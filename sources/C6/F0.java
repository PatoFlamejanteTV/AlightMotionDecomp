package C6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class F0 implements y6.b {

    /* renamed from: b, reason: collision with root package name */
    public static final F0 f1007b = new F0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C1006a0 f1008a = new C1006a0("kotlin.Unit", Q5.I.f8786a);

    private F0() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return this.f1008a.a();
    }

    @Override // y6.InterfaceC4248a
    public /* bridge */ /* synthetic */ Object d(B6.e eVar) {
        f(eVar);
        return Q5.I.f8786a;
    }

    public void f(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        this.f1008a.d(decoder);
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, Q5.I value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        this.f1008a.e(encoder, value);
    }
}
