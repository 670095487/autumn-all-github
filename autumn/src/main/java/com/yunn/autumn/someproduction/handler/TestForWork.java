package com.yunn.autumn.someproduction.handler;

import lombok.Builder;
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

        TestForWorkDo account1 = new TestForWorkDo.TestForWorkDoBuilder().amount(new BigDecimal("90")).account("9001").build();
        TestForWorkDo account2 = new TestForWorkDo.TestForWorkDoBuilder().amount(new BigDecimal("10")).account("9001").build();
        TestForWorkDo account3 = new TestForWorkDo.TestForWorkDoBuilder().amount(new BigDecimal("10")).account("9003").build();
        TestForWorkDo account4 = new TestForWorkDo.TestForWorkDoBuilder().amount(new BigDecimal("10")).account("9004").build();
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);

        Map<String, BigDecimal> resultMap = list.stream()
                .collect(Collectors.groupingBy(TestForWorkDo::getAccount,
                        Collectors.reducing(BigDecimal.ZERO, TestForWorkDo::getAmount, BigDecimal::add)));

        System.out.println("resultMap = " + resultMap.toString());

        System.out.println(YearMonth.now().minusMonths(1).toString());

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
@Builder
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
