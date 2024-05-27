package com.elsharif.chatstreamapp.di

import com.elsharif.chatstreamapp.VideoCallingApp
import com.elsharif.chatstreamapp.connect.ConnectViewModel
import com.elsharif.chatstreamapp.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule= module {

    factory {
        val app =androidContext().applicationContext as VideoCallingApp
        app.client
    }
    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)

}