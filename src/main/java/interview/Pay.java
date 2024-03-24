package interview;

/**
 * @Author:靓仔
 * @Since：2024/03/24
 * @Description:
 */
public class Pay {
    private static double priceBeefNoodleLarge = 18;
    private static double priceBeefNoodleMedium = 16;
    private static double priceBeefNoodleSmall = 14;
    private static double pricedoubleestineNoodleLarge = 20;
    private static double pricedoubleestineNoodleMedium = 18;
    private static double pricedoubleestineNoodleSmall = 16;
    private static double priceBeefPatty = 10;
    private static double priceMilkTea = 12;
    //套餐1
    public static double package1=38;
    //套餐2
    public static double package2=40;
    // 默认为工作日
    private boolean isHoliday = false;
    public static void main(String[] args) {
        Customer zhangsan = new Customer();
        zhangsan.addItem(new Menu("套餐1", package1), 1);
        zhangsan.addItem(new Menu("牛肉饼", priceBeefPatty), 1);
        System.out.println("张三需要付款：" + zhangsan.getTotalPrice(false,null) + "元");

        Customer lisi = new Customer();
        lisi.addItem(new Menu("中碗肥肠面", pricedoubleestineNoodleMedium), 1);
        lisi.addItem(new Menu("奶茶", priceMilkTea), 2);
        System.out.println("李四需要付款：" + lisi.getTotalPrice(false,null) + "元");
    }
}
