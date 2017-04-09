package com.example.android.tekkencheats2;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amigo on 8/4/17.
 */

public class Categ1Adapter extends RecyclerView.Adapter<Categ1Adapter.Categ1ViewHolder> {

    private String[] mDataset;

    public static class Categ1ViewHolder extends RecyclerView.ViewHolder{
        public CardView mCardView;
        public TextView mTextView;

        public Categ1ViewHolder(View v){
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTextView = (TextView) v.findViewById(R.id.tv_text);

        }
    }

    public Categ1Adapter(String[] dataset){
        mDataset = dataset;
    }

    @Override
    public Categ1ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        Categ1ViewHolder c1vh = new Categ1ViewHolder(v);
        return c1vh;

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    @Override
    public void onBindViewHolder(Categ1ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }
}
