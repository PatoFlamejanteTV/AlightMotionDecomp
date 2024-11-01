package q5;

import Q5.I;
import android.content.Context;
import android.os.Bundle;
import c5.K;
import c5.T;
import c6.InterfaceC2072n;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;

/* renamed from: q5.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3798w {

    /* renamed from: a, reason: collision with root package name */
    private T f37318a;

    /* renamed from: b, reason: collision with root package name */
    private String f37319b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37320c;

    /* renamed from: q5.w$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f37322b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f37323c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37324d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37325e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3798w f37326f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, kotlin.jvm.internal.T t8, String str, String str2, C3798w c3798w, U5.d dVar) {
            super(2, dVar);
            this.f37322b = context;
            this.f37323c = t8;
            this.f37324d = str;
            this.f37325e = str2;
            this.f37326f = c3798w;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f37322b, this.f37323c, this.f37324d, this.f37325e, this.f37326f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x011e, code lost:            if (r2 != false) goto L42;     */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x018c, code lost:            if (r2 != false) goto L65;     */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0165, code lost:            if (r2 != false) goto L42;     */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[Catch: all -> 0x007a, JSONException -> 0x007d, TryCatch #1 {JSONException -> 0x007d, blocks: (B:5:0x0013, B:7:0x0035, B:9:0x0044, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x0089, B:19:0x00ad, B:24:0x00b9, B:38:0x00d4, B:40:0x00ef), top: B:4:0x0013, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.C3798w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context, String str, K k8) {
        this.f37320c = true;
        T.f15689k.b(context);
        this.f37318a = null;
        if (str != null) {
            this.f37319b = str;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "fail");
        bundle.putString("loginSource", "google");
        if (k8 != null) {
            bundle.putString("responseCode", String.valueOf(k8.e()));
            if (k8.c() != null) {
                String c8 = k8.c();
                AbstractC3292y.f(c8);
                bundle.putString("exception", c8);
            }
        }
        new C3795t(context).e("login", bundle);
    }

    public final String b() {
        return this.f37319b;
    }

    public final T c() {
        return this.f37318a;
    }

    public final com.google.android.gms.auth.api.signin.b d(Context context) {
        AbstractC3292y.i(context, "context");
        GoogleSignInOptions a9 = new GoogleSignInOptions.a(GoogleSignInOptions.f16013l).b().d("699621046070-qajra0rrsahiqmumvkg7fagujfd78tm8.apps.googleusercontent.com").a();
        AbstractC3292y.h(a9, "build(...)");
        com.google.android.gms.auth.api.signin.b a10 = com.google.android.gms.auth.api.signin.a.a(context, a9);
        AbstractC3292y.h(a10, "getClient(...)");
        return a10;
    }

    public final boolean e() {
        return this.f37320c;
    }

    public final void f(Context context) {
        AbstractC3292y.i(context, "context");
        new C3798w().d(context).u();
    }

    public final Object g(String str, String str2, Context context, U5.d dVar) {
        this.f37318a = new T();
        Object g8 = AbstractC3458i.g(C3445b0.b(), new a(context, new kotlin.jvm.internal.T(), str, str2, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final void i(String str) {
        this.f37319b = str;
    }
}
