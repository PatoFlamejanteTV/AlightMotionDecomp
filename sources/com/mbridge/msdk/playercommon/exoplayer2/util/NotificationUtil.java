package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.browser.trusted.h;

/* loaded from: classes4.dex */
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    /* loaded from: classes4.dex */
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(Context context, String str, int i8, int i9) {
        if (Util.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            a.a();
            notificationManager.createNotificationChannel(h.a(str, context.getString(i8), i9));
        }
    }

    public static void setNotification(Context context, int i8, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i8, notification);
        } else {
            notificationManager.cancel(i8);
        }
    }
}
