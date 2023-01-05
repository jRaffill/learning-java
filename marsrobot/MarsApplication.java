package java21.marsrobot;

public class MarsApplication {
	public static void main (String[] arguments) {
		MarsRobot spirit = new MarsRobot("exploring", 2, -60);
		
		spirit.showAttributes();
		System.out.println("speed to three");
		spirit.speed = 3;
		spirit.showAttributes();
		System.out.println("temperature to -90");
		spirit.temperature = -90;
		spirit.showAttributes();
		System.out.println("checking temperature");
		spirit.checkTemperature();
		spirit.showAttributes();
	}
}
