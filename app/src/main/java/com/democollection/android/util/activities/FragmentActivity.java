package com.democollection.android.util.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.democollection.android.R;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
