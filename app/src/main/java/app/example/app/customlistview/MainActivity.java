package app.example.app.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList cars;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);

        carArrayList();

        MyListAdapter adapter = new MyListAdapter(MainActivity.this, R.layout.my_custom_list, cars);
        list.setAdapter(adapter);
    }


    public ArrayList carArrayList(){
        cars = new ArrayList();
        cars.add(new Cars(876,R.drawable.i20, "i20", "Hyundai", "2018", 700000));
        cars.add(new Cars(564,R.drawable.swift, "Swift", "Maruthi Suzuki", "2017", 500000));
        cars.add(new Cars(957,R.drawable.verna, "Verna", "Hyundai", "2018", 800000));
        cars.add(new Cars(856,R.drawable.ertiga, "Ertiga", "Maruthi Suzuki", "2017", 700000));
        cars.add(new Cars(265,R.drawable.i20, "i20", "Hyundai", "2018", 700000));
        cars.add(new Cars(568,R.drawable.swift, "Swift", "Maruthi Suzuki", "2017", 500000));
        cars.add(new Cars(485,R.drawable.verna, "Verna", "Hyundai", "2018", 800000));
        cars.add(new Cars(934,R.drawable.ertiga, "Ertiga", "Maruthi Suzuki","2017", 700000));
        return cars;
    }
}
