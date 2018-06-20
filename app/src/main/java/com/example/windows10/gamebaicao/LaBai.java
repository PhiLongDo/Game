package com.example.windows10.gamebaicao;

public class LaBai {
    private int SoNut;
    private String Ten;
    private int Hinh;
    public LaBai(int nut, String ten, int hinh)
    {
        SoNut = nut;
        Ten = ten;
        Hinh = hinh;
    }

    public LaBai(LaBai laBai) {
        SoNut = laBai.getSoNut();
        Ten = new String(laBai.getTen());
        Hinh = laBai.getHinh();
    }

    public int getSoNut() {
        return SoNut;
    }

    public void setSoNut(int soNut) {
        SoNut = soNut;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
