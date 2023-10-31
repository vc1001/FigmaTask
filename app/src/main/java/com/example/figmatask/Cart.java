package com.example.figmatask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

 import com.example.figmatask.Adapter.CustomAdapter;
 import com.example.figmatask.Model.Model;

import java.util.ArrayList;
import java.util.List;


public class Cart extends Fragment {

 private RecyclerView recyclerView;
 private List<Model> modelList;

 private CustomAdapter customAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =inflater.inflate(R.layout.fragment_cart, container, false);

        modelList = generateModel();
        recyclerView = rootview.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        customAdapter =new CustomAdapter(modelList);
        recyclerView.setAdapter(customAdapter);

        return rootview;
    }

    private List<Model> generateModel(){

        List<Model> model = new ArrayList<>();
        model.add(new Model(R.drawable.coffe,"Cappuccino","Drizzled with wheep","400"));
        model.add(new Model(R.drawable.coffe1,"Latte","Caramel","456"));
        model.add(new Model(R.drawable.coffee1,"Americano","Cinanom","123"));
        model.add(new Model(R.drawable.coffee2,"Cortado","Drizzled with wheep","908"));
        model.add(new Model(R.drawable.coffee4,"Flat white","Almond","678"));
        model.add(new Model(R.drawable.coffee5,"Espresso","Drizzled with wheep","500"));
        model.add(new Model(R.drawable.coffee6,"Cortado","Almond","600"));
        model.add(new Model(R.drawable.coffee7,"Americano","Blue berry","299"));
        model.add(new Model(R.drawable.cofee3,"Cappuccino","Drizzled with wheep","400"));

        return model;
    }
}