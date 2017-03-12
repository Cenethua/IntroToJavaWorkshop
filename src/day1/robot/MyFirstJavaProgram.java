package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot bastion=new Robot();
for (int i = 0; i < 4; i++) {
	bastion.setSpeed(50);
	bastion.turn(90);
	bastion.move(120);
	
}
	
	}
}