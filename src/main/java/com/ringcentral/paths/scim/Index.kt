package com.ringcentral.paths.scim

class Index(val rc: com.ringcentral.RestClient, val version: String? = "v2") {


    fun path(withParameter: Boolean = true): String {
        if (withParameter && version != null) {
            return "/scim/${version}"
        }

        return "/scim"
    }

    fun com.ringcentral.RestClient.scim(version: String? = "v2"): Index {
        return Index(this, version)
    }
}
