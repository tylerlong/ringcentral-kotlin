package com.ringcentral.paths.restapi.account.extension.profileimage

class Index(val parent: com.ringcentral.paths.restapi.account.extension.Index, val scaleSize: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && scaleSize != null) {
            return "${parent.path()}/profile-image/${scaleSize}"
        }

        return "${parent.path()}/profile-image"
    }

    /**
     * Operation: Get User Profile Image
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image
     */
    fun list(): ByteArray? {
        val str: String? = rc.get(this.path(false)).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, ByteArray::class.java)
    }


    /**
     * Operation: Upload User Profile Image
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image
     */
    fun post(createUserProfileImageRequest: com.ringcentral.definitions.CreateUserProfileImageRequest): String? {
        val str: String? = rc.post(this.path(false), createUserProfileImageRequest, null, com.ringcentral.ContentType.MULTIPART).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    /**
     * Operation: Update User Profile Image
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image
     */
    fun put(updateUserProfileImageRequest: com.ringcentral.definitions.UpdateUserProfileImageRequest): String? {
        val str: String? = rc.put(this.path(false), updateUserProfileImageRequest, null, com.ringcentral.ContentType.MULTIPART).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }


    /**
     * Operation: Get Scaled User Profile Image
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize}
     */
    fun get(): ByteArray? {
        if (this.scaleSize == null) {
            throw NullPointerException("scaleSize")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, ByteArray::class.java)
    }

}
