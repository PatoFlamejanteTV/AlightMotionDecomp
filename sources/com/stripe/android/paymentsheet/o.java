package com.stripe.android.paymentsheet;

import D3.f;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.n;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3292y;
import w3.C4154a;

/* loaded from: classes4.dex */
public abstract class o {
    public static final n a(D3.f fVar, w.l initializationMode, w.g configuration) {
        boolean z8;
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(initializationMode, "initializationMode");
        AbstractC3292y.i(configuration, "configuration");
        if (fVar instanceof f.C0023f) {
            f.C0023f c0023f = (f.C0023f) fVar;
            return new n.d.b(initializationMode, configuration.q(), c0023f.r(), c0023f.i());
        }
        if (fVar instanceof f.b) {
            f.b bVar = (f.b) fVar;
            return new n.b(bVar.getType(), bVar.f());
        }
        if (fVar instanceof f.e) {
            f.e eVar = (f.e) fVar;
            if (AbstractC3292y.d(eVar.h().u(), o.p.f25761o.f25773a)) {
                return new n.a(initializationMode, configuration.q(), eVar.h(), eVar.l(), configuration.h());
            }
            C4154a q8 = configuration.q();
            com.stripe.android.model.p h8 = eVar.h();
            com.stripe.android.model.r l8 = eVar.l();
            if (eVar.f() == f.a.f1246b) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new n.d.a(initializationMode, q8, h8, l8, z8);
        }
        if (fVar instanceof f.c) {
            w.k u8 = configuration.u();
            if (u8 != null) {
                return new n.c(initializationMode, configuration.q(), new n.c.a(u8.h(), configuration.v(), u8.m(), u8.f(), u8.a(), u8.i(), configuration.i()));
            }
        } else if (!(fVar instanceof f.d)) {
            throw new Q5.p();
        }
        return null;
    }
}
