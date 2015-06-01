package com.bin.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jabin on 6/1/15.
 */
public class RcvAdapter extends RecyclerView.Adapter<RcvViewHolder> {
    public List<App> personList = new ArrayList<>();

    public RcvAdapter(List<App> apps) {

        this.personList.addAll(apps);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void setHasStableIds(boolean hasStableIds) {
        super.setHasStableIds(hasStableIds);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onViewRecycled(RcvViewHolder holder) {
        super.onViewRecycled(holder);
    }

    @Override
    public boolean onFailedToRecycleView(RcvViewHolder holder) {
        return super.onFailedToRecycleView(holder);
    }

    @Override
    public void onViewAttachedToWindow(RcvViewHolder holder) {
        super.onViewAttachedToWindow(holder);
    }

    @Override
    public void onViewDetachedFromWindow(RcvViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    @Override
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver observer) {
        super.registerAdapterDataObserver(observer);
    }

    @Override
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver observer) {
        super.unregisterAdapterDataObserver(observer);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override
    public RcvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_hold, parent, false);
        RcvViewHolder rcvViewHolder = new RcvViewHolder(view);
        rcvViewHolder.setOnItemClickListener(new RcvViewHolder.ViewHolderOnClick() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(view.getContext(), "positon: " + position, Toast.LENGTH_SHORT).show();
            }
        });
        return rcvViewHolder;
    }

    @Override
    public void onBindViewHolder(RcvViewHolder holder, int position) {
        holder.tvTitle.setText(personList.get(position).name);
        holder.tvContent.setText(personList.get(position).desc);
        holder.ivIcon.setImageResource(personList.get(position).icon);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
