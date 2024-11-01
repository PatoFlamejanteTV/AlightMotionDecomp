package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.w;

/* loaded from: classes4.dex */
public abstract class C {
    public static final /* synthetic */ boolean a(w.l lVar) {
        return b(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(w.l lVar) {
        if (lVar instanceof w.l.b) {
            return true;
        }
        if (lVar instanceof w.l.c) {
            return false;
        }
        if (lVar instanceof w.l.a) {
            return ((w.l.a) lVar).b().a() instanceof w.m.d.a;
        }
        throw new Q5.p();
    }
}
