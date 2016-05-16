package dallas.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // I had to manualy set the view to rootView from the inflator so that I could refer to rootView when looking for layout IDs in the hierarchy.
        View rootView = inflater.inflate(R.layout.fragment_main, container,    false);

        /* ---- METHOD ONE, NOT DONE BY THE ONLINE TUTORIAL
        ArrayList<String> forecastList = new ArrayList<String>();

        forecastList.add("Today - Sunny - 88/64");
        forecastList.add("Tomorrow - Cloudy - 56/25");
        forecastList.add("Weds - Shitty - 54/25");
        forecastList.add("Thurs - Blistering - 99/87");
        forecastList.add("Fri - Surreptitious - 69/69");
        forecastList.add("Sat - Weekendy - 87/46");
        */

        // ---- METHOD 2, DONE BY TUTORIAL

        String[] weekForecast = {
                "Today - Sunny - 88/64",
                "Tomorrow - Cloudy - 56/25",
                "Weds - Shitty - 54/25",
                "Thurs - Blistering - 99/87",
                "Fri - Surreptitious - 69/69",
                "Sat - Weekendy - 87/46"
        };

// ArrayAdaptor requires Context, Layout of the list view, the ID of the listview it's filling, and the information to fill it with
        ArrayAdapter<String>  mForecastAdaptor = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        ListView forecastList = (ListView) rootView.findViewById(
                R.id.listView_Forecast);

        forecastList.setAdapter(mForecastAdaptor);

        return rootView;
    }
}
