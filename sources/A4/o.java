package a4;

import O1.u;
import S1.AbstractC1442a;
import S1.AbstractC1443b;
import S1.AbstractC1444c;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class o extends P1.b {

    /* renamed from: g, reason: collision with root package name */
    private final byte f14128g;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14129a = new a();

        private a() {
        }

        private final byte[] a(int i8, byte b9, byte b10) {
            int i9 = i8 / 8;
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, b9);
            bArr[i9 - 1] = b10;
            return bArr;
        }

        public final byte[] b(int i8, byte b9) {
            return a(i8, (byte) 0, b9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(byte[] key, byte b9) {
        super(new SecretKeySpec(key, "AES"));
        AbstractC3292y.i(key, "key");
        this.f14128g = b9;
    }

    @Override // P1.b, O1.l
    public O1.j a(O1.m header, byte[] clearText) {
        byte[] b9;
        S1.f d8;
        AbstractC3292y.i(header, "header");
        AbstractC3292y.i(clearText, "clearText");
        O1.i t8 = header.t();
        if (AbstractC3292y.d(t8, O1.i.f6974l)) {
            O1.d v8 = header.v();
            if (v8.c() == d2.e.b(i().getEncoded())) {
                if (v8.c() == d2.e.b(i().getEncoded())) {
                    byte[] a9 = S1.n.a(header, clearText);
                    byte[] a10 = AbstractC1442a.a(header);
                    if (AbstractC3292y.d(header.v(), O1.d.f6943e)) {
                        b9 = a.f14129a.b(128, this.f14128g);
                        d8 = AbstractC1443b.f(i(), b9, a9, a10, g().d(), g().f());
                        AbstractC3292y.h(d8, "encryptAuthenticated(...)");
                    } else if (AbstractC3292y.d(header.v(), O1.d.f6948j)) {
                        b9 = a.f14129a.b(96, this.f14128g);
                        d8 = AbstractC1444c.d(i(), new d2.f(b9), a9, a10, null);
                        AbstractC3292y.h(d8, "encrypt(...)");
                    } else {
                        throw new O1.f(S1.e.b(header.v(), S1.o.f9389f));
                    }
                    return new O1.j(header, null, d2.c.e(b9), d2.c.e(d8.b()), d2.c.e(d8.a()));
                }
                throw new u("The Content Encryption Key length for " + v8 + " must be " + v8.c() + " bits");
            }
            throw new u(v8.c(), v8);
        }
        throw new O1.f("Invalid algorithm " + t8);
    }
}
