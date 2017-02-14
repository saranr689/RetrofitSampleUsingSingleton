package com.saranr689.retrofitobject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lakeba01 on 9/2/17.
 */

public class RetrofitObject  {
    private static Retrofit retrofit;

    private   RetrofitObject()
    {

    }

    public static Retrofit getRetrofitObj(String baseurl) {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseurl)
                    .build();
            return retrofit;
        }else {

            return retrofit;
        }
    }
}
