package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetToFire extends Command {

	boolean isOn = true;
	boolean isFalse = false; 
	private final int SET_AMOUNT; 
	
    public SetToFire(int setAmount) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.springSubsystem);
    	SET_AMOUNT = setAmount;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	springSubsystem.leftGearTalon.set(1);
    	springSubsystem.rightGearTalon.set(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(leftGearTalon.getDistance() >= SET_AMOUNT){
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	for (int i = leftGearTalon.getDistance(); i > springSubsystem.encMin; i++ ){
    		springSubsystem.leftGearTalon.set(-1);
    		springSubsystem.rightGearTalon.set(-1);
    	}
    springSubsystem.leftGearTalon.set(0);
	springSubsystem.rightGearTalon.set(0);


    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
