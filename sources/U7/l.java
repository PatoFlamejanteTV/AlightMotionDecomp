package U7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f10291a;

    /* renamed from: b, reason: collision with root package name */
    public final T7.a f10292b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f10293c;

    /* renamed from: d, reason: collision with root package name */
    public final T7.b f10294d;

    /* renamed from: e, reason: collision with root package name */
    public final W7.j f10295e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10296f;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10297a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10298b;

        /* renamed from: d, reason: collision with root package name */
        public int f10300d;

        public a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10298b = obj;
            this.f10300d |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    public l(Locale appLocale, T7.a networkUtil, SharedStorage sharedStorage, T7.b requestApi, W7.j resolver) {
        AbstractC3292y.i(appLocale, "appLocale");
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(resolver, "resolver");
        this.f10291a = appLocale;
        this.f10292b = networkUtil;
        this.f10293c = sharedStorage;
        this.f10294d = requestApi;
        this.f10295e = resolver;
        this.f10296f = "google-basic-consent/v1/purposes-";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof U7.l.a
            if (r0 == 0) goto L13
            r0 = r9
            U7.l$a r0 = (U7.l.a) r0
            int r1 = r0.f10300d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10300d = r1
            goto L18
        L13:
            U7.l$a r0 = new U7.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10298b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10300d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f10297a
            U7.l r0 = (U7.l) r0
            Q5.t.b(r9)     // Catch: A5.a -> L6d
            goto L52
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            Q5.t.b(r9)
            T7.a r9 = r8.f10292b     // Catch: A5.a -> L6c
            boolean r9 = r9.a()     // Catch: A5.a -> L6c
            if (r9 == 0) goto L55
            T7.b r9 = r8.f10294d     // Catch: A5.a -> L6c
            java.lang.String r2 = r8.b()     // Catch: A5.a -> L6c
            r0.f10297a = r8     // Catch: A5.a -> L6c
            r0.f10300d = r3     // Catch: A5.a -> L6c
            java.lang.Object r9 = r9.a(r2, r0)     // Catch: A5.a -> L6c
            if (r9 != r1) goto L51
            return r1
        L51:
            r0 = r8
        L52:
            java.lang.String r9 = (java.lang.String) r9     // Catch: A5.a -> L6d
            goto L75
        L55:
            A5.b r1 = A5.b.f238a     // Catch: A5.a -> L6c
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L6c
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            A5.b.a(r1, r2, r3, r4, r5, r6, r7)     // Catch: A5.a -> L6c
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f10293c     // Catch: A5.a -> L6c
            X7.a r0 = X7.a.GOOGLE_BASIC_CONSENT     // Catch: A5.a -> L6c
            java.lang.String r9 = r9.j(r0)     // Catch: A5.a -> L6c
            r0 = r8
            goto L75
        L6c:
            r0 = r8
        L6d:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f10293c
            X7.a r1 = X7.a.GOOGLE_BASIC_CONSENT
            java.lang.String r9 = r9.j(r1)
        L75:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f10293c
            X7.a r2 = X7.a.GOOGLE_BASIC_CONSENT
            r1.e(r2, r9)
            W7.j r0 = r0.f10295e
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.l.a(U5.d):java.lang.Object");
    }

    public final String b() {
        String language = this.f10293c.j(X7.a.PORTAL_CHOICE_LANG);
        AbstractC3292y.i(language, "key");
        int[] a9 = D5.b.a(26);
        int length = a9.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                int i9 = a9[i8];
                i8++;
                if (l6.n.s(G6.a.b(i9), language, true) && !l6.n.s(language, "autoDetectedLanguage", true)) {
                    break;
                }
            } else {
                language = this.f10291a.getLanguage();
                break;
            }
        }
        StringBuilder a10 = AbstractC4157a.a("https://cmp.inmobi.com/");
        a10.append(this.f10296f);
        AbstractC3292y.h(language, "language");
        String lowerCase = language.toLowerCase(this.f10291a);
        AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        a10.append(lowerCase);
        a10.append(".json");
        return a10.toString();
    }
}
