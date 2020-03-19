package com.example.tspallet.MainPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorfm5;
import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorfm6;
import com.example.tspallet.MainPackage.DataSparepartPackage.Datasparepartfm5;
import com.example.tspallet.MainPackage.DataSparepartPackage.Datasparepartfm6;
import com.example.tspallet.MainPackage.InspectionPackage.Inspectionfm5;
import com.example.tspallet.MainPackage.InspectionPackage.Inspectionfm6;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingfm5;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingfm6;
import com.example.tspallet.R;

public class FinishMill6 extends AppCompatActivity {
    CardView troubleshooting_finishmill6;
    CardView datamotor_finishmill6;
    CardView datasparepart_finishmill6;
    CardView inspection_finishmill6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finishmill6);
        troubleshooting_finishmill6     = findViewById(R.id.troubleshooting_finishmill6);
        datamotor_finishmill6           = findViewById(R.id.datamotor_finishmill6);
        datasparepart_finishmill6       = findViewById(R.id.datasparepart_finishmill6);
        inspection_finishmill6          = findViewById(R.id.inspection_finishmill6);

        troubleshooting_finishmill6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill6.this, Troubleshootingfm6.class));
            }
        });

        datamotor_finishmill6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill6.this, Datamotorfm6.class));

            }
        });

        datasparepart_finishmill6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill6.this, Datasparepartfm6.class));

            }
        });

        inspection_finishmill6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishMill6.this, Inspectionfm6.class));
            }
        });
    }
}
