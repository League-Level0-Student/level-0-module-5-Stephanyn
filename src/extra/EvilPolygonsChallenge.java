package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot C3PO = new Robot();
		//2. Set the speed to 100
			C3PO.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
			if(colorChoice = "Red") {
				C3PO.setPenColor(225, 0, 0);
			}else if(colorChoice = "Blue") {
				C3PO.setPenColor(0, 0, 225);
			}
		//4. Ask the use how many polygons they want to be drawn.
			JOptionPane.showInputDialog("How many polygons do you want C3PO do draw?");
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

