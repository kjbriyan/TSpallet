package com.example.tspallet.MainPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorfm5;
import com.example.tspallet.MainPackage.DataSparepartPackage.Datasparepartfm5;
import com.example.tspallet.MainPackage.InspectionPackage.Inspectionfm5;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingfm5;
import com.example.tspallet.R;

public class FinishMill5 extends AppCompatActivity {
    CardView troubleshooting_finishmill5;
    CardView datamotor_finishmill5;
    CardView datasparepart_finishmill5;
    CardView inspection_finishmill5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finishmill5);
        troubleshooting_finishmill5  = findViewById(R.id.troubleshooting_finishmill5);
        datamotor_finishmill5      = findViewById(R.id.datamotor_finishmill5);
        datasparepart_finishmill5         = findViewById(R.id.datasparepart_finishmill5);
        inspection_finishmill5         = findViewById(R.id.inspection_finishmill5);

        troubleshooting_finishmill5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill5.this, Troubleshootingfm5.class));
            }
        });

        datamotor_finishmill5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill5.this, Datamotorfm5.class));

            }
        });

        datasparepart_finishmill5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill5.this, Datasparepartfm5.class));

            }
        });

        inspection_finishmill5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill5.this, Inspectionfm5.class));
            }
        });
    }
}
