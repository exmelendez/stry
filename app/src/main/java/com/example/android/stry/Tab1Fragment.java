package com.example.android.stry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Tab1Fragment extends Fragment {

    private static final String TAG = "Tab1Fragment";
//    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
        Log.d(TAG, "onCreateView started.");

        ListView mListView = (ListView) view.findViewById(R.id.settings_listView);

        Stry username = new Stry("cutie40two");
        Stry username2 = new Stry("MrHotShot");
        Stry username3 = new Stry("IamtheKing4life");

        ArrayList<Stry> settingsAL = new ArrayList<>();
        settingsAL.add(username);
        settingsAL.add(username2);
        settingsAL.add(username3);

//        btnTEST = (Button) view.findViewById(R.id.btnTest);
//        btnTEST.setText("sign out");
//
//        btnTEST.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(),SignIn.class);
//                startActivity(intent);
//            }
//        });


        SettingsListAdapter adapter = new SettingsListAdapter(getContext(), R.layout.settings_adapter_view_layout, settingsAL);
        mListView.setAdapter(adapter);

        return view;
    }
}
