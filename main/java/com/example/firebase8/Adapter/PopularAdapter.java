package com.example.firebase8.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.firebase8.Model.PopularModel;
import com.example.firebase8.R;
import com.google.firebase.database.core.Context;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {

    private FragmentActivity context;

    public PopularAdapter(FragmentActivity context, List<PopularModel> popularModelList) {
        this.context = context;
        this.popularModelList = popularModelList;
    }

    private List<PopularModel> popularModelList ;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.pname.setText(popularModelList.get(position).getPname());
        holder.pmodel.setText(popularModelList.get(position).getPmodel());
        holder.pprice.setText(popularModelList.get(position).getPprice());
    }

    @Override
    public int getItemCount() {
        return popularModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView pname, pmodel, pprice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pname = itemView.findViewById(R.id.productname);
            pmodel = itemView.findViewById(R.id.productmodel);
            pprice = itemView.findViewById(R.id.productprice);

        }
    }
}
