package edu.asu.msse.sprasher.assign2android;

/*
Copyright 2020 Sarvansh Prasher

Rights to use this code given to Arizona State University
& Professor Timothy Lindquist (Tim.Lindquist@asu.edu) for course SER 423

@author Sarvansh Prasher mailto:sprasher@asu.edu

@version 21 January,2020

*/

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertActivity extends Activity {


    private Button okButton;


    // As soon as the MainActivity passes the intent to AlertActivity, this method is called
    // which will create the activity and attach its layout to activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        android.util.Log.d(this.getClass().getSimpleName(),"AlertActivity is on onCreate()");

        okButton = findViewById(R.id.button2);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.util.Log.d(this.getClass().getSimpleName(), "called finishAlertActivity()");
                finish();
            }
        });

    }

    // On opening the main dialogue activity , this start function will be seen getting called which
    // will make the Alert Activity visible to users.
    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.d(this.getClass().getSimpleName()," AlertActivity is on onStart()");

    }

    // While the AlertActivity is running , this method is called which ensures the activity is in
    // foreground and the user can interact with the application.
    @Override
    protected void onResume(){
        super.onResume();
        android.util.Log.d(this.getClass().getSimpleName(),"AlertActivity is on onResume()");

    }

    // For testing this in simulator, click on 'OK' button on main screen which will pause
    // the current activity view and will make it semi transparent.
    @Override
    protected void onPause(){
        super.onPause();
        android.util.Log.d(this.getClass().getSimpleName(),"AlertActivity is on onPause()");

    }

    // For testing this , the application must be completely hidden state which will call
    // this method.On clicking 'OK" button this will stop the AlertActivity.
    @Override
    protected void onStop(){
        super.onStop();
        android.util.Log.d(this.getClass().getSimpleName(), "AlertActivity is on onStop()");

    }

    // This method will be called only when we click the 'OK' button on dialogue box
    // clear it from memory.For getting this message printed , terminate the main application.
    @Override
    protected void onDestroy(){
        super.onDestroy();
        android.util.Log.d(this.getClass().getSimpleName(),"AlertActivity is on onDestroy() ");

    }

    // When the activity comes from background state i.e after it has been put into the same state
    // in background, the AlertActivity will come into active state.
    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.d(this.getClass().getSimpleName(),"AlertActivity is on onRestart() ");

    }
}
