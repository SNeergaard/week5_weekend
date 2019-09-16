package com.example.week5_weekend.view.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.week5_weekend.R;
import com.example.week5_weekend.model.datasource.baseWeather.Response;
import com.example.week5_weekend.model.datasource.fiveday.Fiveday;
import com.example.week5_weekend.model.datasource.fiveday.ListItem;
import com.example.week5_weekend.view.adapters.HourlyAdapter;

import java.util.List;


public class HourlyFragment extends Fragment {
    public static final String ARG_PASSED_URL = "param1";
    Response response;

    public HourlyFragment() {
    }

    // TODO: Rename and change types and number of parameters
    public static HourlyFragment newInstance(String param1, String param2) {
        HourlyFragment fragment = new HourlyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PASSED_URL, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //List<ListItem> items = .getItems;
        View rootView = inflater.inflate(R.layout.fragment_hourly, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rvHourly);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //HourlyAdapter adapter = new HourlyAdapter(items);
        //recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return rootView;
    }
}
