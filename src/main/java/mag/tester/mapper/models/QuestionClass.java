package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record QuestionClass(Integer idClass, String textClass) implements ExportData {
    public QuestionClass(Integer idClass, String textClass) {
        this.idClass = idClass;
        this.textClass = textClass;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idClass)
                .param(textClass);
    }
}
