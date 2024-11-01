package U7;

import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final T7.a f10265a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f10266b;

    /* renamed from: c, reason: collision with root package name */
    public final T7.b f10267c;

    /* renamed from: d, reason: collision with root package name */
    public final W7.j f10268d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10269e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10270a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10271b;

        /* renamed from: d, reason: collision with root package name */
        public int f10273d;

        public a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10271b = obj;
            this.f10273d |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    public d(T7.a networkUtil, SharedStorage sharedStorage, T7.b requestApi, W7.j resolver) {
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(resolver, "resolver");
        this.f10265a = networkUtil;
        this.f10266b = sharedStorage;
        this.f10267c = requestApi;
        this.f10268d = resolver;
        this.f10269e = "GVL-v2/cmp-list.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof U7.d.a
            if (r0 == 0) goto L13
            r0 = r9
            U7.d$a r0 = (U7.d.a) r0
            int r1 = r0.f10273d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10273d = r1
            goto L18
        L13:
            U7.d$a r0 = new U7.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10271b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10273d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f10270a
            U7.d r0 = (U7.d) r0
            Q5.t.b(r9)     // Catch: A5.a -> L71
            goto L56
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            Q5.t.b(r9)
            T7.a r9 = r8.f10265a     // Catch: A5.a -> L70
            boolean r9 = r9.a()     // Catch: A5.a -> L70
            if (r9 == 0) goto L59
            T7.b r9 = r8.f10267c     // Catch: A5.a -> L70
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r4 = r8.f10269e     // Catch: A5.a -> L70
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3292y.q(r2, r4)     // Catch: A5.a -> L70
            r0.f10270a = r8     // Catch: A5.a -> L70
            r0.f10273d = r3     // Catch: A5.a -> L70
            java.lang.Object r9 = r9.a(r2, r0)     // Catch: A5.a -> L70
            if (r9 != r1) goto L55
            return r1
        L55:
            r0 = r8
        L56:
            java.lang.String r9 = (java.lang.String) r9     // Catch: A5.a -> L71
            goto L79
        L59:
            A5.b r1 = A5.b.f238a     // Catch: A5.a -> L70
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L70
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            A5.b.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: A5.a -> L70
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f10266b     // Catch: A5.a -> L70
            X7.a r0 = X7.a.CMP_LIST     // Catch: A5.a -> L70
            java.lang.String r9 = r9.j(r0)     // Catch: A5.a -> L70
            r0 = r8
            goto L79
        L70:
            r0 = r8
        L71:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f10266b
            X7.a r1 = X7.a.CMP_LIST
            java.lang.String r9 = r9.j(r1)
        L79:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f10266b
            X7.a r2 = X7.a.CMP_LIST
            r1.e(r2, r9)
            W7.j r0 = r0.f10268d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.d.a(U5.d):java.lang.Object");
    }
}
