package data_dragon.endpoints.cdn.champion.dto;

import com.google.gson.Gson;

public class Datavalues {

    @Override
    public String toString() {
        return
                "datavalues:{" +
                        "}";
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}