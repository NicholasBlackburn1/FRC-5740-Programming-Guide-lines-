package frc.robot;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * This is were you Define all physical robot hardware (IE: motor controllers,
 * encoders, Gryos , etc) Template by Nick B on the FRC 5740 team
 */

public class RobotHardware {

    // Creates Motor Controller Objects For Robots Drive train

    Spark FrontR = new Spark(RobotMap.FrontR);
    Spark FrontL = new Spark(RobotMap.FrontL);

    PWMTalonSRX BackR = new PWMTalonSRX(RobotMap.BackR);
    PWMTalonSRX BackL = new PWMTalonSRX(RobotMap.BackL);

    // Creates SpeedController Group Objects For Drive Train

    SpeedControllerGroup Left = new SpeedControllerGroup(FrontL, BackL);
    SpeedControllerGroup Right = new SpeedControllerGroup(FrontR, BackR);

    // used to create Drive Train to drive robot

    public DifferentialDrive Drive = new DifferentialDrive(Left, Right);

}