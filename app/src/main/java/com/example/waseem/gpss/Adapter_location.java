package com.dreamkodez.gps.location.finderr;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.waseem.gpss.NewAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.NativeExpressAdView;

public class Adapter_location extends BaseAdapter {

    String[] resultz;
    Context context;
    int[] imageIdz;

    private static LayoutInflater inflater_new = null;

    public Adapter_location(com.dreamkodez.gps.location.finderr.findlocation mainActivity, String[] prgmNameList,
                            int[] prgmImages) {
        // TODO Auto-generated constructor stub
        resultz = prgmNameList;
        context = mainActivity;
        imageIdz = prgmImages;
        inflater_new = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 14;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView tv_new;
        ImageView img_new;
        NativeExpressAdView mAdView;
        GridView mgridview;
        InterstitialAd holder;
        AdRequest adRequest;
        Uri gmmIntentUri;
        Intent mapIntent_new;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        final Holder holder = new Holder();
        View rowView;
        holder.holder = new InterstitialAd(context);
        holder.holder.setAdUnitId("ca-app-pub-8002008697356859/3416298509");
        holder.adRequest = new AdRequest.Builder().build();

        holder.holder.loadAd(holder.adRequest);
        if (position % 2 == 0) {
            rowView = inflater_new.inflate(R.layout.ad_layout, null);
            holder.mAdView = (NativeExpressAdView) rowView.findViewById(R.id.adViewww);
            holder.mAdView.loadAd(new AdRequest.Builder().build());

            return rowView;
        } else {
            if (position == 13) {
                rowView = inflater_new.inflate(R.layout.gridview_layout, null);
                holder.mgridview = (GridView) rowView.findViewById(R.id.gridViewzzz);
                holder.mgridview.setAdapter(new NewAdapter(convertView.getContext(), 3, position));
                holder.mgridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (holder.holder.isLoaded()) {
                            holder.holder.show();
                        } else {
                            switch (position) {

                                case 0:

                                    if (holder.holder.isLoaded()) {
                                        holder.holder.show();
                                    } else {

                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Water filter supplier");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;

                                    }
                                case 1:
                                    holder.gmmIntentUri = Uri
                                            .parse("geo:0,0?q=Academy");
                                    holder.mapIntent_new = new Intent(
                                            "android.intent.action.VIEW",
                                            holder.gmmIntentUri);
                                    holder.mapIntent_new
                                            .setPackage("com.google.android.apps.maps");
                                    context
                                            .startActivity(holder.mapIntent_new);
                                    return;

                                case 2:

                                    if (holder.holder.isLoaded()) {
                                        holder.holder.show();
                                    } else {

                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Talor shop");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    }
                            }
                        }
                    }
                });
                return rowView;
            } else {
                rowView = inflater_new.inflate(R.layout.gridview_layout, null);
                holder.mgridview = (GridView) rowView.findViewById(R.id.gridViewzzz);
                holder.mgridview.setAdapter(new NewAdapter(convertView.getContext(), 9, position));
                holder.mgridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position1, long id) {
                        if (holder.holder.isLoaded()) {
                            holder.holder.show();
                        } else {
                            if (position == 1) {
                                switch (position1) {

                                    case 0:
                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=hospitals");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);


                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;
                                        }

                                    case 1:
                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        }

                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=hotels");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;

                                    case 2:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {


                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=mosques");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;
                                        }
                                    case 3:
                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        }
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=airports");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 4:
                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=railway stations");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 5:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        }
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=bus stands");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 6:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {


                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=banks");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;
                                        }

                                    case 7:
                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        }
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=atms");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 8:


                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=post offices");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                }
                            } else if (position == 3) {
                                switch (position1) {
                                    case 0:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=schools");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 1:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=colleges");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;
                                        }
                                    case 2:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=universities");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 3:


                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=fire stations");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 4:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=police stations");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;

                                    case 5:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=service station");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }

                                    case 6:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=bakerys");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 7:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {


                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=salons");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 8:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=book stores");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                }
                            } else if (position == 5) {
                                switch (position1) {
                                    case 0:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=clubs");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 1:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=cafes");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 2:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=court houses");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 3:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=car repair");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 4:


                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=car rental");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 5:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=doctors");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 6:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=furniture store");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 7:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=food");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 8:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=gyms");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                }
                            } else if (position == 7) {
                                switch (position1) {
                                    case 0:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=health");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;


                                    case 1:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=dentist");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }


                                    case 2:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=laundry");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 3:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=lawyers");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 4:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=markets");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 5:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=museums");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 6:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=pharmacy");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 7:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=parking");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }

                                    case 8:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=restaurants");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                }
                            } else if (position == 9) {
                                switch (position1) {
                                    case 0:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=travel agency");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }


                                    case 1:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=zoo");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;


                                    case 2:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=rent a car");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }


                                    case 3:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=hostel");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;


                                    case 4:


                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=patrol pump");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new


                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 5:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=car wash");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 6:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=plumber");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;
                                        }

                                    case 7:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Electrician");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 8:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=Electronic store");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                }
                            } else if (position == 11) {
                                switch (position1) {
                                    case 0:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Hindu Temples");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 1:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=Pet Shops");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 2:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Stadium");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;


                                    case 3:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=Mobile Shops");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 4:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Casino");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 5:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=Software House");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 6:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Movie theater");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;


                                    case 7:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=Shoping Malls");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                    case 8:
                                        holder.gmmIntentUri = Uri
                                                .parse("geo:0,0?q=Taxi stand");
                                        holder.mapIntent_new = new Intent(
                                                "android.intent.action.VIEW",
                                                holder.gmmIntentUri);
                                        holder.mapIntent_new
                                                .setPackage("com.google.android.apps.maps");
                                        context
                                                .startActivity(holder.mapIntent_new);
                                        return;
                                    case 9:

                                        if (holder.holder.isLoaded()) {
                                            holder.holder.show();
                                        } else {

                                            holder.gmmIntentUri = Uri
                                                    .parse("geo:0,0?q=Water filter supplier");
                                            holder.mapIntent_new = new Intent(
                                                    "android.intent.action.VIEW",
                                                    holder.gmmIntentUri);
                                            holder.mapIntent_new
                                                    .setPackage("com.google.android.apps.maps");
                                            context
                                                    .startActivity(holder.mapIntent_new);
                                            return;

                                        }
                                }
                            }
                        }

                    }
                });


                return rowView;
            }
        }

    }


}