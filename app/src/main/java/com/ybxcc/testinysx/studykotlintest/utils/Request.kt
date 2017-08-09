package com.ybxcc.testinysx.studykotlintest.utils

import android.util.Log
import java.net.URL

/**
 * Created by Ybx on 2017/7/14.
 */
public class Request(val url: String) {
    public fun run() {
        val resultQ = URL(url).readText()
        Log.e(javaClass.simpleName, resultQ)
    }
}