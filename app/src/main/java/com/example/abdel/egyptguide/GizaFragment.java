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

public class GizaFragment extends Fragment {
    View view;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.giza_layout, container, false);

        ArrayList<Images> gizaList = new ArrayList<>();
        gizaList.add(new Images(R.string.giza_zoo, R.drawable.giza_zoo));
        gizaList.add(new Images(R.string.pyramids, R.drawable.pyramids6));
        gizaList.add(new Images(R.string.grand_musium, R.drawable.grand_musium));


        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), gizaList);
        ListView list;
        list = view.findViewById(R.id.giza_listView);
        list.setAdapter(placesAdapter);
        return view;
    }

}
