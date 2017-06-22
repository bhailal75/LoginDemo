package com.example.sparken02.logindemo;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.sparken02.logindemo.CustomAdapter.CustomAdapterViewPager;
import com.example.sparken02.logindemo.CustomAdapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerviewPage extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;

    private LinearLayout mLinearLayout;
    private RecyclerView mRecyclerView,mRecyclerViewRecomaded;
    private RecyclerView.Adapter mAdapter,madapter2;
    private RecyclerView.LayoutManager mLayoutManager;

    private ViewPager viewPager;
    int[] images = {  R.drawable.seaone,
                      R.drawable.seatwo,
                      R.drawable.seathree,
                      R.drawable.seafour
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclepage);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerViewRecomaded = (RecyclerView) findViewById(R.id.recyclerViewRecomanded);
        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        mRecyclerViewRecomaded.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));


        ArrayList items = new ArrayList<>(Arrays.asList(R.drawable.seaone,
                R.drawable.seatwo,
                R.drawable.seathree,
                R.drawable.seafour)); // here the example data is created

        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(RecyclerviewPage.this,items);
        mRecyclerView.setAdapter(mAdapter);

        ArrayList itemsRecomanded = new ArrayList<>(Arrays.asList(R.drawable.bestone,
                R.drawable.besttwo,
                R.drawable.bestthree,
                R.drawable.bestfive)); // here the example data is created

        RecyclerViewAdapter mAdapter1 = new RecyclerViewAdapter(RecyclerviewPage.this,itemsRecomanded);
        mRecyclerViewRecomaded.setAdapter(mAdapter1);



        CustomAdapterViewPager adapter = new CustomAdapterViewPager(RecyclerviewPage.this,images);
        viewPager.setAdapter(adapter);
    }
}
