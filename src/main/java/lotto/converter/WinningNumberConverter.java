package lotto.converter;

import lotto.domain.WinningNumber;
import lotto.dto.LottoInputDto;

public class WinningNumberConverter {

    public static WinningNumber toWinningNumber(final LottoInputDto lottoInputDto) {
        return new WinningNumber(lottoInputDto.winningNumber(), lottoInputDto.bonusNumber());
    }
}
