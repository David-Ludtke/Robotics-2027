package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

class Robot extends TimedRobot {
  public Robot() {
    super(1.0 / 50.0);
  }

  @Override public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

  @Override public void simulationInit() {}

  @Override public void robotInit() {}
}