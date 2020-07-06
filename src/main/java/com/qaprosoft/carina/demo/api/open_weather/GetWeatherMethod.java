package com.qaprosoft.carina.demo.api.open_weather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetWeatherMethod extends AbstractApiMethodV2 {
    public GetWeatherMethod() {
        super(null, "api/weather/_get/rs.json");
        replaceUrlPlaceholder("api_weather_url", Configuration.getEnvArg("api_weather_url"));
        replaceUrlPlaceholder("api_weather_key", Configuration.getEnvArg("api_weather_key"));
    }
}
