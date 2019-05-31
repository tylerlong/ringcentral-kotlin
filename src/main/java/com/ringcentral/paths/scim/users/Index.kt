package com.ringcentral.paths.scim.users

class Index(val parent: com.ringcentral.paths.scim.Index, val id: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && id != null) {
            return "${parent.path()}/Users/${id}"
        }

        return "${parent.path()}/Users"
    }

    /// <summary>
    /// Operation: Search or List Users
    /// Http Get /scim/v2/Users
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.SearchViaGet2Parameters? = null): com.ringcentral.definitions.UserSearchResponse
    // public async Task<com.ringcentral.definitions.UserSearchResponse> List(queryParams: com.ringcentral.definitions.SearchViaGet2Parameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.UserSearchResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.UserSearchResponse>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create User
    /// Http Post /scim/v2/Users
    /// </summary>
    fun post(user: com.ringcentral.definitions.User): com.ringcentral.definitions.UserResponse
    // public async Task<com.ringcentral.definitions.UserResponse> Post(user: com.ringcentral.definitions.User)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), user).string(), com.ringcentral.definitions.UserResponse::class.java)
        // return await rc.Post<com.ringcentral.definitions.UserResponse>(this.path(false), user);
    }

    /// <summary>
    /// Operation: Get User
    /// Http Get /scim/v2/Users/{id}
    /// </summary>
    fun get(): com.ringcentral.definitions.UserResponse
    // public async Task<com.ringcentral.definitions.UserResponse> Get()
    {
        if (this.id == null) {
            throw NullPointerException("id");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.UserResponse::class.java)
        // return await rc.Get<com.ringcentral.definitions.UserResponse>(this.path());
    }

    /// <summary>
    /// Operation: Update/Replace User
    /// Http Put /scim/v2/Users/{id}
    /// </summary>
    fun put(user: com.ringcentral.definitions.User): com.ringcentral.definitions.UserResponse
    // public async Task<com.ringcentral.definitions.UserResponse> Put(user: com.ringcentral.definitions.User)
    {
        if (this.id == null) {
            throw NullPointerException("id");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), user).string(), com.ringcentral.definitions.UserResponse::class.java)
        // return await rc.Put<com.ringcentral.definitions.UserResponse>(this.path(), user);
    }

    /// <summary>
    /// Operation: Delete User
    /// Http Delete /scim/v2/Users/{id}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.id == null) {
            throw NullPointerException("id");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    /// <summary>
    /// Operation: Update/Patch User
    /// Http Patch /scim/v2/Users/{id}
    /// </summary>
    fun patch(userPatch: com.ringcentral.definitions.UserPatch): com.ringcentral.definitions.UserResponse
    // public async Task<com.ringcentral.definitions.UserResponse> Patch(userPatch: com.ringcentral.definitions.UserPatch)
    {
        if (this.id == null) {
            throw NullPointerException("id");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), userPatch).string(), com.ringcentral.definitions.UserResponse::class.java)
        // return await rc.Patch<com.ringcentral.definitions.UserResponse>(this.path(), userPatch);
    }

    fun com.ringcentral.paths.scim.Index.users(id: String? = null): Index {
        return Index(this, id)
    }
}
