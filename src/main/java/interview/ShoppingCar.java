package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:javaboy
 * @Since：2024/02/29
 * @Description:
 */
public class ShoppingCar {
    private List<Double> prices;

    public ShoppingCar() {
        prices = new ArrayList<Double>();
    }

    public void addItem(Fruit fruit, int quantity) {
        prices.add(fruit.getPrice()*quantity);
    }

    public void addItem(Fruit fruit, int quantity,double discount) {
        prices.add(fruit.getPrice()*quantity*discount);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Double price : prices) {
            totalPrice=price+totalPrice;
        }
        return totalPrice;
    }
}
