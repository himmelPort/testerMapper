/* project testerMapper
создано 30.09.2021 19:10
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExplanationMapper implements RowMapper<Explanation> {
    @Override
    public Explanation mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idQuestion = resultSet.getInt("idQuestion");
        final String textExplanation = resultSet.getString("textExplanation");
        return new Explanation(idQuestion, textExplanation);
    }
}