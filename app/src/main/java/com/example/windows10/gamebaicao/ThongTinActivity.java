package com.example.windows10.gamebaicao;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;

public class ThongTinActivity extends AppCompatActivity {

    TextView tvThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin);

        tvThongTin = (TextView) findViewById(R.id.tvthongtin);

        tvThongTin.setClickable(true);
        tvThongTin.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
