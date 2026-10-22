package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystem.ShooterSubsytem;

public class RobotContainer {

    public ShooterSubsytem shooterSubsys = new ShooterSubsytem();

    // Sim controller for testing
    public CommandJoystick joystick;

    // Constructor
    public RobotContainer() {

        // If in sim, create a joystick
        if (RobotBase.isSimulation()) {
            joystick = new CommandJoystick(1);
            configSimBindings();
            System.out.println("STARTING SIMULATION");
        }

    }

    // private(cannot access outside of this class) void(returns no information)
    // method
    // should be called once, and only if we are in simulation
    private void configSimBindings() {
        joystick.button(1).onTrue(shooterSubsys.printTest("This is a test :)"));
    }

}
