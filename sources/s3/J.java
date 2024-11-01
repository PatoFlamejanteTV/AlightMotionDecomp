package s3;

import q3.AbstractC3637f;
import q3.C3645n;

/* loaded from: classes4.dex */
public final class J implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I f38934a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f38935b;

    public J(I i8, N5.a aVar) {
        this.f38934a = i8;
        this.f38935b = aVar;
    }

    public static J a(I i8, N5.a aVar) {
        return new J(i8, aVar);
    }

    public static AbstractC3637f c(I i8, C3645n c3645n) {
        return (AbstractC3637f) z5.h.d(i8.a(c3645n));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3637f get() {
        return c(this.f38934a, (C3645n) this.f38935b.get());
    }
}
