package com.generally2.cooboo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;


class BookAdapter extends ArrayAdapter<String> {
    String[] names;
    int[] images;
    Context mContext;
    View customView;


    public BookAdapter(Context context , String[] topics, int[] icons) {
        super(context, R.layout.custom_row, topics);


        this.names = topics;
        this.images = icons;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();

        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            customView = layoutInflater.inflate(R.layout.custom_row, parent, false);

            mViewHolder.bookText = (TextView) customView.findViewById(R.id.textList);
            mViewHolder.bookImage = (ImageView) customView.findViewById(R.id.list_item);
            customView.setTag(mViewHolder);

        }
        else {
            mViewHolder = (ViewHolder) customView.getTag();
        }
        mViewHolder.bookText.setText(names[position]);
        mViewHolder.bookImage.setImageResource(images[position]);


        return customView;
    }
    static class ViewHolder{
        ImageView bookImage;
        TextView bookText;
    }
}
