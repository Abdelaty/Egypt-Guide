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

public class AlexandriaFragment extends Fragment {
    View view;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.alexandria_layout, container, false);

        ArrayList<Images> alexList = new ArrayList<>();
        alexList.add(new Images(R.string.alexandria_library, R.drawable.alexandria_library1));
        alexList.add(new Images(R.string.alexandria_lighthouse, R.drawable.alexandria_lighthouse1));
        alexList.add(new Images(R.string.qitbay_castle, R.drawable.qitbay_castle1));


        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), alexList);
        ListView list;
        list = view.findViewById(R.id.alexandria_listView);
        list.setAdapter(placesAdapter);
        return view;
    }
}
