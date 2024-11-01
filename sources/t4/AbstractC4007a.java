package t4;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4007a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f39475a = ConstraintsKt.Constraints(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final float f39476b = Dp.m5155constructorimpl(16);

    /* renamed from: c, reason: collision with root package name */
    private static final float f39477c = Dp.m5155constructorimpl(12);

    /* renamed from: d, reason: collision with root package name */
    private static final Modifier f39478d;

    static {
        float f8 = 48;
        f39478d = SizeKt.m608defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8));
    }

    public static final float a() {
        return f39477c;
    }

    public static final Modifier b() {
        return f39478d;
    }

    public static final float c() {
        return f39476b;
    }

    public static final long d() {
        return f39475a;
    }
}
