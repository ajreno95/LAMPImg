package com.example.alexander.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private Bitmap convertImageToBitmap(Drawable image, int x, int y){
        //convert image to bitmap then resize
        Bitmap bitmapImage = ((BitmapDrawable)image).getBitmap();
        Bitmap resizedImage = Bitmap.createScaledBitmap(bitmapImage, x, y, false);

        return resizedImage;
    }

    private void displayImage(Drawable image){
        ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
        imageView.setImageDrawable(image);
    }

}
