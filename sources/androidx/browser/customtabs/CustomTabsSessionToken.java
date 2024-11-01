package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class CustomTabsSessionToken {
    private static final String TAG = "CustomTabsSessionToken";

    @Nullable
    private final CustomTabsCallback mCallback;

    @Nullable
    final android.support.customtabs.a mCallbackBinder;

    @Nullable
    private final PendingIntent mSessionId;

    /* loaded from: classes.dex */
    static class MockCallback extends a.AbstractBinderC0279a {
        @Override // android.support.customtabs.a.AbstractBinderC0279a, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.a
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.a
        public void onActivityLayout(int i8, int i9, int i10, int i11, int i12, @NonNull Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onActivityResized(int i8, int i9, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onMinimized(@NonNull Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onNavigationEvent(int i8, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onRelationshipValidationResult(int i8, Uri uri, boolean z8, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onUnminimized(@NonNull Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void onWarmupCompleted(Bundle bundle) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomTabsSessionToken(@Nullable android.support.customtabs.a aVar, @Nullable PendingIntent pendingIntent) {
        CustomTabsCallback customTabsCallback;
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.mCallbackBinder = aVar;
        this.mSessionId = pendingIntent;
        if (aVar == null) {
            customTabsCallback = null;
        } else {
            customTabsCallback = new CustomTabsCallback() { // from class: androidx.browser.customtabs.CustomTabsSessionToken.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void extraCallback(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.extraCallback(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                @NonNull
                public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        return CustomTabsSessionToken.this.mCallbackBinder.extraCallbackWithResult(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                        return null;
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onActivityLayout(int i8, int i9, int i10, int i11, int i12, @NonNull Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onActivityLayout(i8, i9, i10, i11, i12, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onActivityResized(int i8, int i9, @NonNull Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onActivityResized(i8, i9, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onMessageChannelReady(@Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onMinimized(@NonNull Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onMinimized(bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onNavigationEvent(int i8, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(i8, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onRelationshipValidationResult(int i8, @NonNull Uri uri, boolean z8, @Nullable Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onRelationshipValidationResult(i8, uri, z8, bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onUnminimized(@NonNull Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onUnminimized(bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onWarmupCompleted(@NonNull Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.mCallbackBinder.onWarmupCompleted(bundle);
                    } catch (RemoteException unused) {
                        Log.e(CustomTabsSessionToken.TAG, "RemoteException during ICustomTabsCallback transaction");
                    }
                }
            };
        }
        this.mCallback = customTabsCallback;
    }

    @NonNull
    public static CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new CustomTabsSessionToken(new MockCallback(), null);
    }

    private IBinder getCallbackBinderAssertNotNull() {
        android.support.customtabs.a aVar = this.mCallbackBinder;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @Nullable
    public static CustomTabsSessionToken getSessionTokenFromIntent(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        android.support.customtabs.a aVar = null;
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder(CustomTabsIntent.EXTRA_SESSION);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(CustomTabsIntent.EXTRA_SESSION_ID);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        if (binder != null) {
            aVar = a.AbstractBinderC0279a.asInterface(binder);
        }
        return new CustomTabsSessionToken(aVar, pendingIntent);
    }

    public boolean equals(Object obj) {
        boolean z8;
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent id = customTabsSessionToken.getId();
        PendingIntent pendingIntent = this.mSessionId;
        boolean z9 = true;
        if (pendingIntent == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (id != null) {
            z9 = false;
        }
        if (z8 != z9) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(id);
        }
        return getCallbackBinderAssertNotNull().equals(customTabsSessionToken.getCallbackBinderAssertNotNull());
    }

    @Nullable
    public CustomTabsCallback getCallback() {
        return this.mCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public IBinder getCallbackBinder() {
        android.support.customtabs.a aVar = this.mCallbackBinder;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    @Nullable
    PendingIntent getId() {
        return this.mSessionId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasCallback() {
        if (this.mCallbackBinder != null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasId() {
        if (this.mSessionId != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.mSessionId;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean isAssociatedWith(@NonNull CustomTabsSession customTabsSession) {
        return customTabsSession.getBinder().equals(this.mCallbackBinder);
    }
}
