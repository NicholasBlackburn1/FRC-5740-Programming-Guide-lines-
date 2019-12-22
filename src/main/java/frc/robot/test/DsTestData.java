package frc.robot.test;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.OI;
import frc.robot.RobotMap;
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
        private static NetworkTableEntry controllerXEntry = tab.add("ControllerX", text).withPosition(0, 2)
                        .withSize(2, 1).withWidget(BuiltInWidgets.kNumberBar).getEntry();

        // Creates an Network Table entry to Controller info
        private static NetworkTableEntry controllerYEntry = tab.add("ControllerY", text).withPosition(0, 4)
                        .withSize(2, 1).withWidget(BuiltInWidgets.kNumberBar).getEntry();

        // Function to constally update Shuffleboard Values
        public final static void perodic() {

                // update Controller Pos on Dashbord
                controllerXEntry.setDouble(OI.Driver.getRawAxis(RobotMap.LStick));
                controllerYEntry.setDouble(OI.Driver.getRawAxis(RobotMap.RStick));
        }

}