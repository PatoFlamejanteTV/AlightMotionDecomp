package a4;

import Q5.s;
import Q5.t;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class n implements InterfaceC1673g {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14125b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f14126c = EnumC1667a.f14089b.toString();

    /* renamed from: a, reason: collision with root package name */
    private final Z3.c f14127a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public n(Z3.c errorReporter) {
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f14127a = errorReporter;
    }

    @Override // a4.InterfaceC1673g
    public KeyPair a() {
        Object b9;
        try {
            s.a aVar = s.f8810b;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f14126c);
            keyPairGenerator.initialize(new ECGenParameterSpec(V1.a.f10414d.d()));
            b9 = s.b(keyPairGenerator.generateKeyPair());
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b9);
        if (e8 != null) {
            this.f14127a.l(e8);
        }
        Throwable e9 = s.e(b9);
        if (e9 == null) {
            AbstractC3292y.h(b9, "getOrElse(...)");
            return (KeyPair) b9;
        }
        throw new W3.b(e9);
    }
}
