package frc.robot.subsystems;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import frc.robot.RobotMap;

/**
 * This Class is for Setting up / Defining Camera settings Vision System
 * 
 * Template by Nick B on the FRC 5740 team
 */
public class CameraConfig {

    // Vision System Camera Steaming non-Prossed Video
    public static UsbCamera CvCamera = CameraServer.getInstance().startAutomaticCapture(RobotMap.RIOCam);

    // Function Used to setup usb Camera Config
    public static void Config() {

        CvCamera.setBrightness(10);
        CvCamera.setFPS(15);
        CvCamera.setExposureAuto();
    }

}