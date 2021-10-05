/* project testerMapper
создано 03.10.2021 11:56
*/
package mag.tester.mapper.config;

import mag.jdbc.repository.JdbcRepository;

public interface ExportData {
    void values(JdbcRepository jdbcRepository);
}
