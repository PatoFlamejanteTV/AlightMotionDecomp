package q3;

import Q5.I;
import Q5.s;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: q3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3640i implements InterfaceC3642k {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f36690a;

    /* renamed from: q3.i$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36691a = new a();

        a() {
            super(1);
        }

        public final void a(HttpsURLConnection httpsURLConnection) {
            AbstractC3292y.i(httpsURLConnection, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((HttpsURLConnection) obj);
            return I.f8786a;
        }
    }

    public C3640i(Function1 configureSSL) {
        AbstractC3292y.i(configureSSL, "configureSSL");
        this.f36690a = configureSSL;
    }

    @Override // q3.InterfaceC3642k
    public Object a(String str, U5.d dVar) {
        Object b9;
        try {
            s.a aVar = Q5.s.f8810b;
            URLConnection openConnection = new URL(str).openConnection();
            AbstractC3292y.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            if (httpURLConnection instanceof HttpsURLConnection) {
                this.f36690a.invoke(httpURLConnection);
            }
            httpURLConnection.getResponseCode();
            b9 = Q5.s.b(httpURLConnection.getURL().toString());
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        if (Q5.s.e(b9) == null) {
            return b9;
        }
        return str;
    }

    public C3640i() {
        this(a.f36691a);
    }
}
