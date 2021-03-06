package ru.weather.weathertoday.view

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle
import ru.weather.weathertoday.busines.model.DailyWeatherModel
import ru.weather.weathertoday.busines.model.HourlyWeatherModel
import ru.weather.weathertoday.busines.model.WeatherDataModel

interface MainView : MvpView {


    @AddToEndSingle // Стратегия moxy которая заменяет сохраненное действие если оно было
    fun displayLocation(data: String)

    @AddToEndSingle
    fun displayCurrentData(data: WeatherDataModel)

    @AddToEndSingle
    fun displayHourlyData(data: List<HourlyWeatherModel>)

    @AddToEndSingle
    fun displayDaylyData(data: List<DailyWeatherModel>)

    @AddToEndSingle
    fun displayError(error: Throwable)

    @AddToEndSingle
    fun setLoading(flag: Boolean)
}