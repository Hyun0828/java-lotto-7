package lotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {

    private static final String INVALID_NUMBER_COUNT = "[ERROR] 로또 번호는 6개여야 합니다.";
    private static final String LOTTO_NUMBER_DUPLICATE = "[ERROR] 로또 번호는 중복되선 안 됩니다.";

    private final List<Integer> numbers;

    public Lotto(final List<Integer> numbers) {
        validateNumberCount(numbers);
        validateNumberDuplicate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return this.numbers.stream().toList();
    }

    private void validateNumberCount(final List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(INVALID_NUMBER_COUNT);
        }
    }

    private void validateNumberDuplicate(final List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);
        if (numberSet.size() != numbers.size()) {
            throw new IllegalArgumentException(LOTTO_NUMBER_DUPLICATE);
        }
    }
}
