package com.qaprosoft.carina.demo;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.api.place_holder.DeleteAlbumsMethod;
import com.qaprosoft.carina.demo.api.place_holder.GetAlbumsMethod;
import com.qaprosoft.carina.demo.api.place_holder.PostAlbumsMethod;
import com.qaprosoft.carina.demo.api.place_holder.PutAlbumsMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APIPlaceHolderTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "DenisPitsul")
    public void testGetAlbums() {
        GetAlbumsMethod api = new GetAlbumsMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        System.out.println("body: "+api.getRequestBody());
        api.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        api.validateResponseAgainstJSONSchema("api/albums/_get/rs.schema");
    }

    @Test
    @MethodOwner(owner = "DenisPitsul")
    public void testCreateAlbum() {
        PostAlbumsMethod api = new PostAlbumsMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test
    @MethodOwner(owner = "DenisPitsul")
    public void testDeleteAlbums() {
        DeleteAlbumsMethod api = new DeleteAlbumsMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }

    @Test
    @MethodOwner(owner = "DenisPitsul")
    public void testUpdateAlbums() {
        PutAlbumsMethod api = new PutAlbumsMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }
}
