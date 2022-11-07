package com.example.mad_npracticals.Practical_6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mad_npracticals.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    ArrayList<MyListData> myListData = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }


    @Override

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyListData data = myListData.get(position);
        holder.tvName.setText(data.getName());
        holder.tvAdd.setText(data.getAdd());
        holder.img.setImageResource(data.getImgId());
        holder.btnDel.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                myListData.remove(position);
                notifyDataSetChanged();
                notifyItemRemoved(position);
            }

        });

    }

    @Override

    public int getItemCount() {
        return myListData.size();
    }

    public void setData(ArrayList<MyListData> data) {
        this.myListData = data;
        notifyDataSetChanged();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView img;
        private TextView tvName;
        private TextView tvAdd;
        private Button btnDel;

        public ViewHolder(View view) {
            super(view);
            this.img = view.findViewById(R.id.rvImg);
            this.tvName = view.findViewById(R.id.rvTitle);
            this.tvAdd = view.findViewById(R.id.rvMessage);
            this.btnDel = view.findViewById(R.id.rvDel);
        }

    }

}
