// RobotHardware class essentially describes/states inventory and parts of robot
// RobotHardware class also acts as a library where changes can update to all classes
package org.firstinspires.ftc.teamcode.TeleOp;

// DC Motor Extension allows for advanced controls such as velocity control
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
// new bot code v1 update
public class RobotHardware {
    // Setting up the DC Motors of the robot
    public DcMotorEx leftFront;
    public DcMotorEx rightFront;
    public DcMotorEx leftRear;
    public DcMotorEx rightRear;
    //public DcMotorEx bottomIntake;
    //public DcMotorEx topIntake;

    // Describes the hardware specifics of the robot and initializes them
    public void init(HardwareMap hardwareMap) {
        // Setting the variables and shortened terms as basically, an ID
        leftFront = hardwareMap.get(DcMotorEx.class, "LF");
        leftRear = hardwareMap.get(DcMotorEx.class, "LR");
        rightFront = hardwareMap.get(DcMotorEx.class, "RF");
        rightRear = hardwareMap.get(DcMotorEx.class, "RR");
        //bottomIntake = hardwareMap.get(DcMotorEx.class, "BI");
        //topIntake = hardwareMap.get(DcMotorEx.class, "TI");

        // Sets the movement direction of motors
        leftFront.setDirection(DcMotorEx.Direction.REVERSE);
        leftRear.setDirection(DcMotorEx.Direction.REVERSE);
        rightFront.setDirection(DcMotorEx.Direction.FORWARD);
        rightRear.setDirection(DcMotorEx.Direction.FORWARD);
        //bottomIntake.setDirection(DcMotorEx.Direction.FORWARD);
        //topIntake.setDirection(DcMotorEx.Direction.FORWARD);

        // Tells the motors to lock/brake position to prevent stray movement when motor off
        leftFront.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        //bottomIntake.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        //topIntake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
}
