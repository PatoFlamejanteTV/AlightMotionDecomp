package a4;

import Q5.s;
import Q5.t;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: a4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1672f {

    /* renamed from: a, reason: collision with root package name */
    private final Z3.c f14117a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyFactory f14118b;

    public C1672f(Z3.c errorReporter) {
        Object b9;
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f14117a = errorReporter;
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(KeyFactory.getInstance("EC"));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 != null) {
            this.f14117a.l(e8);
        }
        Throwable e9 = s.e(b9);
        if (e9 == null) {
            AbstractC3292y.h(b9, "getOrElse(...)");
            this.f14118b = (KeyFactory) b9;
            return;
        }
        throw new W3.b(e9);
    }

    public final ECPrivateKey a(byte[] privateKeyEncoded) {
        Object b9;
        AbstractC3292y.i(privateKeyEncoded, "privateKeyEncoded");
        try {
            s.a aVar = s.f8810b;
            PrivateKey generatePrivate = this.f14118b.generatePrivate(new PKCS8EncodedKeySpec(privateKeyEncoded));
            AbstractC3292y.g(generatePrivate, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            b9 = s.b((ECPrivateKey) generatePrivate);
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 == null) {
            return (ECPrivateKey) b9;
        }
        throw new W3.b(e8);
    }

    public final ECPublicKey b(byte[] publicKeyEncoded) {
        Object b9;
        AbstractC3292y.i(publicKeyEncoded, "publicKeyEncoded");
        try {
            s.a aVar = s.f8810b;
            PublicKey generatePublic = this.f14118b.generatePublic(new X509EncodedKeySpec(publicKeyEncoded));
            AbstractC3292y.g(generatePublic, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            b9 = s.b((ECPublicKey) generatePublic);
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 != null) {
            this.f14117a.l(e8);
        }
        Throwable e9 = s.e(b9);
        if (e9 == null) {
            return (ECPublicKey) b9;
        }
        throw new W3.b(e9);
    }
}
