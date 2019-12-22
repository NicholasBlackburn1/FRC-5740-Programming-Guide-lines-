package frc.robot.subsystems;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;

import frc.robot.OI;
import frc.robot.RobotMap;

import java.util.Map;

/**
 * This is The ShuffleBoard Data Display class this class Displays Data from the
 * robot to The Driver Station Template by Nick B on the FRC 5740 team
 */
public class DsData {

    public static String name;

    public static void init(final String name) {

        // Creates an Object for shuffleboard and creates a tab named test
        final ShuffleboardTab tab = Shuffleboard.getTab(name);

        // Used to create a Shuffleboard Tab that inharets the name string
        tab.getLayout(name, BuiltInLayouts.kGrid);

    }
}