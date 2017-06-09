package com.example.jin.testknowledge;

import android.os.AsyncTask;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.LruCache;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    private FragementA fragementA;
    private FragementB fragementB;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: " );

        fragmentManager= getSupportFragmentManager();
        transaction=fragmentManager.beginTransaction();
        fragementA=new FragementA();
        fragementB=new FragementB();
        transaction.add(R.id.activity_main,fragementA);
        transaction.addToBackStack("fragmentA");
        transaction.commit();

       /* Fragment fragment=new FragementA();
        getSupportFragmentManager().beginTransaction().add(R.id.activity_main,fragment).commit();*/
      //  LruCache   lruCahce 的内部原理
       // Looper.prepare();
      //  Looper.loop();
      //  ListView
       // Adapter
        //getSupportFragmentManager().putFragment();
       // getSupportFragmentManager().getFragment()
      //  getSupportFragmentManager().beginTransaction().replace()

      //  FragmentManager fragmentManager= getSupportFragmentManager();
       // FragmentTransaction transaction=fragmentManager.beginTransaction();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: " );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: " );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: " );
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
    public void add(View v){
        transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.activity_main,fragementB);
        transaction.addToBackStack("fragmentb");
        transaction.commit();
    }
    public void remove(View v){

    }
}
