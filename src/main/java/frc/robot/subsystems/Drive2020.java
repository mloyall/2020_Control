/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;



//If this is throwing an error - you need to install ctre Pheonix stuff, it's a pain, sorry :(
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;

public class Drive2020 extends DriveTrain {

    WPI_VictorSPX frontLeft = new WPI_VictorSPX(RobotMap.driveFrontLeft2020);
    WPI_VictorSPX frontRight = new WPI_VictorSPX(RobotMap.driveFrontRight2020);
    WPI_VictorSPX backLeft = new WPI_VictorSPX(RobotMap.driveBackLeft2020);
    WPI_VictorSPX backRight = new WPI_VictorSPX(RobotMap.driveBackLeft2020);

    public Drive2020(){
        backRight.follow(frontRight);
        backLeft.follow(frontLeft);
    }

    public void moveLeftWheels(double amount){
        frontLeft.set(ControlMode.PercentOutput, amount);
    }

    public void moveRightWheels(double amount){
        frontRight.set(ControlMode.PercentOutput, amount);
    }

    public double getRightEncoder(){
        return 0.0;
    }

    public double getLeftEncoder(){
        return 0.0;
    }
}