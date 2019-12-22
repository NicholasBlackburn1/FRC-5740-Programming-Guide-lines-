/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.RobotHardware;

/**
 * A Sample Pid Drive Command for our robot
 * 
 * Template by Nick B on the FRC 5740 team
 */
public class PidDrive extends Command {

  // Numbers for P,i,d loop
  public static double p;
  public static double i;
  public static double d;

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    // Calibrates Gyro to current pos
    RobotHardware.gyro.calibrate();

    // Sets Pid Loop Type
    RobotHardware.gyro.setPIDSourceType(PIDSourceType.kDisplacement);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    // sets P,I,D loop to doules on Dashboard
    RobotHardware.myPID.setPID(p, i, d);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
