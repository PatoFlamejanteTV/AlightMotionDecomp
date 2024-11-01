package V;

import Q.AbstractC1396p;
import android.content.Context;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f10389a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            AbstractC1396p.l(context);
            AbstractC1396p.l(th);
            return false;
        } catch (Exception e8) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e8);
            return false;
        }
    }
}
