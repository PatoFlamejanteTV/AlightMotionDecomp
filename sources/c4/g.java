package c4;

import Q5.I;
import Q5.s;
import R5.AbstractC1435t;
import V1.b;
import a4.C1668b;
import a4.EnumC1671e;
import a4.InterfaceC1673g;
import c6.InterfaceC2072n;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: j, reason: collision with root package name */
    public static final a f15488j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final X3.e f15489a;

    /* renamed from: b, reason: collision with root package name */
    private final X3.h f15490b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.m f15491c;

    /* renamed from: d, reason: collision with root package name */
    private final X3.b f15492d;

    /* renamed from: e, reason: collision with root package name */
    private final a4.i f15493e;

    /* renamed from: f, reason: collision with root package name */
    private final p f15494f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15495g;

    /* renamed from: h, reason: collision with root package name */
    private final Z3.c f15496h;

    /* renamed from: i, reason: collision with root package name */
    private final U5.g f15497i;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final V1.d a(PublicKey publicKey, String str, V1.h hVar) {
            AbstractC3292y.i(publicKey, "publicKey");
            b.a c8 = new b.a(V1.a.f10414d, (ECPublicKey) publicKey).c(hVar);
            if (str == null || l6.n.T(str)) {
                str = null;
            }
            V1.b B8 = c8.b(str).a().B();
            AbstractC3292y.h(B8, "toPublicJWK(...)");
            return B8;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f15498a;

        /* renamed from: b, reason: collision with root package name */
        int f15499b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f15500c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f15501d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f15502e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PublicKey f15503f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f15504g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f15505h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ PublicKey f15506i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, g gVar, PublicKey publicKey, String str, String str2, PublicKey publicKey2, U5.d dVar) {
            super(2, dVar);
            this.f15501d = qVar;
            this.f15502e = gVar;
            this.f15503f = publicKey;
            this.f15504g = str;
            this.f15505h = str2;
            this.f15506i = publicKey2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(this.f15501d, this.f15502e, this.f15503f, this.f15504g, this.f15505h, this.f15506i, dVar);
            bVar.f15500c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            String str;
            q qVar;
            Object e8 = V5.b.e();
            int i8 = this.f15499b;
            if (i8 != 0) {
                if (i8 == 1) {
                    q qVar2 = (q) this.f15498a;
                    str = (String) this.f15500c;
                    Q5.t.b(obj);
                    qVar = qVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                g gVar = this.f15502e;
                PublicKey publicKey = this.f15506i;
                String str2 = this.f15505h;
                String str3 = this.f15504g;
                try {
                    s.a aVar = Q5.s.f8810b;
                    b9 = Q5.s.b(gVar.f15493e.a(gVar.g(), publicKey, str2, str3));
                } catch (Throwable th) {
                    s.a aVar2 = Q5.s.f8810b;
                    b9 = Q5.s.b(Q5.t.a(th));
                }
                g gVar2 = this.f15502e;
                String str4 = this.f15505h;
                String str5 = this.f15504g;
                q qVar3 = this.f15501d;
                Throwable e9 = Q5.s.e(b9);
                if (e9 != null) {
                    gVar2.f15496h.l(new RuntimeException(l6.n.e("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=" + str4 + "\n                    keyId=" + str5 + "\n                    sdkTransactionId=" + qVar3 + "\n                    "), e9));
                }
                Throwable e10 = Q5.s.e(b9);
                if (e10 == null) {
                    str = (String) b9;
                    q qVar4 = this.f15501d;
                    X3.b bVar = this.f15502e.f15492d;
                    this.f15500c = str;
                    this.f15498a = qVar4;
                    this.f15499b = 1;
                    Object a9 = bVar.a(this);
                    if (a9 == e8) {
                        return e8;
                    }
                    qVar = qVar4;
                    obj = a9;
                } else {
                    throw new W3.b(e10);
                }
            }
            String a10 = ((X3.a) obj).a();
            String str6 = this.f15502e.f15495g;
            String o8 = g.f15488j.a(this.f15503f, this.f15504g, this.f15502e.h(this.f15505h)).o();
            AbstractC3292y.h(o8, "toJSONString(...)");
            return new c(str, qVar, a10, str6, o8, this.f15502e.f15494f.a());
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public g(X3.e deviceDataFactory, X3.h deviceParamNotAvailableFactory, X3.m securityChecker, X3.b appInfoRepository, a4.i jweEncrypter, p messageVersionRegistry, String sdkReferenceNumber, Z3.c errorReporter, U5.g workContext) {
        AbstractC3292y.i(deviceDataFactory, "deviceDataFactory");
        AbstractC3292y.i(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        AbstractC3292y.i(securityChecker, "securityChecker");
        AbstractC3292y.i(appInfoRepository, "appInfoRepository");
        AbstractC3292y.i(jweEncrypter, "jweEncrypter");
        AbstractC3292y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        this.f15489a = deviceDataFactory;
        this.f15490b = deviceParamNotAvailableFactory;
        this.f15491c = securityChecker;
        this.f15492d = appInfoRepository;
        this.f15493e = jweEncrypter;
        this.f15494f = messageVersionRegistry;
        this.f15495g = sdkReferenceNumber;
        this.f15496h = errorReporter;
        this.f15497i = workContext;
    }

    @Override // c4.d
    public Object a(String str, PublicKey publicKey, String str2, q qVar, PublicKey publicKey2, U5.d dVar) {
        return AbstractC3458i.g(this.f15497i, new b(qVar, this, publicKey2, str2, str, publicKey, null), dVar);
    }

    public final String g() {
        JSONObject put = new JSONObject().put("DV", "1.1").put("DD", new JSONObject(this.f15489a.a())).put("DPNA", new JSONObject(this.f15490b.a()));
        List a9 = this.f15491c.a();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(a9, 10));
        Iterator it = a9.iterator();
        while (it.hasNext()) {
            arrayList.add(((X3.n) it.next()).getId());
        }
        String jSONObject = put.put("SW", new JSONArray((Collection) arrayList)).toString();
        AbstractC3292y.h(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final V1.h h(String directoryServerId) {
        Object obj;
        AbstractC3292y.i(directoryServerId, "directoryServerId");
        Iterator<E> it = EnumC1671e.b().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((EnumC1671e) obj).c().contains(directoryServerId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC1671e enumC1671e = (EnumC1671e) obj;
        if (enumC1671e != null) {
            return enumC1671e.d();
        }
        return V1.h.f10477b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(X3.e deviceDataFactory, X3.h deviceParamNotAvailableFactory, X3.m securityChecker, InterfaceC1673g ephemeralKeyPairGenerator, X3.b appInfoRepository, p messageVersionRegistry, String sdkReferenceNumber, Z3.c errorReporter, U5.g workContext) {
        this(deviceDataFactory, deviceParamNotAvailableFactory, securityChecker, appInfoRepository, new C1668b(ephemeralKeyPairGenerator, errorReporter), messageVersionRegistry, sdkReferenceNumber, errorReporter, workContext);
        AbstractC3292y.i(deviceDataFactory, "deviceDataFactory");
        AbstractC3292y.i(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        AbstractC3292y.i(securityChecker, "securityChecker");
        AbstractC3292y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3292y.i(appInfoRepository, "appInfoRepository");
        AbstractC3292y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
    }
}
