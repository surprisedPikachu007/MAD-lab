package com.example.thirdexperiment;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Shapes");
//Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
//Setting the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
//Creating the Canvas Object
        Canvas canvas = new Canvas(bg);
//Creating the Paint Object and set its color & TextSize
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(50);

        //To draw a Square
        canvas.drawText("Square", 120, 150, paint);
        canvas.drawRect(50, 200, 350, 500, paint);
        //To draw a Line
        canvas.drawText("Line", 480, 150, paint);
        canvas.drawLine(520, 200, 520, 500, paint);
        //To draw a Circle
        canvas.drawText("Circle", 120, 700, paint);
        canvas.drawCircle(200, 900, 150, paint);
        //To draw a Rectangle
        canvas.drawText("Rectangle", 420, 700, paint);
        canvas.drawRect(400, 750, 650, 1150, paint);
    }
}