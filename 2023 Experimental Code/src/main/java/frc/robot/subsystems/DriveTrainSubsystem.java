// This file sets up a drivetrain subsystem

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class DriveTrainSubsystem extends SubsystemBase { 

  //motors defines each of the four motors in an array with motors[1] as the first left motor and etc
  static int[] motorPorts = {Constants.MOTOR_PORT_LEFT[0], Constants.MOTOR_PORT_LEFT[1], Constants.MOTOR_PORT_RIGHT[0], Constants.MOTOR_PORT_RIGHT[1]};
  static TalonFX[] motors = {new TalonFX(motorPorts[0]),new TalonFX(motorPorts[1]),new TalonFX(motorPorts[2]),new TalonFX(motorPorts[3])};

  public static void setMotorSpeed(double leftSpeed, double rightSpeed){
      motors[0].set(ControlMode.PercentOutput, leftSpeed); //sets the first left motor to leftspeed
      motors[1].follow(motors[0]);
      motors[2].set(ControlMode.PercentOutput, rightSpeed);//sets the first right motor to rightspeed
      motors[3].follow(motors[2]);
  }

}
