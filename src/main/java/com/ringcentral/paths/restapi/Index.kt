package com.ringcentral.paths.restapi

class Index(val rc: com.ringcentral.RestClient, val apiVersion: String? = "v1.0") {


    fun path(withParameter: Boolean = true): String {
        if (withParameter && apiVersion != null) {
            return "/restapi/${apiVersion}"
        }

        return "/restapi"
    }

    /// <summary>
    /// Operation: Get API Versions
    /// Http Get /restapi
    /// </summary>
    fun list(): com.ringcentral.definitions.GetVersionsResponse
    // public async Task<com.ringcentral.definitions.GetVersionsResponse> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), com.ringcentral.definitions.GetVersionsResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetVersionsResponse>(this.path(false));
    }

    /// <summary>
    /// Operation: Get Version Info
    /// Http Get /restapi/{apiVersion}
    /// </summary>
    fun get(): com.ringcentral.definitions.GetVersionResponse
    // public async Task<com.ringcentral.definitions.GetVersionResponse> Get()
    {
        if (this.apiVersion == null) {
            throw NullPointerException("apiVersion");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GetVersionResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.GetVersionResponse>(this.path());
    }

    fun com.ringcentral.RestClient.restapi(apiVersion: String? = "v1.0"): Index {
        return Index(this, apiVersion)
    }
}
