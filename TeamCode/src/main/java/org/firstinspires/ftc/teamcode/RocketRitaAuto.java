package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="RocketRitaAuto", group = "Robot")
public class RocketRitaAuto {

    private DcMotor FL0 = null;
    private DcMotor FR1 = null;
    private DcMotor BL2 = null;
    private DcMotor BR3 = null;

    private ElapsedTime runtime = new ElapsedTime();

    static final double COUNTS_PER_MOTOR_REV = 1440 ;
    static final double DRIVE_GEAR_REDUCTION = 20 ;
    static final double WHEEL_DIAMETER_INCHES = 4.0 ;
    static final double COUNTS_PER_INCH = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
                                          (WHEEL_DIAMETER_INCHES * 3.1415);

   static final double DRIVE_SPEED = 0.6;

   static final double TURN_SPEED =0.5;

   @Override
    public void runOpMode() {

       FL0 = hardwareMap.get(DcMotor.class, "FL0");
       FR1 = hardwareMap.get(DcMotor.class, "FR1");
       BL2 = hardwareMap.get(DcMotor.class, "BL2");
       BR3 = hardwareMap.get(DcMotor.class, "BR3");

       FL0.setDirection(DcMotor.Direction.REVERSE);
       FR1.setDirection(DcMotor.Direction.REVERSE);
       BL2.setDirection(DcMotor.Direction.FORWARD);
       BR3.setDirection(DcMotor.Direction.FORWARD);

       FL0.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       FR1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       BL2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       BR3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

       FL0.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
       FR1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
       BL2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
       BR3.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

       telemetry.addData("Starting at", "%7d :%7d",




   }
}

