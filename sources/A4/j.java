package a4;

import O1.m;
import O1.w;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class j {
    public final O1.n a(String payload, String str) {
        AbstractC3292y.i(payload, "payload");
        return new O1.n(new m.a(O1.i.f6968f, O1.d.f6943e).m(str).d(), new w(payload));
    }

    public final String b(String payload, RSAPublicKey publicKey, String str) {
        AbstractC3292y.i(payload, "payload");
        AbstractC3292y.i(publicKey, "publicKey");
        O1.n a9 = a(payload, str);
        a9.g(new P1.e(publicKey));
        String t8 = a9.t();
        AbstractC3292y.h(t8, "serialize(...)");
        return t8;
    }
}
