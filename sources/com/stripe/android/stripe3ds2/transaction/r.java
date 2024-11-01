package com.stripe.android.stripe3ds2.transaction;

import Q5.I;
import Q5.s;
import Q5.t;
import a6.AbstractC1677b;
import a6.AbstractC1684i;
import androidx.browser.trusted.sharing.ShareTarget;
import c6.InterfaceC2072n;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;
import n6.AbstractC3458i;
import n6.M;

/* loaded from: classes4.dex */
public final class r implements c4.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f28172a;

    /* renamed from: b, reason: collision with root package name */
    private final a f28173b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3.c f28174c;

    /* renamed from: d, reason: collision with root package name */
    private final U5.g f28175d;

    /* loaded from: classes4.dex */
    public interface a {
        HttpURLConnection a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements a {
        @Override // com.stripe.android.stripe3ds2.transaction.r.a
        public HttpURLConnection a(String url) {
            AbstractC3292y.i(url, "url");
            URLConnection openConnection = new URL(url).openConnection();
            AbstractC3292y.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) openConnection;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28176a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28177b;

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            c cVar = new c(dVar);
            cVar.f28177b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            InputStream inputStream;
            V5.b.e();
            if (this.f28176a == 0) {
                t.b(obj);
                r rVar = r.this;
                try {
                    s.a aVar = s.f8810b;
                    HttpURLConnection f8 = rVar.f();
                    f8.connect();
                    if (f8.getResponseCode() == 200) {
                        inputStream = f8.getInputStream();
                    } else {
                        inputStream = null;
                    }
                    b9 = s.b(inputStream);
                } catch (Throwable th) {
                    s.a aVar2 = s.f8810b;
                    b9 = s.b(t.a(th));
                }
                r rVar2 = r.this;
                Throwable e8 = s.e(b9);
                if (e8 != null) {
                    rVar2.f28174c.l(e8);
                }
                if (s.g(b9)) {
                    return null;
                }
                return b9;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28179a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28180b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28182d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28183e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, U5.d dVar) {
            super(2, dVar);
            this.f28182d = str;
            this.f28183e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(this.f28182d, this.f28183e, dVar);
            dVar2.f28180b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            V5.b.e();
            if (this.f28179a == 0) {
                t.b(obj);
                r rVar = r.this;
                String str = this.f28182d;
                String str2 = this.f28183e;
                try {
                    s.a aVar = s.f8810b;
                    b9 = s.b(rVar.i(str, str2));
                } catch (Throwable th) {
                    s.a aVar2 = s.f8810b;
                    b9 = s.b(t.a(th));
                }
                r rVar2 = r.this;
                Throwable e8 = s.e(b9);
                if (e8 != null) {
                    rVar2.f28174c.l(e8);
                }
                Throwable e9 = s.e(b9);
                if (e9 == null) {
                    return b9;
                }
                throw new W3.b(e9);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public r(String url, a connectionFactory, Z3.c errorReporter, U5.g workContext) {
        AbstractC3292y.i(url, "url");
        AbstractC3292y.i(connectionFactory, "connectionFactory");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        this.f28172a = url;
        this.f28173b = connectionFactory;
        this.f28174c = errorReporter;
        this.f28175d = workContext;
    }

    private final HttpURLConnection e() {
        return this.f28173b.a(this.f28172a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpURLConnection f() {
        HttpURLConnection e8 = e();
        e8.setDoInput(true);
        return e8;
    }

    private final HttpURLConnection g(String str, String str2) {
        HttpURLConnection e8 = e();
        e8.setRequestMethod(ShareTarget.METHOD_POST);
        e8.setDoOutput(true);
        e8.setRequestProperty("Content-Type", str2);
        e8.setRequestProperty("Content-Length", String.valueOf(str.length()));
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c4.l i(String str, String str2) {
        HttpURLConnection g8 = g(str, str2);
        OutputStream outputStream = g8.getOutputStream();
        try {
            AbstractC3292y.f(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC3292y.h(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.flush();
                I i8 = I.f8786a;
                AbstractC1677b.a(outputStreamWriter, null);
                AbstractC1677b.a(outputStream, null);
                g8.connect();
                return k(g8);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1677b.a(outputStream, th);
                throw th2;
            }
        }
    }

    private final String j(InputStream inputStream) {
        Object b9;
        Object obj = null;
        try {
            s.a aVar = s.f8810b;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C3338d.f34755b), 8192);
            try {
                String f8 = AbstractC1684i.f(bufferedReader);
                AbstractC1677b.a(bufferedReader, null);
                b9 = s.b(f8);
            } finally {
            }
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        if (!s.g(b9)) {
            obj = b9;
        }
        String str = (String) obj;
        if (str == null) {
            return "";
        }
        return str;
    }

    private final boolean l(int i8) {
        return 200 <= i8 && i8 < 300;
    }

    @Override // c4.k
    public Object a(String str, String str2, U5.d dVar) {
        return AbstractC3458i.g(this.f28175d, new d(str, str2, null), dVar);
    }

    public Object h(U5.d dVar) {
        return AbstractC3458i.g(this.f28175d, new c(null), dVar);
    }

    public final c4.l k(HttpURLConnection conn) {
        AbstractC3292y.i(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (l(responseCode)) {
            InputStream inputStream = conn.getInputStream();
            AbstractC3292y.h(inputStream, "getInputStream(...)");
            return new c4.l(j(inputStream), conn.getContentType());
        }
        throw new W3.b("Unsuccessful response code from " + this.f28172a + ": " + responseCode, null, 2, null);
    }

    public /* synthetic */ r(String str, a aVar, Z3.c cVar, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? new b() : aVar, cVar, gVar);
    }
}
