package section2;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
	Random r = new Random();	
		Robot markZuckerburg = new Robot();
		markZuckerburg.setSpeed(100);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.penDown();
		markZuckerburg.setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.move(50);
		markZuckerburg.turn(90);
		markZuckerburg.penUp();
		
		
		
		
		
	}
}
