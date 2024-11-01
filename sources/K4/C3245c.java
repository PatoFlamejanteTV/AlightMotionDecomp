package k4;

import Q5.s;
import Q5.t;
import U5.d;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3245c implements InterfaceC3244b {

    /* renamed from: b, reason: collision with root package name */
    private final i f34506b;

    public C3245c(i errorReporter) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f34506b = errorReporter;
    }

    @Override // k4.InterfaceC3244b
    public Object a(String str, d dVar) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        i.b.a(this.f34506b, i.f.f36240k, null, null, 6, null);
        s.a aVar = s.f8810b;
        return s.b(t.a(illegalStateException));
    }

    @Override // k4.InterfaceC3244b
    public Object b(String str, String str2, int i8, d dVar) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        i.b.a(this.f34506b, i.f.f36239j, null, null, 6, null);
        s.a aVar = s.f8810b;
        return s.b(t.a(illegalStateException));
    }
}
