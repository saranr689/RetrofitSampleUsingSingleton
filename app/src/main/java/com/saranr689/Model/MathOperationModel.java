package com.saranr689.Model;

/**
 * Created by lakeba01 on 9/2/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MathOperationModel {

    @SerializedName("operation")
    @Expose
    private String operation;
    @SerializedName("expression")
    @Expose
    private String expression;
    @SerializedName("result")
    @Expose
    private String result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
