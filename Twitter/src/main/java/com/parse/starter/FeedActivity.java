package com.parse.starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ListView listView = findViewById(R.id.listView);
        List<Map<String, String>> tweetData = new ArrayList<>();

        for(int i=1;i<=5;i++){
            Map<String,String> tweetInfo = new HashMap<>();
            tweetInfo.put("content","Tweet Content" + Integer.toString(i));
            tweetInfo.put("username","User " + Integer.toString(i));
            tweetData.add(tweetInfo);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, tweetData, android.R.layout.simple_expandable_list_item_2, new String[] {"content","username"}, new int[] {android.R.id.text1,android.R.id.text2});

        listView.setAdapter(simpleAdapter);
    }
}
