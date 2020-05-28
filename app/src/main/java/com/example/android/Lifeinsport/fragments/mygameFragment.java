package com.example.android.Lifeinsport.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.android.Lifeinsport.activity.GermanyActivity;
import com.example.android.myndapplication.R;


public class mygameFragment extends Fragment {

    public static mygameFragment newInstance() {
        return new mygameFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(getContext(), GermanyActivity.class);
        startActivity(intent);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mygame, container, false);
    }
}
