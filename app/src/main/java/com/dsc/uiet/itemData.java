package com.dsc.uiet;

/**
 * Created by ANUBHAV on 21-Dec-17.
 */

public class itemData {
    String date,link,body;

    public itemData(String date, String body, String link) {
        this.date = date;
        this.link = link;
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}