package M;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class k extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z8) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return l.class;
            }
            return l.class;
        }
        return super.loadClass(str, z8);
    }
}
