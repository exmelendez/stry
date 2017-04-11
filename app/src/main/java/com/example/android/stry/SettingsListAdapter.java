package com.example.android.stry;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SettingsListAdapter extends ArrayAdapter<Settings> {

    private static final String TAG = "SettingsListAdapter";
    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    static class ViewHolder {
        TextView setting;

    }

    public SettingsListAdapter(Context context, int resource, ArrayList<Settings> settingsAL) {
        super(context, resource, settingsAL);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String username = getItem(position).getUserName();
        String notifications = getItem(position).getNotifications();
        String logout = getItem(position).getLogout();

        Settings settings = new Settings(username);
        settings.setLogout(logout);
        settings.setNotifications(notifications);

        return convertView;

    }
}
