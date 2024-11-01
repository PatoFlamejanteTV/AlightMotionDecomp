package C3;

import x3.C4216c;
import x3.InterfaceC4215b;

/* renamed from: C3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0982c implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C0981b f799a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f800b;

    public C0982c(C0981b c0981b, N5.a aVar) {
        this.f799a = c0981b;
        this.f800b = aVar;
    }

    public static C0982c a(C0981b c0981b, N5.a aVar) {
        return new C0982c(c0981b, aVar);
    }

    public static InterfaceC4215b c(C0981b c0981b, C4216c c4216c) {
        return (InterfaceC4215b) z5.h.d(c0981b.a(c4216c));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4215b get() {
        return c(this.f799a, (C4216c) this.f800b.get());
    }
}
