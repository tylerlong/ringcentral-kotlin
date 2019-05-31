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
    fun put(body: String): String? {
        val str: String? = rc.put(this.path(), body).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, String::class.java)
    }

}
