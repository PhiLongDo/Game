package com.example.windows10.gamebaicao;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chonSoTu(View view) {
        Intent sotu = new Intent(MainActivity.this,ChonSoTuActivity.class);
        startActivity(sotu);
    }

    public void thoat(View view) {
        AlertDialog.Builder xacnhan = new AlertDialog.Builder(MainActivity.this);
        xacnhan.setMessage("Bạn có muốn thoát ứng dụng không?");
        xacnhan.setTitle("Xác nhận");
        xacnhan.setIcon(R.drawable.icon_exit);
        xacnhan.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        xacnhan.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(1);
            }
        });
        xacnhan.show();
    }

    public void thongtin(View view) {
        Intent thongtin = new Intent(MainActivity.this,ThongTinActivity.class);
        startActivity(thongtin);
    }

    public void danhsachbai(View view) {
        Intent dsbai = new Intent(MainActivity.this,DanhSachBaiActivity.class);
        startActivity(dsbai);
    }
}
