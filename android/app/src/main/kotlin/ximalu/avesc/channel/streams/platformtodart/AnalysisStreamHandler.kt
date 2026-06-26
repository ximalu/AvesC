package ximalu.avesc.channel.streams.platformtodart

import ximalu.avesc.channel.streams.BaseStreamHandler
import ximalu.avesc.utils.LogUtils

class AnalysisStreamHandler : BaseStreamHandler() {
    fun notifyCompletion() = success(true)

    override val logTag = LOG_TAG

    companion object {
        private val LOG_TAG = LogUtils.createTag<AnalysisStreamHandler>()
        const val CHANNEL = "ximalu.avesc/analysis_events"
    }
}