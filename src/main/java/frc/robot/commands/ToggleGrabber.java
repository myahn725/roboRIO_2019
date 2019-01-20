package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

public class ToggleGrabber extends Command {

  private DoubleSolenoid.Value toggleType;

   public ToggleGrabber(Value toggleType) {
      super("Toggle hatch grabber");
      requires(Robot.hatchPanelGrabber);
      this.toggleType = toggleType;
  }

  @Override
  protected void execute() {
      Robot.hatchPanelGrabber.toggleGrabber(Value.kOff);
      Robot.hatchPanelGrabber.toggleGrabber(toggleType);
  }

  @Override
  protected boolean isFinished() {
      return true;
  }

}
