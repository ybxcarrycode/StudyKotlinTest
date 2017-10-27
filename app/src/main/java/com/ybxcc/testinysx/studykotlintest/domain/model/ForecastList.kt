package com.ybxcc.testinysx.studykotlintest.domain.model

/**
 * 项目名称：studykotlin
 * 类描述：
 * 创建人：ybx
 * 创建时间：2017/10/25 18:57
 * 备注：
 * @version
 */
data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>)