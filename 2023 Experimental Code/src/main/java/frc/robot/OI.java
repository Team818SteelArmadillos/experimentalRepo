package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import static frc.robot.Constants.*;

public class OI {

    private static Joystick leftJoyStick, rightJoyStick;
    private static XboxController gamePad, gamePadDriver;

    private static JoystickButton intakeButton;
    private static JoystickButton elevatorButton;

    public OI () {
      leftJoyStick = new Joystick(leftJoystickPort);
      rightJoyStick = new Joystick(rightJoystickPort);
      gamePad = new XboxController(gamePadPort);
      gamePadDriver = new XboxController(gamePadDriverPort);
      elevatorButton = new JoystickButton(gamePad, 7);
    }

      public static boolean getElevatorUp() {
        return (gamePad.getPOV() == 0);
      }

      public static boolean getElevatorDown() {
        return (gamePad.getPOV() == 180);
      }

      public static boolean getElevatorOut(){
        return (gamePad.getPOV() == 270);
      }

      public static boolean getElevatorIn(){
        return (gamePad.getPOV() == 90);
      }

      public static boolean getXButton() {
        return gamePad.getXButton();
      }    

      public static boolean getYButton() {
        return gamePad.getYButton();
      }

      public static boolean getAButton() {
        return gamePad.getAButton();
      }

      public static boolean getBButton() {
        return gamePad.getBButton();
      }

      public static boolean getLeftBumper() {
        return gamePad.getRawButtonPressed(5);
      }

      public static boolean getRightBumper() {
        return gamePad.getRawButtonPressed(6);
      }

      public static boolean getRightTrigger() {
        return gamePad.getRawButtonPressed(3);
      }

      public static boolean getLeftTrigger() {
        return gamePad.getRawButtonPressed(2);
      }

      public static double getRightTriggerAxis() {
        return gamePad.getRightTriggerAxis();
      }

      public static double getLeftTriggerAxis() {
        return gamePad.getLeftTriggerAxis();
      }

      public static double getRightAxisX() {
        return gamePad.getRightX();
      }

      public static double getRightAxisY() {
        return gamePad.getRightY();
      }

      public static double getLeftAxisX() {
        return gamePad.getLeftX();
      }

      public static double getLeftAxisY() {
        return gamePad.getLeftY();
      }


      /**
      * Retrieves the left joystick Y axis
      * 
      * <p> Joystick Y axis
      */
      public static double getleftYAxis() {
        // return Math.pow(-leftJoyStick.getY(), 3.0);
        return leftJoyStick.getY();
        // // return Math.pow(-gamePadDriver.getLeftY(), 3.0);
        //return gamePadDriver.getLeftY();
      }
      /**
      * Retrieves the right joystick Y axis
      * 
      * <p> Joystick Y axis
      */
      public static double getrightYAxis() {
        // return Math.pow(rightJoyStick.getY(), 3.0);
        return rightJoyStick.getY();
        // // return Math.pow(gamePadDriver.getRightY(), 3.0);
        // return gamePadDriver.getRightY();
      }
      /**
      * Retrieves the left joystick X axis
      * 
      * <p> Joystick X axis
      */
      public static double getleftXAxis() {
        // return Math.pow(-rightJoyStick.getX(), 3.0);
        return leftJoyStick.getX();
        // // return Math.pow(-gamePadDriver.getLeftX(), 3.0);
        // return gamePadDriver.getLeftX();
      }
      /**
      * Retrieves the right joystick X axis
      * 
      * <p> Joystick X axis
      */
      public static double getrightXAxis() {
        // return Math.pow(-rightJoyStick.getX(), 3.0);
        return rightJoyStick.getX();
        // // return Math.pow(-gamePadDriver.getRightX(), 3.0);
        // return gamePadDriver.getRightX();
      }

      public static boolean shiftGears(){
        return (rightJoyStick.getRawButton(2));
      }
    }