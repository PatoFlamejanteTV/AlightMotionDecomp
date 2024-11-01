package V;

import android.os.Looper;

/* loaded from: classes3.dex */
public abstract class r {
    public static boolean a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
