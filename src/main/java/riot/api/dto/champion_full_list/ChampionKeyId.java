package riot.api.dto.champion_full_list;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ChampionKeyId {

    private int key;
    private String id;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ChampionKeyId{" +
                "key=" + key +
                ", id='" + id + '\'' +
                '}';
    }
}