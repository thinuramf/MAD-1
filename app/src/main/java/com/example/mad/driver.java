package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class driver extends AppCompatActivity {

    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);


        imgButton =(ImageButton)findViewById(R.id.paybtn);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCarRentalActivity();
            }
        });


        imgButton =(ImageButton)findViewById(R.id.acccbtn);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmployeeProfile();
            }
        });
    }

    public void openCarRentalActivity(){
        Intent intent = new Intent(this, CarRentalActivity.class);
        startActivity(intent);
    }
    public void openEmployeeProfile(){
        Intent intent = new Intent(this, Employee_Profile.class);
        startActivity(intent);
    }
}