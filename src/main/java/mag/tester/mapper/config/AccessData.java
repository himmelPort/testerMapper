/* project testerMapper
создано 30.09.2021 19:08
*/
package mag.tester.mapper.config;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.models.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AccessData {
    private final List<TableData> listTableData = new ArrayList<>();
    private  List<ExportData> exportData;

    private String transLog;
    private TableData tdSelect;

    public AccessData() {
    }

    public String transLog() {
        return transLog;
    }

//  different structures use the identical storage
    public void accessDataConfig() {
        listTableData.add(new TableData("actor", ActorMapper::new, exportData));
        listTableData.add(new TableData("answers", AnswersMapper::new, exportData));
        listTableData.add(new TableData("cardtest", CardTestMapper::new, exportData));
        listTableData.add(new TableData("cardtestanswer", CardTestAnswerMapper::new, exportData));
        listTableData.add(new TableData("explanation", ExplanationMapper::new, exportData));
        listTableData.add(new TableData("hierarchies", HierarchiesMapper::new, exportData));
        listTableData.add(new TableData("images", ImagesMapper::new, exportData));
        listTableData.add(new TableData("moderuntest", ModeRunTestMapper::new, exportData));
        listTableData.add(new TableData("mosaic", MosaicMapper::new, exportData));
        listTableData.add(new TableData("questionclass", QuestionClassMapper::new, exportData));
        listTableData.add(new TableData("questionmedia", QuestionMediaMapper::new, exportData));
        listTableData.add(new TableData("questions", QuestionsMapper::new, exportData));
        listTableData.add(new TableData("questionstree", QuestionsTreeMapper::new, exportData));
    }

    public void transLogClear() {
        this.transLog = "";
    }
    private TableData findTableData(String tableName) {
        return listTableData.stream()
                .filter(td -> td.tableName().equalsIgnoreCase(tableName))
                .findFirst().orElse(new TableData());
    }
    public boolean selectTableData(JdbcRepository jdbcRepository, String tableName) {
        TableData td = findTableData(tableName);
        if (td.tableName().isEmpty()) {
            transLog = transLog.concat("операция select не будет выполнена. для таблицы ")
                    .concat(tableName).concat(" не найдено описание структуры\n");
            return false;
        }
        td.setDataMatrix(jdbcRepository
                .jdbcNativeQuery("select * from " + tableName, td.getRowMapper()));
        tdSelect = td;
        return true;
    }
    public boolean insertTableData(JdbcRepository jdbcRepository) {
        if (tdSelect.dataMatrix().size() == 0) {
            transLog = transLog.concat("операция insert не будет выполнена. для таблицы ")
                    .concat(tdSelect.tableName()).concat(" количество записей для вставки равно нулю\n");
            return false;
        }
        jdbcRepository.jdbcNativeQuery("delete from " + tdSelect.tableName());

        String sql = "insert into " + tdSelect.tableName() + " values";
        int row;
        for (row = 0; row < tdSelect.dataMatrix().size(); row++) {
            tdSelect.rowMatrix(row).values(jdbcRepository);
            jdbcRepository.jdbcNativeQuery(sql);
        }
        return true;
    }
}
