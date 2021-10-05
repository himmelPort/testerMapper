package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record Images(Integer idImage, String nameImage, String descriptImage, Integer sizeImage,
                     byte[] dataImage) implements ExportData {

    public Images(Integer idImage, String nameImage, String descriptImage, Integer sizeImage, byte[] dataImage) {
        this.idImage = idImage;
        this.nameImage = nameImage;
        this.descriptImage = descriptImage;
        this.sizeImage = sizeImage;
        this.dataImage = dataImage;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
        .param(idImage)
        .param(nameImage)
        .param(descriptImage)
        .param(sizeImage)
        .param(dataImage);
    }
}