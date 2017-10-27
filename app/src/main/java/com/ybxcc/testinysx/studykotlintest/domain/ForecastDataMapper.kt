package com.ybxcc.testinysx.studykotlintest.domain

import com.ybxcc.testinysx.studykotlintest.bean.Forecast
import com.ybxcc.testinysx.studykotlintest.bean.ForecastResult
import com.ybxcc.testinysx.studykotlintest.domain.model.ForecastList
import java.text.DateFormat
import java.util.*
import com.ybxcc.testinysx.studykotlintest.domain.model.Forecast as ModelForecast


/**
 * 项目名称：studykotlin
 * 类描述：
 * 创建人：ybx
 * 创建时间：2017/10/25 18:27
 * 备注：
 * @version
 */
public class ForecastDataMapper {
    
    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(forecast.city.name, forecast.city.country,
                convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description,
                forecast.temp.max.toInt(), forecast.temp.min.toInt())
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}