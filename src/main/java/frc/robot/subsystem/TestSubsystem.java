package frc.robot.subsystem;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.wpilibj.simulation.ElevatorSim;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Subsystem made for testing in sim, intended for education purposes only
 * Has a flywheel mechanism (controlled by a two SparkMaxes), 
 *      pivot (controlled by a SparkMax), 
 *      and elevator (controller by two Talons)
 * Author: C Furmanski (clydestale158)
 */
public class TestSubsystem extends SubsystemBase{
    //Variables
    //Motor controllers and configs
        //INFO - in 2027, you will need to specify the can bus on each device as well
        //Make the device ID and Can bus constants. Use those vars in the constructors, NOT THE NUMBERS
        //For Spark Maxes, ensure that the motortype matches the physical device. Also, make sure that the motor type inport is from rev
        //These names are also very mediocre. Please find better names. And these should be split into 2 or 3 subsystems. 
    private final SparkMax flywheelMotor1 = new SparkMax(0, MotorType.kBrushless);
    private final SparkMax flywheelMotor2 = new SparkMax(1, MotorType.kBrushless);
    private final SparkMaxConfig flyMotor1Config = new SparkMaxConfig();
    private final SparkMaxConfig flyMotor2Config = new SparkMaxConfig();

    private final SparkMax pivotMotor = new SparkMax(2, MotorType.kBrushless);
    private final SparkMaxConfig pivotMotorConfig = new SparkMaxConfig();

    private final TalonFX elevMotor1 = new TalonFX(3);
    private final TalonFX elevMotor2 = new TalonFX(4);

    //Starting configs
        //NOTE these should belong in constants
    private static final double pivotStartAngle = 10;
    private static final double elevStartHeight = 0.1;

    //Setpoint variables
    private double flywheelSetpoint = 0;
    private double pivotSetpoint = pivotStartAngle;
    private double elevSetpoint = elevStartHeight;

    //Elev Sim
    public final ElevatorSim elevSim = new ElevatorSim(DCMotor.getKrakenX60Foc(2), 4, 0.1, 0.01, -0.01, 1, true, 0.3);





    //Constructor
    public TestSubsystem(){

    }


    //Simulaton periodic
    @Override
    public void simulationPeriodic(){

    }

    //Periodic
    
    

}
