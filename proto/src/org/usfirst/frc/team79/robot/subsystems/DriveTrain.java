package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveTrain extends Subsystem {
    
private RobotDrive Drive;
public static CANTalon FrontLeft, BackLeft, FrontRight, BackRight , MiddleLeft, MiddleRight;
	public DriveTrain(){
		
//		super();
		FrontLeft = new CANTalon(RobotMap.ForntLeftMotor);
		BackLeft = new CANTalon(RobotMap.BackRightMotor);
	    FrontRight = new CANTalon(RobotMap.FrontRightMotor);
	    BackRight = new CANTalon(RobotMap.BackRightMotor);
	    MiddleRight = new CANTalon(RobotMap.MiddleRightMotor);
	    MiddleLeft = new CANTalon(RobotMap.MiddleLeftMotor);
	    Drive = new RobotDrive(BackLeft, FrontLeft, BackRight, FrontLeft);
	    
	}

    public void initDefaultCommand() {
    	
    }
    public void CANTalon() {
    	//MiddleRight.changeControlMode(TalonControlMode.Follower);
    	//MiddleLeft.changeControlMode(TalonControlMode.Follower);
    	
    	//MiddleRight.set(RobotMap.ForntLeftMotor);
    	//MiddleLeft.set(RobotMap.FrontRightMotor);
    }

    public void arcadeDrive(Joystick stick){
    	Drive.arcadeDrive(stick);
    }
    
    public void arcadeDrive(double x, double y) {
    	Drive.arcadeDrive(x, y);
    }

}