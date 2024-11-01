package s6;

import Q5.s;
import a.C1639a;

/* renamed from: s6.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3979E {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f39164a = new C1639a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f39165b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f39166c;

    static {
        Object b9;
        Object b10;
        try {
            s.a aVar = Q5.s.f8810b;
            b9 = Q5.s.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        if (Q5.s.e(b9) != null) {
            b9 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f39165b = (String) b9;
        try {
            b10 = Q5.s.b(AbstractC3979E.class.getCanonicalName());
        } catch (Throwable th2) {
            s.a aVar3 = Q5.s.f8810b;
            b10 = Q5.s.b(Q5.t.a(th2));
        }
        if (Q5.s.e(b10) != null) {
            b10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f39166c = (String) b10;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
