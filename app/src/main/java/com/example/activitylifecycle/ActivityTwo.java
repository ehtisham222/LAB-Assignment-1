package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    private TextView onCreate,onStart,onResume,onRestart;
    private Button activityBtn;
    private int crt,strt,rsm,rstart=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        crt++;
        onCreate=findViewById(R.id.tvOnCreate);
        onCreate.setText("onCreate() Calls : "+crt);
        Log.i("ActivityLifeCycle","onCreate() is called");
        activityBtn=findViewById(R.id.btnActivity);
        activityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityTwo.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        strt++;
        onStart=findViewById(R.id.tvOnStart);
        onStart.setText("onStart() Calls : "+strt);
        Log.i("ActivityLifeCycle","onStart() is called");
    }
    protected void onResume(){
        super.onResume();
        rsm++;
        onResume=findViewById(R.id.tvOnResume);
        onResume.setText("onResume() Calls : "+rsm);
        Log.i("ActivityLifeCycle","onStart() is called");
    }
    protected void onRestart(){
        super.onRestart();
        rstart++;
        onRestart=findViewById(R.id.tvOnRestart);
        onRestart.setText("onRestart() Calls : "+rstart);
        Log.i("ActivityLifeCycle","onStart() is called");
    }
    protected void onPause(){
        super.onPause();
        Log.i("ActivityLifeCycle","onPause() is called");
    }
    protected void onStop(){
        super.onStop();
        Log.i("ActivityLifeCycle","onStop() is called");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("ActivityLifeCycle","onDestroy() is called");
    }
}