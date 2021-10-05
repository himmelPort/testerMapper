package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record Questions(Integer idQuestion, String textQuestion, Integer idClass) implements ExportData {
    public Questions(Integer idQuestion, String textQuestion, Integer idClass) {
        this.idQuestion = idQuestion;
        this.textQuestion = textQuestion;
        this.idClass = idClass;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idQuestion)
                .param(textQuestion)
                .param(idClass);
    }
}
