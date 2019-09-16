package com.example.week5_weekend.model.datasource.remote.network.retrofit;

import com.example.week5_weekend.model.datasource.baseWeather.Response;
import com.example.week5_weekend.model.weather.Location;

import io.reactivex.Observable;
import retrofit2.http.GET;

import static com.example.week5_weekend.model.datasource.remote.UrlConstants.LOCATION_PATH;

public interface WeatherService {

    @GET(LOCATION_PATH)
    Observable<Response> getWeather();
}
