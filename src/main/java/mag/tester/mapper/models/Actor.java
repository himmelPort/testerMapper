package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

import java.util.UUID;

public record Actor(UUID idActor, String nameActor, Integer idMode, Integer imgWidth, Integer imgHeight)
        implements ExportData {

    public Actor(UUID idActor, String nameActor, Integer idMode, Integer imgWidth, Integer imgHeight) {
        this.idActor = idActor;
        this.nameActor = nameActor;
        this.idMode = idMode;
        this.imgWidth = imgWidth;
        this.imgHeight = imgHeight;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idActor)
                .param(nameActor)
                .param(idMode)
                .param(imgWidth)
                .param(imgHeight);
    }
}