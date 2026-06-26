package ximalu.avesc.channel.streams.platformtodart

import ximalu.avesc.channel.streams.BaseStreamHandler
import ximalu.avesc.utils.LogUtils

class WindowChangeStreamHandler : BaseStreamHandler() {
    fun notifyCutoutInsetsChange() = success(CODE_CUTOUT_INSETS)
    fun notifyWindowModeChange() = success(CODE_WINDOW_MODE)

    override val logTag = LOG_TAG

    companion object {
        private val LOG_TAG = LogUtils.createTag<ErrorStreamHandler>()
        const val CHANNEL = "ximalu.avesc/window_change"

        private const val CODE_CUTOUT_INSETS = "cutout_insets"
        private const val CODE_WINDOW_MODE = "window_mode"
    }
}