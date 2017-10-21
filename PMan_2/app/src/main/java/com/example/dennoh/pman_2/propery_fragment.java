package com.example.dennoh.pman_2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dennoh on 10/9/2017.
 */

public class propery_fragment extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.property, container,false );
        recyclerView=(RecyclerView) myView.findViewById(R.id.property) ;
        adapter=new Adapter(getActivity(),getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return myView;

    }
    public static List<Information> getData(){
        List<Information> data=new ArrayList<>();
        int[] icons ={R.drawable.account,R.drawable.account,R.drawable.account,R.drawable.account};
        String[] titles={"Property 1","Property 2","Property 3","Property 4"};
        for (int i=0;i<titles.length && i<icons.length;i++){
            Information current = new Information();
            current.imageId=icons[i];
            current.title=titles[i];
            data.add(current);

        }
        return data;
    }
}
