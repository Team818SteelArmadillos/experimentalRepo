// This file sets up a drivetrain subsystem

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;


public class ElevatorSubsystem extends SubsystemBase { 
  public TalonFX elevatorMotorOne;

  public ElevatorSubsystem() {
    elevatorMotorOne = new TalonFX(Constants.ELEVATOR_PORT);
  }
  public double getEncoderPosition(){
    return elevatorMotorOne.getSelectedSensorPosition();
  }
  
  public void setElevatorMotor(double Speed) {
    elevatorMotorOne.set(ControlMode.PercentOutput, Speed);
    
  }

  public void adjustElevatorPositionUp(){
    if(elevatorMotorOne.getSelectedSensorPosition() < elevatorMotorOne.getSelectedSensorPosition() + 2048){
      setElevatorMotor(1);
    }
  }

  public void adjustElevatorPositionDown(){
    if(elevatorMotorOne.getSelectedSensorPosition() > elevatorMotorOne.getSelectedSensorPosition() - 2048){
      setElevatorMotor(-1);
    }
  }

  public void resetEncoders(){
    elevatorMotorOne.setSelectedSensorPosition(0);
  }
 
}