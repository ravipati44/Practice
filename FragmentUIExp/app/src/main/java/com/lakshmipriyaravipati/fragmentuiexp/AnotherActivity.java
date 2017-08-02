package com.lakshmipriyaravipati.fragmentuiexp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lakshmipriyaravipati on 7/24/17.
 */

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        int index=getIntent().getIntExtra("index",0);
        FragmentB f2=(FragmentB)getFragmentManager().findFragmentById(R.id.fragment2);
        if(f2!=null){
            f2.changeData(index);
        }

    }
}
