/**
 * Created By Marbella Castillo 9/20/19 5:24 pm
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IronKingsTeleOpTest extends OpMode
{
    IronKingsHardwareMap robot = new IronKingsHardwareMap();

    @Override
    public void init()
    {

        robot.init(hardwareMap);
    }

    public void loop()
    {
        robot.left.setPower(gamepad1.left_stick_y);
        robot.right.setPower(gamepad1.right_stick_y);

        robot.arm.setPower(gamepad1.right_trigger - gamepad2.left_trigger);

        if (gamepad2.right_bumper) {

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