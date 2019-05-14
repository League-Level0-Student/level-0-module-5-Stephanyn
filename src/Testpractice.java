import javax.swing.JOptionPane;

public class Testpractice {
	public static void main(String[] args) {
	String n = JOptionPane.showInputDialog("Enter a number");
		int Usernum = Integer.parseInt(n);
		System.out.println(Usernum * 10);
	}
}
