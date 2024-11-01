package c4;

import Q5.s;
import R5.Q;
import java.security.interfaces.ECPublicKey;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f implements InterfaceC2030b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f15486b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Z3.c f15487a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public f(Z3.c errorReporter) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f15487a = errorReporter;
    }

    private final ECPublicKey b(Object obj) {
        String str;
        V1.b x8;
        if (obj instanceof Map) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            x8 = V1.b.y((Map) obj);
        } else {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            x8 = V1.b.x(str);
        }
        ECPublicKey z8 = x8.z();
        AbstractC3292y.h(z8, "toECPublicKey(...)");
        return z8;
    }

    @Override // c4.InterfaceC2030b
    public C2029a a(JSONObject payloadJson) {
        Object b9;
        AbstractC3292y.i(payloadJson, "payloadJson");
        try {
            s.a aVar = Q5.s.f8810b;
            Map m8 = d2.k.m(payloadJson.toString());
            AbstractC3292y.h(m8, "parse(...)");
            Map w8 = Q.w(m8);
            b9 = Q5.s.b(new C2029a(String.valueOf(w8.get("acsURL")), b(w8.get("acsEphemPubKey")), b(w8.get("sdkEphemPubKey"))));
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        Throwable e8 = Q5.s.e(b9);
        if (e8 != null) {
            this.f15487a.l(new IllegalArgumentException("Failed to parse ACS data: " + payloadJson, e8));
        }
        Q5.t.b(b9);
        return (C2029a) b9;
    }
}
