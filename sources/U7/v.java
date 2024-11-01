package U7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    public final T7.a f10358a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f10359b;

    /* renamed from: c, reason: collision with root package name */
    public final T7.b f10360c;

    /* renamed from: d, reason: collision with root package name */
    public final W7.j f10361d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10362e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10363a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10364b;

        /* renamed from: d, reason: collision with root package name */
        public int f10366d;

        public a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10364b = obj;
            this.f10366d |= Integer.MIN_VALUE;
            return v.this.b(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f10367a;

        /* renamed from: c, reason: collision with root package name */
        public int f10369c;

        public b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10367a = obj;
            this.f10369c |= Integer.MIN_VALUE;
            return v.this.a(this);
        }
    }

    public v(T7.a networkUtil, SharedStorage sharedStorage, T7.b requestApi, W7.j resolver, String packageName, String pCode) {
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(resolver, "resolver");
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(pCode, "pCode");
        this.f10358a = networkUtil;
        this.f10359b = sharedStorage;
        this.f10360c = requestApi;
        this.f10361d = resolver;
        Y y8 = Y.f34578a;
        String format = String.format(AbstractC3292y.q("https://cmp.inmobi.com/", "choice/%s/%s/app-config.json"), Arrays.copyOf(new Object[]{pCode, packageName}, 2));
        AbstractC3292y.h(format, "format(format, *args)");
        this.f10362e = format;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(3:16|17|(2:19|(1:21))(2:22|23))|11|12))|25|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // U7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof U7.v.b
            if (r0 == 0) goto L13
            r0 = r8
            U7.v$b r0 = (U7.v.b) r0
            int r1 = r0.f10369c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10369c = r1
            goto L18
        L13:
            U7.v$b r0 = new U7.v$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10367a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10369c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r8)     // Catch: A5.a -> L6b
            goto L5b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            Q5.t.b(r8)
            T7.a r8 = r7.f10358a     // Catch: A5.a -> L6b
            boolean r8 = r8.a()     // Catch: A5.a -> L6b
            if (r8 == 0) goto L5e
            W7.j r8 = r7.f10361d     // Catch: A5.a -> L6b
            com.inmobi.cmp.data.storage.SharedStorage r2 = r7.f10359b     // Catch: A5.a -> L6b
            X7.a r4 = X7.a.PORTAL_CONFIG     // Catch: A5.a -> L6b
            java.lang.String r2 = r2.j(r4)     // Catch: A5.a -> L6b
            java.lang.Object r8 = r8.a(r2)     // Catch: A5.a -> L6b
            J6.f r8 = (J6.f) r8     // Catch: A5.a -> L6b
            T7.b r2 = r7.f10360c     // Catch: A5.a -> L6b
            J6.a r8 = r8.f4497b     // Catch: A5.a -> L6b
            java.lang.String r8 = r8.f4472r     // Catch: A5.a -> L6b
            r0.f10369c = r3     // Catch: A5.a -> L6b
            java.lang.Object r8 = r2.b(r8, r0)     // Catch: A5.a -> L6b
            if (r8 != r1) goto L5b
            return r1
        L5b:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: A5.a -> L6b
            goto L6c
        L5e:
            A5.b r0 = A5.b.f238a     // Catch: A5.a -> L6b
            com.inmobi.cmp.model.ChoiceError r1 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L6b
            r5 = 0
            r6 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            A5.b.a(r0, r1, r2, r3, r4, r5, r6)     // Catch: A5.a -> L6b
        L6b:
            r8 = 0
        L6c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.v.a(U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof U7.v.a
            if (r0 == 0) goto L13
            r0 = r9
            U7.v$a r0 = (U7.v.a) r0
            int r1 = r0.f10366d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10366d = r1
            goto L18
        L13:
            U7.v$a r0 = new U7.v$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10364b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10366d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f10363a
            U7.v r0 = (U7.v) r0
            Q5.t.b(r9)     // Catch: A5.a -> L6b
            goto L50
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            Q5.t.b(r9)
            T7.a r9 = r8.f10358a     // Catch: A5.a -> L6a
            boolean r9 = r9.a()     // Catch: A5.a -> L6a
            if (r9 == 0) goto L53
            T7.b r9 = r8.f10360c     // Catch: A5.a -> L6a
            java.lang.String r2 = r8.f10362e     // Catch: A5.a -> L6a
            r0.f10363a = r8     // Catch: A5.a -> L6a
            r0.f10366d = r3     // Catch: A5.a -> L6a
            java.lang.Object r9 = r9.a(r2, r0)     // Catch: A5.a -> L6a
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r0 = r8
        L50:
            java.lang.String r9 = (java.lang.String) r9     // Catch: A5.a -> L6b
            goto L73
        L53:
            A5.b r1 = A5.b.f238a     // Catch: A5.a -> L6a
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L6a
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            A5.b.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: A5.a -> L6a
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f10359b     // Catch: A5.a -> L6a
            X7.a r0 = X7.a.PORTAL_CONFIG     // Catch: A5.a -> L6a
            java.lang.String r9 = r9.j(r0)     // Catch: A5.a -> L6a
            r0 = r8
            goto L73
        L6a:
            r0 = r8
        L6b:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f10359b
            X7.a r1 = X7.a.PORTAL_CONFIG
            java.lang.String r9 = r9.j(r1)
        L73:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f10359b
            X7.a r2 = X7.a.PORTAL_CONFIG
            r1.e(r2, r9)
            W7.j r0 = r0.f10361d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.v.b(U5.d):java.lang.Object");
    }
}
