package com.ringcentral.definitions;


public class CreateFaxMessageRequest {
    /**
     * File to upload
     */
    public Attachment[] attachments;

    /**
     * Resolution of Fax
     * Enum: High, Low
     */
    public String faxResolution;

    /**
     * To Phone Number
     */
    public MessageStoreCallerInfoRequest[] to;

    /**
     * Timestamp to send fax at. If not specified (current or the past), the fax is sent immediately
     */
    public String sendTime;

    /**
     * ISO Code. e.g UK
     */
    public String isoCode;

    /**
     * Cover page identifier. For the list of available cover page identifiers please call the method Fax Cover Pages. If not specified, the default cover page which is configured in 'Outbound Fax Settings' is attached
     */
    public Long coverIndex;

    /**
     * Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
     */
    public String coverPageText;
}
