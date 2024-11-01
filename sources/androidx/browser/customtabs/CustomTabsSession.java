package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.b;
import android.support.customtabs.c;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    static final String TARGET_ORIGIN_KEY = "target_origin";
    private final android.support.customtabs.a mCallback;
    private final ComponentName mComponentName;

    @Nullable
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final android.support.customtabs.b mService;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends c.a {
        private final Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ EngagementSignalsCallback val$callback;

        AnonymousClass1(EngagementSignalsCallback engagementSignalsCallback) {
            this.val$callback = engagementSignalsCallback;
        }

        @Override // android.support.customtabs.c
        public void onGreatestScrollPercentageIncreased(final int i8, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.c
                @Override // java.lang.Runnable
                public final void run() {
                    EngagementSignalsCallback.this.onGreatestScrollPercentageIncreased(i8, bundle);
                }
            });
        }

        @Override // android.support.customtabs.c
        public void onSessionEnded(final boolean z8, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.b
                @Override // java.lang.Runnable
                public final void run() {
                    EngagementSignalsCallback.this.onSessionEnded(z8, bundle);
                }
            });
        }

        @Override // android.support.customtabs.c
        public void onVerticalScrollEvent(final boolean z8, final Bundle bundle) {
            Handler handler = this.mHandler;
            final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.d
                @Override // java.lang.Runnable
                public final void run() {
                    EngagementSignalsCallback.this.onVerticalScrollEvent(z8, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends c.a {
        private final Executor mExecutor;
        final /* synthetic */ EngagementSignalsCallback val$callback;
        final /* synthetic */ Executor val$executor;

        AnonymousClass2(Executor executor, EngagementSignalsCallback engagementSignalsCallback) {
            this.val$executor = executor;
            this.val$callback = engagementSignalsCallback;
            this.mExecutor = executor;
        }

        @Override // android.support.customtabs.c
        public void onGreatestScrollPercentageIncreased(final int i8, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        EngagementSignalsCallback.this.onGreatestScrollPercentageIncreased(i8, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.c
        public void onSessionEnded(final boolean z8, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        EngagementSignalsCallback.this.onSessionEnded(z8, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.c
        public void onVerticalScrollEvent(final boolean z8, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final EngagementSignalsCallback engagementSignalsCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        EngagementSignalsCallback.this.onVerticalScrollEvent(z8, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* loaded from: classes.dex */
    static class MockSession extends b.a {
        MockSession() {
        }

        @Override // android.support.customtabs.b
        public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.b
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean mayLaunchUrl(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean newSession(android.support.customtabs.a aVar) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean newSessionWithExtras(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public int postMessage(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.b
        public boolean receiveFile(android.support.customtabs.a aVar, Uri uri, int i8, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean requestPostMessageChannel(android.support.customtabs.a aVar, Uri uri) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean setEngagementSignalsCallback(android.support.customtabs.a aVar, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean updateVisuals(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean validateRelationship(android.support.customtabs.a aVar, int i8, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean warmup(long j8) throws RemoteException {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class PendingSession {

        @Nullable
        private final CustomTabsCallback mCallback;

        @Nullable
        private final PendingIntent mId;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PendingSession(@Nullable CustomTabsCallback customTabsCallback, @Nullable PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public CustomTabsCallback getCallback() {
            return this.mCallback;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        public PendingIntent getId() {
            return this.mId;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomTabsSession(android.support.customtabs.b bVar, android.support.customtabs.a aVar, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.mService = bVar;
        this.mCallback = aVar;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle createBundleWithId(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    private c.a createEngagementSignalsCallbackWrapper(@NonNull EngagementSignalsCallback engagementSignalsCallback) {
        return new AnonymousClass1(engagementSignalsCallback);
    }

    @NonNull
    @VisibleForTesting
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    @Nullable
    private Bundle createPostMessageExtraBundle(@Nullable Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(TARGET_ORIGIN_KEY, uri);
        }
        if (this.mId != null) {
            addIdToBundle(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public PendingIntent getId() {
        return this.mId;
    }

    public boolean isEngagementSignalsApiAvailable(@NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.isEngagementSignalsApiAvailable(this.mCallback, createBundleWithId(bundle));
        } catch (SecurityException e8) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e8);
        }
    }

    public boolean mayLaunchUrl(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(@NonNull String str, @Nullable Bundle bundle) {
        int postMessage;
        Bundle createBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                try {
                    postMessage = this.mService.postMessage(this.mCallback, str, createBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return postMessage;
    }

    public boolean receiveFile(@NonNull Uri uri, int i8, @Nullable Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i8, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public boolean setActionButton(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e8) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e8);
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(@Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i8, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i8);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i8, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i8 >= 1 && i8 <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i8, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    private c.a createEngagementSignalsCallbackWrapper(@NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Executor executor) {
        return new AnonymousClass2(executor, engagementSignalsCallback);
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        try {
            Bundle createPostMessageExtraBundle = createPostMessageExtraBundle(uri2);
            if (createPostMessageExtraBundle != null) {
                bundle.putAll(createPostMessageExtraBundle);
                return this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, bundle);
            }
            return this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull Executor executor, @NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.mService.setEngagementSignalsCallback(this.mCallback, createEngagementSignalsCallbackWrapper(engagementSignalsCallback, executor).asBinder(), createBundleWithId(bundle));
        } catch (SecurityException e8) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e8);
        }
    }
}
