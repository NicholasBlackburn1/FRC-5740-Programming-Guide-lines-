package frc.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

/**
 * This is were you Define all physical robot hardware (IE: motor controllers,
 * encoders, Gryos , etc) Template by Nick B on the FRC 5740 team
 */

public class RobotHardware {

    // Creates Gyro for pid loop
    public static ADXRS450_Gyro gyro = new ADXRS450_Gyro();

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