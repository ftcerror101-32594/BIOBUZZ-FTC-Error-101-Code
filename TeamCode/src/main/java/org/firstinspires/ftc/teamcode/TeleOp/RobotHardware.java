// RobotHardware class essentially describes/states inventory and parts of robot
// RobotHardware class also acts as a library where changes can update to all classes
package org.firstinspires.ftc.teamcode.TeleOp;

// DC Motor Extension allows for advanced controls such as velocity control
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

// new bot code v1 update
public class RobotHardware {
    // Setting up the DC Motors of the robot
    public DcMotorEx leftFront;
    public DcMotorEx rightFront;
    public DcMotorEx leftRear;
    public DcMotorEx rightRear;
    public DcMotorEx intake;
    public DcMotorEx transfer;
    public DcMotorEx outtake;
    public Servo gardenServo;

    // Describes the hardware specifics of the robot and initializes them
    public void init(HardwareMap hardwareMap) {
        // Setting the variables and shortened terms as basically, an ID
        leftFront = hardwareMap.get(DcMotorEx.class, "LF");
        leftRear = hardwareMap.get(DcMotorEx.class, "LR");
        rightFront = hardwareMap.get(DcMotorEx.class, "RF");
        rightRear = hardwareMap.get(DcMotorEx.class, "RR");
        intake = hardwareMap.get(DcMotorEx.class, "Intake");
        transfer = hardwareMap.get(DcMotorEx.class, "Transfer");
        outtake = hardwareMap.get(DcMotorEx.class, "Outtake");
        gardenServo = hardwareMap.get(Servo.class, "Garden Servo");
        // Sets the movement direction of motors
        leftFront.setDirection(DcMotorEx.Direction.FORWARD);
        leftRear.setDirection(DcMotorEx.Direction.FORWARD);
        rightFront.setDirection(DcMotorEx.Direction.REVERSE);
        rightRear.setDirection(DcMotorEx.Direction.REVERSE);
        intake.setDirection(DcMotorEx.Direction.FORWARD);
        transfer.setDirection(DcMotorEx.Direction.FORWARD);
        outtake.setDirection(DcMotorEx.Direction.FORWARD);
        gardenServo.setDirection(Servo.Direction.FORWARD);

        // Tells the motors to lock/brake position to prevent stray movement when motor off
        leftFront.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        intake.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        transfer.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        outtake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
}
