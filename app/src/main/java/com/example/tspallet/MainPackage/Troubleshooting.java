package com.example.tspallet.MainPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingpalletizer;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingpacker;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingfm5;
import com.example.tspallet.MainPackage.TroubleshootingPackage.Troubleshootingfm6;
import com.example.tspallet.R;


public class Troubleshooting extends AppCompatActivity {
    CardView troubleshooting_palletizer;
    CardView troubleshooting_packer;
    CardView troubleshooting_fm5;
    CardView troubleshooting_fm6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troubleshooting);
        troubleshooting_palletizer  = findViewById(R.id.troubleshooting_palletizer);
        troubleshooting_packer      = findViewById(R.id.troubleshooting_packer);
        troubleshooting_fm5         = findViewById(R.id.troubleshooting_fm5);
        troubleshooting_fm6         = findViewById(R.id.troubleshooting_fm6);

        troubleshooting_palletizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Troubleshooting.this, Troubleshootingpalletizer.class));
            }
        });

        troubleshooting_packer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Troubleshooting.this, Troubleshootingpacker.class));

            }
        });

        troubleshooting_fm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Troubleshooting.this, Troubleshootingfm5.class));

            }
        });

        troubleshooting_fm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Troubleshooting.this, Troubleshootingfm6.class));
            }
        });
    }
}
