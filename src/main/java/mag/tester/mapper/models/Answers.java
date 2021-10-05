package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record Answers(Integer idAnswer, String textAnswer) implements ExportData {

    public Answers(Integer idAnswer, String textAnswer) {
        this.idAnswer = idAnswer;
        this.textAnswer = textAnswer;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idAnswer)
                .param(textAnswer);
    }
}