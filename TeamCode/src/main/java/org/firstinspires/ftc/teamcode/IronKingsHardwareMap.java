/**
 * Created by Marbella Castillo 9/17/2019 1:21:35 PM
 */

package org.firstinspires.ftc.teamcode;

//Import required packages.
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

//Define class.
public class IronKingsHardwareMap {

    //Define Motors and Sensors.
    DcMotor leftMotor, rightMotor, armMotor;
    Servo leftServo, rightServo;

    //Code to run at initialization.
    public void init(HardwareMap hwMap) {

        //Set motor name's for phone.
        rightMotor = hwMap.dcMotor.get("rm");
        leftMotor = hwMap.dcMotor.get("lm");
        armMotor = hwMap.dcMotor.get("am");
        rightServo = hwMap.servo.get("rs");
        leftServo = hwMap.servo.get ("ls");

        //Reverse motor directions
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        rightServo.setDirection(Servo.Direction.REVERSE);

        //Set motors to brake when not receiving power.
        leftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        armMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //Set motor to Zero power.
        rightMotor.setPower(0);
        leftMotor.setPower(0);

        //Set servos to position Zero.
        rightServo.setPosition(0);
        leftServo.setPosition(0);
    }

    //Function to control robot during TeleOP at defined speed.
    public void driveControls(double leftDrive, double rightDrive, double armDrive, double clawServo, double speed){

        leftMotor.setPower(-leftDrive * speed);
        rightMotor.setPower(-rightDrive * speed);

        armMotor.setPower(-armDrive / 2);

        leftServo.setPosition(clawServo);
        rightServo.setPosition(clawServo);
    }

    //Function to stop all motors.
    public void stop() {

        rightMotor.setPower(0);
        leftMotor.setPower(0);
        armMotor.setPower(0);
    }

    //Function to move robot forward.
    public void forward(double speed) {

        rightMotor.setPower(speed);
        leftMotor.setPower(speed);
    }

    //Function to move robot backwards.
    public void backwards(double speed) {

        rightMotor.setPower(-speed);
        leftMotor.setPower(-speed);
    }

    //Function to turn robot right.
    public void turnRight(double speed) {

        rightMotor.setPower(-speed);
        leftMotor.setPower(speed);
    }

    //Function to turn robot left.
    public void turnLeft(double speed) {

        rightMotor.setPower(speed);
        leftMotor.setPower(-speed);
    }

    //Function to lift arm.
    public void liftArm(double speed) {

        armMotor.setPower(speed);
    }

    //function to lower arm.
    public void lowerArm(double speed) {

        armMotor.setPower(-speed);
    }

    //Function to close Claw.
    public void closeClaw() {

        rightServo.setPosition(1);
        leftServo.setPosition(1);
    }

    //Function to open Claw.
    public void openClaw() {

        rightServo.setPosition(0);
        leftServo.setPosition(0);
    }

}