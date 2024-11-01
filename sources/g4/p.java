package g4;

import Q5.s;
import Q5.t;
import Q5.x;
import R5.Q;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;

/* loaded from: classes4.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    private final p3.i f32448b;

    public p(p3.i errorReporter) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f32448b = errorReporter;
    }

    @Override // g4.o
    public void a() {
        Object b9;
        IllegalStateException illegalStateException = new IllegalStateException("Missing stripecardscan dependency, please add it to your apps build.gradle");
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(Class.forName("androidx.test.InstrumentationRegistry"));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        this.f32448b.a(i.f.f36232c, x2.k.f40948e.b(illegalStateException), Q.e(x.a("has_instrumentation", String.valueOf(s.h(b9)))));
    }
}
