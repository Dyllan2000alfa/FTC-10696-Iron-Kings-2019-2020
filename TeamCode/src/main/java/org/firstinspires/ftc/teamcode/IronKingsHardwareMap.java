/**
 * Created by Marbella Castillo 9/17/2019 1:21:35 PM
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class IronKingsHardwareMap
{

    DcMotor left, right, arm;
    Servo sLeft, sRight;

    public void init(HardwareMap hwMap)
    {
        right = hwMap.dcMotor.get("ri");
        left = hwMap.dcMotor.get("le");
        arm = hwMap.dcMotor.get("arm");
        sRight = hwMap.servo.get("sri");
        sLeft = hwMap.servo.get ("sle");

        right.setDirection(DcMotor.Direction.REVERSE);
        arm.setDirection(DcMotor.Direction.REVERSE);

        right.setPower(0);
        left.setPower(0);

        sRight.setPosition(1);
        sLeft.setPosition(0);
    }

    public void stop()
    {
        right.setPower(0);
        left.setPower(0);
    }

    public void forward()
    {

    }


}