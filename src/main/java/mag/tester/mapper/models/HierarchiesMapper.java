/* project testerMapper
создано 30.09.2021 19:12
*/
package mag.tester.mapper.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HierarchiesMapper implements RowMapper<Hierarchies> {
    @Override
    public Hierarchies mapRow(ResultSet resultSet, int i) throws SQLException {
        final Integer idHierarchy = resultSet.getInt("idHierarchy");
        final String textHierarchy = resultSet.getString("textHierarchy");
        final Integer idParent = resultSet.getInt("idParent");
        return new Hierarchies(idHierarchy, textHierarchy, idParent);
    }
}