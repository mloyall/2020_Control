/*----------------------------------------------------------------------------*/
/* CopyRight (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the Left and Right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int LeftMotor = 1;
  // public static int RightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;


	//Spark Motors for Monolith
	public static int driveFrontRightPortMonolith = 2;
	public static int driveFrontLeftPortMonolith = 0;
	public static int driveBackRightPortMonolith = 3;
	public static int driveBackLeftPortMonolith = 1;

	// CAN Bus Drive 
	public static int driveFrontRightPortMonty = 7;
	public static int driveFrontLeftPortMonty = 5;
	public static int driveBackRightPortMonty = 2;
	public static int driveBackLeftPortMonty = 1;

	//button panel
	public static int buttonPanelPort = 1;

	//hotas
	public static int hotasPort = 0;
	

}
