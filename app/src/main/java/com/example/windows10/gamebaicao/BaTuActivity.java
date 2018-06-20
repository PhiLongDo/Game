package com.example.windows10.gamebaicao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class BaTuActivity extends AppCompatActivity {

    private ImageView LaBai[] = new ImageView[9];
    private TextView tvKetQua[] = new TextView[3] ;
    private ArrayList<LaBai> CacLaBai = new ArrayList<>();
    private ArrayList<LaBai> CacLaDaRut = new ArrayList<>();
    private ArrayList<TuBai> CacTu = new ArrayList<>();
    private Button MoBai[] = new Button[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_tu);
            //Tụ 1
        LaBai[0] = (ImageView) findViewById(R.id.img_3Tu_la1Tu1);
        LaBai[1] = (ImageView) findViewById(R.id.img_3Tu_la2Tu1);
        LaBai[2] = (ImageView) findViewById(R.id.img_3Tu_la3Tu1);
        tvKetQua[0] = (TextView)  findViewById(R.id.tv_3Tu_soNutTu1);
        MoBai[0] = (Button) findViewById(R.id.btn_3Tu_moTu1);
             //Tụ 2
        LaBai[3] = (ImageView) findViewById(R.id.img_3Tu_la1Tu2);
        LaBai[4] = (ImageView) findViewById(R.id.img_3Tu_la2Tu2);
        LaBai[5] = (ImageView) findViewById(R.id.img_3Tu_la3Tu2);
        tvKetQua[1] = (TextView)  findViewById(R.id.tv_3Tu_soNutTu2);
        MoBai[1] = (Button) findViewById(R.id.btn_3Tu_moTu2);
            //Tụ 3
        LaBai[6] = (ImageView) findViewById(R.id.img_3Tu_la1Tu3);
        LaBai[7] = (ImageView) findViewById(R.id.img_3Tu_la2Tu3);
        LaBai[8] = (ImageView) findViewById(R.id.img_3Tu_la3Tu3);
        tvKetQua[2] = (TextView)  findViewById(R.id.tv_3Tu_soNutTu3);
        MoBai[2] = (Button) findViewById(R.id.btn_3Tu_moTu3);

        xaoBai();
    }

    private void xaoBai() {
        CacLaBai.clear();
        CacLaBai.add(new LaBai(1, "Ách Chuồng", R.drawable.c1));
        CacLaBai.add(new LaBai(1, "Ách Rô", R.drawable.d1));
        CacLaBai.add(new LaBai(1, "Ách Cơ", R.drawable.h1));
        CacLaBai.add(new LaBai(1, "Ách Bích", R.drawable.s1));

        CacLaBai.add(new LaBai(2, "Hai Chuồng", R.drawable.c2));
        CacLaBai.add(new LaBai(2, "Hai Rô", R.drawable.d2));
        CacLaBai.add(new LaBai(2, "Hai Cơ", R.drawable.h2));
        CacLaBai.add(new LaBai(2, "Hai Bích", R.drawable.s2));

        CacLaBai.add(new LaBai(3, "Ba Chuồng", R.drawable.c3));
        CacLaBai.add(new LaBai(3, "Ba Rô", R.drawable.d3));
        CacLaBai.add(new LaBai(3, "Ba Cơ", R.drawable.h3));
        CacLaBai.add(new LaBai(3, "Ba Bích", R.drawable.s3));

        CacLaBai.add(new LaBai(4, "Bốn Chuồng", R.drawable.c4));
        CacLaBai.add(new LaBai(4, "Bốn Rô", R.drawable.d4));
        CacLaBai.add(new LaBai(4, "Bốn Cơ", R.drawable.h4));
        CacLaBai.add(new LaBai(4, "Bốn Bích", R.drawable.s4));

        CacLaBai.add(new LaBai(5, "Năm Chuồng", R.drawable.c5));
        CacLaBai.add(new LaBai(5, "Năm Rô", R.drawable.d5));
        CacLaBai.add(new LaBai(5, "Năm Cơ", R.drawable.h5));
        CacLaBai.add(new LaBai(5, "Năm Bích", R.drawable.s5));

        CacLaBai.add(new LaBai(6, "Sáu Chuồng", R.drawable.c6));
        CacLaBai.add(new LaBai(6, "Sáu Rô", R.drawable.d6));
        CacLaBai.add(new LaBai(6, "Sáu Cơ", R.drawable.h6));
        CacLaBai.add(new LaBai(6, "Sáu Bích", R.drawable.s6));

        CacLaBai.add(new LaBai(7, "Bảy Chuồng", R.drawable.c7));
        CacLaBai.add(new LaBai(7, "Bảy Rô", R.drawable.d7));
        CacLaBai.add(new LaBai(7, "Bảy Cơ", R.drawable.h7));
        CacLaBai.add(new LaBai(7, "Bảy Bích", R.drawable.s7));

        CacLaBai.add(new LaBai(8, "Tám Chuồng", R.drawable.c8));
        CacLaBai.add(new LaBai(8, "Tám Rô", R.drawable.d8));
        CacLaBai.add(new LaBai(8, "Tám Cơ", R.drawable.h8));
        CacLaBai.add(new LaBai(8, "Tám Bích", R.drawable.s8));

        CacLaBai.add(new LaBai(9, "Chín Chuồng", R.drawable.c9));
        CacLaBai.add(new LaBai(9, "Chín Rô", R.drawable.d9));
        CacLaBai.add(new LaBai(9, "Chín Cơ", R.drawable.h9));
        CacLaBai.add(new LaBai(9, "Chín Bích", R.drawable.s9));

        CacLaBai.add(new LaBai(10, "Mười Chuồng", R.drawable.c10));
        CacLaBai.add(new LaBai(10, "Mười Rô", R.drawable.d10));
        CacLaBai.add(new LaBai(10, "Mười Cơ", R.drawable.h10));
        CacLaBai.add(new LaBai(10, "Mười Bích", R.drawable.s10));

        CacLaBai.add(new LaBai(11, "Bồi Chuồng", R.drawable.cj));
        CacLaBai.add(new LaBai(11, "Bồi Rô", R.drawable.dj));
        CacLaBai.add(new LaBai(11, "Bồi Cơ", R.drawable.hj));
        CacLaBai.add(new LaBai(11, "Bồi Bích", R.drawable.sj));

        CacLaBai.add(new LaBai(12, "Đầm Chuồng", R.drawable.cq));
        CacLaBai.add(new LaBai(12, "Đầm Rô", R.drawable.dq));
        CacLaBai.add(new LaBai(12, "Đầm Cơ", R.drawable.hq));
        CacLaBai.add(new LaBai(12, "Đầm Bích", R.drawable.sq));

        CacLaBai.add(new LaBai(13, "Già Chuồng", R.drawable.ck));
        CacLaBai.add(new LaBai(13, "Già Rô", R.drawable.dk));
        CacLaBai.add(new LaBai(13, "Già Cơ", R.drawable.hk));
        CacLaBai.add(new LaBai(13, "Già Bích", R.drawable.sk));
    }


    private void chiabai(View view) {
        Random r = new Random();
        CacTu.clear();
        xaoBai();
        for (int i = 0; i<9; i++){
            LaBai[i].setImageResource(R.drawable.b1fv);
            if(i<3){
                tvKetQua[i].setText("Số nút: ");
            }
        }

        int vt, tong;
        String ketqua;
        for (int j = 0; j<3; j++){
            tong = 0;
            CacLaDaRut.clear();
            for (int i=0; i<3; i++) {
                vt = r.nextInt(CacLaBai.size() - 1);
                CacLaDaRut.add(CacLaBai.get(vt));
                if (CacLaBai.get(vt).getSoNut() <= 10) {
                    tong = tong + CacLaBai.get(vt).getSoNut();
                }
                CacLaBai.remove(vt);
            }
            if (tong > 0) {
                ketqua = (tong % 10) + " nút";
            } else {
                ketqua = "ba Tây";
            }
            CacTu.add(new TuBai(CacLaDaRut,ketqua));
        }

        Toast.makeText(this, "Đã chia bài xong", Toast.LENGTH_SHORT).show();
    }

    private void mobai(View view) {
        if (CacTu.isEmpty()){
            Toast.makeText(this, "Bạn chưa chia bài", Toast.LENGTH_SHORT).show();
        } else {
            if (view == MoBai[0]){
                for (int i=0; i<3; i++){
                    LaBai[i].setImageResource((CacTu.get(0).getCacLaDaRut().get(i).getHinh()));
                }
                tvKetQua[0].setText(CacTu.get(0).getKetQua());
            }

            if (view == MoBai[1]){
                for (int i=0; i<3; i++){
                    LaBai[i+3].setImageResource((CacTu.get(1).getCacLaDaRut().get(i).getHinh()));
                }
                tvKetQua[1].setText(CacTu.get(1).getKetQua());
            }

            if (view == MoBai[2]){
                for (int i=0; i<3; i++){
                    LaBai[i+6].setImageResource((CacTu.get(2).getCacLaDaRut().get(i).getHinh()));
                }
                tvKetQua[2].setText(CacTu.get(2).getKetQua());
            }
        }
    }
}
