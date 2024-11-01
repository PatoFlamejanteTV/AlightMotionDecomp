package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1018h implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1018h f1064a = new C1018h();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1065b = new k0("kotlin.Boolean", e.a.f256a);

    private C1018h() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1065b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Boolean) obj).booleanValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Boolean.valueOf(decoder.f());
    }

    public void g(B6.f encoder, boolean z8) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.k(z8);
    }
}
