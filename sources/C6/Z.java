package C6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class Z implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    private final y6.b f1034a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.f f1035b;

    public Z(y6.b serializer) {
        AbstractC3292y.i(serializer, "serializer");
        this.f1034a = serializer;
        this.f1035b = new m0(serializer.a());
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return this.f1035b;
    }

    @Override // y6.InterfaceC4248a
    public Object d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        if (decoder.x()) {
            return decoder.w(this.f1034a);
        }
        return decoder.q();
    }

    @Override // y6.i
    public void e(B6.f encoder, Object obj) {
        AbstractC3292y.i(encoder, "encoder");
        if (obj != null) {
            encoder.t();
            encoder.z(this.f1034a, obj);
        } else {
            encoder.e();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass() && AbstractC3292y.d(this.f1034a, ((Z) obj).f1034a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1034a.hashCode();
    }
}
