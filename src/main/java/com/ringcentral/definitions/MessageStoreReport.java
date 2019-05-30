package com.ringcentral.definitions;


public class MessageStoreReport {
    /**
     * Internal identifier of a message store report task
     */
    public String id;

    /**
     * Link to a task
     */
    public String uri;

    /**
     * Status of a message store report task
     * Enum: Accepted, Pending, InProgress, AttemptFailed, Failed, Completed, Cancelled
     */
    public String status;

    /**
     * Internal identifier of an account
     */
    public String accountId;

    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    /**
     * Task creation time
     */
    public String creationTime;

    /**
     * Time of the last task modification
     */
    public String lastModifiedTime;

    /**
     * Ending time for collecting messages
     */
    public String dateTo;

    /**
     * Starting time for collecting messages
     */
    public String dateFrom;
}
