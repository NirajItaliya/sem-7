package com.example.mad_npracticals.Practical_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mad_npracticals.R;

import java.util.ArrayList;

public class parcticl_6 extends AppCompatActivity {

    ArrayList<MyListData> mListData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcticl6);

        String[] name = new String[]{"John Cena", "Roman Reings", "UnderTaker", "Deam Ambroad", "John Cena", "Roman Reings", "UnderTaker", "Deam Ambroad"};
        int[] img = new
                int[]{R.drawable.user1, R.drawable.user2, R.drawable.user3, R.drawable.user4, R.drawable.user1, R.drawable.user2, R.drawable.user3, R.drawable.user4};
        String[] add = new
                String[]{"California", "London", "Amsterdam", "Dubai", "California", "London", "Amsterdam", "Dubai"};
        RecyclerView rvList;
        rvList = findViewById(R.id.rvList);


/*
myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California");

myListData=new MyListData("John Cena",R.drawable.user1,"California"); myListData=new MyListData("John Cena",R.drawable.user1,"California");
*/

        for (int i = 0; i <= name.length; i++) {
            try {
                MyListData myListData = new MyListData(name[i], img[i], add[i]);
                mListData.add(myListData);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        MyAdapter myAdapter = new MyAdapter();
        rvList.setAdapter(myAdapter);
        myAdapter.setData(mListData);
        rvList.setLayoutManager(new LinearLayoutManager(this));
    }

}
