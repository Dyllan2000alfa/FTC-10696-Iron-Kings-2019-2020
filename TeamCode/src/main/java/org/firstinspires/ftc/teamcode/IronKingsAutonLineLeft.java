/**
 * Created By Marbella Castillo 10/4/19 4:58pm
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Stop Left", group="Stop on Line")
public class IronKingsAutonLineLeft extends LinearOpMode {

    IronKingsHardwareMap robot = new IronKingsHardwareMap();
    private ElapsedTime runtime = new ElapsedTime();

    public void runOpMode() {

        robot.init(hardwareMap);

        telemetry.addData("Status", "Ready to run");
        telemetry.update();

        waitForStart();

        runtime.reset();

        robot.forward(0.5);
        while (opModeIsActive() && (runtime.seconds() < 1.35)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        runtime.reset();
        robot.stop();

        robot.turnLeft(0.25);
        while (opModeIsActive() && (runtime.seconds() < 1.65)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        runtime.reset();
        robot.stop();

        robot.forward(0.5);
        while (opModeIsActive() && (runtime.seconds() < 1.35)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        runtime.reset();
        robot.stop();

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);
    }
}