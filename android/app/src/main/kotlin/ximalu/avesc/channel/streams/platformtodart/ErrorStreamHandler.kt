package ximalu.avesc.channel.streams.platformtodart

import ximalu.avesc.channel.streams.BaseStreamHandler
import ximalu.avesc.utils.LogUtils

class ErrorStreamHandler : BaseStreamHandler() {
    fun notifyError(error: String) = success(error)

    override val logTag = LOG_TAG

    companion object {
        private val LOG_TAG = LogUtils.createTag<ErrorStreamHandler>()
        const val CHANNEL = "ximalu.avesc/error"
    }
}