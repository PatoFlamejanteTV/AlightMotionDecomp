package U7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final T7.a f10309a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f10310b;

    /* renamed from: c, reason: collision with root package name */
    public final T7.b f10311c;

    /* renamed from: d, reason: collision with root package name */
    public final W7.j f10312d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10313e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10314a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10315b;

        /* renamed from: d, reason: collision with root package name */
        public int f10317d;

        public a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10315b = obj;
            this.f10317d |= Integer.MIN_VALUE;
            return p.this.a(this);
        }
    }

    public p(T7.a networkUtil, SharedStorage sharedStorage, T7.b requestApi, W7.j resolver) {
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(resolver, "resolver");
        this.f10309a = networkUtil;
        this.f10310b = sharedStorage;
        this.f10311c = requestApi;
        this.f10312d = resolver;
        this.f10313e = "tcfv2/google-atp-list.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U7.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof U7.p.a
            if (r0 == 0) goto L13
            r0 = r9
            U7.p$a r0 = (U7.p.a) r0
            int r1 = r0.f10317d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10317d = r1
            goto L18
        L13:
            U7.p$a r0 = new U7.p$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10315b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10317d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f10314a
            U7.p r0 = (U7.p) r0
            Q5.t.b(r9)     // Catch: A5.a -> L2d
            goto L82
        L2d:
            goto L9f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            Q5.t.b(r9)
            T7.a r9 = r8.f10309a     // Catch: A5.a -> L85
            boolean r9 = r9.a()     // Catch: A5.a -> L85
            if (r9 == 0) goto L87
            boolean r9 = r8.b()     // Catch: A5.a -> L85
            if (r9 == 0) goto L87
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f10310b     // Catch: A5.a -> L85
            X7.a r2 = X7.a.GOOGLE_VENDOR_LAST_UPDATE     // Catch: A5.a -> L85
            long r4 = java.lang.System.currentTimeMillis()     // Catch: A5.a -> L85
            r9.getClass()     // Catch: A5.a -> L85
            java.lang.String r6 = "preferenceKey"
            kotlin.jvm.internal.AbstractC3292y.i(r2, r6)     // Catch: A5.a -> L85
            android.content.SharedPreferences r9 = r9.f19084a     // Catch: A5.a -> L85
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: A5.a -> L85
            java.lang.String r2 = "editor"
            kotlin.jvm.internal.AbstractC3292y.h(r9, r2)     // Catch: A5.a -> L85
            java.lang.String r2 = "googleVendorLastUpdate"
            r9.putLong(r2, r4)     // Catch: A5.a -> L85
            r9.apply()     // Catch: A5.a -> L85
            T7.b r9 = r8.f10311c     // Catch: A5.a -> L85
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r4 = r8.f10313e     // Catch: A5.a -> L85
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3292y.q(r2, r4)     // Catch: A5.a -> L85
            r0.f10314a = r8     // Catch: A5.a -> L85
            r0.f10317d = r3     // Catch: A5.a -> L85
            java.lang.Object r9 = r9.a(r2, r0)     // Catch: A5.a -> L85
            if (r9 != r1) goto L81
            return r1
        L81:
            r0 = r8
        L82:
            java.lang.String r9 = (java.lang.String) r9     // Catch: A5.a -> L2d
            goto Lb0
        L85:
            goto L9e
        L87:
            A5.b r1 = A5.b.f238a     // Catch: A5.a -> L85
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L85
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            A5.b.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: A5.a -> L85
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f10310b     // Catch: A5.a -> L85
            X7.a r0 = X7.a.GOOGLE_VENDOR_LIST     // Catch: A5.a -> L85
            java.lang.String r9 = r9.j(r0)     // Catch: A5.a -> L85
            r0 = r8
            goto Lb0
        L9e:
            r0 = r8
        L9f:
            boolean r9 = r0.b()
            if (r9 == 0) goto La8
            java.lang.String r9 = ""
            goto Lb0
        La8:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f10310b
            X7.a r1 = X7.a.GOOGLE_VENDOR_LIST
            java.lang.String r9 = r9.j(r1)
        Lb0:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f10310b
            X7.a r2 = X7.a.GOOGLE_VENDOR_LIST
            r1.e(r2, r9)
            W7.j r0 = r0.f10312d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.p.a(U5.d):java.lang.Object");
    }

    public final boolean b() {
        SharedStorage sharedStorage = this.f10310b;
        X7.a preferenceKey = X7.a.GOOGLE_VENDOR_LAST_UPDATE;
        sharedStorage.getClass();
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - sharedStorage.f19084a.getLong("googleVendorLastUpdate", 0L)) < 0) {
            return false;
        }
        return true;
    }
}
