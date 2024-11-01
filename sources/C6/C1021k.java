package C6;

import A6.e;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1021k implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1021k f1071a = new C1021k();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1072b = new k0("kotlin.Byte", e.b.f257a);

    private C1021k() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1072b;
    }

    @Override // y6.i
    public /* bridge */ /* synthetic */ void e(B6.f fVar, Object obj) {
        g(fVar, ((Number) obj).byteValue());
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Byte d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return Byte.valueOf(decoder.D());
    }

    public void g(B6.f encoder, byte b9) {
        AbstractC3292y.i(encoder, "encoder");
        encoder.j(b9);
    }
}
