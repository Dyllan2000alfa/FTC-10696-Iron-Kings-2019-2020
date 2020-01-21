/**
 * Created By Dyllan Tinoco 12/11/19
 */

package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Stop on line, Forward", group="Stop on Line")
public class IronKingsAutonForward extends LinearOpMode {

    IronKingsHardwareMap robot = new IronKingsHardwareMap();
    private ElapsedTime runtime = new ElapsedTime();

    public void runOpMode() {

        robot.init(hardwareMap);

        telemetry.addData("Status", "Ready to run");
        telemetry.update();

        waitForStart();

        runtime.reset();

        robot.forward(0.5);
        while (opModeIsActive() && (runtime.seconds() < 1.0)) {
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