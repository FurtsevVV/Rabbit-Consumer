package com.zakat.rabbitconsumer;

public class BackMessage {

    private int id;
    private String text;
    private int qty;

    public BackMessage(int id, String text, int qty) {
        this.id = id;
        this.text = text;
        this.qty = qty;
    }

    public BackMessage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "BackMessage{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", qty=" + qty +
                '}';
    }
}
