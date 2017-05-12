package org.usfirst.frc.team2583.robot.subsystems;

import org.usfirst.frc.team2583.robot.commands.Drive;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private Talon fLeft = new Talon(0);
	private Talon fRight = new Talon(1);
	private Talon bRight = new Talon(2);
	private Talon bLeft = new Talon(3);
	
	public final double root2 = 1.414213562;
	
    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
    
    /**
     * Runs a mecanum drivetrain based on input from two joysticks
     * 
     * @param jMoveX the X-value of the joystick that controls lateral movement
     * @param jMoveY the Y-value of the joystick that controls lateral movement
     * @param jTurnX the X-value of the joystick that controls heading (or the turn parameter)
     */
    public void driveMecanum(double jMoveX, double jMoveY, double jTurnX){
    	jMoveX = jMoveX / root2;
    	jMoveY = jMoveY / root2;
    	
    	double FL = jMoveY - jMoveX + jTurnX;
    	double FR = jMoveY + jMoveX - jTurnX;
    	double BL = jMoveY + jMoveX + jTurnX;
    	double BR = jMoveY - jMoveX - jTurnX;
    	
    	fLeft.set(FL);
    	fRight.set(FR);
    	bLeft.set(BL);
    	bRight.set(BR);
    }
    
    public void driveTank(double left, double right){
    	fLeft.set(left);
    	fRight.set(right);
    	bLeft.set(left);
    	bRight.set(right);
    }
}

