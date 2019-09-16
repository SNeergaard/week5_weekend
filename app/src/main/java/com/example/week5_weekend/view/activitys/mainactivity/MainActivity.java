package com.example.week5_weekend.view.activitys.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.example.week5_weekend.R;
import com.example.week5_weekend.databinding.ActivityMainBinding;
import com.example.week5_weekend.model.datasource.baseWeather.Response;
import com.example.week5_weekend.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    MainActivityViewModel viewmodel;
    TextView tvTemp;
    TextView tvMaxTemp;
    TextView tvMinTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewmodel = new MainActivityViewModel();
        activityMainBinding.getViewmodel();
//        BindView();
    }

    private void BindView(){
        tvMaxTemp = findViewById(R.id.tvTempMax);
        tvMinTemp = findViewById(R.id.tvTempMin);
        tvTemp = findViewById(R.id.tvTemp);
    }

//    @Override
    public void onWeather(Response response){
        if(response != null){
//            tvTempMax.setText(response.getWeather().get)
        }
    }
}
