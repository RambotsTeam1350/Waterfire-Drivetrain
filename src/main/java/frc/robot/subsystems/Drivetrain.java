package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {

    // Creating instances of all the motors
    private Victor right1;
    private Victor right2;
    private Victor left1;
    private Victor left2;
    private int inverseVal;

    // constructor for the Subsystem
    public Drivetrain() {
        // initializing the motors
        right1 = new Victor(Constants.right1);
        right2 = new Victor(Constants.right2);

        left1 = new Victor(Constants.left1);
        left2 = new Victor(Constants.left2);

        inverseVal = 1;
    }

    // sets the speed of both motors at once
    public void Drive(double leftVal, double rightVal) {
        setLeft(leftVal);
        setRight(rightVal);
        System.out.println(leftVal);
    }

    // sets the speed of the left motor
    public void setLeft(double leftVal) {
        left1.set(-leftVal * inverseVal);
        left2.set(-leftVal * inverseVal);
    }

    // sets the speed of the right motor
    public void setRight(double rightVal) {
        right1.set(rightVal * inverseVal);
        right2.set(rightVal * inverseVal);
    }

    public void invertControls() {
        inverseVal *= -1;
    }
}