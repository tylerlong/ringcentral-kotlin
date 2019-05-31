package com.ringcentral.paths.restapi.glip.posts

class Index(val parent: com.ringcentral.paths.restapi.glip.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/posts"
    }

    /**
     * Operation: Get Posts
     * Http Get /restapi/v1.0/glip/posts
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.ListGlipPostsParameters? = null): com.ringcentral.definitions.GlipPosts {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(), queryParams).string(), com.ringcentral.definitions.GlipPosts::class.java)
    }

    /**
     * Operation: Create Post
     * Http Post /restapi/v1.0/glip/posts
     */
    fun post(glipCreatePost: com.ringcentral.definitions.GlipCreatePost): com.ringcentral.definitions.GlipPostInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(), glipCreatePost).string(), com.ringcentral.definitions.GlipPostInfo::class.java)
    }
}
