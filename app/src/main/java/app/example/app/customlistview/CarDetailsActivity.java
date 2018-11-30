package app.example.app.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CarDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        MainActivity obj = new MainActivity();
        ArrayList<Cars> carList = obj.carArrayList();

        ImageView image = (ImageView)findViewById(R.id.detailsImage);
        TextView name = (TextView)findViewById(R.id.carName);
        TextView price = (TextView)findViewById(R.id.priceDetails);
        TextView model = (TextView)findViewById(R.id.modelDetails);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            int id = bundle.getInt("car_id");
            for(int i = 0; i< carList.size(); i++){
                Cars car = carList.get(i);
                if (car.getId() == id){
                    name.setText(car.getName()+"\n("+car.getBrand()+")");
                    image.setImageDrawable(getResources().getDrawable(car.getImage()));
                    price.setText("Rs."+car.getPrice());
                    model.setText("Model: "+car.getModel());
                }
            }
        }
    }
}
