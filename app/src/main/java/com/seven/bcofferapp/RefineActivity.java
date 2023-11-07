package com.seven.bcofferapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.seven.bcofferapp.adapter.CustomAdapter;
import com.seven.bcofferapp.model.CustomItem;

import java.util.ArrayList;

public class RefineActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner customSpinner;
    ArrayList<CustomItem> customList;
    int width = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        customSpinner = (Spinner) findViewById(R.id.customIconSpinner);
        CustomAdapter adapter = new CustomAdapter(this, customList);

        if (customSpinner != null){
            customSpinner.setAdapter(adapter);
            customSpinner.setOnItemSelectedListener(this);
        }
    }

    private ArrayList<CustomItem>getCustomList(){
        customList = new ArrayList<>();
        customList.add(new CustomItem("Home",R.drawable.ic_home));
        customList.add(new CustomItem("Email",R.drawable.ic_email));
        customList.add(new CustomItem("Person",R.drawable.ic_person));
        customList.add(new CustomItem("Phone",R.drawable.ic_phone));
        return customList;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){

       try {
           LinearLayout linearLayout = findViewById(R.id.customSpinnerItemLayout);
           width=linearLayout.getWidth();
       } catch (Exception e){
           e.printStackTrace();
       }

        customSpinner.setDropDownWidth(width);
        CustomItem item = (CustomItem) adapterView.getSelectedItem();
        Toast.makeText(this, item.getSpinnerItemName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView){

    }
}