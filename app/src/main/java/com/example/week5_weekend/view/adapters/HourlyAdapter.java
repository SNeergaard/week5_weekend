package com.example.week5_weekend.view.adapters;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week5_weekend.R;
import com.example.week5_weekend.model.datasource.fiveday.ListItem;

import java.util.List;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.ViewHolder>{
    List<ListItem> resultList;

    public HourlyAdapter(List<ListItem> resultList) {
        this.resultList = resultList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hourly_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItem currentItem = resultList.get(position);
        holder.populateValues(currentItem);

    }


    @Override
    public int getItemCount() {
        return resultList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvHourTemp;
        ListItem item;


        public void setItem(ListItem item) {
            this.item = item;
        }

        private void populateValues(ListItem item) {
            tvHourTemp.setText(Double.toString(item.getMain().getTemp()));
            setItem(item);

        }

        public ViewHolder(View itemView) {
            super(itemView);
            tvHourTemp = itemView.findViewById(R.id.tvHourTemp);
        }

    }
}
