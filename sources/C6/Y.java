package C6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class Y implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f1032a = new Y();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1033b = X.f1029a;

    private Y() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1033b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        throw new y6.h("'kotlin.Nothing' does not have instances");
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, Void value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        throw new y6.h("'kotlin.Nothing' cannot be serialized");
    }
}
