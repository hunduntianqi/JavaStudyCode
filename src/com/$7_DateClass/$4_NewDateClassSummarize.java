package com.$7_DateClass;

/*
    JDK8开始, java.time包提供了新的日期和时间API, 主要有:
        1. LocalDate: 不包含具体时间的日期
        2. LocalTime: 不包含日期的时间
        3. LocalDateTime: 包含了日期及时间
        4. Instant: 代表的是时间戳
        5. DateTimeFormatter: 用于做时间的格式化和解析
        6. Duration: 用于计算两个"时间"的间隔
        7. Period: 用于计算两个"日期"间隔
      注:
        1. 新增API严格区分了时刻, 本地日期, 本地时间, 并对日期和时间进行运算更加方便
        2. 新增API几乎全部是不变类型(类似于String的使用), 可以放心使用, 不必担心被修改

        LocalDate/LocalTime/LocalDateTime类:
            分别表示日期, 时间, 日期时间对象, 类的实例是不可变对象
            创建对象方法:
                1.public static Xxxx now():静态方法, 根据当前时间创建对象
                    例:
                        LocalDate localDate = LocalDate.now();
                        LocalTime localTime = LocalTime.now();
                        LocalDateTime localDateTime = LocalDateTime.now();
                2.public static Xxxx of(...):静态方法, 指定日期 / 时间创建对象
                    例:
                        LocalDate localDate = LocalDate.of(2021, 12, 15);
                        LocalTime localTime = LocalTime.of(20, 27, 35);
                        LocalDateTime localDateTime = LocalDateTime.of(2021, 12, 15, 20, 27, 35);
                LocalDateTime转换成LocalDate和LocalTime的方法:
                    1. public LocalDate toLocalDate():转换成一个LocalDate对象
                    2. public LocalTime toLocalTime:转换成一个LocalTime对象
                修改相关方法:
                    plusDays / plusWeeks / plusMonths / piusYears: 向当前LocalDate对象添加几天, 几周, 几个月, 几年
                    minusDays / minusWeeks / minusMonths / minusYears: 向当前LocalDate对象减去几天, 几周, 几个月, 几年
                    withDayOfMonth / withDayOfYear / withMonth / withYear:将月份天数, 年份天数, 月份, 年份修改为指定的值并返回新的
                                                                                                            LocalDate对象
                    isBefore / isAfter: 比较两个LocalDate对象
                  注意:这些方法都会返回一个新的对象, 因为实例对象均是不可变类型
          Instant时间戳:
            Instant类有一个静态方法now()可以返回当前时间戳
            Instant instant = Instant.now();
            时间戳:包含日期和时间, 与Date类相似, 且Instant和Date类可以进行转换
          DateTimeFormatter类:
            日期与时间格式化, 正反都能调用format方法
                创建对象:
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-ddd HH:mm:ss EEE a");
                正向格式化:
                    String latStr1 = dtf.format(ldt);
                反向格式化:
                    String latStr2 = ldt.format(dtf);
                解析字符串时间:
                    1.先创建格式化对象:
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("与要解析的字符串一致的时间格式");
                    2. 解析字符串时间, 创建日期时间对象
                        LocalDateTime ldt = LocalDateTime.parse("字符串时间", dtf(格式化对象));
            Period类:
                计算日期间隔差异
                    主要通过Period类的getYears() / getMonths / getDays 方法来计算, 只能精确到年月日
                    用于LocalDate之间的比较
                    创建对象:
                        Period period = Period.between(LocalDate对象1, LocalDate对象2);
            Duration类:
                计算时间间隔的差异, 提供了使用基于时间的值测量时间量的方法
                用于LocalDateTime之间的比较, 也可用于Instant之间的比较
                创建对象:
                        Duration duration = Duration.between(LocalDateTime对象1, LocalDateTime对象2);
            ChronoUnit类:
                可用于在单个时间单位内测量一段时间, 可以用于比较所有的时间单位
 */

public class $4_NewDateClassSummarize {
}
