/* project testerMapper
создано 30.09.2021 18:57
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersMapper implements RowMapper<Answers> {
    @Override
    public Answers mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idAnswer = resultSet.getInt("idAnswer");
        final String textAnswer = resultSet.getString("textAnswer");
        return new Answers(idAnswer, textAnswer);
    }
}