// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class DriveTrainCommand extends CommandBase {
  
  public static XboxController gamePad = new XboxController(Constants.gamePadPort);
  //private final OI m_oi;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveTrainCommand() {
    //m_DriveTrainSubsystem = new DriveTrainSubsystem();
    //m_oi = new OI();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    DriveTrainSubsystem.setMotorSpeed(0, 0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    DriveTrainSubsystem.setMotorSpeed(gamePad.getLeftY(), gamePad.getRightY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
