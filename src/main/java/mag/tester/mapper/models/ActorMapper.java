/* project testerMapper
создано 30.09.2021 18:51
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class ActorMapper implements RowMapper<Actor> {
    @Override
    public Actor mapRow(ResultSet resultSet, int i) throws SQLException {
        final UUID idActor = (UUID) resultSet.getObject("idActor");
        final String nameActor = resultSet.getString("nameActor");
        final Integer idMode = resultSet.getInt("idMode");
        final Integer imgWidth = resultSet.getInt("imgWidth");
        final Integer imgHeight = resultSet.getInt("imgHeight");
        return new Actor(idActor, nameActor, idMode, imgWidth, imgHeight);
    }
}