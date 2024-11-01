package e0;

import android.os.Build;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2777a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f31520a;

    static {
        int i8;
        if (Build.VERSION.SDK_INT >= 31) {
            i8 = 33554432;
        } else {
            i8 = 0;
        }
        f31520a = i8;
    }
}
