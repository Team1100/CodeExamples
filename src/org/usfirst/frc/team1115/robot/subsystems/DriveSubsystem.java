package org.usfirst.frc.team1115.robot.subsystems;

import org.usfirst.frc.team1115.robot.RobotMap;
import org.usfirst.frc.team1115.robot.commands.UserDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private static DriveSubsystem instance;
	
	//List elements
	private Victor leftFront;
	private Victor rightFront;
	private Victor leftBack;
	private Victor rightBack;
	
	private RobotDrive drive;
	
	public DriveSubsystem(){
		//initialize everything
		leftFront = new Victor(RobotMap.D_LEFT_FRONT_MOTOR);
		rightFront = new Victor(RobotMap.D_RIGHT_FRONT_MOTOR);
		leftBack = new Victor(RobotMap.D_LEFT_FRONT_MOTOR);
		rightBack = new Victor(RobotMap.D_RIGHT_FRONT_MOTOR);
		
		drive = new RobotDrive(leftFront, rightFront, leftBack, rightBack);
	}
	
	public static DriveSubsystem getInstance(){
		if(instance==null)instance = new DriveSubsystem();
		return instance;
	}
	
	public void driveTank(double left, double right){
		drive.tankDrive(left, right);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new UserDriveCommand());
	}
}
