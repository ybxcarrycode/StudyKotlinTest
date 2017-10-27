package com.ybxcc.testinysx.studykotlintest.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ybxcc.testinysx.studykotlintest.R
import com.ybxcc.testinysx.studykotlintest.adapter.ForecastListAdapter
import com.ybxcc.testinysx.studykotlintest.domain.RequestForecastCommand
import org.jetbrains.anko.async
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

//        toast("Hello  Kotlin")

        async {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                recyclerView.adapter = ForecastListAdapter(result)
            }
        }


//        val f1 = Forecast(Date(), 27.5f, "Shiny day")
//        
//        val f2 = f1.copy(temperature = 40f)
//
//        val (date, temperature, details) = f2
//
//        val date1 = f1.component1()
//        val temperature1 = f1.component2()
//        val details1 = f1.component3()
//
//        Log.e("test", "date=$date/temperatue=$temperature/details=$details")
//        Log.e("test1", "date1=$date1/temperature1=$temperature1/details1=$details1")
    }

}
