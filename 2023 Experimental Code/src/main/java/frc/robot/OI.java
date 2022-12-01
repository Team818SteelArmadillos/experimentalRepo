package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import static frc.robot.Constants.*;

public class OI {

    private static XboxController gamePad;

    //public OI () 
    static {
      gamePad = new XboxController(gamePadPort);
    }

    public static XboxController getController() {
      return gamePad;
    }

    }