package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.i;
import com.stripe.android.model.n;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.paymentsheet.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2637d {

    /* renamed from: com.stripe.android.paymentsheet.d$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27206a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27207b;

        static {
            int[] iArr = new int[w.m.e.values().length];
            try {
                iArr[w.m.e.f28007a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.m.e.f28008b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27206a = iArr;
            int[] iArr2 = new int[w.m.a.values().length];
            try {
                iArr2[w.m.a.f27996a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[w.m.a.f27997b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[w.m.a.f27998c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f27207b = iArr2;
        }
    }

    private static final i.b a(w.m.d dVar) {
        StripeIntent.Usage usage;
        if (dVar instanceof w.m.d.a) {
            w.m.d.a aVar = (w.m.d.a) dVar;
            long b9 = aVar.b();
            String L8 = aVar.L();
            w.m.e a9 = dVar.a();
            if (a9 != null) {
                usage = d(a9);
            } else {
                usage = null;
            }
            return new i.b.a(b9, L8, usage, c(aVar.f()));
        }
        if (dVar instanceof w.m.d.b) {
            w.m.d.b bVar = (w.m.d.b) dVar;
            return new i.b.C0500b(bVar.L(), d(bVar.a()));
        }
        throw new Q5.p();
    }

    public static final com.stripe.android.model.i b(w.m mVar) {
        AbstractC3292y.i(mVar, "<this>");
        return new com.stripe.android.model.i(a(mVar.a()), mVar.e(), mVar.f(), mVar.b());
    }

    private static final n.b c(w.m.a aVar) {
        int i8 = a.f27207b[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return n.b.f25588e;
                }
                throw new Q5.p();
            }
            return n.b.f25587d;
        }
        return n.b.f25586c;
    }

    private static final StripeIntent.Usage d(w.m.e eVar) {
        int i8 = a.f27206a[eVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return StripeIntent.Usage.f25381d;
            }
            throw new Q5.p();
        }
        return StripeIntent.Usage.f25380c;
    }
}
