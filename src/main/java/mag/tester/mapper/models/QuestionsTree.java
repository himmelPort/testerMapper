package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record QuestionsTree(Integer idHierarchy, Integer idNode, Integer idParent,
                            Integer marLeft, String level6, String keep6) implements ExportData {
    public QuestionsTree(Integer idHierarchy, Integer idNode, Integer idParent, Integer marLeft, String level6, String keep6) {
        this.idHierarchy = idHierarchy;
        this.idNode = idNode;
        this.idParent = idParent;
        this.marLeft = marLeft;
        this.level6 = level6;
        this.keep6 = keep6;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idHierarchy)
                .param(idNode)
                .param(idParent)
                .param(marLeft)
                .param(level6)
                .param(keep6);
    }
}
