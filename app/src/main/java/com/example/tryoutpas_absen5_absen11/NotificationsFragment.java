//INI UNTUK COLLAB ATAU BIODATA ALIF DAN DANIS

package com.example.tryoutpas_absen5_absen11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerView = view.findViewById(R.id.rvBiodata);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<BiodataModel> biodataList = new ArrayList<>();
        biodataList.add(new BiodataModel("Alif Nawaf Ahmad", "Alif", "5", "Kolaborator"));
        biodataList.add(new BiodataModel("Desnian Danis Maulana", "Danis", "11", "Project Leader"));


        BiodataAdapter adapter = new BiodataAdapter(biodataList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
