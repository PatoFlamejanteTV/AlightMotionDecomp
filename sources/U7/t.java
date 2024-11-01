package U7;

import com.inmobi.cmp.data.storage.SharedStorage;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f10345a;

    /* renamed from: b, reason: collision with root package name */
    public final T7.a f10346b;

    /* renamed from: c, reason: collision with root package name */
    public final T7.b f10347c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedStorage f10348d;

    /* renamed from: e, reason: collision with root package name */
    public final D5.h f10349e;

    /* renamed from: f, reason: collision with root package name */
    public final H6.g f10350f;

    /* renamed from: g, reason: collision with root package name */
    public final W7.j f10351g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10352h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10353i;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f10354a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10355b;

        /* renamed from: d, reason: collision with root package name */
        public int f10357d;

        public a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10355b = obj;
            this.f10357d |= Integer.MIN_VALUE;
            return t.this.a(this);
        }
    }

    public t(Locale appLocale, T7.a networkUtil, T7.b requestApi, SharedStorage sharedStorage, D5.h jurisdiction, H6.g state, W7.j resolver) {
        AbstractC3292y.i(appLocale, "appLocale");
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(jurisdiction, "jurisdiction");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(resolver, "resolver");
        this.f10345a = appLocale;
        this.f10346b = networkUtil;
        this.f10347c = requestApi;
        this.f10348d = sharedStorage;
        this.f10349e = jurisdiction;
        this.f10350f = state;
        this.f10351g = resolver;
        this.f10352h = "us-mspa/v1/purposes-state-%s-";
        this.f10353i = "us-mspa/v1/purposes-national-";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // U7.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof U7.t.a
            if (r0 == 0) goto L13
            r0 = r9
            U7.t$a r0 = (U7.t.a) r0
            int r1 = r0.f10357d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10357d = r1
            goto L18
        L13:
            U7.t$a r0 = new U7.t$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10355b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f10357d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f10354a
            U7.t r0 = (U7.t) r0
            Q5.t.b(r9)     // Catch: A5.a -> L6d
            goto L52
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            Q5.t.b(r9)
            T7.a r9 = r8.f10346b     // Catch: A5.a -> L6c
            boolean r9 = r9.a()     // Catch: A5.a -> L6c
            if (r9 == 0) goto L55
            T7.b r9 = r8.f10347c     // Catch: A5.a -> L6c
            java.lang.String r2 = r8.b()     // Catch: A5.a -> L6c
            r0.f10354a = r8     // Catch: A5.a -> L6c
            r0.f10357d = r3     // Catch: A5.a -> L6c
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
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f10348d     // Catch: A5.a -> L6c
            X7.a r0 = X7.a.MSPA_PURPOSES     // Catch: A5.a -> L6c
            java.lang.String r9 = r9.j(r0)     // Catch: A5.a -> L6c
            r0 = r8
            goto L75
        L6c:
            r0 = r8
        L6d:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f10348d
            X7.a r1 = X7.a.MSPA_PURPOSES
            java.lang.String r9 = r9.j(r1)
        L75:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f10348d
            X7.a r2 = X7.a.MSPA_PURPOSES
            r1.e(r2, r9)
            W7.j r0 = r0.f10351g
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.t.a(U5.d):java.lang.Object");
    }

    public final String b() {
        String str;
        String str2;
        D5.h hVar = this.f10349e;
        D5.h value = D5.h.STATE_AND_NATIONAL;
        if (hVar == value) {
            H6.g state = this.f10350f;
            AbstractC3292y.i(state, "state");
            AbstractC3292y.i(state, "state");
            int ordinal = state.ordinal();
            String str3 = DownloadCommon.DOWNLOAD_REPORT_CANCEL;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str2 = "co";
                } else if (ordinal == 2) {
                    str2 = "ct";
                } else if (ordinal == 3) {
                    str2 = "ut";
                } else if (ordinal == 4) {
                    str2 = "va";
                } else {
                    str2 = "";
                }
            } else {
                str2 = DownloadCommon.DOWNLOAD_REPORT_CANCEL;
            }
            if (str2.length() > 0) {
                H6.d dVar = H6.d.f3272a;
                AbstractC3292y.i(value, "value");
                H6.d.f3279h = value;
                Y y8 = Y.f34578a;
                String str4 = this.f10352h;
                H6.g state2 = this.f10350f;
                AbstractC3292y.i(state2, "state");
                int ordinal2 = state2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        str3 = "co";
                    } else if (ordinal2 == 2) {
                        str3 = "ct";
                    } else if (ordinal2 == 3) {
                        str3 = "ut";
                    } else if (ordinal2 == 4) {
                        str3 = "va";
                    } else {
                        str3 = "";
                    }
                }
                str = String.format(str4, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC3292y.h(str, "format(format, *args)");
                StringBuilder sb = new StringBuilder();
                sb.append("https://cmp.inmobi.com/");
                sb.append(str);
                String lowerCase = "EN".toLowerCase(this.f10345a);
                AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                sb.append(lowerCase);
                sb.append(".json");
                return sb.toString();
            }
        }
        H6.d dVar2 = H6.d.f3272a;
        D5.h value2 = D5.h.NATIONAL;
        AbstractC3292y.i(value2, "value");
        H6.d.f3279h = value2;
        str = this.f10353i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://cmp.inmobi.com/");
        sb2.append(str);
        String lowerCase2 = "EN".toLowerCase(this.f10345a);
        AbstractC3292y.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase2);
        sb2.append(".json");
        return sb2.toString();
    }
}
