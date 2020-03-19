package com.example.tspallet.MainPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tspallet.MainPackage.DataMotorPackage.Datamotorpacker;
import com.example.tspallet.MainPackage.DataSparepartPackage.Datasparepartpacker;
import com.example.tspallet.MainPackage.InspectionPackage.Inspectionpacker;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingpacker;
import com.example.tspallet.R;

public class Packer extends AppCompatActivity {
    CardView troubleshooting_packer;
    CardView datamotor_packer;
    CardView datasparepart_packer;
    CardView inspection_packer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packer);
        troubleshooting_packer  = findViewById(R.id.troubleshooting_packer);
        datamotor_packer      = findViewById(R.id.datamotor_packer);
        datasparepart_packer         = findViewById(R.id.datasparepart_packer);
        inspection_packer         = findViewById(R.id.inspection_packer);

        troubleshooting_packer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Packer.this, Troubleshootingpacker.class));
            }
        });

        datamotor_packer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Packer.this, Datamotorpacker.class));

            }
        });

        datasparepart_packer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Packer.this, Datasparepartpacker.class));

            }
        });

        inspection_packer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Packer.this, Inspectionpacker.class));
            }
        });
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
}
