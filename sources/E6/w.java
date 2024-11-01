package E6;

import Q5.C1413h;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3334D;

/* loaded from: classes5.dex */
public final class w extends B6.a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1043a f2079a;

    /* renamed from: b, reason: collision with root package name */
    private final F6.b f2080b;

    public w(AbstractC1043a lexer, D6.a json) {
        AbstractC3292y.i(lexer, "lexer");
        AbstractC3292y.i(json, "json");
        this.f2079a = lexer;
        this.f2080b = json.e();
    }

    @Override // B6.a, B6.e
    public byte D() {
        AbstractC1043a abstractC1043a = this.f2079a;
        String q8 = abstractC1043a.q();
        try {
            return AbstractC3334D.a(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1043a.x(abstractC1043a, "Failed to parse type 'UByte' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1413h();
        }
    }

    @Override // B6.a, B6.e
    public short F() {
        AbstractC1043a abstractC1043a = this.f2079a;
        String q8 = abstractC1043a.q();
        try {
            return AbstractC3334D.j(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1043a.x(abstractC1043a, "Failed to parse type 'UShort' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1413h();
        }
    }

    @Override // B6.c
    public F6.b b() {
        return this.f2080b;
    }

    @Override // B6.a, B6.e
    public int n() {
        AbstractC1043a abstractC1043a = this.f2079a;
        String q8 = abstractC1043a.q();
        try {
            return AbstractC3334D.d(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1043a.x(abstractC1043a, "Failed to parse type 'UInt' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1413h();
        }
    }

    @Override // B6.a, B6.e
    public long v() {
        AbstractC1043a abstractC1043a = this.f2079a;
        String q8 = abstractC1043a.q();
        try {
            return AbstractC3334D.g(q8);
        } catch (IllegalArgumentException unused) {
            AbstractC1043a.x(abstractC1043a, "Failed to parse type 'ULong' for input '" + q8 + '\'', 0, null, 6, null);
            throw new C1413h();
        }
    }

    @Override // B6.c
    public int y(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}
