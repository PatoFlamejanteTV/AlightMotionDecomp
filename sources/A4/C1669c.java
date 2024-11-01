package a4;

import O1.m;
import O1.w;
import Q5.s;
import Q5.t;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import org.json.JSONObject;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1669c implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14097d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final O1.d f14098e = O1.d.f6943e;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14099a;

    /* renamed from: b, reason: collision with root package name */
    private byte f14100b;

    /* renamed from: c, reason: collision with root package name */
    private byte f14101c;

    /* renamed from: a4.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1669c(boolean z8, byte b9, byte b10) {
        this.f14099a = z8;
        this.f14100b = b9;
        this.f14101c = b10;
    }

    @Override // a4.k
    public JSONObject I(String message, SecretKey secretKey) {
        AbstractC3292y.i(message, "message");
        AbstractC3292y.i(secretKey, "secretKey");
        JSONObject b9 = b(message, secretKey);
        e(b9);
        byte b10 = (byte) (this.f14101c + 1);
        this.f14101c = b10;
        if (b10 != 0) {
            return b9;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero".toString());
    }

    @Override // a4.k
    public String U(JSONObject challengeRequest, SecretKey secretKey) {
        AbstractC3292y.i(challengeRequest, "challengeRequest");
        AbstractC3292y.i(secretKey, "secretKey");
        String string = challengeRequest.getString("acsTransID");
        AbstractC3292y.h(string, "getString(...)");
        O1.m a9 = a(string);
        Y y8 = Y.f34578a;
        String format = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.f14100b)}, 1));
        AbstractC3292y.h(format, "format(locale, format, *args)");
        challengeRequest.put("sdkCounterStoA", format);
        O1.n nVar = new O1.n(a9, new w(challengeRequest.toString()));
        O1.d v8 = a9.v();
        AbstractC3292y.h(v8, "getEncryptionMethod(...)");
        nVar.g(new o(d(secretKey, v8), this.f14100b));
        byte b9 = (byte) (this.f14100b + 1);
        this.f14100b = b9;
        if (b9 != 0) {
            String t8 = nVar.t();
            AbstractC3292y.h(t8, "serialize(...)");
            return t8;
        }
        throw new IllegalArgumentException("SDK to ACS counter is zero".toString());
    }

    public final O1.m a(String keyId) {
        AbstractC3292y.i(keyId, "keyId");
        O1.m d8 = new m.a(O1.i.f6974l, f14098e).m(keyId).d();
        AbstractC3292y.h(d8, "build(...)");
        return d8;
    }

    public final JSONObject b(String message, SecretKey secretKey) {
        AbstractC3292y.i(message, "message");
        AbstractC3292y.i(secretKey, "secretKey");
        O1.n r8 = O1.n.r(message);
        O1.d v8 = r8.p().v();
        AbstractC3292y.h(v8, "getEncryptionMethod(...)");
        r8.f(new P1.a(c(secretKey, v8)));
        return new JSONObject(r8.b().toString());
    }

    public final byte[] c(SecretKey secretKey, O1.d encryptionMethod) {
        AbstractC3292y.i(secretKey, "secretKey");
        AbstractC3292y.i(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        O1.d dVar = O1.d.f6948j;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, encoded.length - (dVar.c() / 8), encoded.length);
            AbstractC3292y.f(copyOfRange);
            return copyOfRange;
        }
        AbstractC3292y.f(encoded);
        return encoded;
    }

    public final byte[] d(SecretKey secretKey, O1.d encryptionMethod) {
        AbstractC3292y.i(secretKey, "secretKey");
        AbstractC3292y.i(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        O1.d dVar = O1.d.f6948j;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, dVar.c() / 8);
            AbstractC3292y.f(copyOfRange);
            return copyOfRange;
        }
        AbstractC3292y.f(encoded);
        return encoded;
    }

    public final void e(JSONObject cres) {
        Object b9;
        AbstractC3292y.i(cres, "cres");
        if (!this.f14099a) {
            return;
        }
        if (cres.has("acsCounterAtoS")) {
            try {
                s.a aVar = s.f8810b;
                String string = cres.getString("acsCounterAtoS");
                AbstractC3292y.h(string, "getString(...)");
                b9 = s.b(Byte.valueOf(Byte.parseByte(string)));
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            if (s.e(b9) == null) {
                byte byteValue = ((Number) b9).byteValue();
                if (this.f14101c == byteValue) {
                    return;
                }
                throw new d4.c(d4.f.f31443i, "Counters are not equal. SDK counter: " + ((int) this.f14101c) + ", ACS counter: " + ((int) byteValue));
            }
            throw d4.c.f31408d.a("acsCounterAtoS");
        }
        throw d4.c.f31408d.b("acsCounterAtoS");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1669c)) {
            return false;
        }
        C1669c c1669c = (C1669c) obj;
        if (this.f14099a == c1669c.f14099a && this.f14100b == c1669c.f14100b && this.f14101c == c1669c.f14101c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z8 = this.f14099a;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return (((r02 * 31) + this.f14100b) * 31) + this.f14101c;
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.f14099a + ", counterSdkToAcs=" + ((int) this.f14100b) + ", counterAcsToSdk=" + ((int) this.f14101c) + ")";
    }

    public C1669c(boolean z8) {
        this(z8, (byte) 0, (byte) 0);
    }
}
