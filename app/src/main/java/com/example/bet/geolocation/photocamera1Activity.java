package com.example.bet.geolocation;

import android.app.VoiceInteractor;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Picture;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class photocamera1Activity extends AppCompatActivity {
    private static final int PICK_IMAGE=100;
    private static final int  REQUEST_IMAGE_CAPTURE=100;
    Uri imageuri;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photocamera1);

        ImageButton cm = (ImageButton) findViewById(R.id.cmbtn);
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opncm();
            }
        });
        ImageButton gal = (ImageButton) findViewById(R.id.galbtn);
      gal.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              OPENCAMER();
          }
      });

        Button next = (Button) findViewById(R.id.picnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openloc();
            }
        });
    }
    public void OPENCAMER(){
        Intent GALLERY=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);

                startActivityForResult(GALLERY,PICK_IMAGE);
    }
    @Override
    protected  void onActivityResult(int requestCode, int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode==RESULT_OK && requestCode== PICK_IMAGE){
            imageuri=data.getData();
            imageView.setImageURI(imageuri);
        }
    }

    private void opncm() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);

    }}

    public void openloc(){
        Intent intent3=new Intent(this,selectphotoActivity.class);
        startActivity(intent3);
    }
}
