package com.ringcentral.paths.restapi.glip.groups.posts.text

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.posts.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/text"
    }

    /// <summary>
    /// Operation: Update Post
    /// Http Put /restapi/v1.0/glip/groups/{groupId}/posts/{postId}/text
    /// </summary>
    fun put(body: String): String
    // public async Task<String> Put(body: String)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), body).string(), String::class.java)
        // return await rc.Put<String>(this.path(), body);
    }

    fun com.ringcentral.paths.restapi.glip.groups.posts.Index.text(): Index {
        return Index(this)
    }
}
