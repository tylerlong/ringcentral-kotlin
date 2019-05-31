package com.ringcentral.paths.restapi.glip.groups.posts.text

class Index(val parent: com.ringcentral.paths.restapi.glip.groups.posts.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/text"
    }

    /**
     * Operation: Update Post
     * Http Put /restapi/v1.0/glip/groups/{groupId}/posts/{postId}/text
     */
    fun put(body: String): String {
        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), body).string(), String::class.java)
    }
}
