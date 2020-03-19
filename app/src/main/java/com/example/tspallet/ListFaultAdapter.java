package com.example.tspallet;

import android.app.LauncherActivity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


import com.example.tspallet.MainPackage.F001;
import com.example.tspallet.MainPackage.F002;

import java.util.ArrayList;

public class ListFaultAdapter extends RecyclerView.Adapter<ListFaultAdapter.ExampleViewHolder> {
    private ArrayList<Fault> mExampleList;
    public class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        private RelativeLayout rl;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            rl = itemView.findViewById(R.id.rl_list);

        }


    }

    public ListFaultAdapter(ArrayList<Fault> exampleList) {
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_fault, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(final ExampleViewHolder holder, int position) {
        Fault currentItem = mExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());

        if (holder.mTextView1.getText().equals("F001")){
            holder.rl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), F001.class);
                    v.getContext().startActivity(i);
                }
            });
        }else if (holder.mTextView1.getText().equals("F002")){
            holder.rl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), F002.class);
                    v.getContext().startActivity(i);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<Fault> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}