/* project testerMapper
создано 01.10.2021 11:19
*/
package mag.tester.mapper.config;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.function.Supplier;

public class TableData<T> {
    private String tableName;
    private RowMapper<T> rowMapper;
    private List<ExportData> dataMatrix;

    public TableData() {
        this.tableName = "";
    }

    public TableData(String tableName, Supplier<T> rowMapper, List<ExportData> dataMatrix) {
        this.tableName = tableName;
        this.rowMapper = (RowMapper) rowMapper.get();
        this.dataMatrix = dataMatrix;
    }

    public String tableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Supplier<T> getRowMapper() {
        return (() -> (T) this.rowMapper);
    }

    public void setRowMapper(Supplier<T> rowMapper) {
        this.rowMapper = (RowMapper) rowMapper.get();
    }

    public List<ExportData> dataMatrix() {
        return dataMatrix;
    }

    public void setDataMatrix(List<ExportData> dataMatrix) {
        this.dataMatrix = dataMatrix;
    }

    public ExportData rowMatrix(int row) {
        return this.dataMatrix().get(row);
    }
}
