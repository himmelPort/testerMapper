package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record Hierarchies(Integer idHierarchy, String textHierarchy, Integer idParent) implements ExportData {

    public Hierarchies(Integer idHierarchy, String textHierarchy, Integer idParent) {
        this.idHierarchy = idHierarchy;
        this.textHierarchy = textHierarchy;
        this.idParent = idParent;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idHierarchy)
                .param(textHierarchy)
                .param(idParent);
    }
}