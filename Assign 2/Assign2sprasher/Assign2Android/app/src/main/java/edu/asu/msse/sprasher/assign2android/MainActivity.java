package edu.asu.msse.sprasher.assign2android;

/*
Copyright 2020 Sarvansh Prasher

Rights to use this code given to Arizona State University
& Professor Timothy Lindquist (Tim.Lindquist@asu.edu) for course SER 423

@author Sarvansh Prasher mailto:sprasher@asu.edu

@version 21 January,2020

*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    // As soon as the application is launched , this method is called
    // which will create the activity and attach its layout to activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.util.Log.d(this.getClass().getSimpleName(),"App is on onCreate()");

    }

    // On opening the main page of application, this start function will be seen getting called which
    // will make the activity visible to users.
    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.d(this.getClass().getSimpleName(),"MainActivity is on onStart()");

    }

    // While the application is running , this method is called which ensures the activity is in
    // foreground and the user can interact with the application.
    @Override
    protected void onResume(){
        super.onResume();
        android.util.Log.d(this.getClass().getSimpleName(),"MainActivity is on onResume()");

    }

    // For testing this in simulator, click on 'Click Me' button on main screen which will pause
    // the current activity view and will make it semi transparent.
    @Override
    protected void onPause(){
        super.onPause();
        android.util.Log.d(this.getClass().getSimpleName(),"MainActivity is on onPause()");

    }

    // For testing this , the application must be completely hidden state which will call
    // this method.
    @Override
    protected void onStop(){
        super.onStop();
        android.util.Log.d(this.getClass().getSimpleName(), "MainActivity is on onStop()");

    }

    // This method will be called only when we close the application and clear it from memory.For
    // getting this message printed , terminate the main application.
    @Override
    protected void onDestroy(){
        super.onDestroy();
        android.util.Log.d(this.getClass().getSimpleName(),"MainActivity is on onDestroy() ");

    }

    // When the activity comes from background state i.e after OK button has been clicked on Alert
    // activity , MainActivity will come into onRestart state.
    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.d(this.getClass().getSimpleName(),"MainActivity is on onRestart() ");

    }

    public void onClickButton(View view){
        android.util.Log.d("ActivityMain", "called startAlertActivity()");
        Intent intent = new Intent(this,AlertActivity.class);
        startActivity(intent);

    }


}
