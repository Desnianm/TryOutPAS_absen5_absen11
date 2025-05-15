package com.example.tryoutpas_absen5_absen11;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TimResponse {
    @SerializedName("teams")
    private List<TeamModel> teams;

    public List<TeamModel> getTeams() {
        return teams;
    }
}
