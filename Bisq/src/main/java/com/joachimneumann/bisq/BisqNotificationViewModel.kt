package org.apache.cordova.radiox.remote


import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import org.apache.cordova.radiox.remote.Database.BisqNotification

import org.apache.cordova.radiox.remote.Database.NotificationRepository
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking

class BisqNotificationViewModel(application: Application) : AndroidViewModel(application) {

    private val mRepository: NotificationRepository
    var bisqNotifications: LiveData<List<BisqNotification>>

    init {
        mRepository = NotificationRepository(application)
        bisqNotifications = mRepository.allBisqNotifications
    }

    fun insert(bisqNotification: BisqNotification) {
        mRepository.insert(bisqNotification)
    }

    fun delete(bisqNotification: BisqNotification) {
        mRepository.delete(bisqNotification)
    }

    fun nukeTable() {
        mRepository.nukeTable()
    }

    fun getFromUid(uid: Int): BisqNotification? {
        return mRepository.getFromUid(uid)
    }

    fun markAllAsRead() {
        mRepository.markAllAsRead()
    }

    fun markAsRead(uid: Int) {
        mRepository.markAsRead(uid)
    }
}
