package com.mzelzoghbi.circleciemulatortest

import android.app.Application
import com.instabug.library.Instabug
import com.instabug.library.invocation.InstabugInvocationEvent

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Instabug.Builder(this, "token")
            .setInvocationEvents(
                InstabugInvocationEvent.FLOATING_BUTTON,
                InstabugInvocationEvent.SHAKE
            )
            .build()
    }
}