// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.XboxController;

/** An example command that uses an example subsystem. */
public class ElevatorCommand extends CommandBase {
  
  //private final DriveTrainSubsystem m_DriveTrainSubsystem;
  //private final OI m_oi;
  public ElevatorCommand() {
    addRequirements(Robot.m_elevatorSubsystem);
  } 

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.m_elevatorSubsystem.setElevatorMotor(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(Robot.m_oi.getXButtonPressed() && Robot.m_elevatorSubsystem.getEncoderPosition() < 53541.40691 ){
      Robot.m_elevatorSubsystem.setElevatorMotor(1);
    } 
    if(Robot.m_oi.getYButtonPressed() && Robot.m_elevatorSubsystem.getEncoderPosition() < 102964.2441){
      Robot.m_elevatorSubsystem.setElevatorMotor(1);
    }
    if(Robot.m_oi.getBButtonPressed() && Robot.m_elevatorSubsystem.getEncoderPosition() < 152387.0812){
      Robot.m_elevatorSubsystem.setElevatorMotor(1);
    }
    if(Robot.m_oi.getXButtonPressed() && Robot.m_elevatorSubsystem.getEncoderPosition() > 45304.26739 ){
      Robot.m_elevatorSubsystem.setElevatorMotor(-1);
    } 
    if(Robot.m_oi.getYButtonPressed() && Robot.m_elevatorSubsystem.getEncoderPosition() > 94727.10453 ){
      Robot.m_elevatorSubsystem.setElevatorMotor(-1);
    } 
    if(Robot.m_oi.getBButtonPressed() && Robot.m_elevatorSubsystem.getEncoderPosition() > 144149.9417 ){
      Robot.m_elevatorSubsystem.setElevatorMotor(-1);
    } 
    if(Robot.m_oi.getLeftBumperPressed()){
      Robot.m_elevatorSubsystem.adjustElevatorPositionDown();
    }
    if(Robot.m_oi.getRightBumperPressed()){
      Robot.m_elevatorSubsystem.adjustElevatorPositionUp();
    }
  }


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  Robot.m_elevatorSubsystem.setElevatorMotor(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
