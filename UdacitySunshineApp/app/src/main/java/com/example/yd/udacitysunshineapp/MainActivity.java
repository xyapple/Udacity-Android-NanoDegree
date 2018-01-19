package com.example.yd.udacitysunshineapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.yd.udacitysunshineapp.data.SunshinePreferences;
import com.example.yd.udacitysunshineapp.utilities.NetworkUtils;
import com.example.yd.udacitysunshineapp.utilities.OpenWeatherJsonUtils;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    //create a field to store weather data
    private TextView mWeatherTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViewById to get a reference to the weather display TextView
        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        //call the loadWeatherData() method
        loadWeatherData();
    }

    private void loadWeatherData(){
        String location = SunshinePreferences.getPreferredWeatherLocation(this);
        new FetchWeatherTask().execute(location);
    }

    //Perform network requests
    public class FetchWeatherTask extends AsyncTask<String, Void, String[]> {

        // Override the doInBackground method to perform your network requests

        @Override
        protected String[] doInBackground(String... params) {

            /* If there's no zip code, there's nothing to look up. */
            if (params.length == 0) {
                return null;
            }

            String location = params[0];
            URL weatherRequestUrl = NetworkUtils.buildUrl(location);

            try {
                String jsonWeatherResponse = NetworkUtils
                        .getResponseFromHttpUrl(weatherRequestUrl);

                String[] simpleJsonWeatherData = OpenWeatherJsonUtils
                        .getSimpleWeatherStringsFromJson(MainActivity.this, jsonWeatherResponse);

                return simpleJsonWeatherData;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        //Override the onPostExecute method to display the results of the network request
        @Override
        protected void onPostExecute(String[] weatherData) {
            if (weatherData != null) {
                /*
                 * Iterate through the array and append the Strings to the TextView. The reason why we add
                 * the "\n\n\n" after the String is to give visual separation between each String in the
                 * TextView. Later, we'll learn about a better way to display lists of data.
                 */
                for (String weatherString : weatherData) {
                    mWeatherTextView.append((weatherString) + "\n\n\n");
                }
            }
        }


    }

}
