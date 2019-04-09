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
		int colorChoice=JOptionPane.showOptionDialog(null, "hello, I'm C3PO, please choose a color", "color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
			if(colorChoice==0) {
				C3PO.setPenColor(225, 0, 0);
			}else if(colorChoice==1) {
				C3PO.setPenColor(0, 0, 225);
			}else if (colorChoice==2) {
				C3PO.setPenColor(0, 0, 225);
			}
		//4. Ask the use how many polygons they want to be drawn.
			String input = JOptionPane.showInputDialog("How many polygons do you want C3PO do draw?");
		//5. Use the robot to draw the number of polygons the user requested.
			int polyNum = Integer.parseInt(input);
			C3PO.penDown();
			for (int j = 0; j < polyNum; j++) {
			for (int i = 0; i < 3; i++) {
					C3PO.move(100);
					C3PO.turn(360/3);
			}
			C3PO.penUp();
			C3PO.move(110);
			C3PO.penDown();
			}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

