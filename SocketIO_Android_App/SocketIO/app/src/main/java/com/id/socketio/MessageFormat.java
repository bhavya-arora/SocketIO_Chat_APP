package com.id.socketio;

public class MessageFormat {

    private String Username;
    private String Message;
    private String UniqueId;

    public MessageFormat(String uniqueId, String username, String message) {
        Username = username;
        Message = message;
        UniqueId = uniqueId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getUniqueId() {
        return UniqueId;
    }

    public void setUniqueId(String uniqueId) {
        UniqueId = uniqueId;
    }
}
