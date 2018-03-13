package com.example.bet.geolocation;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaCas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.bet.geolocation.nameActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class numbrActivity extends AppCompatActivity {
    EditText number1;
    Button next;
    /*FirebaseDatabase fdb1;*/
   /*DatabaseReference myref;*/
   /* nmbrcls bb;*/
    // public static final String MyPREFERENCES = "MyPrefs" ;
    //public static final String Name = "nameKey";
    //SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbr);
      /*  fdb1 = FirebaseDatabase.getInstance();
         myref = fdb1.getReference();
         bb=new nmbrcls();*/


        number1 = (EditText) findViewById(R.id.nmbr);
        Button next = (Button) findViewById(R.id.nmbrnext);
        // sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* String a = number1.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(Name, a);
                editor.commit();*/
                /*SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
                String ab = sharedPreferences.getString("number", "");
                number1.setText(ab);


                Naamecls NMB=new Naamecls();
                FirebaseDatabase fdb1 = FirebaseDatabase.getInstance();
                DatabaseReference myref = fdb1.getReference();

                myref.setValue(number1);*/

                /*String a = number1.getText().toString();
                SharedPreferences pref=getApplicationContext().getSharedPreferences("my",0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("name",a);
                editor.commit();*/

                openMain4Activity();
            }
        });
    }
   /* public  void  ggetvalue(){
        bb.setNumber(number1.getText().toString());
    }
    public void next(View view){
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                myref.child("user1").setValue(bb);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }*/
    /*public void information() {
        String number = number1.getText().toString();
        NAMECLS abc = new nmbrcls(number);
        FirebaseDatabase fdb1 = FirebaseDatabase.getInstance();
DatabaseReference myref = fdb1.getReference();

        myref.setValue(abc);
    }*/


    public void openMain4Activity() {
        String nm = number1.getText().toString();

        /*Naamecls NMB=new Naamecls();
        FirebaseDatabase fdb1 = FirebaseDatabase.getInstance();
        DatabaseReference myref = fdb1.getReference();

        myref.setValue(NMB);*/


        SharedPreferences pref=getApplicationContext().getSharedPreferences("my",0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("number",nm);
        editor.commit();
        if (nm.equals("")) {
            Toast.makeText(this, "plese enter your number", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this, passwrdActivity.class);
            startActivity(intent);
            /*information();*/
        }
    }
}
