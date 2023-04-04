package com.valokafor.prontolist

import android.app.Application
import android.util.Log
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber

class ProntoTodoApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this);
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
    }

    private inner class CrashReportingTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, throwable: Throwable?) {
            if (priority == Log.ERROR || priority == Log.DEBUG) {
                if (throwable != null) {
                    //Log to real crash lib like Crashlytics
                }
            } else return
        }
    }
}