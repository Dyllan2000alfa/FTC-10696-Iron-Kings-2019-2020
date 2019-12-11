/**
 * Created By Marbella Castillo 9/20/19 5:24 pm
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TeleOp Full Speed", group="TeleOp")
public class IronKingsTeleOpFullSpeed extends OpMode {

    IronKingsHardwareMap robot = new IronKingsHardwareMap();

    @Override
    public void init() {

        robot.init(hardwareMap);
    }

    public void loop() {

        robot.leftMotor.setPower(-gamepad1.left_stick_y);
        robot.rightMotor.setPower(-gamepad1.right_stick_y);

        robot.armMotor.setPower(gamepad2.right_stick_y / 2);

        if (gamepad2.right_trigger > .25) {

            robot.closeClaw();
        }
        else {

            robot.openClaw();
        }
    }

    public void stop() {

        robot.stop();
    }
}