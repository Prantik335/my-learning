package me.prantik.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {

    private ArrayList<String> countryNameList;
    private ArrayList<String> detailList;
    private ArrayList<Integer> imageList;
    private Context context;

    public RecyclerAdapter(ArrayList<String> countryNameList, ArrayList<String> detailList, ArrayList<Integer> imageList, Context context) {
        this.countryNameList = countryNameList;
        this.detailList = detailList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int pos) {
        holder.textViewCountryName.setText(countryNameList.get(pos));
        holder.textViewDetails.setText(detailList.get(pos));
        holder.imageView.setImageResource(imageList.get(pos));

        holder.cardView.setOnClickListener(view -> {
            Toast.makeText(context, "You selectd the " + countryNameList.get(pos) + " flag", Toast.LENGTH_LONG)
                    .show();
        });
    }

    @Override
    public int getItemCount() {
        return countryNameList.size();
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewCountryName, textViewDetails;
        private ImageView imageView;
        private CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCountryName = itemView.findViewById(R.id.textViewCountryName);
            textViewDetails = itemView.findViewById(R.id.textViewDetails);
            imageView = itemView.findViewById(R.id.image_view);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
