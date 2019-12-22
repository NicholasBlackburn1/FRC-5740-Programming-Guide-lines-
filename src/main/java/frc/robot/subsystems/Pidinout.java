package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import frc.robot.RobotHardware;

public class Pidinout {

    public static PIDOutput myPIDoutput = new PIDOutput() {

        @Override
        public void pidWrite(final double output) {
            RobotHardware.Drive.arcadeDrive(0, output);
        }
    };
    public static PIDSource myPIDsource = new PIDSource() {

        @Overrcide
        public void setPIDSourceType(PIDSourceType pidSource) {

            pidSource = PIDSourceType.kDisplacement;
        }

        @Override
        public double pidGet() {
            return RobotHardware.gyro.pidGet();
        }

        @Override
        public PIDSourceType getPIDSourceType() {
            return RobotHardware.gyro.getPIDSourceType();
        }

    };
}