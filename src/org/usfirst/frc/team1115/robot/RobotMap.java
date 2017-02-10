package org.usfirst.frc.team1115.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	//[D]RIVE
	public static final int D_LEFT_FRONT_MOTOR = 0;
	public static final int D_RIGHT_FRONT_MOTOR = 0;
	public static final int D_RIGHT_BACK_MOTOR = 0;
	public static final int D_LEFT_BACK_MOTOR = 0;
	//[I]NPUT
	public static final int I_LEFT_STICK = 0;
	public static final int I_RIGHT_STICK = 1;
	
}
