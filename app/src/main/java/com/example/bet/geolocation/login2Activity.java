package com.example.bet.geolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login2Activity extends AppCompatActivity {
EditText log2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        log2=(EditText)findViewById(R.id.pss);
        Button next=(Button) findViewById(R.id.log2next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstart();
            }
        });
    }
    public void  openstart() {
        String a = log2.getText().toString();
        if (a.equals("")) {
            Toast.makeText(this, "plese enter the password", Toast.LENGTH_LONG).show();
        } else {
            Intent isr = new Intent(this, openpageActivity.class);
            startActivity(isr);
        }
    }
}
