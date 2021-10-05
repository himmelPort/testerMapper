package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record Explanation(Integer idQuestion, String textExplanation) implements ExportData {

    public Explanation(Integer idQuestion, String textExplanation) {
        this.idQuestion = idQuestion;
        this.textExplanation = textExplanation;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idQuestion)
                .param(textExplanation);
    }
}