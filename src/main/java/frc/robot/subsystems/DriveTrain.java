package frc.robot.subsystems;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotHardware;
import frc.robot.RobotMap;

/**
 * This is were you Call all your Drive train Objects to modify the Drive trains
 * actions Template by Nick B on the FRC 5740 team
 */

public class DriveTrain {

    // Object that inits Operator Interface for robot

    public void init() {

    }

    // Function for Drivetrain Objects Run in Teleop Perodic

    public static void perodic() {

        // Created an Arcade drive object to drive the robot

        Robot.m_hardware.Drive.arcadeDrive(OI.Driver.getRawAxis(RobotMap.RStick),
                OI.Driver.getRawAxis(RobotMap.LStick));

    }
}