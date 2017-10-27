package com.ybxcc.testinysx.studykotlintest.domain

import com.ybxcc.testinysx.studykotlintest.bean.ForecastRequest
import com.ybxcc.testinysx.studykotlintest.domain.model.ForecastList

/**
 * 项目名称：studykotlin
 * 类描述：
 * 创建人：ybx
 * 创建时间：2017/10/27 14:07
 * 备注：
 * @version
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}