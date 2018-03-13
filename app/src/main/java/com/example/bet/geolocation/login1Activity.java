package com.example.bet.geolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login1Activity extends AppCompatActivity {
    EditText log1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        log1 = (EditText) findViewById(R.id.crnt);
        Button next = (Button) findViewById(R.id.log1next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengopass1();
            }
        });
    }

    public void opengopass1() {
        String a = log1.getText().toString();
        if (a.equals("")) {
            Toast.makeText(this, "plese enter your number", Toast.LENGTH_LONG).show();
        } else {
            Intent intent9 = new Intent(this, login2Activity.class);
            startActivity(intent9);
        }

    }
}