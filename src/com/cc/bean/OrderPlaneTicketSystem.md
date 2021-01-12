## 一、项目中类的抽取

###1.1、乘客

```java
import com.cc.bean.Order;

public class Customer {
    private String id;
    private String customerType;//旅客类型：成人、儿童、婴儿
    private String name;//旅客姓名
    private String phone;//电话
    private String cardId;//身份证
    private Date birthDate;//出生日期
    private Order order;
}
```
###1.2、航班信息
```java
public class Flight {
    private String id;
    private String PlaneType;//航班类型
    private String departureAirport;//出发地
    private String destinationAirPort;//目的地
    private Date departureTime;//到达时间
}
```

###1.3、订单

```java
import com.cc.bean.Customer;import com.cc.bean.Flight;public class Order {
    private String id;
    private float jpjg;//机票价格
    private float airPortTax;//机场税
    private float ryf;//燃油费
    private float hkzhx;//航空综合险
    private float jptgx;//机票退改险
    private float yhq;//优惠券
    private float hszj;//含税总价
    private Customer customers[];
    private Flight flight;
}
```

## 二、分析类之间的关系

###2.1、is a

###2.2、like a

###2.3、has a（关联关系）

## 三、数据库的设计

## 四、项目结构搭建

分层设计

实体类 bean
DAO层:data access object(与数据库交互)
面向抽象
- 面向抽象类
- 面向接口类
service层：业务相关代码
UI层
bbl层：bussiness logic layer
  
什么时候需要 commit 和 push？
