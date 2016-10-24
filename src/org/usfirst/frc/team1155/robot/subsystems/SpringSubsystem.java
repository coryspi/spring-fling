package org.usfirst.frc.team1155.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SpringSubsystem extends Subsystem {
    
	public static CANTalon leftTalon, rightTalon;
	public static int encMax = 5;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public SpringSubsystem(){
		
		leftTalon = new CANTalon(0);
		rightTalon = new CANTalon(1);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

