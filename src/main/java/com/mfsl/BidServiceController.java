package com.mfsl;

import io.micronaut.http.annotation.*;

@Controller("/bidService")
public class BidServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}