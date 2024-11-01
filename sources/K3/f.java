package K3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f4630a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4631b;

    /* renamed from: c, reason: collision with root package name */
    private final e f4632c;

    public /* synthetic */ f(long j8, int i8, e eVar, AbstractC3284p abstractC3284p) {
        this(j8, i8, eVar);
    }

    public static /* synthetic */ f b(f fVar, long j8, int i8, e eVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j8 = fVar.f4630a;
        }
        if ((i9 & 2) != 0) {
            i8 = fVar.f4631b;
        }
        if ((i9 & 4) != 0) {
            eVar = fVar.f4632c;
        }
        return fVar.a(j8, i8, eVar);
    }

    public final f a(long j8, int i8, e pollingState) {
        AbstractC3292y.i(pollingState, "pollingState");
        return new f(j8, i8, pollingState, null);
    }

    public final int c() {
        return this.f4631b;
    }

    public final long d() {
        return this.f4630a;
    }

    public final e e() {
        return this.f4632c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (C3374a.j(this.f4630a, fVar.f4630a) && this.f4631b == fVar.f4631b && this.f4632c == fVar.f4632c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C3374a.A(this.f4630a) * 31) + this.f4631b) * 31) + this.f4632c.hashCode();
    }

    public String toString() {
        return "PollingUiState(durationRemaining=" + C3374a.N(this.f4630a) + ", ctaText=" + this.f4631b + ", pollingState=" + this.f4632c + ")";
    }

    private f(long j8, int i8, e pollingState) {
        AbstractC3292y.i(pollingState, "pollingState");
        this.f4630a = j8;
        this.f4631b = i8;
        this.f4632c = pollingState;
    }

    public /* synthetic */ f(long j8, int i8, e eVar, int i9, AbstractC3284p abstractC3284p) {
        this(j8, i8, (i9 & 4) != 0 ? e.f4624a : eVar, null);
    }
}
