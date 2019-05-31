package com.ringcentral.paths.restapi.account.extension.profileimage

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val scaleSize: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && scaleSize != null) {
            return "${parent.path()}/profile-image/${scaleSize}"
        }

        return "${parent.path()}/profile-image"
    }

    /// <summary>
    /// Operation: Get User Profile Image
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image
    /// </summary>
    fun list(): ByteArray
    // public async Task<ByteArray> List()
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false)).string(), ByteArray::class.java)
        // return await rc.Get<ByteArray>(this.path(false));
    }

    /// <summary>
    /// Operation: Upload User Profile Image
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image
    /// </summary>
    fun post(createUserProfileImageRequest: com.ringcentral.definitions.CreateUserProfileImageRequest): String
    // public async Task<String> Post(createUserProfileImageRequest: com.ringcentral.definitions.CreateUserProfileImageRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createUserProfileImageRequest, com.ringcentral.ContentType.MULTIPART).string(), String::class.java)
    }

    /// <summary>
    /// Operation: Update User Profile Image
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image
    /// </summary>
    fun put(updateUserProfileImageRequest: com.ringcentral.definitions.UpdateUserProfileImageRequest): String
    // public async Task<String> Put(updateUserProfileImageRequest: com.ringcentral.definitions.UpdateUserProfileImageRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(false), updateUserProfileImageRequest, com.ringcentral.ContentType.MULTIPART).string(), String::class.java)
    }

    /// <summary>
    /// Operation: Get Scaled User Profile Image
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize}
    /// </summary>
    fun get(): ByteArray
    // public async Task<ByteArray> Get()
    {
        if (this.scaleSize == null) {
            throw NullPointerException("scaleSize");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), ByteArray::class.java)
        // return await rc.Get<ByteArray>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.Index.profileimage(scaleSize: String? = null): Index {
        return Index(this, scaleSize)
    }
}
