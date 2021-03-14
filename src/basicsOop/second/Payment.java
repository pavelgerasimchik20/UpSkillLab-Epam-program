package basicsOop.second;

import javax.swing.*;
import java.util.Arrays;

public class Payment {

    private final ShoppingCart shoppingCart;
    private final String customersName;

    public Payment(String customersName, String... goods) {
        this.customersName = customersName;
        shoppingCart = new ShoppingCart(goods);
    }

    public void print() {
        JOptionPane.showMessageDialog(null,
                shoppingCart,
                "Customer: " + customersName,
                JOptionPane.INFORMATION_MESSAGE);
    }

    static class ShoppingCart {

        private final String[] goods;
        private final int amountOfGoods;
        private final double totalCost;

        public ShoppingCart(String... goods) {
            this.goods = goods;
            amountOfGoods = goods.length;
            totalCost = Math.random()*100;
        }

        @Override
        public String toString() {
            String txt = "Goods: " + Arrays.toString(goods) + "\n" ;
            txt += "Amount of goods: " + amountOfGoods + "\n" ;
            txt += "Total cost: " + totalCost;
            return txt;
        }
    }
}
