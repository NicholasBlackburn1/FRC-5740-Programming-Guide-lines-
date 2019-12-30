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
