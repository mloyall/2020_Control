/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.DriveTrain;
import frc.robot.Robot;
import frc.robot.OI;

/**
 * An example command.  You can replace me with your own command.
 */
public class ManualDrive extends Command{
  public ManualDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    drive();
  }

  private double drive(){
    double turnAmount = OI.getTurn();
    double forwardAmount = OI.getForward();

    double leftAmount = forwardAmount;
    double rightAmount = forwardAmount;

    leftAmount += turnAmount;
    rightAmount -= turnAmount;

    leftAmount = OI.sCurve(leftAmount) * 2 - 1;
    rightAmount = OI.sCurve(rightAmount) * 2 - 1;

    Robot.driveTrain.moveLeftWheels(leftAmount);
    Robot.driveTrain.moveRightWheels(rightAmount);

    return ((leftAmount + rightAmount) / 2);
  }



  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
