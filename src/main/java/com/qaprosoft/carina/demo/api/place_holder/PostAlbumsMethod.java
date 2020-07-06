package com.qaprosoft.carina.demo.api.place_holder;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostAlbumsMethod extends AbstractApiMethodV2 {
    public PostAlbumsMethod() {
        super("api/albums/_post/rq.json", "api/albums/_post/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
