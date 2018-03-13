package com.example.bet.geolocation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class passwrdActivity extends AppCompatActivity {
EditText PS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passwrd);
        PS=(EditText)findViewById(R.id.ps);
        Button next = (Button) findViewById(R.id.psnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain5Activity();
            }
        });
    }

    public void openMain5Activity() {
        String pwd = PS.getText().toString();

        SharedPreferences pref=getApplicationContext().getSharedPreferences("my",0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("password",pwd);
        editor.commit();
        if (pwd.equals("")) {
            Toast.makeText(this, "plese enter the password", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this, photocamera1Activity.class);
            startActivity(intent);
        }
    }
}
