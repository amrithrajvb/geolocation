package com.example.bet.geolocation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

public class mainpageActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences pref=getApplicationContext().getSharedPreferences("my",0);
        SharedPreferences.Editor editor = pref.edit();

        String str=pref.getString("id",null);
        if(!str.equals("")){
            Intent strt=new Intent(this,startbtnActivity.class);
            startActivity(strt);
        }else {
            Intent strt2=new Intent(this,login1Activity.class);
            startActivity(strt2);
        }
        setContentView(R.layout.mainpage);
        ImageButton LOCATION=(ImageButton)findViewById(R.id.LOCATNbutton);
        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase fdb;
                DatabaseReference myref;
                FirebaseDatabase fdb1=FirebaseDatabase.getInstance();
                DatabaseReference myref1=fdb1.getReference("message");
                myref1.setValue("hai");
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menutop:
                pro();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void pro(){

        Intent VV=new Intent(this,profileActivity.class);
        startActivity(VV);

    }
}

