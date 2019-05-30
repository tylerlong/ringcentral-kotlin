package com.ringcentral.definitions;


public class DataExportTask {
    /// <summary>
    /// Canonical URI of a task
    /// </summary>
    public String uri;

    /// <summary>
    /// Internal identifier of a task
    /// </summary>
    public String id;

    /// <summary>
    /// Task creation datetime
    /// </summary>
    public String creationTime;

    /// <summary>
    /// Task last modification datetime
    /// </summary>
    public String lastModifiedTime;

    /// <summary>
    /// Task status
    /// Enum: Accepted, InProgress, Completed, Failed
    /// </summary>
    public String status;

    /// <summary>
    /// Data collection archives. Returned by task ID
    /// </summary>
    public ExportTaskResultInfo[] result;
}
