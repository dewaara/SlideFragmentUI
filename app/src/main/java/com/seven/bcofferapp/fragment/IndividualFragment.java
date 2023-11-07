package com.seven.bcofferapp.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.seven.bcofferapp.R;
import com.seven.bcofferapp.RefineActivity;

public class IndividualFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_individual,
                container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.btn_conferma);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getContext(), RefineActivity.class);
                startActivity(intent);

            }
        });
        return view;

    }
}