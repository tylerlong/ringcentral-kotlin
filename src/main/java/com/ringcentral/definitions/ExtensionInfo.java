package com.ringcentral.definitions;


public class ExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension
     */
    public String uri;
    /**
     * Number of department extension
     */
    public String extensionNumber;
    /**
     * For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
     */
    public String partnerId;

    public ExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public ExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionInfo partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

}
