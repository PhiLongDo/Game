package com.example.windows10.gamebaicao;

import java.util.ArrayList;

public class TuBai {
    private ArrayList<LaBai> CacLaDaRut = new ArrayList<>();
    private String KetQua;

    public TuBai(ArrayList<LaBai> cacLaDaRut, String ketQua) {
        for (int i=0; i<3; i++){
            CacLaDaRut.add(new LaBai(cacLaDaRut.get(i)));
        }
        KetQua = ketQua;
    }

    public ArrayList<LaBai> getCacLaDaRut() {
        return CacLaDaRut;
    }

    public void setCacLaDaRut(ArrayList<LaBai> cacLaDaRut) {
        for (int i=0; i<3; i++){
            CacLaDaRut.add(new LaBai(cacLaDaRut.get(i)));
        }
    }

    public String getKetQua() {
        return KetQua;
    }

    public void setKetQua(String ketQua) {
        KetQua = ketQua;
    }
}
