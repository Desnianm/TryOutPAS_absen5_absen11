
//INI UNTUK LALIGA
package com.example.tryoutpas_absen5_absen11;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import androidx.fragment.app.Fragment;

public class DashboardFragment extends Fragment {

    RecyclerView rvlaliga;

    TimAdapter adapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        rvlaliga = view.findViewById(R.id.rv_Laliga);

        rvlaliga.setLayoutManager(new LinearLayoutManager(getContext()));

        SoccerApi api = REtrofitClient.getInstance().create(SoccerApi.class);
        fetchJadwal(api);
        return view;
    }
    private void fetchJadwal(SoccerApi api) {
        api.getLaligaTeam("La Liga").enqueue(new Callback<TimResponse>() {
            @Override
            public void onResponse(Call<TimResponse> call, Response<TimResponse> response) {
                if (response.isSuccessful() && response.body() != null && response.body().getTeams() != null) {
                    List<TeamModel> teams = response.body().getTeams();
                    adapter = new TimAdapter(teams);
                    rvlaliga.setAdapter(adapter);
                    rvlaliga.setVisibility(View.VISIBLE);

                }
            }

            @Override
            public void onFailure(Call<TimResponse> call, Throwable t) {
                Log.e("API_ERROR", t.getMessage());
            }
        });
    }
}