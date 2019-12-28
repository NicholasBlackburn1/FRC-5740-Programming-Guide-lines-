# 1.1 Structure of  Your Robot Program

It would be wrong of me to say there is one right way of setting up your code. There is not. You can set up your
code any way you would like, as long as you can understand the structure and effectively navigate your code. I am going to explain one hierarchy of code that we Personally like to use, the Command based robot project hierarchy.
    
    Robot/
        robot/
            hardware/ #RobotMap and RobotHardware are located here
            commands/ # Commands for Robot are located here
            subsystems/
            
            