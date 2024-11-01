package V6;

import U6.AbstractC1457m;
import U6.C1449e;
import U6.Z;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class g extends AbstractC1457m {

    /* renamed from: b, reason: collision with root package name */
    private final long f10676b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10677c;

    /* renamed from: d, reason: collision with root package name */
    private long f10678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z delegate, long j8, boolean z8) {
        super(delegate);
        AbstractC3292y.i(delegate, "delegate");
        this.f10676b = j8;
        this.f10677c = z8;
    }

    private final void b(C1449e c1449e, long j8) {
        C1449e c1449e2 = new C1449e();
        c1449e2.L(c1449e);
        c1449e.f(c1449e2, j8);
        c1449e2.a();
    }

    @Override // U6.AbstractC1457m, U6.Z
    public long m(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        long j9 = this.f10678d;
        long j10 = this.f10676b;
        if (j9 > j10) {
            j8 = 0;
        } else if (this.f10677c) {
            long j11 = j10 - j9;
            if (j11 == 0) {
                return -1L;
            }
            j8 = Math.min(j8, j11);
        }
        long m8 = super.m(sink, j8);
        if (m8 != -1) {
            this.f10678d += m8;
        }
        long j12 = this.f10678d;
        long j13 = this.f10676b;
        if ((j12 < j13 && m8 == -1) || j12 > j13) {
            if (m8 > 0 && j12 > j13) {
                b(sink, sink.E() - (this.f10678d - this.f10676b));
            }
            throw new IOException("expected " + this.f10676b + " bytes but got " + this.f10678d);
        }
        return m8;
    }
}
