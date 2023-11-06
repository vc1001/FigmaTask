package com.example.figmatask.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.figmatask.Model.HomeModel;
import com.example.figmatask.R;

import java.util.List;
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.teaviewholder> {
    List<HomeModel> homeModelList;
    Context context;
    public HomeAdapter(List<HomeModel> homeModelList) {
        this.homeModelList = homeModelList;
        this.context = context;
    }
    @NonNull
    @Override
    public HomeAdapter.teaviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item2_layout,parent,false);
        return new teaviewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.teaviewholder holder, int position) {
        HomeModel homeModel=homeModelList.get(position);
      holder.homeimage.setImageResource(homeModel.getHomeimage());
      holder.homename.setText(homeModel.getHomename());
      holder.homerating.setText(homeModel.getHomerating());
      holder.homeflavour.setText(homeModel.getHomeflavour());

    }
    @Override
    public int getItemCount() {
        return homeModelList.size();
    }
    public static class teaviewholder extends RecyclerView.ViewHolder{
        TextView homename, homeflavour,homerating;
        ImageView homeimage;
        public teaviewholder(@NonNull View itemView) {
            super(itemView);
            homename=itemView.findViewById(R.id.homename);
            homeflavour=itemView.findViewById(R.id.homeflavour);
            homerating=itemView.findViewById(R.id.homerating);
            homeimage=itemView.findViewById(R.id.homeimage);
        }
    }
}
 