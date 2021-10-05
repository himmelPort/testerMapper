package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record CardTestAnswer(Integer idCard, Integer idAnswer, Integer meaning) implements ExportData {

    public CardTestAnswer(Integer idCard, Integer idAnswer, Integer meaning) {
        this.idCard = idCard;
        this.idAnswer = idAnswer;
        this.meaning = meaning;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idCard)
                .param(idAnswer)
                .param(meaning);
    }
}