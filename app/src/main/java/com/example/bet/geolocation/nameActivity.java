package com.example.bet.geolocation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.jar.Attributes;

public class nameActivity extends AppCompatActivity {
    EditText editText;
   // FirebaseDatabase nm1;
   // DatabaseReference nm2;
    String a;
  /* namecls nnm;*/

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);




        editText=(EditText)findViewById(R.id.nameText);
         /*nm1 =FirebaseDatabase.getInstance();
         nm2=nm1.getReference();
        nnm =new namecls ();*/





      /* SharedPreferences pref=getApplicationContext().getSharedPreferences("my",0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name",a);
        pref.getString("name:",a);
        Log.i("NAME",a);*/

        Button next = (Button) findViewById(R.id.nmnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*String a=editText.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =sharedPreferences.edit();
                editor.putString("name",a);

                editor.commit();*/




               /* Naamecls NMB=new Naamecls();
                FirebaseDatabase fdb1 = FirebaseDatabase.getInstance();
                DatabaseReference myref = fdb1.getReference();

                myref.setValue(NMB);*/

                openMain3Activity();
            }
        });
    }
   /* private  void getvalue(){
        nnm.setName(editText.getText().toString());

    }
    public void next(View view){
        nm2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
             nm2.child("user1").setValue(nnm);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }*/
   /*public void nameon(){
 String v=editText.getText().toString();
 Naamecls dbmss1=new Naamecls();

       FirebaseDatabase nm1 =FirebaseDatabase.getInstance();
        DatabaseReference nm2=nm1.getReference();

        nm2.setValue(dbmss1);

    }*/
    public void openMain3Activity() {
       /* Naamecls NMB=new Naamecls();
        FirebaseDatabase fdb1 = FirebaseDatabase.getInstance();
        DatabaseReference myref = fdb1.getReference();

        myref.setValue(NMB);*/


       String a=editText.getText().toString();
        SharedPreferences pref=getApplicationContext().getSharedPreferences("my",0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name",a);
        editor.commit();

        if(a.equals("")){
            Toast.makeText(this,"plese enter your name",Toast.LENGTH_LONG).show();
        }else {
            Intent intent1 = new Intent(this, MapsActivity.class);
            startActivity(intent1);
          /* nameon();*/

        }
    }

}
