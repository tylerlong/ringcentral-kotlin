package com.ringcentral.definitions;

public class Attachment {
    /**
     * File name with extension, such as "example.png"
     */
    public String fileName;

    /**
     * Binary content of the file
     */
    public byte[] bytes;

    /**
     * Content tyle of the file, such as "image/png"
     */
    public String contentType;
}