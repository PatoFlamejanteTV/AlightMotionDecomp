package j4;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;

/* renamed from: j4.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3173c0 {

    /* renamed from: a, reason: collision with root package name */
    private final p3.i f34101a;

    public C3173c0(p3.i errorReporter) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f34101a = errorReporter;
    }

    public final List a(String str) {
        if (str != null && str.length() != 0) {
            Object a9 = C3177e0.f34112a.a(str);
            Throwable e8 = Q5.s.e(a9);
            if (e8 != null) {
                i.b.a(this.f34101a, i.f.f36244o, x2.k.f40948e.b(e8), null, 4, null);
            }
            if (Q5.s.e(a9) != null) {
                a9 = AbstractC1435t.m();
            }
            return (List) a9;
        }
        return AbstractC1435t.m();
    }
}
