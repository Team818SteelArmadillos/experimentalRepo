// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class DriveTrainCommand extends CommandBase {
  
  private final DriveTrainSubsystem m_DriveTrainSubsystem;
  private final OI m_oi;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveTrainCommand() {
    m_DriveTrainSubsystem = new DriveTrainSubsystem();
    m_oi = new OI();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_DriveTrainSubsystem.setMotorSpeed(0, 0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_DriveTrainSubsystem.setMotorSpeed(m_oi.getleftYAxis(), m_oi.getrightYAxis());
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
