	package org.usfirst.frc.team1155.robot.commands;
	
	import org.usfirst.frc.team1155.robot.Robot;
	
	import edu.wpi.first.wpilibj.command.Command;
	
	/**
	 *
	 */
	public class Fire extends Command {
	
	    public Fire() {
	        // Use requires() here to declare subsystem dependencies
	        // eg. requires(chassis);
	    	requires(Robot.springSubsystem);
	    }
	
	    // Called just before this Command runs the first time
	    protected void initialize() {
	 
	    }
	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	   springSubsystem.leftLockPiston.set(off);
	    	    springSubsystem.rightLockPiston.set(off);
	    	    
	    }
	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	    	if(leftLockTalon.getDistance() > springSubsystem.encMin){
	    		return true;
	    	}
	        return false;
	    }
	    // Called once after isFinished returns true
	    protected void end() {
	    	   
	    	    
	    }
	
	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }
	}
