package com.sonacollegeoftechnology.intent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    TextView name,age;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        back = findViewById(R.id.back);

        Intent intent = getIntent();
        String n = intent.getStringExtra("name");
        String a = intent.getStringExtra("age");

        name.setText("Name: "+n);
        age.setText("Age: "+a);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
