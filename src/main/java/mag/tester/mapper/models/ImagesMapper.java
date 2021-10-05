/* project testerMapper
создано 30.09.2021 19:17
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ImagesMapper implements RowMapper<Images> {
    @Override
    public Images mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idImage = resultSet.getInt("idImage");
        final String nameImage = resultSet.getString("nameImage");
        final String descriptImage = resultSet.getString("descriptImage");
        final Integer sizeImage = resultSet.getInt("sizeImage");
        final byte[] dataImage = resultSet.getBytes("dataImage");
        return new Images(idImage, nameImage, descriptImage, sizeImage, dataImage);
    }
}