package frc.robot.simulation;

import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.wpilibj.smartdashboard.MechanismLigament2d;
import edu.wpi.first.wpilibj.smartdashboard.MechanismRoot2d;
import edu.wpi.first.wpilibj.util.Color8Bit;

public class Viz {
    private String name;
    private MechanismRoot2d root;
    private MechanismLigament2d ligament;

    // Constructor
    public Viz(String vizName) {
        this.name = vizName;
    }

    // Constructor
    public Viz(String vizName, MechanismRoot2d root, double ligLength, double ligAngle, double ligLineWidth) {
        this.name = vizName;

    }

    // Constructor
    public Viz(String vizName, MechanismRoot2d root, double ligLength, double ligAngle, double ligLineWidth,
            Color8Bit color) {
        this.name = vizName;

    }

    /**
     * Getter method that returns the ligament. Grab ligament info from this method
     */
    public MechanismLigament2d getLigament() {
        return ligament;
    }

    /** Setter method that changes the color of the ligament */
    public void setColor(Color8Bit color) {
        ligament.setColor(color);
    }

    /** Setter method that returns the ligament's length */
    public void setLength(double length) {
        ligament.setLength(length);
    }

    /** Setter method that returns the ligament's angle */
    public void setAngle(double angle, Rotation3d rotation) {
        ligament.setAngle(angle);
    }

    /** Setter method that returns the ligament's root */
    public void setRoot(double x, double y) {
        root.setPosition(x, y);
    }

}
