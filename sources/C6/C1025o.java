package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1025o implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1025o f1082a = new C1025o();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1083b = new k0("kotlin.Char", e.c.f258a);

    private C1025o() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1083b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Character) obj).charValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Character d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Character.valueOf(decoder.h());
    }

    public void g(B6.f encoder, char c8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.s(c8);
    }
}
