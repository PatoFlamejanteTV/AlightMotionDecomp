package y2;

import java.util.Locale;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4238b implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C4237a f41150a;

    public C4238b(C4237a c4237a) {
        this.f41150a = c4237a;
    }

    public static C4238b a(C4237a c4237a) {
        return new C4238b(c4237a);
    }

    public static Locale c(C4237a c4237a) {
        return c4237a.a();
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Locale get() {
        return c(this.f41150a);
    }
}
