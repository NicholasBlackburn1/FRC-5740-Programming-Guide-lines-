package frc.robot.subsystems;

import java.util.Map;

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

    public static void testData(String name) {

        // Creates an Object for shuffleboard and creates a tab named test
        final ShuffleboardTab tab = Shuffleboard.getTab(name);

        // Used to create a Shuffleboard Tab that inharets the name string
        tab.getLayout(name, BuiltInLayouts.kGrid);

        // Created a simple Display widget to Display controller 1 axis
        tab.add("Controller", OI.Driver.getRawAxis(RobotMap.LStick)).withWidget(BuiltInWidgets.kNumberBar)
                .withProperties(Map.of("min", 0, "max", 2)).withSize(2, 1).withPosition(0, 2).getEntry();

        // Created a simple Display widget to Display controller 1 axis
        tab.add("Controller", OI.Driver.getRawAxis(RobotMap.RStick)).withWidget(BuiltInWidgets.kNumberBar)
                .withProperties(Map.of("min", 0, "max", 2)).withSize(2, 1).withPosition(0, 2).getEntry();

    }
}