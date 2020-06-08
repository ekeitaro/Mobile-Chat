package com.example.chat;

public class Chat {
    private String pURL;
    private String name;
    private String lastMessage;

    public Chat(String pURL, String name, String lastMessage) {
        this.pURL = pURL;
        this.name = name;
        this.lastMessage = lastMessage;
    }

    public String getPURL() {
        return pURL;
    }


    public String getName() {
        return name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

}
