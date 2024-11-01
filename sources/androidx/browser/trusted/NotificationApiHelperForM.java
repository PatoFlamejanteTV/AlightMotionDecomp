package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class NotificationApiHelperForM {
    private NotificationApiHelperForM() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications;
        activeNotifications = notificationManager.getActiveNotifications();
        return activeNotifications;
    }
}
