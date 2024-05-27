package com.elsharif.chatstreamapp.video

sealed interface VideoCallAction {
    data object OnDisconnectClick:VideoCallAction
    data object JoinCall:VideoCallAction

}