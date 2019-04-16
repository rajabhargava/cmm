package com.example.cmm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }




    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ArrayList<SubjectModel> subjectModels;
        ListView listView;
        SubjectAddapter subjectAddapter;

        listView = rootView.findViewById(R.id.lv_sub);

        subjectModels = new ArrayList<>();

        subjectModels.add(new SubjectModel("Mental Ability",R.drawable.ic_menu_gallery,25));
        subjectModels.add(new SubjectModel("Physics",R.drawable.ic_menu_gallery,20));
        subjectModels.add(new SubjectModel("Chemistry",R.drawable.ic_menu_gallery,10));
        subjectModels.add(new SubjectModel("Mathematics",R.drawable.ic_menu_gallery,0));
        subjectModels.add(new SubjectModel("Logical",R.drawable.ic_menu_gallery,25));

        subjectAddapter = new SubjectAddapter(subjectModels, this.getContext());

        listView.setAdapter(subjectAddapter);
        // Inflate the layout for this fragment
        return rootView;
    }


    }




