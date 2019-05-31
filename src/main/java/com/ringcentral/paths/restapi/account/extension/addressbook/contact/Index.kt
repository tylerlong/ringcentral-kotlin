package com.ringcentral.paths.restapi.account.extension.addressbook.contact

class Index(val parent: com.ringcentral.paths.restapi.account.extension.addressbook.Index, val contactId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && contactId != null) {
            return "${parent.path()}/contact/${contactId}"
        }

        return "${parent.path()}/contact"
    }

    /**
     * Operation: Get Contact List
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact
     */
    @JvmOverloads
    fun list(queryParams: com.ringcentral.definitions.ListContactsParameters? = null): com.ringcentral.definitions.ContactList {
        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path(false), queryParams).string(), com.ringcentral.definitions.ContactList::class.java)
    }

    /**
     * Operation: Create Contact
     * Http Post /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact
     */
    @JvmOverloads
    fun post(personalContactRequest: com.ringcentral.definitions.PersonalContactRequest, queryParams: com.ringcentral.definitions.CreateContactParameters? = null): com.ringcentral.definitions.PersonalContactResource {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), personalContactRequest, queryParams).string(), com.ringcentral.definitions.PersonalContactResource::class.java)
    }

    /**
     * Operation: Get Contact
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     */
    fun get(): com.ringcentral.definitions.PersonalContactResource {
        if (this.contactId == null) {
            throw NullPointerException("contactId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.PersonalContactResource::class.java)
    }

    /**
     * Operation: Update Contact
     * Http Put /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     */
    @JvmOverloads
    fun put(personalContactRequest: com.ringcentral.definitions.PersonalContactRequest, queryParams: com.ringcentral.definitions.UpdateContactParameters? = null): com.ringcentral.definitions.PersonalContactResource {
        if (this.contactId == null) {
            throw NullPointerException("contactId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.put(this.path(), personalContactRequest, queryParams).string(), com.ringcentral.definitions.PersonalContactResource::class.java)
    }

    /**
     * Operation: Delete Contact
     * Http Delete /restapi/v1.0/account/{accountId}/extension/{extensionId}/address-book/contact/{contactId}
     */
    fun delete(): String {
        if (this.contactId == null) {
            throw NullPointerException("contactId")
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.delete(this.path()).string(), String::class.java)
    }
}
