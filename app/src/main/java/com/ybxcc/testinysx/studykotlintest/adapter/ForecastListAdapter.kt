package com.ybxcc.testinysx.studykotlintest.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.ybxcc.testinysx.studykotlintest.domain.model.ForecastList

/**
 * Created by Ybx on 2017/7/11.
 */

class ForecastListAdapter(val weekForecastList: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecastList.dailyForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecastList.dailyForecast.size


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}