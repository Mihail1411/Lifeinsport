package com.example.android.Lifeinsport.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.android.Lifeinsport.activity.TableActivity;
import com.example.android.myndapplication.R;

public class tableFragment extends Fragment {
    public static tableFragment newInstance() {
        return new tableFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(getContext(), TableActivity.class);
        startActivity(intent);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_table, container, false);
    }
}

