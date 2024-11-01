package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.c;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
final class EngagementSignalsCallbackRemote implements EngagementSignalsCallback {
    private static final String TAG = "EngagementSigsCallbkRmt";
    private final android.support.customtabs.c mCallbackBinder;

    private EngagementSignalsCallbackRemote(@NonNull android.support.customtabs.c cVar) {
        this.mCallbackBinder = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static EngagementSignalsCallbackRemote fromBinder(@NonNull IBinder iBinder) {
        return new EngagementSignalsCallbackRemote(c.a.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(@IntRange(from = 1, to = 100) int i8, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onGreatestScrollPercentageIncreased(i8, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z8, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onSessionEnded(z8, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z8, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onVerticalScrollEvent(z8, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
