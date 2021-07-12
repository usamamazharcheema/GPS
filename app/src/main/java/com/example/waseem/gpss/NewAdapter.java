package com.example.waseem.gpss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.dreamkodez.gps.location.finderr.R;
import com.google.android.gms.ads.NativeExpressAdView;

/**
 * Created by Usama Cheema on 9/20/2017.
 */

public class NewAdapter extends BaseAdapter {
    int[] imageIdz1= {R.drawable.hospital, R.drawable.hotel, R.drawable.mosque, R.drawable.airport,
    R.drawable.railwaystation, R.drawable.busstation, R.drawable.bank, R.drawable.atm,
    R.drawable.postoffice};
    int[] imageIdz2={R.drawable.school, R.drawable.college, R.drawable.university,
            R.drawable.firestation, R.drawable.policestation, R.drawable.servicestation, R.drawable.bakery,
            R.drawable.beautysaloon, R.drawable.bookshop};
    int[] imageIdz3={R.drawable.club, R.drawable.cafe,
            R.drawable.court, R.drawable.carrepair, R.drawable.carrental, R.drawable.doctor,
            R.drawable.furniture, R.drawable.fastfood, R.drawable.gym};
    int[] imageIdz4={R.drawable.health,
            R.drawable.dentist, R.drawable.laundry, R.drawable.lawyer, R.drawable.market,
            R.drawable.meseum, R.drawable.pharmacy, R.drawable.parking, R.drawable.restaurant};
    int[] imageIdz5={R.drawable.travelagent, R.drawable.zoo, R.drawable.carrental, R.drawable.hostel,
            R.drawable.petrolpump, R.drawable.carwash, R.drawable.plumber, R.drawable.electrician,
            R.drawable.electronicstore};
    int[] imageIdz6={R.drawable.hindutemple, R.drawable.petshop, R.drawable.stadium,
            R.drawable.mobileshop, R.drawable.casino, R.drawable.softwarehouse, R.drawable.movietheater,
            R.drawable.shoppingmall, R.drawable.taxistand};
    int[] imageIdz7={R.drawable.watersupplier, R.drawable.academy,
            R.drawable.tailorshop};

    String[] resultz1={"Hospital", "Hotel", "Mosque", "Airport",
            "Railway Station", "Bus Stand", "Bank", "ATM",
            "Post Office"};
    String[] resultz2={"School", "College", "University",
            "Fire Station", "Police Station", "Service Station", "Backers",
            "Beauty Salon", "Book Shops"};
    String[] resultz3={"Clubs", "cafes",
            "Court House", "Car Repair", "Car Rental", "Doctors",
            "Furniture", "Fast Food", "Gyms"};
    String[] resultz4={"Health",
            "Dentist", "laundry", "lawyer", "Markets",
            "Museums", "Pharmacy", "Parking", "Restaurant"};
    String[] resultz5={"Travel Agent", "Zoo", "Rent A Car", "Hostel",
            "patrol pump", "Car Wash", "Plumber", "Electrician",
            "Electronic Store"};
    String[] resultz6={"Hindu Temples", "Pet Shop", "Stadium",
            "Mobile Shop", "Casino", "Software House", "Movie theater",
            "Shoping Mall", "Taxi Stand"};
    String[] resultz7={" Water Supplier", "Academy",
            "Talor shop"};

    Context context;
    int renumber;
    int reposititon;
    private static LayoutInflater inflater_new = null;
    public NewAdapter(Context context1, int number,int position) {
        // TODO Auto-generated constructor stub

        context = context1;
renumber=number;
        reposititon=position;
        inflater_new = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    public class Holder {
        TextView tv_new;
        ImageView img_new;

    }

    @Override
    public int getCount() {
        return renumber;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder = new Holder();
        View rowView;
        if (reposititon==1)
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz1[position]);
            holder.img_new.setImageResource(imageIdz1[position]);
            return rowView;
        }
        else if (reposititon==3)
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz2[position]);
            holder.img_new.setImageResource(imageIdz2[position]);
            return rowView;

        }
        else if (reposititon==5)
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz3[position]);
            holder.img_new.setImageResource(imageIdz3[position]);
            return rowView;
        }
        else if (reposititon==7)
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz4[position]);
            holder.img_new.setImageResource(imageIdz4[position]);
            return rowView;
        }
        else if (reposititon==9)
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz5[position]);
            holder.img_new.setImageResource(imageIdz5[position]);
            return rowView;
        }
        else if (reposititon==11)
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz6[position]);
            holder.img_new.setImageResource(imageIdz6[position]);
            return rowView;
        }

        else if (reposititon==13)
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz7[position]);
            holder.img_new.setImageResource(imageIdz7[position]);
            return rowView;
        }
        else
        {
            rowView = inflater_new.inflate(R.layout.gpszz_row_add, null);

            holder.tv_new = (TextView) rowView.findViewById(R.id.texticon_new);
            holder.img_new = (ImageView) rowView.findViewById(R.id.tpyeicon_new);

            holder.tv_new.setText(resultz7[position]);
            holder.img_new.setImageResource(imageIdz7[position]);
            return rowView;
        }


    }
}
