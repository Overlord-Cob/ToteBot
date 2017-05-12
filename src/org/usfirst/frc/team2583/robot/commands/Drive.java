package org.usfirst.frc.team2583.robot.commands;

import org.usfirst.frc.team2583.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {

    public Drive() {
    	requires(Robot.dt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.dt.driveMecanum(Robot.oi.x1.getRawAxis(0), Robot.oi.x1.getRawAxis(1), Robot.oi.x1.getRawAxis(4));		// These axis are from memory: might need changing
    	// Uncomment the below code to run in tank drive instead of mecanum
//    	Robot.dt.driveTank(Robot.oi.x1.getRawAxis(1), Robot.oi.x1.getRawAxis(5));	// Again, these are from memory
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
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
