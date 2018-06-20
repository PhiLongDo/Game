package com.example.windows10.gamebaicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChonSoTuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_so_tu);
    }

    public void chontu(View view) {
        if (view == findViewById(R.id.btn_1tu)){
            Intent MotTu = new Intent(ChonSoTuActivity.this,MotTuActivity.class);
            startActivity(MotTu);
            finish();
        }

        if (view == findViewById(R.id.btn_2tu)){
            Intent HaiTu = new Intent(ChonSoTuActivity.this,HaiTuActivity.class);
            startActivity(HaiTu);
            finish();
        }

        if (view == findViewById(R.id.btn_3tu)){
            Intent BaTu = new Intent(ChonSoTuActivity.this,BaTuActivity.class);
            startActivity(BaTu);
            finish();
        }

        if (view == findViewById(R.id.btn_4tu)){
            Intent BonTu = new Intent(ChonSoTuActivity.this,BonTuActivity.class);
            startActivity(BonTu);
            finish();
        }

    }

}
