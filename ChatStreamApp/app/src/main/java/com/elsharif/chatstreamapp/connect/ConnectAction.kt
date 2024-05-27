package com.elsharif.chatstreamapp.connect

sealed interface ConnectAction {
    data class OnNameChane(val name:String):ConnectAction
    data object OnConnectClick:ConnectAction

}