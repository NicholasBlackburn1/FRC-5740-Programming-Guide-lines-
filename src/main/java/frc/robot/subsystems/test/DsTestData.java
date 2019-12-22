package frc.robot.test;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.OI;
import frc.robot.RobotHardware;
import frc.robot.RobotMap;
import frc.robot.commands.PidDrive;
import frc.robot.subsystems.CameraConfig;

/**
 * This Class is For Displaying Data From the Robot to ShuffleBoard in Test Mode
 * Template by Nick B on the FRC 5740 team
 */
public class DsTestData {

        static double text;

        // Creates an Object for shuffleboard and creates a tab named DATA
        public static ShuffleboardTab tab = Shuffleboard.getTab("DATA");

        // Created an Complex widget that displays video feed
        private final ComplexWidget frontCameraWidget = tab.add("Normal_Video", CameraConfig.CvCamera)
                        .withPosition(7, 0).withSize(3, 4).withWidget(BuiltInWidgets.kCameraStream);

        // Creates an Network Table entry to Controller info
        private static NetworkTableEntry controllerXEntry = tab.add("ControllerX", 0).withPosition(0, 2).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberBar).getEntry();

        // Creates an Network Table entry to Controller info
        private static NetworkTableEntry controllerYEntry = tab.add("ControllerY", 0).withPosition(0, 4).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberBar).getEntry();

        // Creates an Network Table entry to Pid loop
        private static NetworkTableEntry pEntry = tab.add("proportional gain", 0).withPosition(2, 0).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberSlider).getEntry();

        // Creates an Network Table entry to Pid loop
        private static NetworkTableEntry iEntry = tab.add("intergral gain", 0).withPosition(2, 2).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberSlider).getEntry();

        // Creates an Network Table entry to Pid loop
        private static NetworkTableEntry dEntry = tab.add("derivitave gain", 0).withPosition(2, 4).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberSlider).getEntry();

        // Function to constally update Shuffleboard Values
        public final static void perodic() {

                // update Controller Pos on Dashbord
                controllerXEntry.setDouble(OI.Driver.getRawAxis(RobotMap.LStick));
                controllerYEntry.setDouble(OI.Driver.getRawAxis(RobotMap.RStick));

                // sets p double in command
                pEntry.setDouble(PidDrive.p);
                // sets i double in command
                iEntry.setDouble(PidDrive.i);

                // sets d double in command
                dEntry.setDouble(PidDrive.d);

        }

}