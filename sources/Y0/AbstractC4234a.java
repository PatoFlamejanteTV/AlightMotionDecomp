package y0;

import w0.h;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4234a extends AbstractC4235b {
    public static int a(int i8, int i9, int i10) {
        boolean z8;
        if (i9 <= i10) {
            z8 = true;
        } else {
            z8 = false;
        }
        h.f(z8, "min (%s) must be less than or equal to max (%s)", i9, i10);
        return Math.min(Math.max(i8, i9), i10);
    }
}
