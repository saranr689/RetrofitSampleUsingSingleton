package com.saranr689.retrofitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.saranr689.IMathOperationApiEndPoints;
import com.saranr689.Model.MathOperationModel;
import com.saranr689.retrofitobject.RetrofitObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    String baseUrl = "https://newton.now.sh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofitObj = RetrofitObject.getRetrofitObj(baseUrl);
        IMathOperationApiEndPoints iMathOperationApiEndPoints = retrofitObj.create(IMathOperationApiEndPoints.class);
        Call<MathOperationModel> mathOperationModelCall = iMathOperationApiEndPoints.mathOperationCall("2(2)");
        mathOperationModelCall.enqueue(new Callback<MathOperationModel>() {
            @Override
            public void onResponse(Call<MathOperationModel> call, Response<MathOperationModel> response) {

                if (response!=null && response.isSuccessful())
                {
                    Log.e("MATHOPERATION","Operation"+ response.body().getOperation()+"Expression :"+response.body().getExpression()+ "Result: "+response.body().getResult());
                }
            }

            @Override
            public void onFailure(Call<MathOperationModel> call, Throwable t) {

            }
        });


    }


}
