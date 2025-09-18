package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class PushTest extends OpMode {
    @Override
    public void init() {
        double power=1;
    }

    @Override
    public void loop() {
     telemetry.addData("power", 1);
     telemetry.update();
    }
}

