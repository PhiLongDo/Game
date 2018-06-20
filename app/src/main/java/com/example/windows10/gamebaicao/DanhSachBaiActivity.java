package com.example.windows10.gamebaicao;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanhSachBaiActivity extends AppCompatActivity {

    ListView lv;
    private ArrayList<LaBai> CacLaBai = new ArrayList<>();
    LaBaiAdapter adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_bai);

        lv = (ListView) findViewById(R.id.lvDsBai);
        xaoBai();
        adp = new LaBaiAdapter(CacLaBai,DanhSachBaiActivity.this);
        lv.setAdapter(adp);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                LaBai lb = (LaBai) parent.getItemAtPosition(position);
                AlertDialog.Builder tb = new AlertDialog.Builder(DanhSachBaiActivity.this);
                tb.setTitle("Thông tin");
                tb.setMessage(lb.getTen()+" "+lb.getSoNut());
                tb.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                tb.show();
                return false;
            }
        });
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
}
