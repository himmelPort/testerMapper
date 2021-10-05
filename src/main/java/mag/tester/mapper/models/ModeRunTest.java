package mag.tester.mapper.models;

import mag.jdbc.repository.JdbcRepository;
import mag.tester.mapper.config.ExportData;

public record ModeRunTest(Integer idMode, String nameMode, Boolean isRegistration,
                          Boolean isShowTrueAnswer, Boolean isShowExplain) implements ExportData {
    public ModeRunTest(Integer idMode, String nameMode, Boolean isRegistration, Boolean isShowTrueAnswer, Boolean isShowExplain) {
        this.idMode = idMode;
        this.nameMode = nameMode;
        this.isRegistration = isRegistration;
        this.isShowTrueAnswer = isShowTrueAnswer;
        this.isShowExplain = isShowExplain;
    }

    @Override
    public void values(JdbcRepository jdbcRepository) {
        jdbcRepository
                .param(idMode)
                .param(nameMode)
                .param(isRegistration)
                .param(isShowTrueAnswer)
                .param(isShowExplain);
    }
}
