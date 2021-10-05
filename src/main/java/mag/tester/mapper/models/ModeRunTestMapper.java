/* project testerMapper
создано 30.09.2021 19:29
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ModeRunTestMapper implements RowMapper<ModeRunTest> {
    @Override
    public ModeRunTest mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idMode = resultSet.getInt("idMode");
        final String nameMode = resultSet.getString("nameMode");
        final Boolean isRegistration = resultSet.getBoolean("isRegistration");
        final Boolean isShowTrueAnswer = resultSet.getBoolean("isShowTrueAnswer");
        final Boolean isShowExplain = resultSet.getBoolean("isShowExplain");
        return new ModeRunTest(idMode, nameMode, isRegistration, isShowTrueAnswer, isShowExplain);
    }
}
