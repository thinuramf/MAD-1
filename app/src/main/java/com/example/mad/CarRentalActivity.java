package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CarRentalActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_rental);


        button = (Button) findViewById(R.id.menubtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });


        button = (Button) findViewById(R.id.pickuplocationbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPickUpLocationActivity();
            }
        });

        button =(Button) findViewById(R.id.calanderbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalenderActivity();
            }
        });


        TextView textView = findViewById(R.id.date);
        Button button = (Button) findViewById(R.id.calanderbtn);

        String date = getIntent().getStringExtra(("Set Date"));
        if(date!= null)
            textView.setText((date));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CarRentalActivity.this, CalenderActivity.class);
                startActivity(intent);

            }
        });

        button =(Button) findViewById(R.id.historybtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHistoryActivity();
            }
        });

    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPickUpLocationActivity(){
        Intent intent = new Intent(this, PickUpLocation.class);
        startActivity(intent);
    }

    public void openCalenderActivity(){
        Intent intent = new Intent(this, CalenderActivity.class);
        startActivity(intent);
    }


    public void openHistoryActivity(){
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
}



