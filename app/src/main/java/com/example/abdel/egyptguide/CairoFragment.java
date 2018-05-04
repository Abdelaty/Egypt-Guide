package com.example.abdel.egyptguide;

import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CairoFragment extends Fragment {
    View view;
    int imageButton1;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.cairo_layout, container, false);

        ArrayList<Images> cairoList = new ArrayList<>();
        cairoList.add(new Images(R.string.cairo_tower, R.drawable.cairo_tower));
        cairoList.add(new Images(R.string.opera, R.drawable.opera1));
        cairoList.add(new Images(R.string.mohammed_ali_mosque, R.drawable.mohammed_ali));


        PlacesAdapter placesAdapter = new PlacesAdapter(getContext(), cairoList);
        ListView list;
        list = view.findViewById(R.id.cairo_listView);
        list.setAdapter(placesAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent(getActivity(), TabsActivity.class);
                startActivity(myIntent);
            }
        });


        return view;

    }

}
