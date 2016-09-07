package com.liguofu.romeoseatao_project.activty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.liguofu.romeoseatao_project.R;

import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class LiveDatielActivity extends AppCompatActivity {

    private VideoView mVidoView;
    private ImageView imageBack;
    private ImageView imageShare;

    public static final String URL = "http://apiapp.romeomart.com/apiapp/zlives/index?homes.html";
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_datiel);
        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this))
            return;
        mVidoView = (VideoView) findViewById(R.id.vv_live_detail);
        MediaController controller = new MediaController(this);
        mVidoView.setMediaController(controller);

        initView();
    }

    private void initView() {
        imageBack = (ImageView) findViewById(R.id.iv_livedetail_back);
        imageShare = (ImageView) findViewById(R.id.iv_livedetail_share);
        wv = (WebView) findViewById(R.id.wv_livedetail);

        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imageShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LiveDatielActivity.this, "暂无分享功能", Toast.LENGTH_SHORT).show();
            }
        });
        wv.loadUrl(URL);
        WebViewClient webViewClient = new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        };
        wv.setWebViewClient(webViewClient);


    }


}
