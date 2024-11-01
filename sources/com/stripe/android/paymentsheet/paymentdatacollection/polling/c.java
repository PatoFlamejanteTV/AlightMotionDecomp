package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import K3.e;
import Q5.I;
import Q5.p;
import U5.d;
import c6.InterfaceC2072n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import k3.C3237c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public abstract class c {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27639a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f27640b;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f4624a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f4626c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f4625b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f4627d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27639a = iArr;
            int[] iArr2 = new int[StripeIntent.Status.values().length];
            try {
                iArr2[StripeIntent.Status.f25371e.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StripeIntent.Status.f25374h.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StripeIntent.Status.f25369c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StripeIntent.Status.f25370d.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.Status.f25372f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.Status.f25373g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.Status.f25375i.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f27640b = iArr2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a */
        long f27641a;

        /* renamed from: b */
        int f27642b;

        /* renamed from: c */
        private /* synthetic */ Object f27643c;

        /* renamed from: d */
        final /* synthetic */ long f27644d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j8, d dVar) {
            super(2, dVar);
            this.f27644d = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f27644d, dVar);
            bVar.f27643c = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0082 -> B:12:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r9.f27642b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L24
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                long r5 = r9.f27641a
                java.lang.Object r1 = r9.f27643c
                q6.g r1 = (q6.InterfaceC3822g) r1
                Q5.t.b(r10)
                goto L68
            L24:
                long r5 = r9.f27641a
                java.lang.Object r1 = r9.f27643c
                q6.g r1 = (q6.InterfaceC3822g) r1
                Q5.t.b(r10)
                goto L49
            L2e:
                Q5.t.b(r10)
                java.lang.Object r10 = r9.f27643c
                r1 = r10
                q6.g r1 = (q6.InterfaceC3822g) r1
                long r5 = r9.f27644d
                m6.a r10 = m6.C3374a.e(r5)
                r9.f27643c = r1
                r9.f27641a = r5
                r9.f27642b = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
                return r0
            L49:
                m6.a$a r10 = m6.C3374a.f35036b
                long r7 = r10.b()
                int r10 = m6.C3374a.g(r5, r7)
                if (r10 <= 0) goto L85
                m6.d r10 = m6.EnumC3377d.f35046e
                long r7 = m6.AbstractC3376c.s(r4, r10)
                r9.f27643c = r1
                r9.f27641a = r5
                r9.f27642b = r3
                java.lang.Object r10 = n6.X.c(r7, r9)
                if (r10 != r0) goto L68
                return r0
            L68:
                m6.a$a r10 = m6.C3374a.f35036b
                m6.d r10 = m6.EnumC3377d.f35046e
                long r7 = m6.AbstractC3376c.s(r4, r10)
                long r5 = m6.C3374a.H(r5, r7)
                m6.a r10 = m6.C3374a.e(r5)
                r9.f27643c = r1
                r9.f27641a = r5
                r9.f27642b = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
                return r0
            L85:
                Q5.I r10 = Q5.I.f8786a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(InterfaceC3822g interfaceC3822g, d dVar) {
            return ((b) create(interfaceC3822g, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public static final InterfaceC3821f c(long j8) {
        return AbstractC3823h.z(new b(j8, null));
    }

    public static final C3237c d(e eVar, PollingContract.a args) {
        AbstractC3292y.i(eVar, "<this>");
        AbstractC3292y.i(args, "args");
        int i8 = a.f27639a[eVar.ordinal()];
        if (i8 == 1 || i8 == 2) {
            return null;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return new C3237c(args.d(), 3, null, false, null, null, null, 116, null);
            }
            throw new p();
        }
        return new C3237c(args.d(), 1, null, false, null, null, null, 124, null);
    }

    public static final e e(StripeIntent.Status status) {
        switch (a.f27640b[status.ordinal()]) {
            case 1:
                return e.f4624a;
            case 2:
                return e.f4625b;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return e.f4626c;
            default:
                throw new p();
        }
    }
}
