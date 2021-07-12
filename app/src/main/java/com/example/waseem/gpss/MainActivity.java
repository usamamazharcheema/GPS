package com.dreamkodez.gps.location.finderr;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.NativeExpressAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn_rout_finder, my_current_location, share_my_location , srchlctin_btn, rate_btn, sharebtn;
    LocationManager gps_see;

    InterstitialAd holder;
    private static String LOG_TAG = "EXAMPLE";
    NativeExpressAdView mAdView;
    VideoController mVideoController;




    int PERMISSION_ALL = 1;
    String[] PERMISSIONS = {android.Manifest.permission.INTERNET, android.Manifest.permission.ACCESS_NETWORK_STATE,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.ACCESS_FINE_LOCATION,
            android.Manifest.permission.ACCESS_COARSE_LOCATION, android.Manifest.permission.SYSTEM_ALERT_WINDOW ,
            android.Manifest.permission.GET_TASKS
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!hasPermissions(this, PERMISSIONS)) {
            ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_ALL);
        }

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Bannernative();



        holder = new InterstitialAd(this);
        holder.setAdUnitId("ca-app-pub-8002008697356859/3416298509");
        requestNewInterstitial();
        holder.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });


        gps_see = (LocationManager) getSystemService(LOCATION_SERVICE);
        if (!gps_see.isProviderEnabled(LocationManager.GPS_PROVIDER)
                || !gps_see.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setIcon(R.drawable.b);
            builder.setMessage("you want to open the GPS?")
                    .setCancelable(false)
                    .setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    Intent intent = new Intent(
                                            Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                    startActivity(intent);
                                }
                            })
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {

                                    dialog.cancel();
                                }
                            });

            AlertDialog alert = builder.create();
            alert.setTitle("Your Device GPS is OFF");
            alert.show();
        }

        btn_rout_finder = (Button) findViewById(R.id.rout_finder);
        my_current_location = (Button) findViewById(R.id.mylocation);
        share_my_location = (Button) findViewById(R.id.sharemylocation);
        srchlctin_btn = (Button) findViewById(R.id.srchlctinbtn);
        rate_btn= (Button) findViewById(R.id.rateapp);

        rate_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("market://details?id="
                                        + "com.utilitiesapp.gpsmaps.navigation.public.transport")));

                    }
                }
        );

        sharebtn= (Button) findViewById(R.id.shareapp);
        sharebtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent share = new Intent(android.content.Intent.ACTION_SEND);
                        share.setType("text/plain");
                        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                        share.putExtra(Intent.EXTRA_SUBJECT, "GPS Maps, Navigation Directions: Public Transport");
                        share.putExtra(
                                Intent.EXTRA_TEXT,
                                "https://play.google.com/store/apps/details?id="
                                        + getPackageName()).toString();
                        startActivity(Intent.createChooser(share, "GPS Maps, Navigation Directions: Public Transport"));
                    }
                }
        );

        btn_rout_finder.setOnClickListener(this);
        my_current_location.setOnClickListener(this);
        share_my_location.setOnClickListener(this);
        srchlctin_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.rout_finder:

                if (holder.isLoaded()) {
                    holder.show();
                }
                    Intent distnc = new Intent("android.intent.action.VIEW",
                            Uri.parse("google.navigation:q="));
                    distnc.setPackage("com.google.android.apps.maps");
                    MainActivity.this.startActivity(distnc);

                break;

            case R.id.mylocation:

                if (holder.isLoaded()) {
                    holder.show();
                }

                    Intent crntlcations = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(crntlcations);

                break;

            case R.id.sharemylocation:
                if (holder.isLoaded()) {
                    holder.show();
                }
                    Intent shr = new Intent(MainActivity.this, shareActivity.class);
                    startActivity(shr);

                break;

            case R.id.srchlctinbtn:

                if (holder.isLoaded()) {
                    holder.show();
                }
                    Intent srch = new Intent(MainActivity.this, findlocation.class);
                    startActivity(srch);

                    break;


        }


    }

    private void Bannernative() {

        mAdView = (NativeExpressAdView) findViewById(R.id.adVieww);
        mAdView.loadAd(new AdRequest.Builder().build());
        }



    public static boolean hasPermissions(Context context, String... permissions) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }




    private void requestNewInterstitial() {
        // TODO Auto-generated method stub
        AdRequest adRequest = new AdRequest.Builder().build();

        holder.loadAd(adRequest);
    }


    @Override
   public void onBackPressed() {

        if (holder.isLoaded()) {
            holder.show();
        }



        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.b);
        builder.setMessage("Are you sure you want to quit?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                finish();
                            }
                        })
                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {

                            }
                        });

        AlertDialog alert = builder.create();
        alert.setTitle("QUIT");
        alert.show();
    }

}
