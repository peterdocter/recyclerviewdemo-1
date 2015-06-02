package com.bin.recycleviewdemo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jabin on 6/1/15.
 */
public class RcvViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public CardView cv;
    public TextView tvTitle;
    public TextView tvContent;
    public ImageView ivIcon;
    ViewHolderOnClick mViewHolderOnClick;

    RcvViewHolder(final View viewitem) {
        super(viewitem);
        cv = (CardView) viewitem.findViewById(R.id.cv);
        tvTitle = (TextView) viewitem.findViewById(R.id.tvTitle);
        tvContent = (TextView) viewitem.findViewById(R.id.tvContent);
        ivIcon = (ImageView) viewitem.findViewById(R.id.ivIcon);
        cv.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (mViewHolderOnClick != null) {
            mViewHolderOnClick.onItemClicked(v, getLayoutPosition());
        }
    }

    public void setOnItemClickListener(ViewHolderOnClick viewHolderOnClick) {
        this.mViewHolderOnClick = viewHolderOnClick;
    }

    public interface ViewHolderOnClick {
         void onItemClicked(View view, int position);
    }

}
