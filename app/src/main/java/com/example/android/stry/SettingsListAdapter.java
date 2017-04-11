package com.example.android.stry;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SettingsListAdapter extends ArrayAdapter<Stry> {

    private static final String TAG = "SettingsListAdapter";
    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    static class ViewHolder {
        TextView setting;

    }

    public SettingsListAdapter(Context context, int resource, ArrayList<Stry> settingsAL) {
        super(context, resource, settingsAL);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String title = getItem(position).getTitle();
        String idea_desc = getItem(position).getIdea_desc();
        String content = getItem(position).getContent();

        Stry stry = new Stry(title, idea_desc, content);

        return convertView;

    }
}
