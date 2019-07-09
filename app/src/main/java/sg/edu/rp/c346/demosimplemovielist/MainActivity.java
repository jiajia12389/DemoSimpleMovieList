package sg.edu.rp.c346.demosimplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<String> movieList;
    ArrayAdapter<String>  aaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewMovie);
        movieList = new ArrayList<>();
        movieList.add("Avengers");
        movieList.add("Justice League");

        aaList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, movieList);
        lvExamTips.setAdapter(aaList);

    }
}
