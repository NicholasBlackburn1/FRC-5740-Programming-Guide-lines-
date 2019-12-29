/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Components.hardware.OI;
import frc.robot.Components.hardware.CameraConfig;
import frc.robot.Components.hardware.RobotHardware;
import frc.robot.Components.subsystems.DriveTrain;
import frc.robot.Components.datacollection.DsTestData;

public class Robot extends TimedRobot {

  // Calls Operator Interface as an object
  public static OI m_oi;
  public static RobotHardware m_hardware;

  // Calls Robot Hardware as an object

  @Override
  public void robotInit() {

    // inits object m_oi as Operator Interface
    m_oi = new OI();

    // inits object m_hardware as Robot Hardware class
    m_hardware = new RobotHardware();

    // Inits Camera Settings for robotrio
    CameraConfig.Config();

  }

  @Override
  public void robotPeriodic() {

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

    // Reads data from controller joystics and sends them to the Network table
    DsTestData.perodic();

    // Controlls drive train for robot
    DriveTrain.perodic();

    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {

    DriveTrain.testMode();
  }
}
