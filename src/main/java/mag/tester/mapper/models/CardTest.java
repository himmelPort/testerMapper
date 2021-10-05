package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

import java.util.UUID;

public record CardTest(Integer idCard, UUID idActor, String yyyymmdd, String hhmmss, Integer idQuestion,
                       Integer meaning, Boolean checked) implements ExportData {

    public CardTest(Integer idCard, UUID idActor, String yyyymmdd, String hhmmss, Integer idQuestion, Integer meaning, Boolean checked) {
        this.idCard = idCard;
        this.idActor = idActor;
        this.yyyymmdd = yyyymmdd;
        this.hhmmss = hhmmss;
        this.idQuestion = idQuestion;
        this.meaning = meaning;
        this.checked = checked;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idCard)
                .param(idActor)
                .param(yyyymmdd)
                .param(hhmmss)
                .param(idQuestion)
                .param(meaning)
                .param(checked);
    }
}