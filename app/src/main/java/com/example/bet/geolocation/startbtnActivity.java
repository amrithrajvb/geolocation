package com.example.bet.geolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startbtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startbtn);
        Button next=(Button) findViewById(R.id.letsbutton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openletsgo();
            }
        });
    }
    public  void openletsgo(){
        Intent intent10=new Intent(this,openpageActivity.class);
        startActivity(intent10);
    }
}
