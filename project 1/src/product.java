
import javax.swing.JTextField;

public class product {
   public double price;
    public double ammount;

    public product(double price, double ammount) {
        this.price = price;
        this.ammount = ammount;
    }

    product(JTextField productPrice, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    product(JTextField productPrice, JTextField productQTY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
      public double sum(){
        return  getAmmount()*getPrice();
    }
    
    public double vat(){
        return  (sum()*5)/100;
    }
}
