/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  // Define port numbers of Controllers Motor controllers etc for robot

  // Driver station usb ports
  int DSDriver = 1;
  int DSOperator = 2;

  // Robot Drive train Motors ports
  int FrontL = 1;
  int FrontR = 2;
  int BackL = 3;
  int BackR = 4;
}
