package com.lemur.sysanalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ticket extends AppCompatActivity {

    private Button manEntryButton;
    private Button scanButton;
    public static TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        //changes when bar code scanned
        resultTextView = findViewById(R.id.testText);

        //manual entry
        manEntryButton = findViewById(R.id.manEntryButton);
        manEntryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openManualEntry();
            }
        });

        //scan
        scanButton = findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), scan.class));
            }
        });

    }

    public void openManualEntry()
    {
        Intent intent = new Intent(this, manualEntry.class);
        startActivity(intent);
    }
}
