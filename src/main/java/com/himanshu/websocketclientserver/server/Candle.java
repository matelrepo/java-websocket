package com.himanshu.websocketclientserver.server;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;




public class Candle {

    public Candle(){}

    public Candle(int id, String content ){
        this.id = id;
        this.content = content;
    }

    private int id;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Candle{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
