/**
 * Created By Dyllan Tinoco 12/11/19
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TeleOp Three Quarter Speed", group="TeleOp")
public class IronKingsTeleOpThreeQuarterSpeed extends OpMode {

    IronKingsHardwareMap robot = new IronKingsHardwareMap();

    @Override
    public void init() {

        robot.init(hardwareMap);
    }

    public void loop() {

        robot.leftMotor.setPower(-gamepad1.left_stick_y / 1.5);
        robot.rightMotor.setPower(-gamepad1.right_stick_y / 1.5);

        robot.armMotor.setPower(-gamepad2.right_stick_y / 2);

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