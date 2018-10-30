package com.example.lokesh.amul;

public class Message {
    private byte[] encryptedBytes;
    private byte[] encryptedKey;
    private String device;
    private String text;
    private MemberData data;
    private String algo;
    private boolean belongsToCurrentUser;

    public Message(String text, String device, MemberData data, boolean belongsToCurrentUser) {
        this.encryptedBytes = encryptedBytes;
        this.encryptedKey = encryptedKey;
        this.device = device;
        this.text = text;
        this.data = data;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public byte[] getEncryptedBytes(){return encryptedBytes;}
    public byte[] getEncryptedKey(){return encryptedKey;}
    public String getAlgo(){return algo;}
    public String getText(){return text;}

    public MemberData getData() {
        return data;
    }
    public String getDevice(){return device;}

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}
