/**
 * Created By Dyllan Tinoco 12/11/19
 */

package org.firstinspires.ftc.teamcode;

//Import required packages.
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//Define TeleOP Name and Group. Define class.
@TeleOp(name="TeleOp 3\4 Speed", group="TeleOp")
public class IronKingsTeleOpThreeQuarterSpeed extends OpMode {

    //Link HardwareMap.
    IronKingsHardwareMap robot = new IronKingsHardwareMap();

    //Code to run at initialization.
    @Override
    public void init() {

        //Run initialization code from hardware map.
        robot.init(hardwareMap);
    }

    //Code to loop while code is running.
    public void loop() {

        //Run drive controls function with defined controllers and speed.
        robot.driveControls(gamepad1.left_stick_y, gamepad1.right_stick_y, gamepad2.right_stick_y, gamepad2.right_trigger, 0.75);
    }

    //Code to run when Stop button is pressed.
    public void stop() {

        //Run stop function.
        robot.stop();
    }
}