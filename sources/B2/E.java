package B2;

import a6.AbstractC1677b;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface E extends Closeable {

    /* loaded from: classes4.dex */
    public static abstract class a implements E {

        /* renamed from: b, reason: collision with root package name */
        public static final C0008a f387b = new C0008a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final String f388c = StandardCharsets.UTF_8.name();

        /* renamed from: a, reason: collision with root package name */
        private final HttpsURLConnection f389a;

        /* renamed from: B2.E$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0008a {
            private C0008a() {
            }

            public final String a() {
                return a.f388c;
            }

            public /* synthetic */ C0008a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public a(HttpsURLConnection conn) {
            AbstractC3292y.i(conn, "conn");
            this.f389a = conn;
        }

        private final InputStream g() {
            int b9 = b();
            if (200 <= b9 && b9 < 300) {
                return this.f389a.getInputStream();
            }
            return this.f389a.getErrorStream();
        }

        @Override // B2.E
        public /* synthetic */ H A() {
            int b9 = b();
            Object C8 = C(g());
            Map<String, List<String>> headerFields = this.f389a.getHeaderFields();
            AbstractC3292y.h(headerFields, "getHeaderFields(...)");
            return new H(b9, C8, headerFields);
        }

        public /* synthetic */ int b() {
            return this.f389a.getResponseCode();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream g8 = g();
            if (g8 != null) {
                g8.close();
            }
            this.f389a.disconnect();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpsURLConnection conn) {
            super(conn);
            AbstractC3292y.i(conn, "conn");
        }

        @Override // B2.E
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String C(InputStream inputStream) {
            String str;
            if (inputStream == null) {
                return null;
            }
            try {
                Scanner useDelimiter = new Scanner(inputStream, a.f387b.a()).useDelimiter("\\A");
                if (useDelimiter.hasNext()) {
                    str = useDelimiter.next();
                } else {
                    str = null;
                }
                AbstractC1677b.a(inputStream, null);
                return str;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1677b.a(inputStream, th);
                    throw th2;
                }
            }
        }
    }

    H A();

    Object C(InputStream inputStream);
}
