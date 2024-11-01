package a4;

import Q5.s;
import Q5.t;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1668b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final j f14094a;

    /* renamed from: b, reason: collision with root package name */
    private final h f14095b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3.c f14096c;

    private C1668b(j jVar, h hVar, Z3.c cVar) {
        this.f14094a = jVar;
        this.f14095b = hVar;
        this.f14096c = cVar;
    }

    @Override // a4.i
    public String a(String payload, PublicKey acsPublicKey, String directoryServerId, String str) {
        Object b9;
        AbstractC3292y.i(payload, "payload");
        AbstractC3292y.i(acsPublicKey, "acsPublicKey");
        AbstractC3292y.i(directoryServerId, "directoryServerId");
        if (acsPublicKey instanceof RSAPublicKey) {
            s.a aVar = s.f8810b;
            b9 = s.b(this.f14094a.b(payload, (RSAPublicKey) acsPublicKey, str));
        } else if (acsPublicKey instanceof ECPublicKey) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(this.f14095b.a(payload, (ECPublicKey) acsPublicKey, directoryServerId));
        } else {
            s.a aVar3 = s.f8810b;
            b9 = s.b(t.a(new W3.b("Unsupported public key algorithm: " + acsPublicKey.getAlgorithm(), null, 2, null)));
        }
        Throwable e8 = s.e(b9);
        if (e8 != null) {
            this.f14096c.l(e8);
        }
        t.b(b9);
        return (String) b9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1668b(InterfaceC1673g ephemeralKeyPairGenerator, Z3.c errorReporter) {
        this(new j(), new h(ephemeralKeyPairGenerator, errorReporter), errorReporter);
        AbstractC3292y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3292y.i(errorReporter, "errorReporter");
    }
}
