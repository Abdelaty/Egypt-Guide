package com.example.abdel.egyptguide;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LuxorFragment extends Fragment {
    View view;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.luxor_layout, container, false);

        ArrayList<Images> luxorList = new ArrayList<>();
        luxorList.add(new Images(R.string.el_karnak, R.drawable.karnak1));
        luxorList.add(new Images(R.string.valley_of_kings, R.drawable.valleykings1));
        luxorList.add(new Images(R.string.valley_of_queens, R.drawable.valleyquieens1));


        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), luxorList);
        ListView list;
        list = view.findViewById(R.id.luxor_listView);
        list.setAdapter(placesAdapter);
        return view;
    }
}
