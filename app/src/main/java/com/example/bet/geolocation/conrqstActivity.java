package com.example.bet.geolocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class conrqstActivity extends AppCompatActivity {
EditText cnctn;
Button SEND;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conrqst);
        EditText cnctn=(EditText)findViewById(R.id.crnt);
        Button SEND=(Button) findViewById(R.id.sendbtn2);
        SEND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openss();
            }
        });
    }
    public  void openss() {
        String ac = cnctn.getText().toString();
        if (ac.equals("")) {
            Toast.makeText(this, "plese enter your parner ID", Toast.LENGTH_LONG).show();
        } else {
            Intent NN = new Intent(this, mainpageActivity.class);
            startActivity(NN);
        }


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


