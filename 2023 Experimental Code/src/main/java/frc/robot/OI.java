package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

import static frc.robot.Constants.*;

public class OI {

    private static XboxController gamePad;

    //public OI () 
    static {
      gamePad = new XboxController(gamePadPort);
    }

    public static XboxController getXbox() {
      return gamePad;
    }

}