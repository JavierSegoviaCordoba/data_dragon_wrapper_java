package data_dragon.endpoints.realms.realms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Realms {

    @JsonProperty("dd")
    private String dd;

    @JsonProperty("css")
    private String css;

    @JsonProperty("v")
    private String V;

    @JsonProperty("lg")
    private String lg;

    @JsonProperty("profileiconmax")
    private int profileiconmax;

    @JsonProperty("store")
    private Object store;

    @JsonProperty("l")
    private String L;

    @JsonProperty("cdn")
    private String cdn;

    @JsonProperty("n")
    private N N;

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getV() {
        return V;
    }

    public void setV(String V) {
        this.V = V;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public int getProfileiconmax() {
        return profileiconmax;
    }

    public void setProfileiconmax(int profileiconmax) {
        this.profileiconmax = profileiconmax;
    }

    public Object getStore() {
        return store;
    }

    public void setStore(Object store) {
        this.store = store;
    }

    public String getL() {
        return L;
    }

    public void setL(String L) {
        this.L = L;
    }

    public String getCdn() {
        return cdn;
    }

    public void setCdn(String cdn) {
        this.cdn = cdn;
    }

    public N getN() {
        return N;
    }

    public void setN(N N) {
        this.N = N;
    }

    @Override
    public String toString() {
        return
                "Realms{" +
                        "dd = '" + dd + '\'' +
                        ",css = '" + css + '\'' +
                        ",v = '" + V + '\'' +
                        ",lg = '" + lg + '\'' +
                        ",profileiconmax = '" + profileiconmax + '\'' +
                        ",store = '" + store + '\'' +
                        ",l = '" + L + '\'' +
                        ",cdn = '" + cdn + '\'' +
                        ",n = '" + N + '\'' +
                        "}";
    }
}