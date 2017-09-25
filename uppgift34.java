import javax.swing.*;

public class uppgift34 {

  public static void main(String[] args) {

    String sTime, sPrice;
    double time, price, total;
    sTime = JOptionPane.showInputDialog("Minuter per m\u00E5nad: ");
    sPrice = JOptionPane.showInputDialog("Pris per minut: ");
    time = Double.parseDouble(sTime);
    price = Double.parseDouble(sPrice);

    total = time * price;

    JOptionPane.showMessageDialog(null, "Total kostnad per m\u00E5nad: " + total + "0 kr");
  }
}
