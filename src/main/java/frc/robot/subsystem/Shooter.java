package frc.robot.subsystem;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class Shooter {
    //sparkMaxs are motors
   private final SparkMax motorShooterSparkMax = new SparkMax(0, MotorType.kBrushless);
   private final SparkMax followerMotor = new SparkMax(4, MotorType.kBrushless);
   private final SparkMax motor6 = new SparkMax(8, MotorType.kBrushless);
//constructor
public Shooter(){

}

}
