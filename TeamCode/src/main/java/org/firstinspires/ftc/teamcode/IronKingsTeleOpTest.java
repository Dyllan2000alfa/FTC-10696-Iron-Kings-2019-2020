/**
 * Created By Marbella Castillo 9/20/19 5:24 pm
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TeleOp 1 Controller", group="Testing")
public class IronKingsTeleOpTest extends OpMode {

    IronKingsHardwareMap robot = new IronKingsHardwareMap();

    @Override
    public void init() {

        robot.init(hardwareMap);
    }

    public void loop() {

        robot.leftMotor.setPower(-gamepad1.left_stick_y);
        robot.rightMotor.setPower(-gamepad1.right_stick_y);

        robot.armMotor.setPower(gamepad1.left_trigger - gamepad1.right_trigger);

        if (gamepad1.right_bumper) {

            robot.rightServo.setPosition(0);
            robot.leftServo.setPosition(1);
        }
        else {

            robot.rightServo.setPosition(1);
            robot.leftServo.setPosition(0);
        }
    }

    public void stop() {

        robot.stop();
    }
}