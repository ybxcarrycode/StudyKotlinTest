package com.ybxcc.testinysx.studykotlintest.domain

import com.ybxcc.testinysx.studykotlintest.bean.Forecast

/**
 * Created by Ybx on 2017/7/15.
 */

public interface Command<T> {
    fun execute(): T
}