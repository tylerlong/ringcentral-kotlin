package com.ringcentral.paths.restapi.glip.cards

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val cardId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && cardId != null) {
            return "${parent.path()}/cards/${cardId}"
        }

        return "${parent.path()}/cards"
    }

    /**
     * Operation: Create Card
     * Http Post /restapi/v1.0/glip/cards
     */
    @JvmOverloads
    fun post(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest, queryParams: com.ringcentral.definitions.CreateGlipCardParameters? = null): com.ringcentral.definitions.GlipMessageAttachmentInfo {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipMessageAttachmentInfoRequest, queryParams).string(), com.ringcentral.definitions.GlipMessageAttachmentInfo::class.java)
    }

    /**
     * Operation: Get Card
     * Http Get /restapi/v1.0/glip/cards/{cardId}
     */
    fun get(): com.ringcentral.definitions.GlipMessageAttachmentInfo {
        if (this.cardId == null) {
            throw NullPointerException("cardId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipMessageAttachmentInfo::class.java)
    }

    /**
     * Operation: Update Card
     * Http Put /restapi/v1.0/glip/cards/{cardId}
     */
    fun put(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest): String {
        if (this.cardId == null) {
            throw NullPointerException("cardId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), glipMessageAttachmentInfoRequest).string(), String::class.java)
    }

    /**
     * Operation: Delete Card
     * Http Delete /restapi/v1.0/glip/cards/{cardId}
     */
    fun delete(): String {
        if (this.cardId == null) {
            throw NullPointerException("cardId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
    }
}
