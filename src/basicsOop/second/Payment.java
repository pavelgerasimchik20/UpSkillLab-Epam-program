package basicsOop.second;

import javax.swing.*;
import java.util.Arrays;

public class Payment {

    private String customersName;
    private Basket basket;

    public Payment(String customersName, String... goods) {
        this.customersName = customersName;
        basket = new Basket(goods);
    }

    public void show(){
        JOptionPane.showMessageDialog(null,
                basket,
                "Receipt",
                JOptionPane.INFORMATION_MESSAGE);
    }

    class Basket {

        private int amountOfGoods;
        private String[] goods;

        public Basket(String... goods) {
            this.goods = goods;
            amountOfGoods = goods.length;
        }

        @Override
        public String toString() {
            String txt = "Goods: " + Arrays.toString(goods) + "\n";
            txt += "Amount of goods: " + amountOfGoods;
            return txt;
        }
    }
}
