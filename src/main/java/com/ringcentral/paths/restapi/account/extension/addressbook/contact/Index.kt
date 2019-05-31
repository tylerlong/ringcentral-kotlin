package com.ringcentral.paths.restapi.account.extension.addressbook.contact

class Index(val parent: com.ringcentral.paths.restapi.account.extension.addressbook.Index, val contactId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && contactId != null) {
            return "${parent.path()}/contact/${contactId}"
        }

        return "${parent.path()}/contact"
    }

    /// <summary>
    /// Operation: Get Contact List
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact
    /// </summary>
    fun list(queryParams: com.ringcentral.definitions.ListContactsParameters? = null): com.ringcentral.definitions.ContactList
    // public async Task<com.ringcentral.definitions.ContactList> List(queryParams: com.ringcentral.definitions.ListContactsParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.ContactList::class.java)
        // return await rc.Get<com.ringcentral.definitions.ContactList>(this.path(false), queryParams);
    }

    /// <summary>
    /// Operation: Create Contact
    /// Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact
    /// </summary>
    fun post(personalContactRequest: com.ringcentral.definitions.PersonalContactRequest, queryParams: com.ringcentral.definitions.CreateContactParameters? = null): com.ringcentral.definitions.PersonalContactResource
    // public async Task<com.ringcentral.definitions.PersonalContactResource> Post(personalContactRequest: com.ringcentral.definitions.PersonalContactRequest, queryParams: com.ringcentral.definitions.CreateContactParameters? = null)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), personalContactRequest, queryParams).string(), com.ringcentral.definitions.PersonalContactResource::class.java)
        // return await rc.Post<com.ringcentral.definitions.PersonalContactResource>(this.path(false), personalContactRequest, queryParams);
    }

    /// <summary>
    /// Operation: Get Contact
    /// Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
    /// </summary>
    fun get(): com.ringcentral.definitions.PersonalContactResource
    // public async Task<com.ringcentral.definitions.PersonalContactResource> Get()
    {
        if (this.contactId == null) {
            throw NullPointerException("contactId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.PersonalContactResource::class.java)
        // return await rc.Get<com.ringcentral.definitions.PersonalContactResource>(this.path());
    }

    /// <summary>
    /// Operation: Update Contact
    /// Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
    /// </summary>
    fun put(personalContactRequest: com.ringcentral.definitions.PersonalContactRequest, queryParams: com.ringcentral.definitions.UpdateContactParameters? = null): com.ringcentral.definitions.PersonalContactResource
    // public async Task<com.ringcentral.definitions.PersonalContactResource> Put(personalContactRequest: com.ringcentral.definitions.PersonalContactRequest, queryParams: com.ringcentral.definitions.UpdateContactParameters? = null)
    {
        if (this.contactId == null) {
            throw NullPointerException("contactId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), personalContactRequest, queryParams).string(), com.ringcentral.definitions.PersonalContactResource::class.java)
        // return await rc.Put<com.ringcentral.definitions.PersonalContactResource>(this.path(), personalContactRequest, queryParams);
    }

    /// <summary>
    /// Operation: Delete Contact
    /// Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
    /// </summary>
    fun delete(): String
    // public async Task<String> Delete()
    {
        if (this.contactId == null) {
            throw NullPointerException("contactId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
        // return await rc.Delete<String>(this.path());
    }

    fun com.ringcentral.paths.restapi.account.extension.addressbook.Index.contact(contactId: String? = null): Index {
        return Index(this, contactId)
    }
}
