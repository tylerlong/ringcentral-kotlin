package com.ringcentral.paths.restapi.glip.chats.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index, val postId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && postId != null) {
            return "${parent.path()}/posts/${postId}"
        }

        return "${parent.path()}/posts"
    }

    /// <summary>
    /// Operation: Get Posts
    /// Http Get /restapi/v1.0/glip/chats/{chatId}/posts
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ReadGlipPostsParameters? = null): com.ringcentral.definitions.GlipPostsList
    // public async Task<com.ringcentral.definitions.GlipPostsList> List(queryParams: com.ringcentral.definitions.ReadGlipPostsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipPostsList::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipPostsList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Post
    /// Http Post /restapi/v1.0/glip/chats/{chatId}/posts
    /// </summary>
    fun post(glipPostPostBody: com.ringcentral.definitions.GlipPostPostBody): com.ringcentral.definitions.GlipPostInfo
    // public async Task<com.ringcentral.definitions.GlipPostInfo> Post(glipPostPostBody: com.ringcentral.definitions.GlipPostPostBody)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipPostPostBody).string(), com.ringcentral.definitions.GlipPostInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipPostInfo>(this.path(false), glipPostPostBody);
    }

    /// <summary>
    /// Operation: Get Post
    /// Http Get /restapi/v1.0/glip/chats/{chatId}/posts/{postId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipPostInfo
    // public async Task<com.ringcentral.definitions.GlipPostInfo> Get()
    {
        if (this.postId == null) {
            throw NullPointerException("postId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipPostInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipPostInfo>(this.path());
    }

    /// <summary>
    /// Operation: Update Post
    /// Http Patch /restapi/v1.0/glip/chats/{chatId}/posts/{postId}
    /// </summary>
    fun patch(glipPatchPostBody: com.ringcentral.definitions.GlipPatchPostBody): com.ringcentral.definitions.GlipPostInfo
    // public async Task<com.ringcentral.definitions.GlipPostInfo> Patch(glipPatchPostBody: com.ringcentral.definitions.GlipPatchPostBody)
    {
        if (this.postId == null) {
            throw NullPointerException("postId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.patch(this.path(), glipPatchPostBody).string(), com.ringcentral.definitions.GlipPostInfo::class.java)
        // return await rc.Patch<com.ringcentral.definitions.GlipPostInfo>(this.path(), glipPatchPostBody);
    }

    /// <summary>
    /// Operation: Delete Post
    /// Http Delete /restapi/v1.0/glip/chats/{chatId}/posts/{postId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.postId == null) {
            throw NullPointerException("postId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.chats.Index.posts(postId: String? = null): Index {
        return Index(this, postId)
    }
}
