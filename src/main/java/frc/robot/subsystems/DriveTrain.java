package frc.robot.subsystems;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotHardware;

/**
 * This is were you Call all your Drive train Objects to modify the Drive trains
 * actions Template by Nick B on the FRC 5740 team
 */

public class DriveTrain {

    // Object that inits Operator Interface for robot

    public void init() {

    }

    // Function for Drive train Objects Run in Teleop Perodic
    public void perodic() {

        Robot.m_hardware.Drive.arcadeDrive(Robot.m_oi.Driver.getRawAxis());

    }
}