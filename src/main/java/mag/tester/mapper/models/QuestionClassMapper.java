/* project testerMapper
создано 30.09.2021 19:48
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionClassMapper implements RowMapper<QuestionClass> {
    @Override
    public QuestionClass mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idClass = resultSet.getInt("idClass");
        final String textClass = resultSet.getString("textClass");
        return new QuestionClass(idClass, textClass);
    }
}
