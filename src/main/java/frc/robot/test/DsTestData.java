package frc.robot.test;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.OI;
import frc.robot.RobotMap;

/**
 * This Class is For Displaying Data From the Robot to ShuffleBoard in Test Mode
 * Template by Nick B on the FRC 5740 team
 */
public class DsTestData {

        // Creates an Object for shuffleboard and creates a tab named DATA
        public static ShuffleboardTab tab = Shuffleboard.getTab("DATA");

        // Uses NetWorktables to pass Data to Shuffleboard
        private final NetworkTableEntry ControllerX = tab.add("ControllerX", OI.Driver.getRawAxis(RobotMap.RStick))
                        .withWidget(BuiltInWidgets.kNumberBar).withPosition(0, 2).withSize(2, 1).getEntry();

        // Created a simple Display widget to Display controller 1 axis
        private final NetworkTableEntry ControllerY = tab.add("ControllerY", OI.Driver.getRawAxis(RobotMap.LStick))
                        .withWidget(BuiltInWidgets.kNumberBar).withPosition(0, 4).withSize(2, 1).getEntry();

        // Function to constally update Shuffleboard Values
        public final static void perodic() {
                /*
                 * final Double X =
                 * ControllerX.getDouble(OI.Driver.getRawAxis(RobotMap.RStick)); final Double Y
                 * = ControllerY.getDouble(OI.Driver.getRawAxis(RobotMap.LStick));
                 */
        }
}