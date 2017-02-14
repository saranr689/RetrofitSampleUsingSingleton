package com.saranr689;

import com.saranr689.Model.MathOperationModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by lakeba01 on 13/2/17.
 */

public interface IMathOperationApiEndPoints {

    @GET("/factor/{operation}")
    Call<MathOperationModel> mathOperationCall (@Path("operation")String operation);
}
