package com.oasis.android.utils.rxandroid

import io.reactivex.Scheduler

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
interface SchedulerProvider {
    fun ui(): Scheduler
    fun io(): Scheduler
}