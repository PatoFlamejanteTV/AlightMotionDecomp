package com.stripe.android.model;

import com.stripe.android.model.b;
import com.stripe.android.model.r;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class s {
    public static final b.c a(r rVar) {
        AbstractC3292y.i(rVar, "<this>");
        if (rVar instanceof r.a) {
            return null;
        }
        if (rVar instanceof r.b) {
            return ((r.b) rVar).h();
        }
        if (rVar instanceof r.c) {
            return null;
        }
        if (rVar instanceof r.d) {
            return ((r.d) rVar).b();
        }
        if ((rVar instanceof r.e) || AbstractC3292y.d(rVar, r.f.f25898c)) {
            return null;
        }
        throw new Q5.p();
    }
}
