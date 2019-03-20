package anew.gans.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
    }

    public void linegraph(View view) {
        startActivity(new Intent(this,LineGraph.class));
    }

    public void bargraph(View view) {
        startActivity(new Intent(this,BarGraph.class));
    }
}
