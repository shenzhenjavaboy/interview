package interview;

/**
 * @Author:javaboy
 * @Since：2024/02/29
 * @Description:
 */
public class SuperMarket {

    public static void main(String[] args) {
        /*
        * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
        *   现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
        *   请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        *
        *   2、超市增加了一种水果芒果，其定价为 20 元/斤。
        *   现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
        *   请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        *
        *   3、超市做促销活动，草莓限时打 8 折。
        *   现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
        *   请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        *
        *   4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
        *   现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
        *   请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        * */
        // 问题1
        Fruit apple = new Fruit("苹果", 8);
        Fruit strawberry = new Fruit("草莓", 13);

        ShoppingCar cartA = new ShoppingCar();
        cartA.addItem(apple, 3);
        cartA.addItem(strawberry, 2);

        double totalPriceA = cartA.getTotalPrice();
        System.out.println("顾客A需要支付：" + totalPriceA + "元");

        // 问题2
        Fruit mango = new Fruit("芒果", 20);

        ShoppingCar cartB = new ShoppingCar();
        cartB.addItem(apple, 2);
        cartB.addItem(strawberry, 1);
        cartB.addItem(mango, 4);

        double totalPriceB = cartB.getTotalPrice();
        System.out.println("顾客B需要支付：" + totalPriceB + "元");

        // 问题3
        ShoppingCar cartC = new ShoppingCar();
        cartC.addItem(apple, 1);
        cartC.addItem(strawberry, 3,0.8);
        cartC.addItem(mango, 2);

        double totalPriceC = cartC.getTotalPrice();
        System.out.println("顾客C需要支付：" + totalPriceC + "元");

        // 问题4
        ShoppingCar cartD = new ShoppingCar();
        cartD.addItem(apple, 4);
        cartD.addItem(strawberry, 2);
        cartD.addItem(mango, 3);

        double totalPriceD = cartD.getTotalPrice();
        if (totalPriceD >= 100) {
            totalPriceD -= 10;
        }
        System.out.println("顾客D需要支付：" + totalPriceD + "元");
    }
}

