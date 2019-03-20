package anew.gans.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class BarGraph extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_graph);
        barChart = (BarChart)findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(44f,1));
        barEntries.add(new BarEntry(55f,2));
        barEntries.add(new BarEntry(88f,3));
        barEntries.add(new BarEntry(22f,4));
        barEntries.add(new BarEntry(33f,5));
        barEntries.add(new BarEntry(77f,6));
        barEntries.add(new BarEntry(11f,7));
        barEntries.add(new BarEntry(55f,8));

        BarDataSet barDataSet= new BarDataSet(barEntries,"Dates");


         ArrayList<String> theDates = new ArrayList<>();
         theDates.add("Jan");
         theDates.add("Feb");
        theDates.add("March");
        theDates.add("April");
        theDates.add("May");
        theDates.add("June");
        theDates.add("July");
        theDates.add("Aug");


        BarData theData = new BarData(theDates, barDataSet);
        barChart.setData(theData);
        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }
}
