package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final android.support.customtabs.trusted.a mCallbackBinder;

    private TrustedWebActivityCallbackRemote(@NonNull android.support.customtabs.trusted.a aVar) {
        this.mCallbackBinder = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static TrustedWebActivityCallbackRemote fromBinder(@Nullable IBinder iBinder) {
        android.support.customtabs.trusted.a asInterface;
        if (iBinder == null) {
            asInterface = null;
        } else {
            asInterface = a.AbstractBinderC0285a.asInterface(iBinder);
        }
        if (asInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(asInterface);
    }

    public void runExtraCallback(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
