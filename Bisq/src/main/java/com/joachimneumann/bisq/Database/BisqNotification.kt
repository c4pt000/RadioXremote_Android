package com.joachimneumann.bisq.Database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import java.util.*

@Entity
open class BisqNotification : RawBisqNotification() {

    @ColumnInfo(name = "sentDate")
    var sentDate: Date? = null

    @ColumnInfo(name = "read")
    var read: Boolean = false
}
