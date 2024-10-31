package lotto.config;

import lotto.controller.LottoController;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class AppConfig {

    public LottoController getLottoController() {
        return new LottoController(new InputView(), new OutputView(), new LottoService());
    }
}