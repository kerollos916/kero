package com.example.theroom0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class roms4 extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roms4);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);adView.setAdUnitId("ca-app-pub-2651492113349554/3235544996");
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    AdSize adSize = new AdSize(300, 50);
    AdView adView = new AdView(this);



    Button button1 =findViewById(R.id.bun_1);
        Button button2 =findViewById(R.id.bun_2);
        Button button3 =findViewById(R.id.bun_3);
        Button button4 =findViewById(R.id.bun_4);




    public void ex(View view) {
        Intent intent = new Intent(this,roms5.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"اعبر بسلام",Toast.LENGTH_LONG).show();

    }

    public void good(View view) {
        Intent intent = new Intent(this,roms05.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"انتقل لليعد الاخر",Toast.LENGTH_LONG).show();
    }

    public void rand(View view) {
        Intent intent = new Intent(this,roms04.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"اجابه صحيحه 50%",Toast.LENGTH_LONG).show();
    }

    public void bad(View view) {
        Intent intent = new Intent(this,roms03.class);
        startActivity(intent);


        Toast.makeText(getApplicationContext(),"انت لم تخرج ابدا",Toast.LENGTH_LONG).show();
    }
}
