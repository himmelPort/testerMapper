package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record QuestionMedia(Integer idQuestion, Integer idImage, Integer idVideo) implements ExportData {
    public QuestionMedia(Integer idQuestion, Integer idImage, Integer idVideo) {
        this.idQuestion = idQuestion;
        this.idImage = idImage;
        this.idVideo = idVideo;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idQuestion)
                .param(idImage)
                .param(idVideo);
    }
}
