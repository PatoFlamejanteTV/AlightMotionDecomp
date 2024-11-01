package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {

    @Nullable
    private Context mApplicationContext;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new CustomTabsClient(b.a.asInterface(iBinder), componentName, this.mApplicationContext) { // from class: androidx.browser.customtabs.CustomTabsServiceConnection.1
            });
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
