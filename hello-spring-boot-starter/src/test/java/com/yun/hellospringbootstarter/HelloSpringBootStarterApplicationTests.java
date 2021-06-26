package com.yun.hellospringbootstarter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@SpringBootTest
public class HelloSpringBootStarterApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void t4()  {
        TimeZone tz = TimeZone.getTimeZone("Etc/Greenwich");//设置欧洲时区格林威尔标准时间
        Calendar calendar = new GregorianCalendar(tz);
        calendar.setTime(Date.from( LocalDateTime.now().atZone(ZoneId.of("Etc/Greenwich")).toInstant()));
        String rst = getRst(calendar);
        System.out.println(rst);
    }

    public String getRst(Calendar calendar) {
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int secondWorkDay = getSecondWorkDay(calendar);
        if (currentDay > secondWorkDay) {//在工作日后
            return "after";
        } else if (currentDay < secondWorkDay) {
            return "before";
        } else {
            return "today";
        }
    }


    private int getSecondWorkDay(Calendar calendar) {
        /*通过判断当月1号是星期几来确定第二工作日日期，数组的位数0,1,2,3,4,5,6分别对应星期日，一，。。。。
        数组里面的value则是第二工作日的日期day*/
        Integer[] weekDayTransferWordDay = {3, 2, 2, 2, 2, 4, 4};
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;//看当日是星期几，-1是因为星期2是一周的第三天，每周的第一天是周天
        return weekDayTransferWordDay[weekDay];
    }

    @Test
    public void testMonth() throws Exception {
        SimpleDateFormat yyyyMM = new SimpleDateFormat("yyyy-MM");
        String month = "2021-09";
        // Date date = yyyyMM.parse(month);
        // System.out.println(date);
        // System.out.println(yyyyMM.format(date));
        // System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM")));
        // System.out.println((LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))));
        // System.out.println(LocalDate.parse((LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"))), DateTimeFormatter.ofPattern("yyyy-MM")));
        // System.out.println(YearMonth.parse("2021-08", DateTimeFormatter.ofPattern("yyyy-MM")));m

    }


}
