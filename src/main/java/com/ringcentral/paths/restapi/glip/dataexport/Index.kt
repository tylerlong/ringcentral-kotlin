package com.ringcentral.paths.restapi.glip.dataexport

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val taskId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && taskId != null) {
            return "${parent.path()}/data-export/${taskId}"
        }

        return "${parent.path()}/data-export"
    }

    /**
     * Operation: Create Data Export Task
     * Http Post /restapi/v1.0/glip/data-export
     */
    fun post(createDataExportTaskRequest: com.ringcentral.definitions.CreateDataExportTaskRequest): com.ringcentral.definitions.DataExportTask? {
        val str: String? = rc.post(this.path(false), createDataExportTaskRequest).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.DataExportTask::class.java)
    }


    /**
     * Operation: Get Data Export Task
     * Http Get /restapi/v1.0/glip/data-export/{taskId}
     */
    fun get(): com.ringcentral.definitions.DataExportTask? {
        if (this.taskId == null) {
            throw NullPointerException("taskId")
        }

        val str: String? = rc.get(this.path()).string()
        if (str == null) {
            return null
        }
        return com.alibaba.fastjson.JSON.parseObject(str, com.ringcentral.definitions.DataExportTask::class.java)
    }


    @JvmOverloads
    fun archive(archiveId: String? = null): com.ringcentral.paths.restapi.glip.dataexport.archive.Index {
        return com.ringcentral.paths.restapi.glip.dataexport.archive.Index(this, archiveId)
    }

}