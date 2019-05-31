package com.ringcentral.paths.restapi.glip.groups.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.Index, val postId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && postId != null) {
            return "${parent.path()}/posts/${postId}"
        }

        return "${parent.path()}/posts"
    }

    /// <summary>
    /// Operation: Get Group Posts
    /// Http Get /restapi/v1.0/glip/groups/{groupId}/posts
    /// </summary>
    fun get(queryParams: com.ringcentral.definitions.ListGlipGroupPostsParameters? = null): com.ringcentral.definitions.GlipPosts
    // public async Task<com.ringcentral.definitions.GlipPosts> Get(queryParams: com.ringcentral.definitions.ListGlipGroupPostsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.GlipPosts::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipPosts>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Post in Group
    /// Http Post /restapi/v1.0/glip/groups/{groupId}/posts
    /// </summary>
    fun post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost): com.ringcentral.definitions.GlipPostInfo
    // public async Task<com.ringcentral.definitions.GlipPostInfo> Post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipCreatePost).string(), com.ringcentral.definitions.GlipPostInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipPostInfo>(this.path(false), glipCreatePost);
    }

    fun com.ringcentral.paths.restapi.glip.groups.Index.posts(postId: String? = null): Index {
        return Index(this, postId)
    }
}
