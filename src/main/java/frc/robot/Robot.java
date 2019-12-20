/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  // Calls Operator Interface as an object
  public static OI m_oi;
  public static RobotHardware m_hardware;
  public static RobotMap m_map;

  // Calls Robot Hardware as an object

  @Override
  public void robotInit() {

    // inits object m_oi as Operator Interface
    m_oi = new OI();

    // inits object m_hardware as Robot Hardware class
    m_hardware = new RobotHardware();

    // inits object m_map as Robot Map class
    m_map = new RobotMap();
  }

  @Override
  public void robotPeriodic() {

    // enables robot drive train to be controlled by user

  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {
  }
}
