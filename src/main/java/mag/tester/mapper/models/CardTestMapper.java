/* project testerMapper
создано 30.09.2021 19:04
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class CardTestMapper implements RowMapper<CardTest> {
    @Override
    public CardTest mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idCard = resultSet.getInt("idCard");
        final UUID idActor = (UUID) resultSet.getObject("idActor");
        final String yyyymmdd = resultSet.getString("yyyymmdd");
        final String hhmmss = resultSet.getString("hhmmss");
        final Integer idQuestion = resultSet.getInt("idQuestion");
        final Integer meaning = resultSet.getInt("meaning");
        final Boolean checked = resultSet.getBoolean("checked");
        return new CardTest(idCard, idActor, yyyymmdd, hhmmss, idQuestion, meaning, checked);
    }
}