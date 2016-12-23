package com.example.yunus.firebaserecycleradapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yunus on 23.12.2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> values=null;
    RecyclerViewAdapter(ArrayList<String> values) {
        this.values = values;
    }
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false));
    }


    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position)
    {
        holder.name.setText(values.get(position));
    }

    @Override
    public int getItemCount()
    {
        return (values == null) ? 0 : values.size();

        //If you are ok with returning 0 as size when values is null. We can add this code instead of "return values.size();"
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView name;
        ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.list_item_text);
        }
    }


}
