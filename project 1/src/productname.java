
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTextField;

public class productname extends product {
     String s;

    public productname(String s, double price, double ammount) {
        super(price, ammount);
        this.s = s;
    }

 

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public double sum(){
        double sum=0;
        return  sum+(getAmmount()*getPrice());
    }
    
    public double vat(double vat11){
        
        return  vat11;
    }
}
