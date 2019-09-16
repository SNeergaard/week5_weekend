package com.example.week5_weekend.view.activitys.mainactivity;

import com.example.week5_weekend.model.datasource.baseWeather.Response;
import com.example.week5_weekend.model.datasource.fiveday.Fiveday;

public interface MainActivityContract {
    void onWeather(Response response);
    void onFiveDay(Fiveday fiveday);
}
