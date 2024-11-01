package o1;

import Q5.I;
import Q5.t;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import c6.InterfaceC2072n;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import m1.C3352b;
import n6.AbstractC3458i;
import n6.M;
import org.json.JSONObject;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3514d implements InterfaceC3511a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f35860d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C3352b f35861a;

    /* renamed from: b, reason: collision with root package name */
    private final U5.g f35862b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35863c;

    /* renamed from: o1.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: o1.d$b */
    /* loaded from: classes4.dex */
    static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35864a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f35866c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f35867d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f35868e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, U5.d dVar) {
            super(2, dVar);
            this.f35866c = map;
            this.f35867d = interfaceC2072n;
            this.f35868e = interfaceC2072n2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f35866c, this.f35867d, this.f35868e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f35864a;
            try {
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        if (i8 == 3) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                    }
                } else {
                    t.b(obj);
                    URLConnection openConnection = C3514d.this.c().openConnection();
                    AbstractC3292y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f35866c.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        T t8 = new T();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            t8.f34573a = readLine;
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        InterfaceC2072n interfaceC2072n = this.f35867d;
                        this.f35864a = 1;
                        if (interfaceC2072n.invoke(jSONObject, this) == e8) {
                            return e8;
                        }
                    } else {
                        InterfaceC2072n interfaceC2072n2 = this.f35868e;
                        String str = "Bad response code: " + responseCode;
                        this.f35864a = 2;
                        if (interfaceC2072n2.invoke(str, this) == e8) {
                            return e8;
                        }
                    }
                }
            } catch (Exception e9) {
                InterfaceC2072n interfaceC2072n3 = this.f35868e;
                String message = e9.getMessage();
                if (message == null) {
                    message = e9.toString();
                }
                this.f35864a = 3;
                if (interfaceC2072n3.invoke(message, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public C3514d(C3352b appInfo, U5.g blockingDispatcher, String baseUrl) {
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(blockingDispatcher, "blockingDispatcher");
        AbstractC3292y.i(baseUrl, "baseUrl");
        this.f35861a = appInfo;
        this.f35862b = blockingDispatcher;
        this.f35863c = baseUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f35863c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f35861a.b()).appendPath("settings").appendQueryParameter("build_version", this.f35861a.a().a()).appendQueryParameter("display_version", this.f35861a.a().f()).build().toString());
    }

    @Override // o1.InterfaceC3511a
    public Object a(Map map, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, U5.d dVar) {
        Object g8 = AbstractC3458i.g(this.f35862b, new b(map, interfaceC2072n, interfaceC2072n2, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public /* synthetic */ C3514d(C3352b c3352b, U5.g gVar, String str, int i8, AbstractC3284p abstractC3284p) {
        this(c3352b, gVar, (i8 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
