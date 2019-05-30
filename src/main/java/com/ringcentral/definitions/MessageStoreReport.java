package com.ringcentral.definitions;


public class MessageStoreReport {
    /// <summary>
    /// Internal identifier of a message store report task
    /// </summary>
    public String id;

    /// <summary>
    /// Link to a task
    /// </summary>
    public String uri;

    /// <summary>
    /// Status of a message store report task
    /// Enum: Accepted, Pending, InProgress, AttemptFailed, Failed, Completed, Cancelled
    /// </summary>
    public String status;

    /// <summary>
    /// Internal identifier of an account
    /// </summary>
    public String accountId;

    /// <summary>
    /// Internal identifier of an extension
    /// </summary>
    public String extensionId;

    /// <summary>
    /// Task creation time
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Time of the last task modification
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// Ending time for collecting messages
    /// </summary>
    public String dateTo;

    /// <summary>
    /// Starting time for collecting messages
    /// </summary>
    public String dateFrom;
}
