package com.democollection.android.util.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.democollection.android.MainActivity;
import com.democollection.android.R;
import com.democollection.android.util.IntentItem;
import com.democollection.android.util.IntentListAdater;

import java.util.ArrayList;
import java.util.List;

public class LayoutActivity extends AppCompatActivity {

    private List<IntentItem> layoutItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_activity);
        initLayoutName();
        IntentListAdater listAdater = new IntentListAdater(LayoutActivity.this
                ,R.layout.intent_item,layoutItemList);
        ListView layoutList= (ListView) findViewById(R.id.layout_list);
        layoutList.setAdapter(listAdater);
        layoutList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(LayoutActivity.this, LinearLayoutActivity.class);
                    startActivity(intent);


                }else if(position ==1){

                }
            }
        });
    }

    private void initLayoutName() {
        IntentItem LinearLayoutDemo = new IntentItem("线性布局");
        layoutItemList.add(LinearLayoutDemo);
        IntentItem FragmentDemo = new IntentItem("帧布局");
        layoutItemList.add(FragmentDemo);
    }
}
