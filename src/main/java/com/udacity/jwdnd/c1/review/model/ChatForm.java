package com.udacity.jwdnd.c1.review.model;

public class ChatForm {
    private String Username;
    private String messageText;
    private String messageType;

    public String getUsername(){
        return Username;
    }
    public void setUsername(String Username)
    {
this.Username=Username;
    }
    public String getmessageText(){
        return messageText;
    }
    public void setmessageText(String messageText)
    {
this.messageText=messageText;
    }
    public String getMessageType()
    {
        return messageType;
    }
    public void setMessageType(String messageType)
        {
            this.messageType=messageType;
    }
}
