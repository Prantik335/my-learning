package me.prantik.gridview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> names;
    ArrayList<Integer> images;

    public GridAdapter(Context context, ArrayList<String> names, ArrayList<Integer> images) {
        this.context = context;
        this.names = names;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.size();
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
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_view_layout, viewGroup, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textView);

        textViewName.setText(names.get(i));
        imageView.setImageResource(images.get(i));

        // NOT GOOD!
     /* view.setOnClickListener(view1 -> {
            Toast.makeText(context, "You selected " + names.get(i), Toast.LENGTH_SHORT)
                    .show();
        });*/

        return view;
    }
}
