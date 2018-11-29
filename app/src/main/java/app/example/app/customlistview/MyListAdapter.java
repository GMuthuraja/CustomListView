package app.example.app.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends ArrayAdapter {


    List<Cars> car_array;
    int resource;
    Context context;

    public MyListAdapter(Context context_param, int resource_param, List car_param){
        super(context_param, resource_param, car_param);
        this.context = context_param;
        this.resource = resource_param;
        this.car_array = car_param;
    }


    @Override
    public View getView(int position, View child, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(this.resource, null);


        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewBrand = view.findViewById(R.id.textViewBrand);
        Button buttonDetails = view.findViewById(R.id.buttonDetails);

        Cars car = car_array.get(position);
        imageView.setImageDrawable(context.getResources().getDrawable(car.getImage()));
        textViewName.setText(car.getName());
        textViewBrand.setText(car.getBrand());

        return view;
    }
}
