package sg.edu.rp.c346.id19031965.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alColourList;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.boxListView);
        alColourList = new ArrayList<>();
        alColourList.add(new Box("blue"));
        alColourList.add(new Box("orange"));
        alColourList.add(new Box("brown"));

        caColour = new CustomAdapter(this, R.layout.row, alColourList);
        lvBox.setAdapter(caColour);
    }
}
