package org.usfirst.frc.team1155.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SpringSubsystem extends Subsystem {
    
	public static CANTalon leftGearTalon, rightGearTalon, leftLockTalon, rightLockTalon;
	// encMax is a meaningless value meant to represent the farthest distance reachable by the talons 
	public static int encMax = 5;
	// encMin is a meaningless value meant to represent the lowest distance reachable by the talons 
	public static int encMin =0 ;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public SpringSubsystem(){
		
		leftGearTalon = new CANTalon(0);
		rightGearTalon = new CANTalon(1);
		leftLockTalon = new CANTalon(3);
		rightLockTalon = new CANTalon(4);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

