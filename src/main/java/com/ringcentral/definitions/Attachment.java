package com.ringcentral.definitions;

public class Attachment {
    /// <summary>
    /// File name with extension, such as "example.png"
    /// </summary>
    public String fileName;

    /// <summary>
    /// Binary content of the file
    /// </summary>
    public byte[] bytes;

    /// <summary>
    /// Content tyle of the file, such as "image/png"
    /// </summary>
    public String contentType;
}