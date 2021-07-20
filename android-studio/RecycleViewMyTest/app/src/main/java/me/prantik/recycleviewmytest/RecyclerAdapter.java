package me.prantik.recycleviewmytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.PeopleViewHolder> {
    Context context;
    ArrayList<String> nameList;
    ArrayList<String> bioList;
    ArrayList<Integer> profileImgList;
    ConstraintLayout layout;

    public RecyclerAdapter(Context context, ArrayList<String> nameList, ArrayList<String> bioList, ArrayList<Integer> profileImgList, ConstraintLayout layout) {
        this.context = context;
        this.nameList = nameList;
        this.bioList = bioList;
        this.profileImgList = profileImgList;
        this.layout = layout;
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card_view, parent, false);
        System.out.println("Prantik");
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int pos) {
        holder.name.setText(nameList.get(pos));
        holder.bio.setText(bioList.get(pos));
        holder.profilePic.setImageResource(profileImgList.get(pos));

        holder.name.setOnClickListener(view -> {
            Snackbar.make(layout, nameList.get(pos) + ": " + bioList.get(pos), Snackbar.LENGTH_LONG)
                    .show();
        });
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public static class PeopleViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView bio;
        private ImageView profilePic;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textViewName);
            bio = itemView.findViewById(R.id.textViewBio);
            profilePic = itemView.findViewById(R.id.profile_image);
        }
    }
}
