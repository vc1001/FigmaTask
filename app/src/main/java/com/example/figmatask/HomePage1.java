package com.example.figmatask;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.figmatask.Adapter.HomeAdapter;
import com.example.figmatask.Model.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class HomePage1 extends Fragment {
    private RecyclerView recyclerView2;
    private View v1;
    private HomeAdapter homeAdapter;
    private List<HomeModel> homeModelList;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    public HomePage1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v1 = inflater.inflate(R.layout.fragment_home_page1, container, false);
        recyclerView2 = v1.findViewById(R.id.recyclerview2);
        homeModelList=new ArrayList<>();
        homeAdapter = new HomeAdapter(homeModelList);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, staggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        recyclerView2.setAdapter(homeAdapter);
        IntializeDataintoRecycleview();
        return v1;
    }
    private void IntializeDataintoRecycleview() {

        HomeModel t1 = new HomeModel(R.drawable.coffee7, "Capacuino", "Cinamon","4.5");
        HomeModel t2 = new HomeModel(R.drawable.coffe, "FlatWhite", "Chocolate","4.0");
        HomeModel t3 = new HomeModel(R.drawable.coffee2, "Espresso", "Blueberry","4.5");
        HomeModel t4 = new HomeModel(R.drawable.coffee1, "Capacuino", "Chocolate","3.5");
        HomeModel t5 = new HomeModel(R.drawable.coffee4, "FlatWhite", "Cinamon","4.8");
        HomeModel t6 = new HomeModel(R.drawable.coffee2, "Americano", "Blueberry","4.0");
        HomeModel t7 = new HomeModel(R.drawable.coffee5, "Espresso", "Chocolate","4.2");
        HomeModel t8 = new HomeModel(R.drawable.coffee6, "Americano", "Drizziled with wheep","3.0");

        homeModelList.add(t1);
        homeModelList.add(t2);
        homeModelList.add(t4);
        homeModelList.add(t5);
        homeModelList.add(t6);
        homeModelList.add(t7);
        homeModelList.add(t8);
        homeAdapter.notifyDataSetChanged();
    }
}
 