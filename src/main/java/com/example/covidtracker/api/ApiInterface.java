package com.example.covidtracker.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    static final String BASE_URL = "https://corona.lmao.ninja/v3/covid-19/";

    @GET("countries")
    Call<List<CountryData>> getCountryData();
}
