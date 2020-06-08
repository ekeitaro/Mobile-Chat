package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvChat;
    ChatAdapter chatAdapter;
    ArrayList<Chat> listChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        initComponents();
        loadData();
        setEvents();
    }

    private void initComponents() {
        listChat = new ArrayList<>();
        rvChat = findViewById(R.id.rvChat);
        chatAdapter = new ChatAdapter(this, listChat);
    }

    private void loadData() {

        listChat.add(new Chat(
                "https://www.shareicon.net/data/256x256/2016/09/07/827256_man_512x512.png",
                "James",
                "Thank you! That was very helpful"
        ));

        listChat.add(new Chat(
                "https://www.shareicon.net/data/256x256/2016/09/07/827262_user_512x512.png",
                "Will Kenny",
                "I know... I'm trying to get the funds."
        ));

        listChat.add(new Chat(
                "https://www.shareicon.net/data/256x256/2016/09/07/827269_man_512x512.png",
                "Beth Williams",
                "I'm looking for tips around capturing the milky way. I have a 6D with a 24-100mm..."
        ));

        listChat.add(new Chat(
                "https://www.shareicon.net/data/256x256/2016/09/07/827276_man_512x512.png",
                "Rev Shawn",
                "Wanted to ask if you're available for a portrait shoot next week."
        ));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvChat.setLayoutManager(linearLayoutManager);
        rvChat.setAdapter(chatAdapter);
    }

    private void setEvents() {

    }

    @Override
    protected void onResume() {
        chatAdapter.notifyDataSetChanged();
        super.onResume();
    }
}
