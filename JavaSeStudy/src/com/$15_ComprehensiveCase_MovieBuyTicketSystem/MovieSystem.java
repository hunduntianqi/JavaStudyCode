package com.$15_ComprehensiveCase_MovieBuyTicketSystem;

/*
    系统角色类准备:
        1. 继承日志框架, 用于后期记录日志信息
        2. 定义一个电影类Movie类, 包含:片名, 主演, 评分, 时长, 票价, 余票
        3. 系统包含2个用户角色:客户, 商家, 存在有相同的属性信息
        4. 定义User类作为父类, 属性:登录名称, 密码, 真实名称, 性别, 电话, 账户金额
        5. 定义Business类代表商家角色, 属性: 店铺名称, 地址
        6. 定义Customer类代表客户角色, 属性
        7. 定义集合List<User> 用户存放系统注册的用户对象信息
        8. 定义集合Map<Business, List<Movie>>存放商家和排片信息
    首页, 登录, 商家界面, 用户界面设计:
        1. 首页需要包含登录, 商家入驻, 客户注册功能
        2. 商家和客户可以共用一个登录功能
        3. 判断登录成功的用户的真实类型, 根据用户类型完成对应的操作界面设计
            3.1 商家功能:
                1. 展示本商家的信息和其排片情况
                2. 提供影片上架功能: 创建一个影片对象, 存入到商家的集合中去
                3. 提供影片下架功能: 从商家的集合中删除影片对象
                4. 影片修改功能:拿到需要修改的影片对象, 修改里面的数据
 */


import com.$15_ComprehensiveCase_MovieBuyTicketSystem.JavaBean.Business;
import com.$15_ComprehensiveCase_MovieBuyTicketSystem.JavaBean.Customer;
import com.$15_ComprehensiveCase_MovieBuyTicketSystem.JavaBean.Movie;
import com.$15_ComprehensiveCase_MovieBuyTicketSystem.JavaBean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {
    /**
     * 定义系统的数据容器用于存储数据
     * 1. 存储很多用户(客户对象, 商家对象)
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /**
     * 2.存储系统全部商家和其排片信息
     * 商家 = [p1, p2, p3...]
     */
    public static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

    // 定义一个静态的User类型的变量记住当前登录成功的用户对象
    public static User loginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    /**
     * 3. 准备测试数据
     */

    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassword("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassword("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassword("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassword("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies3); // b2 = []
    }

    public static void main(String[] args) {
        showmain();
    }

    private static void showmain() {
        while (true) {
            System.out.println("==============混沌电影首页=============");
            System.out.println("1. 登录");
            System.out.println("2. 用户注册");
            System.out.println("3. 商家注册");
            System.out.println("4. 退出系统");

            System.out.println("请输入操作命令:");
            String command = SYS_SC.next();
            switch (command) {
                case "1":
                    // 登录方法
                    login();
                    break;
                case "2":
                    // 用户注册
                    customerRegister();
                    break;
                case "3":
                    // 商家注册
                    businessRegister();
                    break;
                case "4":
                    System.out.println("您即将退出混沌电影系统, 十分期待您的再次使用, 再见！！");
                    return;
                default:
                    System.out.println("命令有误, 请重新输入:");
            }
        }
    }

    /**
     * 商家注册系统
     */
    private static void businessRegister() {
        Business business = new Business();
        System.out.println("请设置您的用户名:");
        business.setLoginName(SYS_SC.next());
        System.out.println("请设置您的登录密码:");
        business.setPassword(SYS_SC.next());
        System.out.println("请输入您的真实姓名:");
        business.setUserName(SYS_SC.next());
        System.out.println("请输入您的性别:");
        business.setSex((char) SYS_SC.next().charAt(0));
        System.out.println("请输入您的电话号码:");
        business.setPhone(SYS_SC.next());
        System.out.println("请输入您的注册资金:");
        business.setMoney(SYS_SC.nextDouble());
        System.out.println("请输入您的店铺名称:");
        business.setShopName(SYS_SC.next());
        System.out.println("请输入您的店铺地址:");
        business.setAddress(SYS_SC.next());
        // 添加用户对象到用户对象集合
        ALL_USERS.add(business);
        System.out.println("恭喜商家" + business.getLoginName() + "注册" + business.getShopName()
                + "店铺成功！！");
        // 将商家添加到店铺排片信息集合中
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(business, movies);
    }

    /**
     * 客户注册系统
     */
    private static void customerRegister() {
        Customer cus = new Customer();
        System.out.println("请设置您的用户名:");
        cus.setLoginName(SYS_SC.next());
        System.out.println("请设置您的登录密码:");
        cus.setPassword(SYS_SC.next());
        System.out.println("请输入您的真实姓名:");
        cus.setUserName(SYS_SC.next());
        System.out.println("请输入您的性别:");
        cus.setSex(SYS_SC.next().charAt(0));
        System.out.println("请输入您的电话号码:");
        cus.setPhone(SYS_SC.next());
        System.out.println("请输入您的注册资金:");
        cus.setMoney(SYS_SC.nextDouble());
        // 添加用户对象到用户对象集合
        ALL_USERS.add(cus);
        System.out.println("恭喜客户" + cus.getLoginName() + "注册成功！！");
    }

    /**
     *  登录系统功能
     */
    private static void login() {
        System.out.println("=============欢迎使用混沌电影系统=============");
        while (true) {
            System.out.println("请您输入登录名称:");
            String loginName = SYS_SC.next();
            System.out.println("请您输入登录密码:");
            String passWord = SYS_SC.next();
            // 根据登录名查询用户对象
            User u = getUserByLoginName(loginName);
            // 判断用户名是否存在
            if (u != null) {
                // 判断密码是否正确
                if (u.getPassword().equals(passWord)) {
                    // 登录成功
                    loginUser = u;
                    LOGGER.info(u.getUserName() + "登录了系统！！");
                    // 判断是商家登录还是客户登录
                    if (u instanceof Customer) {
                        // 普通客户
                        showCustomerMain();
                    } else {
                        // 商家用户
                        showBusinessMain();
                    }
                    return;
                } else {
                    System.out.println("您的密码有误, 请重新输入:");
                }
            } else {
                System.out.println("登录名称错误, 请确认:");
            }
        }
    }

    /**
     *  展示商家信息
     */
    private static void showBusinessMain() {
        // 商家操作界面
        while (true) {
            System.out.println("============混沌电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.next();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 影片修改功能
     */
    private static void updateMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        // 判断集合中是否存在电影对象
        if (movies.size() == 0) {
            System.out.println("你的店铺没有上架影片, 请先上架影片");
            return;
        }
        // 输入要查询的电影名称
        System.out.println("请输入您要修改信息的影片名称:");
        String movieName = SYS_SC.next();
        Movie movie = getMovieByName(movieName);
        // 判断电影在店铺是否存在
        if (movie != null) {
            while (true) {
                System.out.println("请输入您要修改的电影信息:");
                System.out.println("1. 修改电影票价");
                System.out.println("2. 修改电影剩余票数");
                System.out.println("3. 修改电影放映时间");
                System.out.println("4. 退出");
                String command = SYS_SC.next();
                switch (command) {
                    case "1":
                        System.out.println("请输入您修改后的票价:");
                        double price = SYS_SC.nextDouble();
                        movie.setPrice(price);
                        break;
                    case "2":
                        System.out.println("请输入当前电影的剩余票数:");
                        int number = SYS_SC.nextInt();
                        movie.setNumber(number);
                        break;
                    case "3":
                        System.out.println("请您输入新的电影放映时间:");
                        try {
                            Date startTime = sdf.parse(SYS_SC.next());
                            movie.setStarttime(startTime);
                        } catch (ParseException e) {
                            e.printStackTrace();
                            System.out.println("时间解析异常");
                        }
                        break;
                    case "4":
                        System.out.println("即将退出修改信息系统！！");
                        return;
                    default:
                        System.out.println("您输入的指令有误, 请问是否继续修改电影信息？ y / n");
                        switch (SYS_SC.next()) {
                            case "y":
                                break;
                            default:
                                System.out.println("好的, 即将退出修改信息系统");
                                return;
                        }
                }
            }
        } else {
            System.out.println("您要修改的电影还未上架！！");
            return;
        }
    }

    /**
     * 下架电影
     */
    private static void deleteMovie() {
        System.out.println("==============混沌电影下架影片=============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("您的店铺当前无影片可下架！！");
            return;
        }
        while (true) {
            // 让用户选择需要下架的电影名称
            System.out.println("请您输入需要下架的电影名称:");
            String movieName = SYS_SC.next();

            // 查询该电影是否存在
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                // 下架影片
                movies.remove(movie);
                showBusinessInfos();
                return;
            } else {
                System.out.println("您的店铺没有上架该影片!");
                System.out.println("请问继续下架吗? y / n");
                String command = SYS_SC.next();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("好的！！");
                        return;
                }
            }
        }
    }

    /**
     * 查询当前商家下的影片
     */
    public static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 商家进行电影上架
     * Map<Business, List<Movie>> ALL_MOVIES
     */
    private static void addMovie() {
        System.out.println("==============混沌电影上架影片=============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        System.out.println("请您输入新片名：");
        String name = SYS_SC.next();
        System.out.println("请您输入主演：");
        String actor = SYS_SC.next();
        System.out.println("请您输入时长：");
        String time = SYS_SC.next();
        System.out.println("请您输入票价：");
        String price = SYS_SC.next();
        System.out.println("请您输入票数：");
        String totalNumber = SYS_SC.next(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime = SYS_SC.nextLine();
                // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price)
                        , Integer.valueOf(totalNumber), sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                showBusinessInfos();
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了毛病");
            }
        }
    }

    /**
     * 展示当前商家的全部信息
     */
    private static void showBusinessInfos() {
        // 根据商家对象(登录的用户:loginUser), 作为Map集合的键, 提取对应的值: 排片信息-> Map<Business, List<Movie>> ALL_MOVIES
        System.out.println("=============商家详情界面===========");
        LOGGER.info(loginUser.getUserName() + "商家正在查看自己的详情页面！！");
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:" + business.getAddress());
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() > 0) {
            System.out.println("片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t\t" + movie.getTime()
                        + "\t\t\t" + movie.getScore() + "\t\t\t" + movie.getPrice() + "\t\t\t" + movie.getNumber() + "\t\t\t"
                        + sdf.format(movie.getStarttime()));
            }
        } else {
            System.out.println("您的店铺当前没有可放映的影片！！");
        }
    }

    /**
     * 客户操作界面
     */
    private static void showCustomerMain() {
        // 客户操作界面
        while (true) {
            System.out.println("============混沌电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
//                    scoreMovie();
//                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     *  用户购票功能
     */
    private static void buyMovie() {
        showAllMovies();
        // 用户购票
        System.out.println("==============用户购票功能=============");
        while (true) {
            // 1. 查询商家是否存在
            System.out.println("请您输入要购票的店铺:");
            String shopName = SYS_SC.next();
            Business business = getUserByShopName(shopName);
            if (business == null) {
                System.out.println("对不起, 您查询的店铺不存在！！");
            } else {
                // 2. 查询此商家全部的影片
                List<Movie> movies = ALL_MOVIES.get(business);
                if (movies.size() > 0) {
                    // 选择购买影片
                    while (true) {
                        System.out.println("请你输入需要购买的电影名称:");
                        String movieName = SYS_SC.next();
                        // 查询当前商家下的电影对象
                        Movie movie = getMovieByShopAndName(business, movieName);
                        if (movie != null) {
                            // 开始购票
                            // 判断电影是否足票
                            while (true) {
                                System.out.println("请您输入要购买的电影票数:");
                                String number = SYS_SC.next();
                                int buyNumber = Integer.valueOf(number);
                                // 判断电影票数是否足够
                                if (movie.getNumber() >= buyNumber) {
                                    // 可以购买
                                    // 计算当前购票需要花费的金额
                                    double money = BigDecimal.valueOf(movie.getPrice()).multiply(
                                            BigDecimal.valueOf(buyNumber)).doubleValue();
                                    if (loginUser.getMoney() > money) {
                                        // 终于可以买票了
                                        System.out.println("您成功购买了" + movie.getName() + buyNumber +
                                                "张票, 总金额是:" + money);
                                        // 更新自己和商家的金额
                                        loginUser.setMoney(loginUser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        // 更新商家电影余票
                                        movie.setNumber(movie.getNumber() - buyNumber);
                                    } else {
                                        System.out.println("是否要继续买票？y / n");
                                        switch (SYS_SC.next()) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的, 即将退出购票系统");
                                                return;
                                        }
                                    }
                                } else {
                                    // 票数不够
                                    System.out.println("您当前最多可以购买" + movie.getNumber() + "张票");
                                    System.out.println("是否要继续买票？y / n");
                                    switch (SYS_SC.next()) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的, 即将退出购票系统");
                                            return;
                                    }
                                }
                            }
                        } else {
                            System.out.println("电影名称有毛病~~");
                        }
                    }
                } else {
                    System.out.println("该电影院已关门~~");
                    System.out.println("是否要继续买票？y / n");
                    switch (SYS_SC.next()) {
                        case "y":
                            break;
                        default:
                            System.out.println("好的, 即将退出购票系统");
                            return;
                    }
                }
            }
        }
    }

    /**
     *  根据店铺名和影片名返回电影对象
     */
    public static Movie getMovieByShopAndName (Business business, String name) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(name)) {
                return movie;
            } else {
                System.out.println("该商家店铺没有这部影片");
            }
        }
        return null;
    }

    /**
     *  根据商家名称提取商家对象
     */
    public static Business getUserByShopName(String shopName) {
        Set<Business> business = ALL_MOVIES.keySet();
        // 遍历商家对象
        for (Business business1 : business) {
            if (business1.getShopName().equals(shopName)) {
                return business1;
            }
        }
        return null;
    }

    /**
     * 展示全部商家和排片信息
     */
    private static void showAllMovies() {
        System.out.println("=============全部商家排片信息============");
        // 循环遍历所有商家
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:" + business.getAddress());
            // 循环遍历该商家所有排片信息
            System.out.println("\t\t\t片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t\t" + movie.getTime()
                        + "\t\t\t" + movie.getScore() + "\t\t\t" + movie.getPrice() + "\t\t\t" + movie.getNumber() + "\t\t\t"
                        + sdf.format(movie.getStarttime()));
            }
        });
    }

    /**
     * 通过登录名获取用户对象
     */
    public static User getUserByLoginName(String loginName) {
        for (User allUser : ALL_USERS) {
            // 判断用户登录名是否为目标登录名
            if (allUser.getLoginName().equals(loginName))
                return allUser;
        }
        return null;
    }
}
