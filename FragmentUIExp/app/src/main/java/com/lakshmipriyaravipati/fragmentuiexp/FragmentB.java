package com.lakshmipriyaravipati.fragmentuiexp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lakshmipriyaravipati on 7/24/17.
 */

public class FragmentB extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_b,container,false);
        textView=(TextView)view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(int i){

        String [] descriptions=getResources().getStringArray(R.array.description);
        textView.setText(descriptions[i]);

    }
}
