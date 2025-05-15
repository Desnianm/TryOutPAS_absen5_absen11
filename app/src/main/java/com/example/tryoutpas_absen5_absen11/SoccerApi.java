package com.example.tryoutpas_absen5_absen11;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface SoccerApi {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    Call<TimResponse> getPremierLeagueTeams(@Query("id") String league);

    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TimResponse> getLaligaTeam(@Query("id2") String league);
}
