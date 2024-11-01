package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2246s2;
import com.google.android.gms.internal.measurement.C2306z6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class n6 extends AbstractC2314b {

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.L1 f17977g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h6 f17978h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(h6 h6Var, String str, int i8, com.google.android.gms.internal.measurement.L1 l12) {
        super(str, i8);
        this.f17978h = h6Var;
        this.f17977g = l12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2314b
    public final int a() {
        return this.f17977g.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2314b
    public final boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC2314b
    public final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(Long l8, Long l9, C2246s2 c2246s2, boolean z8) {
        boolean z9;
        boolean z10;
        Object obj;
        if (C2306z6.a() && this.f17978h.b().H(this.f17685a, G.f17324o0)) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean L8 = this.f17977g.L();
        boolean M8 = this.f17977g.M();
        boolean N8 = this.f17977g.N();
        if (!L8 && !M8 && !N8) {
            z10 = false;
        } else {
            z10 = true;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z8 && !z10) {
            C2415p2 K8 = this.f17978h.a().K();
            Integer valueOf = Integer.valueOf(this.f17686b);
            if (this.f17977g.O()) {
                num = Integer.valueOf(this.f17977g.j());
            }
            K8.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        com.google.android.gms.internal.measurement.J1 H8 = this.f17977g.H();
        boolean M9 = H8.M();
        if (c2246s2.Y()) {
            if (!H8.O()) {
                this.f17978h.a().L().b("No number filter for long property. property", this.f17978h.d().g(c2246s2.U()));
            } else {
                bool = AbstractC2314b.d(AbstractC2314b.c(c2246s2.P(), H8.J()), M9);
            }
        } else if (c2246s2.W()) {
            if (!H8.O()) {
                this.f17978h.a().L().b("No number filter for double property. property", this.f17978h.d().g(c2246s2.U()));
            } else {
                bool = AbstractC2314b.d(AbstractC2314b.b(c2246s2.G(), H8.J()), M9);
            }
        } else if (c2246s2.a0()) {
            if (!H8.Q()) {
                if (!H8.O()) {
                    this.f17978h.a().L().b("No string or number filter defined. property", this.f17978h.d().g(c2246s2.U()));
                } else if (Z5.g0(c2246s2.V())) {
                    bool = AbstractC2314b.d(AbstractC2314b.e(c2246s2.V(), H8.J()), M9);
                } else {
                    this.f17978h.a().L().c("Invalid user property value for Numeric number filter. property, value", this.f17978h.d().g(c2246s2.U()), c2246s2.V());
                }
            } else {
                bool = AbstractC2314b.d(AbstractC2314b.g(c2246s2.V(), H8.K(), this.f17978h.a()), M9);
            }
        } else {
            this.f17978h.a().L().b("User property has no value, property", this.f17978h.d().g(c2246s2.U()));
        }
        C2415p2 K9 = this.f17978h.a().K();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        K9.b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f17687c = Boolean.TRUE;
        if (N8 && !bool.booleanValue()) {
            return true;
        }
        if (!z8 || this.f17977g.L()) {
            this.f17688d = bool;
        }
        if (bool.booleanValue() && z10 && c2246s2.Z()) {
            long R8 = c2246s2.R();
            if (l8 != null) {
                R8 = l8.longValue();
            }
            if (z9 && this.f17977g.L() && !this.f17977g.M() && l9 != null) {
                R8 = l9.longValue();
            }
            if (this.f17977g.M()) {
                this.f17690f = Long.valueOf(R8);
            } else {
                this.f17689e = Long.valueOf(R8);
            }
        }
        return true;
    }
}
