package com.cyh.tinker.sample;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //加载补丁包
        String path= Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk";
        TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), path);

        text=findViewById(R.id.text);

        text.setText(getStrText());

    }

    private String getStrText(){
        Log.i("tag","这个APP有bug");
        return "这个APP有bug";
//        return "这个APP的bug已修复";
    }
}
