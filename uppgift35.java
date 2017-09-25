import javax.swing.*;

public class uppgift35 {

  public static void main(String[] args) {

    String sPrice = JOptionPane.showInputDialog("Pris inkl. moms: ");
    String sTax = JOptionPane.showInputDialog("Moms i %: ");
    int price = Integer.parseInt(sPrice);
    int tax = Integer.parseInt(sTax) + 100;
    int preTax = (price * 100) / tax;
    System.out.println(preTax);

  }
}
