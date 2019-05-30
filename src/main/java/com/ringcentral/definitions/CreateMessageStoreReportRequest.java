package com.ringcentral.definitions;


public class CreateMessageStoreReportRequest {
    /// <summary>
    /// Starting time for collecting messages. The default value equals to the current time minus 24 hours
    /// </summary>
    public String dateFrom;

    /// <summary>
    /// Ending time for collecting messages. The default value is the current time
    /// </summary>
    public String dateTo;
}
