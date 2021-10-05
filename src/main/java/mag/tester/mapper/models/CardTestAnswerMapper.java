/* project testerMapper
создано 30.09.2021 19:06
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CardTestAnswerMapper implements RowMapper<CardTestAnswer> {
    @Override
    public CardTestAnswer mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idCard = resultSet.getInt("idCard");
        final Integer idAnswer = resultSet.getInt("idAnswer");
        final Integer meaning = resultSet.getInt("meaning");
        return new CardTestAnswer(idCard, idAnswer, meaning);
    }
}