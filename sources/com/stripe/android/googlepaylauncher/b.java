package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.e;
import kotlin.jvm.internal.AbstractC3292y;
import r0.C3875m;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final C3875m f25046a;

    /* loaded from: classes4.dex */
    public static final class a implements e.a {
        @Override // com.stripe.android.googlepaylauncher.e.a
        public e a(C3875m paymentsClient) {
            AbstractC3292y.i(paymentsClient, "paymentsClient");
            return new b(paymentsClient);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0470b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25047a;

        /* renamed from: c, reason: collision with root package name */
        int f25049c;

        C0470b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25047a = obj;
            this.f25049c |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(C3875m paymentsClient) {
        AbstractC3292y.i(paymentsClient, "paymentsClient");
        this.f25046a = paymentsClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.stripe.android.googlepaylauncher.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(r0.C3867e r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.googlepaylauncher.b.C0470b
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.googlepaylauncher.b$b r0 = (com.stripe.android.googlepaylauncher.b.C0470b) r0
            int r1 = r0.f25049c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25049c = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.b$b r0 = new com.stripe.android.googlepaylauncher.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25047a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f25049c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Q5.t.b(r6)
            r0.m r6 = r4.f25046a
            com.google.android.gms.tasks.Task r5 = r6.s(r5)
            java.lang.String r6 = "isReadyToPay(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r5, r6)
            r0.f25049c = r3
            java.lang.Object r6 = x6.b.a(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.b.a(r0.e, U5.d):java.lang.Object");
    }
}
