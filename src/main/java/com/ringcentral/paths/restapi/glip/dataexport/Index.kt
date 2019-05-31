package com.ringcentral.paths.restapi.glip.dataexport

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/data-export/${taskId}"
        }

        return "${parent.path()}/data-export"
    }

    /// <summary>
    /// Operation: Create Data Export Task
    /// Http Post /restapi/v1.0/glip/data-export
    /// </summary>
    fun post(createDataExportTaskRequest: com.ringcentral.definitions.CreateDataExportTaskRequest): com.ringcentral.definitions.DataExportTask
    // public async Task<com.ringcentral.definitions.DataExportTask> Post(createDataExportTaskRequest: com.ringcentral.definitions.CreateDataExportTaskRequest)
    {
        return com.alibaba.fastjson.JSON.parseObject(rc.post(this.path(false), createDataExportTaskRequest).string(), com.ringcentral.definitions.DataExportTask::class.java)
        // return await rc.Post<com.ringcentral.definitions.DataExportTask>(this.path(false), createDataExportTaskRequest);
    }

    /// <summary>
    /// Operation: Get Data Export Task
    /// Http Get /restapi/v1.0/glip/data-export/{taskId}
    /// </summary>
    fun get(): com.ringcentral.definitions.DataExportTask
    // public async Task<com.ringcentral.definitions.DataExportTask> Get()
    {
        if (this.taskId == null) {
            throw NullPointerException("taskId");
        }

        return com.alibaba.fastjson.JSON.parseObject(rc.get(this.path()).string(), com.ringcentral.definitions.DataExportTask::class.java)
        // return await rc.Get<com.ringcentral.definitions.DataExportTask>(this.path());
    }

    fun com.ringcentral.paths.restapi.glip.Index.dataexport(taskId: String? = null): Index {
        return Index(this, taskId)
    }
}
