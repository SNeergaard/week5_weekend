package com.example.week5_weekend.viewmodel;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.week5_weekend.model.datasource.baseWeather.Response;
import com.example.week5_weekend.model.datasource.remote.network.retrofit.RetrofitHelper;
import com.example.week5_weekend.model.weather.Location;
import androidx.databinding.BaseObservable;
import androidx.databinding.PropertyChangeRegistry;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivityViewModel extends BaseObservable {
    PropertyChangeRegistry propertyChangeRegistry;

    //List<List>

    public String zip;

    public Location location;

    public void onLocationClicked(View view){
        if(!zip.isEmpty()){
            location = new Location(zip);
            getWeather();
        }
    }

    public void getWeather() {
        RetrofitHelper retrofitHelper = new RetrofitHelper();
        retrofitHelper.getService().getWeather()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response>() {
                    Response response;

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Response response) {
                        this.response = response;
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("Main_ACT_Present", "onError");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
