package com.ringcentral.definitions;


public class DataExportTask {
    /**
     * Canonical URI of a task
     */
    public String uri;

    /**
     * Internal identifier of a task
     */
    public String id;

    /**
     * Task creation datetime
     */
    public String creationTime;

    /**
     * Task last modification datetime
     */
    public String lastModifiedTime;

    /**
     * Task status
     * Enum: Accepted, InProgress, Completed, Failed
     */
    public String status;

    /**
     * Data collection archives. Returned by task ID
     */
    public ExportTaskResultInfo[] result;
}
