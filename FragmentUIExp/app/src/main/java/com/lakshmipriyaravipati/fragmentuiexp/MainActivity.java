package com.lakshmipriyaravipati.fragmentuiexp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements FragmentA.Communicator {

    FragmentA f1;
    FragmentB f2;
    android.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        f1=(FragmentA) manager.findFragmentById(R.id.fragment);
        f1.setCommunicator(this);

    }

    @Override
    public void respond(int i) {
        f2=(FragmentB)manager.findFragmentById(R.id.fragment2);
        if(f2!=null&&f2.isVisible()){
            f2.changeData(i);

        }

        else{
            Intent in=new Intent(this,AnotherActivity.class);
            in.putExtra("index",i);
            startActivity(in);

        }

    }
}
