package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsService;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "CustomTabsService";
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final SimpleArrayMap<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new SimpleArrayMap<>();
    private b.a mBinder = new AnonymousClass1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends b.a {
        AnonymousClass1() {
        }

        @Nullable
        private PendingIntent getSessionIdFromBundle(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        @Nullable
        private Uri getTargetOriginFromBundle(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return (Uri) Api33Impl.getParcelable(bundle, "target_origin", Uri.class);
            }
            return (Uri) bundle.getParcelable("target_origin");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$newSessionInternal$0(CustomTabsSessionToken customTabsSessionToken) {
            CustomTabsService.this.cleanUpSession(customTabsSessionToken);
        }

        private boolean newSessionInternal(@NonNull android.support.customtabs.a aVar, @Nullable PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(aVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.AnonymousClass1.this.lambda$newSessionInternal$0(customTabsSessionToken);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    aVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(aVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.newSession(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.b
        public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.a aVar, @NonNull Bundle bundle) {
            return CustomTabsService.this.isEngagementSignalsApiAvailable(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.b
        public boolean mayLaunchUrl(@Nullable android.support.customtabs.a aVar, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.b
        public boolean newSession(@NonNull android.support.customtabs.a aVar) {
            return newSessionInternal(aVar, null);
        }

        @Override // android.support.customtabs.b
        public boolean newSessionWithExtras(@NonNull android.support.customtabs.a aVar, @Nullable Bundle bundle) {
            return newSessionInternal(aVar, getSessionIdFromBundle(bundle));
        }

        @Override // android.support.customtabs.b
        public int postMessage(@NonNull android.support.customtabs.a aVar, @NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.postMessage(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean receiveFile(@NonNull android.support.customtabs.a aVar, @NonNull Uri uri, int i8, @Nullable Bundle bundle) {
            return CustomTabsService.this.receiveFile(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), uri, i8, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean requestPostMessageChannel(@NonNull android.support.customtabs.a aVar, @NonNull Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(aVar, null), uri, null, new Bundle());
        }

        @Override // android.support.customtabs.b
        public boolean requestPostMessageChannelWithExtras(@NonNull android.support.customtabs.a aVar, @NonNull Uri uri, @NonNull Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), uri, getTargetOriginFromBundle(bundle), bundle);
        }

        @Override // android.support.customtabs.b
        public boolean setEngagementSignalsCallback(@NonNull android.support.customtabs.a aVar, @NonNull IBinder iBinder, @NonNull Bundle bundle) {
            return CustomTabsService.this.setEngagementSignalsCallback(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), EngagementSignalsCallbackRemote.fromBinder(iBinder), bundle);
        }

        @Override // android.support.customtabs.b
        public boolean updateVisuals(@NonNull android.support.customtabs.a aVar, @Nullable Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), bundle);
        }

        @Override // android.support.customtabs.b
        public boolean validateRelationship(@NonNull android.support.customtabs.a aVar, int i8, @NonNull Uri uri, @Nullable Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(aVar, getSessionIdFromBundle(bundle)), i8, uri, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean warmup(long j8) {
            return CustomTabsService.this.warmup(j8);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Result {
    }

    protected boolean cleanUpSession(@NonNull CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IBinder callbackBinder = customTabsSessionToken.getCallbackBinder();
                    if (callbackBinder == null) {
                        return false;
                    }
                    callbackBinder.unlinkToDeath(this.mDeathRecipientMap.get(callbackBinder), 0);
                    this.mDeathRecipientMap.remove(callbackBinder);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @Nullable
    protected abstract Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle);

    protected boolean isEngagementSignalsApiAvailable(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Bundle bundle) {
        return false;
    }

    protected abstract boolean mayLaunchUrl(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    protected abstract boolean newSession(@NonNull CustomTabsSessionToken customTabsSessionToken);

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }

    protected abstract int postMessage(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull String str, @Nullable Bundle bundle);

    protected abstract boolean receiveFile(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, int i8, @Nullable Bundle bundle);

    protected abstract boolean requestPostMessageChannel(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri);

    protected boolean requestPostMessageChannel(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        return requestPostMessageChannel(customTabsSessionToken, uri);
    }

    protected boolean setEngagementSignalsCallback(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) {
        return false;
    }

    protected abstract boolean updateVisuals(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Bundle bundle);

    protected abstract boolean validateRelationship(@NonNull CustomTabsSessionToken customTabsSessionToken, int i8, @NonNull Uri uri, @Nullable Bundle bundle);

    protected abstract boolean warmup(long j8);
}
