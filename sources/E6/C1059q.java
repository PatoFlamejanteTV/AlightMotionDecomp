package E6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: E6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1059q extends C1050h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1059q(InterfaceC1063v writer, boolean z8) {
        super(writer);
        AbstractC3292y.i(writer, "writer");
        this.f2075c = z8;
    }

    @Override // E6.C1050h
    public void d(byte b9) {
        boolean z8 = this.f2075c;
        String e8 = Q5.y.e(Q5.y.b(b9));
        if (z8) {
            m(e8);
        } else {
            j(e8);
        }
    }

    @Override // E6.C1050h
    public void h(int i8) {
        boolean z8 = this.f2075c;
        int b9 = Q5.A.b(i8);
        if (z8) {
            m(AbstractC1054l.a(b9));
        } else {
            j(AbstractC1055m.a(b9));
        }
    }

    @Override // E6.C1050h
    public void i(long j8) {
        String a9;
        String a10;
        boolean z8 = this.f2075c;
        long b9 = Q5.C.b(j8);
        if (z8) {
            a10 = AbstractC1057o.a(b9, 10);
            m(a10);
        } else {
            a9 = AbstractC1058p.a(b9, 10);
            j(a9);
        }
    }

    @Override // E6.C1050h
    public void k(short s8) {
        boolean z8 = this.f2075c;
        String e8 = Q5.F.e(Q5.F.b(s8));
        if (z8) {
            m(e8);
        } else {
            j(e8);
        }
    }
}
