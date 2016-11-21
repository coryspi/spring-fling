package org.usfirst.frc.team1155.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SpringSubsystem extends Subsystem {
    
	public static CANTalon leftGearTalon, rightGearTalon;
	public static Solenoid leftLockPiston, rightLockPiston;
	// encMax is a meaningless value meant to represent the farthest distance reachable by the talons 
	public static int encMax = 5;
	// encMin is a meaningless value meant to represent the lowest distance reachable by the talons 
	public static int encMin =0 ;
	public static double lockDist;
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

	public SpringSubsystem(){
		
		leftGearTalon = new CANTalon(0);
		rightGearTalon = new CANTalon(1);
		leftLockPiston = new Solenoid(3);
		rightLockPiston = new Solenoid(4);
		
	}
	
	public void lock(){
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

