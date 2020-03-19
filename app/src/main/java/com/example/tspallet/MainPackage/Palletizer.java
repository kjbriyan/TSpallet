package com.example.tspallet.MainPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorpalletizer;
import com.example.tspallet.MainPackage.DataSparepartPackage.Datasparepartpalletizer;
import com.example.tspallet.MainPackage.InspectionPackage.Inspectionpalletizer;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingpalletizer;
import com.example.tspallet.R;

public class Palletizer extends AppCompatActivity {
    CardView troubleshooting_palletizer;
    CardView datamotor_palletizer;
    CardView datasparepart_palletizer;
    CardView inspection_palletizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palletizer);
        troubleshooting_palletizer  = findViewById(R.id.troubleshooting_palletizer);
        datamotor_palletizer      = findViewById(R.id.datamotor_palletizer);
        datasparepart_palletizer         = findViewById(R.id.datasparepart_palletizer);
        inspection_palletizer         = findViewById(R.id.inspection_palletizer);

        troubleshooting_palletizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Palletizer.this, Troubleshootingpalletizer.class));
            }
        });

        datamotor_palletizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Palletizer.this, Datamotorpalletizer.class));

            }
        });

        datasparepart_palletizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Palletizer.this, Datasparepartpalletizer.class));

            }
        });

        inspection_palletizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Palletizer.this, Inspectionpalletizer.class));
            }
        });
    }
}
