package I1;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes4.dex */
public abstract class d {
    public static void a(String str) {
        if (B1.c.f374a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    public static void b(String str, Exception exc) {
        if ((B1.c.f374a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
