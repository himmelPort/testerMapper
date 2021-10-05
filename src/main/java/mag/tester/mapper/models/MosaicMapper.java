/* project testerMapper
создано 30.09.2021 19:19
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MosaicMapper implements RowMapper<Mosaic> {
    @Override
    public Mosaic mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idQuestion = resultSet.getInt("idQuestion");
        final Integer idAnswer = resultSet.getInt("idAnswer");
        final Integer meaning = resultSet.getInt("meaning");
        final String orderPointer = resultSet.getString("orderPointer");
        final Integer idOrder = resultSet.getInt("idOrder");
        final Boolean answerTrue = resultSet.getBoolean("answerTrue");
        return new Mosaic(idQuestion, idAnswer, meaning, orderPointer, idOrder, answerTrue);
    }
}