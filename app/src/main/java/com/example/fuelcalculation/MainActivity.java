package com.example.fuelcalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText kilometersNumber;
    private TextView output;

    private Button button;

    private AirPlane plane1 = new AirPlane("Самолет 1", 210, 850,3.7f);
    private AirPlane plane2 = new AirPlane("Самолет 2", 189, 900, 2.8f);
    private Helicopter helicopter = new Helicopter("Вертолет", 8, 250, 14);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        kilometersNumber = findViewById(R.id.enterNumberFuel);
        button = findViewById(R.id.button);

        button.setOnClickListener(click -> calculationTimeFuel());
    }

    public void calculationTimeFuel(){
        float kilometers = Float.parseFloat(kilometersNumber.getText().toString());
        String message = String.format("Чтобы пролететь %.2f киломметров.\n", kilometers);
        message = message + String.format("%s нужно %.2f минут и %.2f тонн топлива\n", plane1.getName(), plane1.countTime(kilometers), plane1.countFuel(kilometers));
        message = message + String.format("%s нужно %.2f минут и %.2f тонн топлива\n", plane2.getName(), plane2.countTime(kilometers), plane2.countFuel(kilometers));
        message = message + String.format("%s нужно %.2f минут и %.2f кг топлива", helicopter.getName(), helicopter.countTime(kilometers), helicopter.countFuel(kilometers));

        output.setText(message);
    }
}