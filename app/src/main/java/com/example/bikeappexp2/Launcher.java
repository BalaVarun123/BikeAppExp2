package com.example.bikeappexp2;

import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.bikeappexp2.R;
/*
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.View.OnTouchListener;
*/



public class Launcher extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    //private final GestureDetector gestureDetector; //depricated


    TextView top_text, bottom_text;
    ImageView imageView;
    public static final int max_pages = 5;
    int progress = 0;
    SeekBar seekBar;


    //FloatingActionButton fab1,fab2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        /*fab1 = findViewById(R.id.launcher_fab1);
        fab2= findViewById(R.id.launcher_fab2);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        seekBar = (SeekBar) findViewById(R.id.content_launcher_seek_bar_descrete);
        top_text = (TextView) findViewById(R.id.content_launcher_top_text);
        bottom_text = (TextView) findViewById(R.id.content_launcher_botttom_text);
        imageView = (ImageView) findViewById(R.id.content_launcher_image_view);
        imageView.setOnTouchListener(new com.example.bikeappexp2.OnSwipeTouchListener(this){
                                         //@Override
                                         public void onSwipeTop() {

                                             //Toast.makeText(context, "top", Toast.LENGTH_SHORT).show();

                                         }
                                         //@Override
                                         public void onSwipeRight() {
                                             if (progress >0){
                                                 progress--;
                                             }
                                             onProgressChanged(seekBar,progress,true);
                                             //Toast.makeText(context, "right", Toast.LENGTH_SHORT).show();
                                         }
                                         //@Override
                                         public void onSwipeLeft() {
                                             if (progress < max_pages){
                                                 progress++;
                                             }
                                             onProgressChanged(seekBar,progress,true);
                                             //Toast.makeText(context, "left", Toast.LENGTH_SHORT).show();
                                         }
                                         //@Override
                                         public void onSwipeBottom() {
                                             Toast.makeText(context, "bottom", Toast.LENGTH_SHORT).show();
                                         }
                                     }

        );

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        seekBar.setProgress(progress,true);
    }




    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    private void activatePage(int pageNum){

    }

}
