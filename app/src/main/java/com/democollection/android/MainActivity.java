package com.democollection.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.democollection.android.util.IntentItem;
import com.democollection.android.util.IntentListAdater;
import com.democollection.android.util.activities.LayoutActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<IntentItem> intentItemList = new ArrayList<>();
    private ListView intentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initIntentName();
        IntentListAdater listAdater = new IntentListAdater(MainActivity.this
        ,R.layout.intent_item,intentItemList);
        intentList = (ListView) findViewById(R.id.main_list);
        intentList.setAdapter(listAdater);
        intentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //IntentItem inten = intentItemList.get(position);
                if(position ==0){
                    Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void initIntentName() {
        IntentItem LayoutDemo = new IntentItem("布局Demo");
        intentItemList.add(LayoutDemo);
        IntentItem ActivityDemo = new IntentItem("活动Demo");
        intentItemList.add(ActivityDemo);
    }
}
