package com.ringcentral.paths.restapi.glip.cards

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val cardId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && cardId != null) {
            return "${parent.path()}/cards/${cardId}"
        }

        return "${parent.path()}/cards"
    }

    /// <summary>
    /// Operation: Create Card
    /// Http Post /restapi/v1.0/glip/cards
    /// </summary>
    fun post(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest, queryParams: com.ringcentral.definitions.CreateGlipCardParameters? = null): com.ringcentral.definitions.GlipMessageAttachmentInfo
    // public async Task<com.ringcentral.definitions.GlipMessageAttachmentInfo> Post(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest, queryParams: com.ringcentral.definitions.CreateGlipCardParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), glipMessageAttachmentInfoRequest, queryParams).string(), com.ringcentral.definitions.GlipMessageAttachmentInfo::class.java)
        // return await rc.Post<com.ringcentral.definitions.GlipMessageAttachmentInfo>(this.path(false), glipMessageAttachmentInfoRequest, queryParams);
    }

    /// <summary>
    /// Operation: Get Card
    /// Http Get /restapi/v1.0/glip/cards/{cardId}
    /// </summary>
    fun get(): com.ringcentral.definitions.GlipMessageAttachmentInfo
    // public async Task<com.ringcentral.definitions.GlipMessageAttachmentInfo> Get()
    {
        if (this.cardId == null) {
            throw NullPointerException("cardId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.GlipMessageAttachmentInfo::class.java)
        // return await rc.Get<com.ringcentral.definitions.GlipMessageAttachmentInfo>(this.path());
    }

    /// <summary>
    /// Operation: Update Card
    /// Http Put /restapi/v1.0/glip/cards/{cardId}
    /// </summary>
    fun put(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest): String
    // public async Task<String> Put(glipMessageAttachmentInfoRequest: com.ringcentral.definitions.GlipMessageAttachmentInfoRequest)
    {
        if (this.cardId == null) {
            throw NullPointerException("cardId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), glipMessageAttachmentInfoRequest).string(), String::class.java)
        // return await rc.Put<String>(this.path(), glipMessageAttachmentInfoRequest);
    }

    /// <summary>
    /// Operation: Delete Card
    /// Http Delete /restapi/v1.0/glip/cards/{cardId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.cardId == null) {
            throw NullPointerException("cardId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.cards(cardId: String? = null): Index {
        return Index(this, cardId)
    }
}
