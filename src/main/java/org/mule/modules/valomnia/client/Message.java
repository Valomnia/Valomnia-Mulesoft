package org.mule.modules.valomnia.client;

public class Message {

    String id;
    String message;

    public Message(String id, String details) {
        super();
        this.id = id;
        this.message = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String details) {
        this.message = details;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", message=" + message + "]";
    }

}
