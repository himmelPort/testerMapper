/* project testerMapper
создано 30.09.2021 20:36
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionsMapper implements RowMapper<Questions> {
    @Override
    public Questions mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idQuestion = resultSet.getInt("idQuestion");
        final String textQuestion = resultSet.getString("textQuestion");
        final Integer idClass = resultSet.getInt("idClass");
        return new Questions(idQuestion, textQuestion, idClass);
    }
}
