package com.qaprosoft.carina.demo.api.place_holder;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteAlbumsMethod extends AbstractApiMethodV2 {
    public DeleteAlbumsMethod() {
        super("api/albums/_delete/rq.json", "api/albums/_delete/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
