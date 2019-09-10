package com.example.aliapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ServicesApi service = RetrofitModule.getInstance().getService();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
    }

    private void getData() {
        service.getAllMessages().enqueue(new Callback<ProfileResponse>() {
            @Override
            public void onResponse(Call<ProfileResponse> call, Response<ProfileResponse> response) {
                Log.e("data : ", response.body()+"");
                Log.e("AccountNameAR : ", response.body().getAccountNameAR()+"");
                Log.e("AccountNameAR : ", response.body().getPortfolioOpeningStocksArray()+"");
                for (int i = 0; i < response.body().getPortfolioOpeningStocksArray().size(); i++){
                    Log.e("test", response.body().getPortfolioOpeningStocksArray().get(i).getPartnerNameAR());
                }
            }

            @Override
            public void onFailure(Call<ProfileResponse> call, Throwable t) {

            }
        });
    }
}
