package com.ringcentral.paths.restapi.glip.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/posts"
    }

    /// <summary>
    /// Operation: Get Posts
    /// Http Get /restapi/v1.0/glip/posts
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListGlipPostsParameters? = null): com.ringcentral.definitions.GlipPosts
    // public async Task<com.ringcentral.definitions.GlipPosts> Get(queryParams: com.ringcentral.definitions.ListGlipPostsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GlipPosts::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipPosts>(this.path(), queryParams);
    }

    /// <summary>
    /// Operation: Create Post
    /// Http Post /restapi/v1.0/glip/posts
    /// </summary>
    fun post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost): com.ringcentral.definitions.GlipPostInfo
    // public async Task<com.ringcentral.definitions.GlipPostInfo> Post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), glipCreatePost).string(), com.ringcentral.definitions.GlipPostInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipPostInfo>(this.path(), glipCreatePost);
    }

    fun com.ringcentral.paths.restapi.glip.Index.posts(): Index {
        return Index(this)
    }
}
