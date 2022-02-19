package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.ConveyorConstants;
import frc.robot.subsystems.Conveyor;

public class ConveyorUp extends CommandBase {
    private final Conveyor m_conveyor; 
    public ConveyorUp (Conveyor conveyor){
        super();
        m_conveyor = conveyor; 
        addRequirements(m_conveyor);
    }

    @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      m_conveyor.set(ConveyorConstants.conveyorSpeed);
      double color= m_conveyor.readColorSensor();
         SmartDashboard.putNumber("color", color);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      m_conveyor.set(ConveyorConstants.conveyorSpeedStop); 
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

}
