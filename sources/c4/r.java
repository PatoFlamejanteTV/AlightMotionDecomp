package c4;

import java.security.KeyPair;
import java.security.PublicKey;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class r implements s {

    /* renamed from: h, reason: collision with root package name */
    public static final a f15534h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f15535a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15536b;

    /* renamed from: c, reason: collision with root package name */
    private final PublicKey f15537c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15538d;

    /* renamed from: e, reason: collision with root package name */
    private final q f15539e;

    /* renamed from: f, reason: collision with root package name */
    private final KeyPair f15540f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15541g;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public r(d areqParamsFactory, String directoryServerId, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, KeyPair sdkKeyPair, String sdkReferenceNumber) {
        AbstractC3292y.i(areqParamsFactory, "areqParamsFactory");
        AbstractC3292y.i(directoryServerId, "directoryServerId");
        AbstractC3292y.i(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3292y.i(sdkKeyPair, "sdkKeyPair");
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        this.f15535a = areqParamsFactory;
        this.f15536b = directoryServerId;
        this.f15537c = directoryServerPublicKey;
        this.f15538d = str;
        this.f15539e = sdkTransactionId;
        this.f15540f = sdkKeyPair;
        this.f15541g = sdkReferenceNumber;
    }

    @Override // c4.s
    public Object a(U5.d dVar) {
        d dVar2 = this.f15535a;
        String str = this.f15536b;
        PublicKey publicKey = this.f15537c;
        String str2 = this.f15538d;
        q c8 = c();
        PublicKey publicKey2 = this.f15540f.getPublic();
        AbstractC3292y.h(publicKey2, "getPublic(...)");
        return dVar2.a(str, publicKey, str2, c8, publicKey2, dVar);
    }

    @Override // c4.s
    public m b(e challengeParameters, int i8, com.stripe.android.stripe3ds2.transaction.n intentData) {
        AbstractC3292y.i(challengeParameters, "challengeParameters");
        AbstractC3292y.i(intentData, "intentData");
        return new m(this.f15541g, this.f15540f, challengeParameters, i6.m.d(i8, 5), intentData);
    }

    public q c() {
        return this.f15539e;
    }
}
