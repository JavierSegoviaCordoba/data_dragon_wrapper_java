package data_dragon.utils;

import com.google.gson.Gson;

public class ErrorCode {

    private int code;
    private String message;

    public ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "errorCode:{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
