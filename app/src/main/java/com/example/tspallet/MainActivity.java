package com.example.tspallet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.tspallet.MainPackage.DataMotor;
import com.example.tspallet.MainPackage.DataSparepart;
import com.example.tspallet.MainPackage.FinishMill5;
import com.example.tspallet.MainPackage.FinishMill6;
import com.example.tspallet.MainPackage.Inspection;
import com.example.tspallet.MainPackage.Packer;
import com.example.tspallet.MainPackage.Palletizer;
import com.example.tspallet.MainPackage.Troubleshooting;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {
    CardView troubleshooting;
    CardView datamotor;
    CardView datasparepart;
    CardView inspection;
    CardView palletizer;
    CardView packer;
    CardView finishmill5;
    CardView finishmill6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        troubleshooting = findViewById(R.id.troubleshooting);
        datamotor = findViewById(R.id.datamotor);
        datasparepart = findViewById(R.id.datasparepart);
        inspection = findViewById(R.id.inspection);
        palletizer = findViewById(R.id.palletizer);
        packer = findViewById(R.id.packer);
        finishmill5 = findViewById(R.id.finishmill5);
        finishmill6 = findViewById(R.id.finishmill6);

        troubleshooting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Troubleshooting.class));
            }
        });

        datamotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DataMotor.class));

            }
        });

        datasparepart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DataSparepart.class));

            }
        });
        inspection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Inspection.class));
            }
        });

        palletizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Palletizer.class));
            }
        });

        packer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Packer.class));

            }
        });

        finishmill5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FinishMill5.class));

            }
        });
        finishmill6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FinishMill6.class));
            }
        });
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_account_circle);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       // CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
       // collapsingToolbarLayout.setTitle("Maintenance Assistance");
        // collapsingToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
       // collapsingToolbarLayout.setExpandedTitleColor(ContextCompat.getColor(this, R.color.colorPrimary));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting_round, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }
}

