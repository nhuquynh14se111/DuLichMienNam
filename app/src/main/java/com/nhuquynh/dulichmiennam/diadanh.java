package com.nhuquynh.dulichmiennam;

/**
 * Created by Admin on 09/14/2017.
 */

public class diadanh {
    private String tendiadanh;
    private String nhanxet;
    public  diadanh ( String tendiadanh, String nhanxet)
    {
        this.tendiadanh = tendiadanh;
        this.nhanxet = nhanxet;
    }

    public String getTendiadanh() {
        return tendiadanh;
    }

    public void setTendiadanh(String tendiadanh) {
        this.tendiadanh = tendiadanh;
    }

    public String getNhanxet() {
        return nhanxet;
    }

    public void setNhanxet(String nhanxet) {
        this.nhanxet = nhanxet;
    }
}
