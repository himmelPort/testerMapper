/* project testerMapper
создано 30.09.2021 20:44
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionsTreeMapper implements RowMapper<QuestionsTree> {
    @Override
    public QuestionsTree mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idHierarchy = resultSet.getInt("idHierarchy");
        final Integer idNode = resultSet.getInt("idNode");
        final Integer idParent = resultSet.getInt("idParent");
        final Integer marLeft = resultSet.getInt("marLeft");
        final String level6 = resultSet.getString("level6");
        final String keep6 = resultSet.getString("keep6");
        return new QuestionsTree(idHierarchy, idNode, idParent, marLeft, level6, keep6);
    }
}
