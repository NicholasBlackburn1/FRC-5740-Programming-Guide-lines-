package frc.robot.Components.subsystems;

import edu.wpi.first.wpilibj.RobotState;
import frc.robot.Robot;
import frc.robot.Components.hardware.*;

/**
 * This is were you Call all your Drive train Objects to modify the Drive trains
 * actions Template by Nick B on the FRC 5740 team
 */

public class DriveTrain {

    // Function for Drivetrain Objects Run in Teleop Perodic

    public static void perodic() {

        // Created an Arcade drive object to drive the robot

        Robot.m_hardware.Drive.arcadeDrive(OI.Driver.getRawAxis(RobotMap.RStickX),
                OI.Driver.getRawAxis(RobotMap.LStickY));
    }

    public static void testMode() {

        // Sets Drivetrain to run forward
        Robot.m_hardware.Drive.arcadeDrive(1, 1);

    }
}