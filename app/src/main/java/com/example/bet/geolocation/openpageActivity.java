package com.example.bet.geolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class openpageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openpage);
        Button next=(Button) findViewById(R.id.openext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpageActivity();
            }
        });
    }
    public void openpageActivity(){
        Intent intenta1=new Intent(this,conrqstActivity.class);
        startActivity(intenta1);
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
