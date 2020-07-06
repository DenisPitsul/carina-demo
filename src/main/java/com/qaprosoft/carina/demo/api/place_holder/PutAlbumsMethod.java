package com.qaprosoft.carina.demo.api.place_holder;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutAlbumsMethod extends AbstractApiMethodV2 {
    public PutAlbumsMethod() {
        super("api/albums/_put/rq.json", "api/albums/_put/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
