package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.trusted.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public final class TrustedWebActivityServiceConnection {
    private static final String KEY_ACTIVE_NOTIFICATIONS = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
    private static final String KEY_CHANNEL_NAME = "android.support.customtabs.trusted.CHANNEL_NAME";
    private static final String KEY_NOTIFICATION = "android.support.customtabs.trusted.NOTIFICATION";
    private static final String KEY_NOTIFICATION_SUCCESS = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";
    private static final String KEY_PLATFORM_ID = "android.support.customtabs.trusted.PLATFORM_ID";
    private static final String KEY_PLATFORM_TAG = "android.support.customtabs.trusted.PLATFORM_TAG";
    private final ComponentName mComponentName;
    private final android.support.customtabs.trusted.b mService;

    /* loaded from: classes.dex */
    static class ActiveNotificationsArgs {
        public final Parcelable[] notifications;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ActiveNotificationsArgs(Parcelable[] parcelableArr) {
            this.notifications = parcelableArr;
        }

        public static ActiveNotificationsArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS);
            return new ActiveNotificationsArgs(bundle.getParcelableArray(TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(TrustedWebActivityServiceConnection.KEY_ACTIVE_NOTIFICATIONS, this.notifications);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    static class CancelNotificationArgs {
        public final int platformId;
        public final String platformTag;

        CancelNotificationArgs(String str, int i8) {
            this.platformTag = str;
            this.platformId = i8;
        }

        public static CancelNotificationArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_ID);
            return new CancelNotificationArgs(bundle.getString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG), bundle.getInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG, this.platformTag);
            bundle.putInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID, this.platformId);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    static class NotificationsEnabledArgs {
        public final String channelName;

        NotificationsEnabledArgs(String str) {
            this.channelName = str;
        }

        public static NotificationsEnabledArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME);
            return new NotificationsEnabledArgs(bundle.getString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME, this.channelName);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    static class NotifyNotificationArgs {
        public final String channelName;
        public final Notification notification;
        public final int platformId;
        public final String platformTag;

        NotifyNotificationArgs(String str, int i8, Notification notification, String str2) {
            this.platformTag = str;
            this.platformId = i8;
            this.notification = notification;
            this.channelName = str2;
        }

        public static NotifyNotificationArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_PLATFORM_ID);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_NOTIFICATION);
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME);
            return new NotifyNotificationArgs(bundle.getString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG), bundle.getInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID), (Notification) bundle.getParcelable(TrustedWebActivityServiceConnection.KEY_NOTIFICATION), bundle.getString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(TrustedWebActivityServiceConnection.KEY_PLATFORM_TAG, this.platformTag);
            bundle.putInt(TrustedWebActivityServiceConnection.KEY_PLATFORM_ID, this.platformId);
            bundle.putParcelable(TrustedWebActivityServiceConnection.KEY_NOTIFICATION, this.notification);
            bundle.putString(TrustedWebActivityServiceConnection.KEY_CHANNEL_NAME, this.channelName);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    static class ResultArgs {
        public final boolean success;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ResultArgs(boolean z8) {
            this.success = z8;
        }

        public static ResultArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS);
            return new ResultArgs(bundle.getBoolean(TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(TrustedWebActivityServiceConnection.KEY_NOTIFICATION_SUCCESS, this.success);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TrustedWebActivityServiceConnection(@NonNull android.support.customtabs.trusted.b bVar, @NonNull ComponentName componentName) {
        this.mService = bVar;
        this.mComponentName = componentName;
    }

    static void ensureBundleContains(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    @Nullable
    private static android.support.customtabs.trusted.a wrapCallback(@Nullable final TrustedWebActivityCallback trustedWebActivityCallback) {
        if (trustedWebActivityCallback == null) {
            return null;
        }
        return new a.AbstractBinderC0285a() { // from class: androidx.browser.trusted.TrustedWebActivityServiceConnection.1
            @Override // android.support.customtabs.trusted.a
            public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                TrustedWebActivityCallback.this.onExtraCallback(str, bundle);
            }
        };
    }

    public boolean areNotificationsEnabled(@NonNull String str) throws RemoteException {
        return ResultArgs.fromBundle(this.mService.areNotificationsEnabled(new NotificationsEnabledArgs(str).toBundle())).success;
    }

    public void cancel(@NonNull String str, int i8) throws RemoteException {
        this.mService.cancelNotification(new CancelNotificationArgs(str, i8).toBundle());
    }

    @NonNull
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] getActiveNotifications() throws RemoteException {
        return ActiveNotificationsArgs.fromBundle(this.mService.getActiveNotifications()).notifications;
    }

    @NonNull
    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    @Nullable
    public Bitmap getSmallIconBitmap() throws RemoteException {
        return (Bitmap) this.mService.getSmallIconBitmap().getParcelable(TrustedWebActivityService.KEY_SMALL_ICON_BITMAP);
    }

    public int getSmallIconId() throws RemoteException {
        return this.mService.getSmallIconId();
    }

    public boolean notify(@NonNull String str, int i8, @NonNull Notification notification, @NonNull String str2) throws RemoteException {
        return ResultArgs.fromBundle(this.mService.notifyNotificationWithChannel(new NotifyNotificationArgs(str, i8, notification, str2).toBundle())).success;
    }

    @Nullable
    public Bundle sendExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable TrustedWebActivityCallback trustedWebActivityCallback) throws RemoteException {
        IBinder asBinder;
        android.support.customtabs.trusted.a wrapCallback = wrapCallback(trustedWebActivityCallback);
        if (wrapCallback == null) {
            asBinder = null;
        } else {
            asBinder = wrapCallback.asBinder();
        }
        return this.mService.extraCommand(str, bundle, asBinder);
    }
}
