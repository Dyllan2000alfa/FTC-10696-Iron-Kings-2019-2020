/**
 * Created By Dyllan Tinoco 12/11/19
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TeleOp Half Speed", group="TeleOp")
public class IronKingsTeleOpHalfSpeed extends OpMode {

    IronKingsHardwareMap robot = new IronKingsHardwareMap();

    @Override
    public void init() {

        robot.init(hardwareMap);
    }

    public void loop() {

        robot.driveControls(gamepad1.left_stick_y, gamepad1.right_stick_y, gamepad2.right_stick_y, gamepad2.right_trigger, 0.5);
    }

    public void stop() {

        robot.stop();
    }
}