package com.example.week5_weekend.model.datasource.remote.network.retrofit;

import android.util.Log;

import com.example.week5_weekend.model.datasource.baseWeather.Response;
import com.example.week5_weekend.model.datasource.remote.UrlConstants;
import com.example.week5_weekend.view.activitys.mainactivity.MainActivityContract;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitHelper {

    private HttpLoggingInterceptor getLoggingIntercepter(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }

    private OkHttpClient getClient(){
        return new OkHttpClient.Builder().addInterceptor(getLoggingIntercepter()).build();
    }

    private Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .client(getClient())
                .baseUrl(UrlConstants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public WeatherService getService(){
    return getRetrofitInstance().create(WeatherService.class);
    }

}
