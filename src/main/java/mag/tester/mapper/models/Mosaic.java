package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record Mosaic(Integer idQuestion, Integer idAnswer, Integer meaning, String orderPointer,
                     Integer idOrder, Boolean answerTrue) implements ExportData {
    public Mosaic(Integer idQuestion, Integer idAnswer, Integer meaning, String orderPointer, Integer idOrder, Boolean answerTrue) {
        this.idQuestion = idQuestion;
        this.idAnswer = idAnswer;
        this.meaning = meaning;
        this.orderPointer = orderPointer;
        this.idOrder = idOrder;
        this.answerTrue = answerTrue;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idQuestion)
                .param(idAnswer)
                .param(meaning)
                .param(orderPointer)
                .param(idOrder)
                .param(answerTrue);
    }
}