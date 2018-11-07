package com.oasis.android.utils

import com.oasis.android.utils.rxandroid.SchedulerProvider
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
class AppSchedulerProvider: SchedulerProvider {
    override fun ui(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

    override fun io(): Scheduler {
        return Schedulers.io()
    }

}