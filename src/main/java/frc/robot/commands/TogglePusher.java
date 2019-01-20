package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

public class TogglePusher extends Command {
    
  private DoubleSolenoid.Value toggleType;

   public TogglePusher(Value toggleType) {
      super("Toggle hatch pusher");
      requires(Robot.hatchPanelGrabber);
      this.toggleType = toggleType;
  }

  @Override
  protected void execute() {
      Robot.hatchPanelGrabber.togglePusher(Value.kOff);
      Robot.hatchPanelGrabber.togglePusher(toggleType);
  }

  @Override
  protected boolean isFinished() {
      return true;
  }

}
