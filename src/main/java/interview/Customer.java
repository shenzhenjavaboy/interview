package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:靓仔
 * @Since：2024/03/24
 * @Description:
 */
public class Customer {
    private List<Double> prices;

    public Customer() {
        prices = new ArrayList<Double>();
    }

    public void addItem(Menu menu, int quantity) {
        prices.add(menu.getPrice()*quantity);
    }

    public void addItem(Menu menu, int quantity,double discount) {
        prices.add(menu.getPrice()*quantity*discount);
    }

    public double getTotalPrice(Boolean isHoliday,String type) {
        double totalPrice = 0.0;
        for (Double price : prices) {
            totalPrice=price+totalPrice;
        }
        if (isHoliday){
            if ("A".equals(type)){
                //满减  满100-5
                totalPrice =totalPrice>=100?totalPrice-5:totalPrice;
            }else if ("B".equals(type)){
                //折扣 打9折
                totalPrice=0.9*totalPrice;
            }
        }
        return totalPrice;
    }
}
