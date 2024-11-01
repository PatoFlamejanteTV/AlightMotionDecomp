package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
class NotificationApiHelperForO {
    private NotificationApiHelperForO() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Notification copyNotificationOntoChannel(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        NotificationChannel notificationChannel;
        int importance;
        Notification.Builder recoverBuilder;
        notificationManager.createNotificationChannel(h.a(str, str2, 3));
        notificationChannel = notificationManager.getNotificationChannel(str);
        importance = notificationChannel.getImportance();
        if (importance != 0) {
            recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
            recoverBuilder.setChannelId(str);
            return recoverBuilder.build();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isChannelEnabled(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 0) {
                return false;
            }
        }
        return true;
    }
}
