package com.yunn.autumn.someproduction.handler;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yunN
 * @date 2021/06/28
 */
public class TestForWork {

    public static void main(String[] args) {
        List<TestForWorkDo> list = new ArrayList<>();
        list.add(new TestForWorkDo("90005", "lisi1", LocalDateTime.now().minusMinutes(1)));
        list.add(new TestForWorkDo("90005", "lisi2", LocalDateTime.now().minusMinutes(2)));
        list.add(new TestForWorkDo("90005", "lisi3", LocalDateTime.now().minusMinutes(3)));
        list.add(new TestForWorkDo("90005", "lisi4", LocalDateTime.now().minusMinutes(4)));
        list.add(new TestForWorkDo("90005", "lisi5", LocalDateTime.now().minusMinutes(5)));
        list.add(new TestForWorkDo("90006", "wangwu1", LocalDateTime.now().minusMinutes(1)));
        list.add(new TestForWorkDo("90006", "wangwu2", LocalDateTime.now().minusMinutes(2)));
        list.add(new TestForWorkDo("90006", "wangwu3", LocalDateTime.now().minusMinutes(3)));
        list.add(new TestForWorkDo("90006", "wangwu4", LocalDateTime.now().minusMinutes(4)));
        list.add(new TestForWorkDo("90006", "wangwu5", LocalDateTime.now().minusMinutes(5)));
        list.add(new TestForWorkDo("90006", "wangwu6", LocalDateTime.now().minusMinutes(6)));


        Map<String, TestForWorkDo> result = list.stream()
                .sorted(Comparator.comparing(TestForWorkDo::getTime).reversed())
                .collect(Collectors.groupingBy(TestForWorkDo::getAccount,
                         Collectors.collectingAndThen(Collectors.toList(), value -> value.get(0))));

        List<TestForWorkDo> resultList = new ArrayList<>(result.values());

        System.out.println(resultList);

        // System.out.println(list.stream()
        //         .sorted(Comparator.comparing(TestForWorkDo::getTime).reversed())
        //         .distinct()
        //         .collect(Collectors.toList()));
    }
}

@AllArgsConstructor
@Data
class TestForWorkDo {
    private String account;
    private String name;
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
