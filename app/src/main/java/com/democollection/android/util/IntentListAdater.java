package com.democollection.android.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.democollection.android.R;

import java.util.List;

/**
 * Created by Administrator on 2018/3/15.
 */

public class IntentListAdater extends ArrayAdapter<IntentItem> {
    private int resourceId;

    public IntentListAdater(Context context, int textViewResourceId, List<IntentItem> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        IntentItem intentItem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView Intentname = (TextView) view.findViewById(R.id.intent_name);
        Intentname.setText(intentItem.getName());
        return view;
    }
}
