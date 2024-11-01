package a4;

import O1.m;
import O1.w;
import V1.b;
import e2.C2787a;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1673g f14119a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1670d f14120b;

    private h(InterfaceC1673g interfaceC1673g, InterfaceC1670d interfaceC1670d) {
        this.f14119a = interfaceC1673g;
        this.f14120b = interfaceC1670d;
    }

    public final String a(String payload, ECPublicKey acsPublicKey, String directoryServerId) {
        AbstractC3292y.i(payload, "payload");
        AbstractC3292y.i(acsPublicKey, "acsPublicKey");
        AbstractC3292y.i(directoryServerId, "directoryServerId");
        C2787a.e(payload);
        KeyPair a9 = this.f14119a.a();
        InterfaceC1670d interfaceC1670d = this.f14120b;
        PrivateKey privateKey = a9.getPrivate();
        AbstractC3292y.g(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        SecretKey s8 = interfaceC1670d.s(acsPublicKey, (ECPrivateKey) privateKey, directoryServerId);
        V1.a aVar = V1.a.f10414d;
        PublicKey publicKey = a9.getPublic();
        AbstractC3292y.g(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        O1.n nVar = new O1.n(new m.a(O1.i.f6974l, O1.d.f6943e).i(V1.b.x(new b.a(aVar, (ECPublicKey) publicKey).a().o())).d(), new w(payload));
        nVar.g(new P1.b(s8));
        String t8 = nVar.t();
        AbstractC3292y.h(t8, "serialize(...)");
        return t8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC1673g ephemeralKeyPairGenerator, Z3.c errorReporter) {
        this(ephemeralKeyPairGenerator, new m(errorReporter));
        AbstractC3292y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3292y.i(errorReporter, "errorReporter");
    }
}
