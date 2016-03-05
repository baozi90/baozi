package com.example.baozi.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by baozi on 3/4/16.
 */
public class DetailFragment extends Fragment {
    private String itemName;

    public static DetailFragment newInstance(String itemName) {
        DetailFragment myFragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString("ITEM",itemName);
        myFragment.setArguments(args);
        return myFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){
        Bundle args = getArguments();
        //itemName = args.getString("ITEM","Unknown");
        itemName = (String) args.get("ITEM");
        //inflate the layout for this fragment
        View myView =
                inflater.inflate(R.layout.detail_fragment,container,false);
        ((TextView)myView.findViewById(R.id.textViewName)).setText(itemName);
        return myView;
    }
}

