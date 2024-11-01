package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ForegroundInfo {
    private final int mForegroundServiceType;
    private final Notification mNotification;
    private final int mNotificationId;

    public ForegroundInfo(int i8, @NonNull Notification notification) {
        this(i8, notification, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.mNotificationId != foregroundInfo.mNotificationId || this.mForegroundServiceType != foregroundInfo.mForegroundServiceType) {
            return false;
        }
        return this.mNotification.equals(foregroundInfo.mNotification);
    }

    public int getForegroundServiceType() {
        return this.mForegroundServiceType;
    }

    @NonNull
    public Notification getNotification() {
        return this.mNotification;
    }

    public int getNotificationId() {
        return this.mNotificationId;
    }

    public int hashCode() {
        return (((this.mNotificationId * 31) + this.mForegroundServiceType) * 31) + this.mNotification.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.mNotificationId + ", mForegroundServiceType=" + this.mForegroundServiceType + ", mNotification=" + this.mNotification + '}';
    }

    public ForegroundInfo(int i8, @NonNull Notification notification, int i9) {
        this.mNotificationId = i8;
        this.mNotification = notification;
        this.mForegroundServiceType = i9;
    }
}
