package e4;

import j$.util.Objects;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2819c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2819c f31708a = new C2819c();

    private C2819c() {
    }

    public static final boolean a(Object obj, Object obj2) {
        return AbstractC3292y.d(obj, obj2);
    }

    public static final int b(Object... values) {
        AbstractC3292y.i(values, "values");
        return Objects.hash(Arrays.copyOf(values, values.length));
    }
}
