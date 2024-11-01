package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @RequiresApi(24)
    /* loaded from: classes.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static void stopForeground(Service service, int i8) {
            service.stopForeground(i8);
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void startForeground(Service service, int i8, Notification notification, int i9) {
            if (i9 != 0 && i9 != -1) {
                service.startForeground(i8, notification, i9 & 255);
            } else {
                service.startForeground(i8, notification, i9);
            }
        }
    }

    @RequiresApi(34)
    /* loaded from: classes.dex */
    static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        static void startForeground(Service service, int i8, Notification notification, int i9) {
            if (i9 != 0 && i9 != -1) {
                service.startForeground(i8, notification, i9 & ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            } else {
                service.startForeground(i8, notification, i9);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(@NonNull Service service, int i8, @NonNull Notification notification, int i9) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            Api34Impl.startForeground(service, i8, notification, i9);
        } else if (i10 >= 29) {
            Api29Impl.startForeground(service, i8, notification, i9);
        } else {
            service.startForeground(i8, notification);
        }
    }

    public static void stopForeground(@NonNull Service service, int i8) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.stopForeground(service, i8);
            return;
        }
        boolean z8 = true;
        if ((i8 & 1) == 0) {
            z8 = false;
        }
        service.stopForeground(z8);
    }
}
