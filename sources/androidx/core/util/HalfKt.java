package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes3.dex */
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(short s8) {
        Half valueOf;
        valueOf = Half.valueOf(s8);
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(float f8) {
        Half valueOf;
        valueOf = Half.valueOf(f8);
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        Half valueOf;
        valueOf = Half.valueOf(str);
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(double d8) {
        Half valueOf;
        valueOf = Half.valueOf((float) d8);
        return valueOf;
    }
}
