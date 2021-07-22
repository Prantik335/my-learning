package me.prantik.iksnake;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class GridAdapter extends BaseAdapter {
    Context context;
    int numOfRows;
    int size;
    int[] colors = {Color.GRAY, Color.WHITE};
    int count = 0;

    public GridAdapter(Context context, int numOfRows, int size) {
        this.context = context;
        this.numOfRows = numOfRows;
        this.size = size;
    }

    @Override
    public int getCount() {
        return numOfRows * 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder")
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spice, viewGroup, false);
        View spice = view.findViewById(R.id.spice);
        spice.setLayoutParams(new LinearLayout.LayoutParams(size, size));
        spice.setBackgroundColor(colors[count % 2]);
        return view;
    }
}
