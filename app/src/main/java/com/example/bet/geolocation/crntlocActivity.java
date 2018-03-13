package com.example.bet.geolocation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class crntlocActivity extends AppCompatActivity {
    EditText cr;
    FirebaseDatabase fb1;
    DatabaseReference myref1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crntloc);
        cr = (EditText) findViewById(R.id.crnt);
        Button next = (Button) findViewById(R.id.locnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstart();
            }
        });
    }

    public void openstart() {

        String loc = cr.getText().toString();
        SharedPreferences pref=getApplicationContext().getSharedPreferences("my",0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("location",loc);
        editor.commit();

        String name;
        String number;
        String location;
        String password;
        name = pref.getString("name",null);
       number= pref.getString("number",null);
       location= pref.getString("location",null);
        password = pref.getString("password",null);
        //editor.commit();
        Naamecls xx=new Naamecls(name,number,location,password);
        String str=name+number;
        pref=getApplicationContext().getSharedPreferences("my",0);
        editor = pref.edit();
        editor.putString("your ID:",str);
        editor.commit();


        FirebaseDatabase fdb1 = FirebaseDatabase.getInstance();
        DatabaseReference myref = fdb1.getReference();
        myref.child(str).setValue(xx);

        if (loc.equals("")) {
            Toast.makeText(this, "plese enter your current location", Toast.LENGTH_LONG).show();
        } else {
            Intent intent6 = new Intent(this, startbtnActivity.class);
            startActivity(intent6);
        }
    }
}
