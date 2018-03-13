package com.example.bet.geolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sgnlogActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sgnlog);
        Button signup = (Button) findViewById(R.id.signup);
        Button login = (Button) findViewById(R.id.login1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Activity();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openname();
            }
        });
    }

    public void openname() {
        Intent intent2 = new Intent(this, nameActivity.class);
        startActivity(intent2);
    }





    public  void openMain2Activity(){
        Intent intent = new Intent(this,login1Activity.class);
        startActivity(intent);
    }
}



