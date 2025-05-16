package com.example.tryoutpas_absen5_absen11;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.List;
public class TimAdapter extends RecyclerView.Adapter<TimAdapter.ViewHolder> {
    private List<TeamModel> teamList;

    public TimAdapter(List<TeamModel> teamList) {
        this.teamList = teamList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tim, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TeamModel team = teamList.get(position);
        holder.tvTeam.setText(team.getStrTeam());
        holder.tvStadium.setText(team.getStrStadium());

        Glide.with(holder.itemView.getContext())
                .load(team.getStrBadge())
                .into(holder.ivbadge);
    }

    @Override
    public int getItemCount() {
        return teamList != null ? teamList.size() : 0; // ✅ NULL CHECK
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTeam, tvStadium;
        ImageView ivbadge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTeam = itemView.findViewById(R.id.tvteam);
            tvStadium = itemView.findViewById(R.id.tvstadium);
            ivbadge = itemView.findViewById(R.id.ivbadge);
        }
    }

}
