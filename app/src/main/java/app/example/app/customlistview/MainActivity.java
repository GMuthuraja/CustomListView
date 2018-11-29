package app.example.app.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List cars;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cars = new ArrayList();
        list = (ListView) findViewById(R.id.listView);


        cars.add(new Cars(R.drawable.i20, "i20", "Hyundai"));
        cars.add(new Cars(R.drawable.swift, "Swift", "Maruthi Suzuki"));
        cars.add(new Cars(R.drawable.verna, "Verna", "Hyundai"));
        cars.add(new Cars(R.drawable.ertiga, "Ertiga", "Maruthi Suzuki"));


        MyListAdapter adapter = new MyListAdapter(MainActivity.this, R.layout.my_custom_list, cars);
        list.setAdapter(adapter);
    }
}
