# 1.1 Structure of Your Robot Program

It would be wrong of me to say there is one right way of setting up your code. There is not. You can set up your
code any way you would like, as long as you can understand the structure and effectively navigate your code. I am going to explain one hierarchy of code that we Personally like to use, the Command based robot project hierarchy.

        Robot/
            robot/
                robotmodes/ # Robot Control modes (IE: Auto, Telop and Test) in there respective subfolders
                    auto/ # in this folder here lies the robots autonomous modes
                    teleop/ # in this folder here  lies the robot TeleOp modes
                    test/ # in this folder here lies the robot test mode ( this mode is used to test full function of robot before a match)
                Components/ # Different components of the robot (IE: Robot hardware, Commands and subsystems in there respective subfolders)
                    hardware/ #RobotMap and RobotHardware are located here
                    commands/ # Commands for Robot are located here
                    subsystems/ # Subsystems such as drivetrain, etc.
            Main.java # the Forbiddin class... You should never put/ modify this class for any reason (Unless you know what you are doing!)
            Robot.java # the Main robot class that you build your robot project off of

## 1.1.1 RobotMap, OI and RobotHardwareTeleop

A common occurrence in robot code is a file called RobotMap. This file contains constants use throughout the
robot project. Such constants include motor controllers,w port numbers, button mappings for certain robot functions, and PID constants for your control loops.

Many teams use RobotMap for keeping track of constants.
Also, many teams use OI (Operator Interface) to define all User Interface Devices for robot.

RobotHardware where you initialize all of your Robot hardware. Such as motor controllers, Limit switches, Gryos and more.

### **RobotMap Example**

## 1.1.2 Main Robot Structure

You know the old saying “Cleanliness is close to godliness”. The same goes for programming. Clean code -> God
Tier code. The first step to having clean code is to have good organization. Let’s start with robotInit.
robotInit

**Note:** The following Robot.java example show you a Command based Robot project.

### **Java Robot base class**

        public class Robot extends TimedRobot {

         @Override
        public void robotInit() { # Function Runs only when robot first powers on
        }

        @Override
        public void robotPerodic(){ # Function Runs every 10 ms when robot is enabled
        }

        @Override
        public void teleopInit() { # Function Runs only once when the teleop button is pressed on the driver station

         }

        @Override
        public void teleopPeriodic() { # Function Runs every 10 ms when Teleop mode is enabled
        }
          @Override
        public void disabledInit() { # Function Runs only once when the Robot enters Disabled mode

     }

        @Override
        public void disabledPeriodic() { # Function Runs every 10 ms when Robot is Disabled

     }

    }

Let’s talk about what’s happening in these methods. In the Java, the code starts with declaring the variables in the class scope (outside of any method). This allows the other methods you will use such as
teleopPeriodic or operatorControl to have access to your robot components.

### **Teleop**
