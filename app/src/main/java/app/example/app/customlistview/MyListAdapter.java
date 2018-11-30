package app.example.app.customlistview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class MyListAdapter extends ArrayAdapter {


    ArrayList<Cars> car_array;
    int resource;
    Context context;

    public MyListAdapter(Context context_param, int resource_param, ArrayList car_param){
        super(context_param, resource_param, car_param);
        this.context = context_param;
        this.resource = resource_param;
        this.car_array = car_param;
    }


    @Override
    public View getView(final int position, View child, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(resource, null);


        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textViewName = (TextView) view.findViewById(R.id.textViewName);
        TextView textViewBrand = (TextView) view.findViewById(R.id.textViewBrand);
        Button buttonRemove = (Button) view.findViewById(R.id.buttonRemove);
        Button buttonDetails = (Button) view.findViewById(R.id.buttonDetails);

        final Cars car = car_array.get(position);
        imageView.setImageDrawable(context.getResources().getDrawable(car.getImage()));
        textViewName.setText(car.getName());
        textViewBrand.setText(car.getBrand());

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car_array.remove(position);
                notifyDataSetChanged();
            }
        });

        buttonDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context, CarDetailsActivity.class);
                intent.putExtra("car_id", car.getId());
                context.startActivity(intent);
            }
        });

        return view;
    }
}
