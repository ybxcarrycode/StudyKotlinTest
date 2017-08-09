package com.ybxcc.testinysx.studykotlintest.domain

/**
 * Created by Ybx on 2017/7/15.
 */

public interface Command<T> {
    fun execute(): T
}