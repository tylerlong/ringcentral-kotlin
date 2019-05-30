package com.ringcentral.definitions;


public class ListRecentChatsParameters {
    /// <summary>
    /// Type of chats to be fetched. By default all chat types are returned
    /// </summary>
    public String[] type;

    /// <summary>
    /// Max number of chats to be fetched by one request (Not more than 250).
    /// Maximum: 250
    /// Default: 30
    /// </summary>
    public Long recordCount;
}
