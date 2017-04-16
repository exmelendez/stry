package com.example.android.stry;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SettingsTabFragment extends Fragment {

    private static final String TAG = "SettingsTabFragment";
    private TextView username, notifications, logout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settings_tab_fragment,container,false);
        Log.d(TAG, "onCreateView started.");

        username =(TextView) view.findViewById(R.id.untv);
        notifications =(TextView) view.findViewById(R.id.notifications_tv);
        logout =(TextView) view.findViewById(R.id.logout_tv);

        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "View/change user name action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Enable/disable notifications", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),SignIn.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
