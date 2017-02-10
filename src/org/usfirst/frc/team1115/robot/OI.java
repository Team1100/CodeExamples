package org.usfirst.frc.team1115.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private static OI instance;
	public static OI getInstance(){
		if(instance==null)instance = new OI();
		return instance;
	}
	
	private Joystick left, right;
	
	public Joystick getLeft() {
		return left;
	}

	public Joystick getRight() {
		return right;
	}

	public OI(){
		left = new Joystick(RobotMap.I_LEFT_STICK);
		right = new Joystick(RobotMap.I_RIGHT_STICK);
	}
}
