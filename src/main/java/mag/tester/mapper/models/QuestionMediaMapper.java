/* project testerMapper
создано 30.09.2021 19:56
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionMediaMapper implements RowMapper<QuestionMedia> {
    @Override
    public QuestionMedia mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idQuestion = resultSet.getInt("idQuestion");
        final Integer idImage = resultSet.getInt("idImage");
        final Integer idVideo = resultSet.getInt("idVideo");
        return new QuestionMedia(idQuestion, idImage, idVideo);
    }
}
