# 1.1 Structure of  Your Robot Program

It would be wrong of me to say there is one right way of setting up your code. There is not. You can set up your
code any way you would like, as long as you can understand the structure and effectively navigate your code. I am going to explain one hierarchy of code that we Personally like to use, the Command based robot project hierarchy.
    
    Robot/
        robot/
            hardware/ #RobotMap and RobotHardware are located here
            commands/ # Commands for Robot are located here
            Components/ # Different components of the robot 
            auto/ #In this folder are separate autonomous modes
            subsystems/ #  Subsystems such as drivetrain, etc.
            
            
## 1.1.1 RobotMap, OI and RobotHardware
A common occurrence in robot code is a file called RobotMap. This file contains constants use throughout the
robot. Such constants include motor controller port numbers, button mapping for certain robot functions, and PID constants for your control loops. 

Many teams use RobotMap for keeping track of constants. 

Also, many teams use OI (Operator Interface) to define all User Interface Devices for robot. 

RobotHardware where you initialize all of your Robot hardware.

## 1.1.2 Main Robot Structure
You know the old saying “Cleanliness is close to godliness”. The same goes for programming. Clean code -> God
Tier code. The first step to having clean code is to have good organization. Let’s start with robotInit.
robotInit

**Note:** The following examples show Timed Robot.

**Java Robot base class** 

        public class Robot extends TimedRobot {

         @Override
        public void robotInit() {
        }

        @Override
        public void robotPerodic(){
        }

Let’s talk about what’s happening in these methods. In the Java, the code starts with declaring the variables in the class scope (outside of any method). This allows the other methods you will use such as
teleopPeriodic or operatorControl to have access to your robot components.

**Teleop**

