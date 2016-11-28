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
	public static int encMin = 0 ;
	public static double lockDist;
	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	private static final int SET_AMOUNT; 

	public SpringSubsystem(){
		
		leftGearTalon = new CANTalon(0);
		rightGearTalon = new CANTalon(1);
		leftLockPiston = new Solenoid(3);
		rightLockPiston = new Solenoid(4);
		
	}
	
	public void unlock(){
		leftLockPiston.set(true);
		rightLockPiston.set(true);
	}
	
	public void lock(){
		leftLockPiston.set(false);
		rightLockPiston.set(false);
	}
	
	public void moveDown(){
		leftGearTalon.set(1);
		rightGearTalon.set(1);
	}
	
	public void moveUp(){
		leftGearTalon.set(-1);
		rightGearTalon.set(-1);
	}
	
	public void stopMoving(){
		leftGearTalon.set(0);
		rightGearTalon.set(0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

