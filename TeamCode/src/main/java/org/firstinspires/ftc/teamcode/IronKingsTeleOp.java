/**
 * Created By Marbella Castillo 9/20/19 5:24 pm
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IronKingsTeleOp extends OpMode
{
    IronKingsHardwareMap robot = new IronKingsHardwareMap();

    @Override
    public void init()
    {
        //telemetry.addData("Status","Initialized");
        robot.init(hardwareMap);
    }

    public void loop()
    {
        robot.left.setPower(gamepad1.left_stick_y / 2);
        robot.right.setPower(gamepad1.right_stick_y / 2d );

        robot.arm.setPower(gamepad2.right_stick_y / 2);

        if (gamepad2.right_trigger > .25) {

            robot.sRight.setPosition(0);
            robot.sLeft.setPosition(1);
        }
        else {

            robot.sRight.setPosition(1);
            robot.sLeft.setPosition(0);
        }
    }

    public void stop()
    {
        robot.stop();
    }
}