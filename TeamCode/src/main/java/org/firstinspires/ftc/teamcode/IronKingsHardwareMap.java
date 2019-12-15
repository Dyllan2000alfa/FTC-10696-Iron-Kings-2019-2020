/**
 * Created by Marbella Castillo 9/17/2019 1:21:35 PM
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class IronKingsHardwareMap {

    DcMotor leftMotor, rightMotor, armMotor;
    Servo leftServo, rightServo;

    public void init(HardwareMap hwMap) {

        rightMotor = hwMap.dcMotor.get("rm");
        leftMotor = hwMap.dcMotor.get("lm");
        armMotor = hwMap.dcMotor.get("am");
        rightServo = hwMap.servo.get("rs");
        leftServo = hwMap.servo.get ("ls");

        leftMotor.setDirection(DcMotor.Direction.REVERSE);

        rightMotor.setPower(0);
        leftMotor.setPower(0);

        rightServo.setPosition(1);
        leftServo.setPosition(0);
    }

    public void stop() {

        rightMotor.setPower(0);
        leftMotor.setPower(0);
        armMotor.setPower(0);
    }

    public void forward(double speed) {

        rightMotor.setPower(speed);
        leftMotor.setPower(speed);
    }

    public void reverse(double speed) {

        rightMotor.setPower(-speed);
        leftMotor.setPower(-speed);
    }

    public void turnRight(double speed) {

        rightMotor.setPower(-speed);
        leftMotor.setPower(speed);
    }

    public void turnLeft(double speed) {

        rightMotor.setPower(speed);
        leftMotor.setPower(-speed);
    }

    public void liftArm(double speed) {

        armMotor.setPower(speed);
    }

    public void lowerArm(double speed) {

        armMotor.setPower(-speed);
    }

    public void closeClaw() {

        rightServo.setPosition(0);
        leftServo.setPosition(1);
    }

    public void openClaw() {

        rightServo.setPosition(1);
        leftServo.setPosition(0);
    }
}