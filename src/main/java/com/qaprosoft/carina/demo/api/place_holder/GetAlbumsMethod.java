package com.qaprosoft.carina.demo.api.place_holder;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetAlbumsMethod extends AbstractApiMethodV2 {
    public GetAlbumsMethod() {
        super(null, "api/albums/_get/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
