package com.example.bet.geolocation;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectphotoActivity extends AppCompatActivity {
Button CM,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectphoto);
        CM=(Button) findViewById(R.id.cambutton);
        CM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OPS();
            }
        });


        next=(Button) findViewById(R.id.chsnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencheck();
            }
        });
    }
    public void OPS(){
        Intent ab=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        final int ACTIVITY_SELECT_IMAGE = 1234;
        startActivityForResult(ab, ACTIVITY_SELECT_IMAGE);
    }
    public void opencheck(){
        Intent intent9=new Intent(this,crntlocActivity.class);
        startActivity(intent9);
    }
}
