package com.example.tspallet.MainPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorpalletizer;
import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorpacker;
import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorfm5;
import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorfm6;
import com.example.tspallet.R;

public class DataMotor extends AppCompatActivity {
    CardView datamotor_palletizer;
    CardView datamotor_packer;
    CardView datamotor_fm5;
    CardView datamotor_fm6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datamotor);
        datamotor_palletizer  = findViewById(R.id.datamotor_palletizer);
        datamotor_packer      = findViewById(R.id.datamotor_packer);
        datamotor_fm5         = findViewById(R.id.datamotor_fm5);
        datamotor_fm6         = findViewById(R.id.datamotor_fm6);

        datamotor_palletizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataMotor.this, Datamotorpalletizer.class));
            }
        });

        datamotor_packer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataMotor.this, Datamotorpacker.class));

            }
        });

        datamotor_fm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataMotor.this, Datamotorfm5.class));

            }
        });

        datamotor_fm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataMotor.this, Datamotorfm6.class));
            }
        });
    }
}
