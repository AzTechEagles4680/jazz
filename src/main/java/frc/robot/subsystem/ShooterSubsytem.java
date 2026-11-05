package frc.robot.subsystem;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsytem extends SubsystemBase {
    //sparkMaxs are motors
   private final SparkMax motorShooterSparkMax = new SparkMax(0, MotorType.kBrushless);
   private final SparkMax followerMotor = new SparkMax(4, MotorType.kBrushless);
   private final SparkMax motor6 = new SparkMax(8, MotorType.kBrushless);

   public Double SHOOTERSPEED = 0.0;

//constructor
public ShooterSubsytem(){

}

    public Command startMethod(double speed){
        return Commands.runOnce(()->
            motor6.set(speed));
    }

    //Test statement
    //DEMO/SIM USE (repurpose for troubleshooting if need be)
    public Command printTest(String text){
        return Commands.run(()->
            System.out.println(text
            ));
    }
    
    public Command print(String text){
        return Commands.runEnd(()->
            System.out.println(text
            ), ()->
                System.out.println("mech")
            );
    }
}
