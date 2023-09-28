package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class DrivetrainCommands extends CommandBase {

  RobotContainer container;
  // private int invertButtonFrameCount;
  // private boolean inverted;

  public DrivetrainCommands() {
    addRequirements(Robot.drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    container = RobotContainer.getInstance();
    // invertButtonFrameCount = 0;
    // inverted = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // set the motor speeds at every tick with the controller inputs
    Robot.drivetrain.Drive(container.xboxController.getLeftX(), container.xboxController.getLeftY());

    // check if the invert button is being pressed
    // if (container.invertButton.get() && inverted ==false)
    // {
    // Robot.drivetrain.invertControls();
    // inverted = true;
    // }

    // A system to ensure input is not read twice.
    // Essentially counts ten "ticks" of the computer and doesn't
    // register inputs again until 10 ticks have passed
    // if (inverted = true) {
    // invertButtonFrameCount++;

    // if (invertButtonFrameCount > 10)
    // inverted = false;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Turning the robot off when the command is interrupted
    // Robot.drivetrain.Drive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {

    // Turning the motors off when the command is done
    // Robot.drivetrain.Drive(0,0);

    return false;
  }
}
