/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Components.hardware;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Components.hardware.RobotMap;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  // object for calling robot map class
  // Driver Station
  public static XboxController Driver = new XboxController(RobotMap.DSDriver);
  public static XboxController Operator = new XboxController(RobotMap.DSOperator);

}
