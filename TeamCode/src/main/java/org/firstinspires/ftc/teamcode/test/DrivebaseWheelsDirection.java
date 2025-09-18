package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class DrivebaseWheelsDirection extends OpMode {
    DcMotor rfmotor;
    DcMotor lfmotor;
    DcMotor rbmotor;
    DcMotor lbmotor;

    @Override
    public void init() {

        rfmotor = hardwareMap.get(DcMotor.class, "rf");
        lfmotor = hardwareMap.get(DcMotor.class, "lf");
        rbmotor = hardwareMap.get(DcMotor.class, "rb");
        lbmotor = hardwareMap.get(DcMotor.class, "lb");

        rfmotor.setDirection(DcMotor.Direction.REVERSE);
        lfmotor.setDirection(DcMotor.Direction.FORWARD);
        rbmotor.setDirection(DcMotor.Direction.REVERSE);
        lbmotor.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        double power = -gamepad1.left_stick_y;

        rfmotor.setPower(power);
        lfmotor.setPower(power);
        rbmotor.setPower(power);
        lbmotor.setPower(power);

        telemetry.addData("power", power);
        telemetry.update();
    }
}
