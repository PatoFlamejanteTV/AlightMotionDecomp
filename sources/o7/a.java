package O7;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7909a = M7.b.i(a.class);

    private static String a(int i8) {
        return TypedValues.Custom.S_DIMENSION + i8;
    }

    public static boolean b(M7.d dVar, int i8, String str) {
        if (i8 < 1) {
            V7.a.b(f7909a).c("dimensionId should be great than 0 (arg: %d)", Integer.valueOf(i8));
            return false;
        }
        if (str != null && str.length() > 255) {
            str = str.substring(0, 255);
            V7.a.b(f7909a).h("dimensionValue was truncated to 255 chars.", new Object[0]);
        }
        if (str != null && str.length() == 0) {
            str = null;
        }
        dVar.d(a(i8), str);
        return true;
    }
}
