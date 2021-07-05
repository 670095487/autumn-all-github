package com.yunn.autumn.someproduction.handler;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yunN
 * @date 2021/06/28
 */
public class TestForWork {

    public static void main(String[] args) {
        List<TestForWorkDo> list = new ArrayList<>();
        Map<String, BigDecimal> resultMap = list.stream()
                .collect(Collectors.groupingBy(TestForWorkDo::getAccount,
                        Collectors.reducing(BigDecimal.ZERO, TestForWorkDo::getAmount, BigDecimal::add)));

        Map<String, TestForWorkDo> result = getStringTestForWorkDoMap(list);

        List<TestForWorkDo> resultList = new ArrayList<>(result.values());

        System.out.println(resultList);

        System.out.println(YearMonth.now().minusMonths(1).toString());

        System.out.println(list.stream()
                .sorted(Comparator.comparing(TestForWorkDo::getTime).reversed())
                .distinct()
                .collect(Collectors.toList()));

        System.out.println(YearMonth.now().getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }

    private static Map<String, TestForWorkDo> getStringTestForWorkDoMap(List<TestForWorkDo> list) {
        Map<String, TestForWorkDo> result = list.stream()
                .sorted(Comparator.comparing(TestForWorkDo::getTime).reversed())
                .collect(Collectors.groupingBy(TestForWorkDo::getAccount,
                        Collectors.collectingAndThen(Collectors.toList(), value -> value.get(0))));
        return result;
    }


}

@Data
@AllArgsConstructor
class TestForWorkDo {
    private String account;
    private String name;
    private BigDecimal amount;
    private LocalDateTime time;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestForWorkDo that = (TestForWorkDo) o;
        return account.equals(that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }
}
