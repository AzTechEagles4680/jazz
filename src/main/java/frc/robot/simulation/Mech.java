package frc.robot.simulation;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.smartdashboard.Mechanism2d;
import edu.wpi.first.wpilibj.util.Color8Bit;

public class Mech {
    private Mechanism2d mech;
    private String name;

    private ArrayList<Viz> visz = new ArrayList<>();

    //Constructor
    private Mech(String subsystemName, double mechWidth, double mechHieght){
        mech = new Mechanism2d(mechWidth, mechHieght);
        this.name = subsystemName;
    }

    /** Returns the mechanism 2d. Can write to or grab information from the mech using this method */
    public Mechanism2d getMech(){
        return mech;
    }

    public void addViz(String vizName, double rootX, double rootY, double ligLenth, double ligAngle, double ligLineWidth, Color8Bit ligColor){
        visz.add(new Viz(vizName, rootX, rootY, ligLenth, ligAngle, ligLineWidth, ligColor));
    }
}
