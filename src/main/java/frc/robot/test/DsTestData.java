package frc.robot.test;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import frc.robot.OI;
import frc.robot.hardware.RobotMap;
import frc.robot.Components.*;

/**
 * This Class is For Displaying Data From the Robot to ShuffleBoard in Test Mode
 * Template by Nick B on the FRC 5740 team
 */
public class DsTestData {

        static double text;

        // Creates an Object for shuffleboard and creates a tab named DATA
        public static ShuffleboardTab tab = Shuffleboard.getTab("DATA");

        // Created an Complex widget that displays video feed
        private static ComplexWidget frontCameraWidget = tab.add("Normal_Video", CameraConfig.CvCamera)
                        .withPosition(2, 0).withSize(4, 5).withWidget(BuiltInWidgets.kCameraStream);

        // Creates an Network Table entry to Controller info
        private static NetworkTableEntry controllerXEntry = tab.add("ControllerX", 0).withPosition(0, 2).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberBar).getEntry();

        // Creates an Network Table entry to Controller info
        private static NetworkTableEntry controllerYEntry = tab.add("ControllerY", 0).withPosition(0, 4).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberBar).getEntry();

        // Creates an Network Table entry to Pid loop
        private static NetworkTableEntry pEntry = tab.add("proportional gain", 0).withPosition(9, 0).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberSlider).getEntry();

        // Creates an Network Table entry to Pid loop
        private static NetworkTableEntry iEntry = tab.add("intergral gain", 0).withPosition(9, 2).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberSlider).getEntry();

        // Creates an Network Table entry to Pid loop
        private static NetworkTableEntry dEntry = tab.add("derivitave gain", 0).withPosition(9, 4).withSize(2, 1)
                        .withWidget(BuiltInWidgets.kNumberSlider).getEntry();

        // Creates an Network Table entry to show state of Vision Target

        private static NetworkTableEntry targetSeenWidget = tab.add("Vision System Status", false).withPosition(0, 0)
                        .withSize(2, 1).withWidget(BuiltInWidgets.kBooleanBox).getEntry();

        // Graph to display Vision System Accuracy
        private static NetworkTableEntry visionAccuracyWEntry = tab.add("Vision Accuracy", 0).withPosition(6, 0)
                        .withSize(3, 2).withWidget(BuiltInWidgets.kGraph).getEntry();

        // Function to constally update Shuffleboard Values
        public final static void perodic() {

                // update Controller Pos on Dashbord
                controllerXEntry.setDouble(OI.Driver.getRawAxis(RobotMap.LStickY));
                controllerYEntry.setDouble(OI.Driver.getRawAxis(RobotMap.RStickX));

        }

}