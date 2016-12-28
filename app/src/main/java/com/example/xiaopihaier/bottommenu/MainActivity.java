package com.example.xiaopihaier.bottommenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView main_image,faxian_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentVIew();
    }

    private void IntentVIew() {
        main_image= (ImageView) findViewById(R.id.main_image);
        main_image.setOnClickListener(this);
        faxian_image= (ImageView) findViewById(R.id.faxian_image);
        faxian_image.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_image:
                Log.i("点击","首页");
                break;
            case R.id.faxian_image:
                Log.i("点击","发现");
                break;
        }
    }
}
