package B2;

import B2.E;
import B2.G;
import Q5.I;
import a6.AbstractC1677b;
import c6.InterfaceC2072n;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public interface l {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f471a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f472b;

        /* renamed from: c, reason: collision with root package name */
        private static final int f473c;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f472b = (int) timeUnit.toMillis(30L);
            f473c = (int) timeUnit.toMillis(80L);
        }

        private a() {
        }
    }

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f474a = new a();

            private a() {
            }

            @Override // B2.l.b
            public HttpsURLConnection a(G request, InterfaceC2072n callback) {
                AbstractC3292y.i(request, "request");
                AbstractC3292y.i(callback, "callback");
                URLConnection openConnection = new URL(request.f()).openConnection();
                AbstractC3292y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                callback.invoke(httpsURLConnection, request);
                return httpsURLConnection;
            }
        }

        HttpsURLConnection a(G g8, InterfaceC2072n interfaceC2072n);
    }

    /* loaded from: classes4.dex */
    public static final class c implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f475a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static volatile b f476b = b.a.f474a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f477a = new a();

            a() {
                super(2);
            }

            public final void a(HttpURLConnection open, G request) {
                AbstractC3292y.i(open, "$this$open");
                AbstractC3292y.i(request, "request");
                open.setConnectTimeout(a.f472b);
                open.setReadTimeout(a.f473c);
                open.setUseCaches(request.e());
                open.setRequestMethod(request.b().b());
                for (Map.Entry entry : request.a().entrySet()) {
                    open.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (G.a.f393c == request.b()) {
                    open.setDoOutput(true);
                    Map c8 = request.c();
                    if (c8 != null) {
                        for (Map.Entry entry2 : c8.entrySet()) {
                            open.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    OutputStream outputStream = open.getOutputStream();
                    try {
                        AbstractC3292y.f(outputStream);
                        request.g(outputStream);
                        I i8 = I.f8786a;
                        AbstractC1677b.a(outputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1677b.a(outputStream, th);
                            throw th2;
                        }
                    }
                }
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((HttpURLConnection) obj, (G) obj2);
                return I.f8786a;
            }
        }

        private c() {
        }

        private final HttpsURLConnection b(G g8) {
            return f476b.a(g8, a.f477a);
        }

        @Override // B2.l
        public /* synthetic */ E a(G request) {
            AbstractC3292y.i(request, "request");
            return new E.b(b(request));
        }
    }

    E a(G g8);
}
