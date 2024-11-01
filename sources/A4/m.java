package a4;

import Q5.s;
import Q5.t;
import S1.p;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class m implements InterfaceC1670d {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14123b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Z3.c f14124a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public m(Z3.c errorReporter) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f14124a = errorReporter;
    }

    @Override // a4.InterfaceC1670d
    public SecretKey s(ECPublicKey acsPublicKey, ECPrivateKey sdkPrivateKey, String agreementInfo) {
        Object b9;
        AbstractC3292y.i(acsPublicKey, "acsPublicKey");
        AbstractC3292y.i(sdkPrivateKey, "sdkPrivateKey");
        AbstractC3292y.i(agreementInfo, "agreementInfo");
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(new S1.k("SHA-256").j(p.a(acsPublicKey, sdkPrivateKey, null), 256, S1.k.o(null), S1.k.k(null), S1.k.k(d2.c.d(agreementInfo)), S1.k.m(256), S1.k.n()));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 != null) {
            this.f14124a.l(e8);
        }
        Throwable e9 = s.e(b9);
        if (e9 == null) {
            AbstractC3292y.h(b9, "getOrElse(...)");
            return (SecretKey) b9;
        }
        throw new W3.b(e9);
    }
}
