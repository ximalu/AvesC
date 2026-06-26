package ximalu.avesc.channel.streams.platformtodart

import ximalu.avesc.channel.streams.BaseStreamHandler
import ximalu.avesc.utils.LogUtils

class IntentStreamHandler : BaseStreamHandler() {
    fun notifyNewIntent(intentData: MutableMap<String, Any?>?) = success(intentData)

    override val logTag = LOG_TAG

    companion object {
        private val LOG_TAG = LogUtils.createTag<IntentStreamHandler>()
        const val CHANNEL = "ximalu.avesc/new_intent_stream"
    }
}