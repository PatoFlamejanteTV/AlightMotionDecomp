package c4;

import a4.InterfaceC1673g;
import java.security.PublicKey;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    private final d f15511a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1673g f15512b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15513c;

    public i(d areqParamsFactory, InterfaceC1673g ephemeralKeyPairGenerator, String sdkReferenceNumber) {
        AbstractC3292y.i(areqParamsFactory, "areqParamsFactory");
        AbstractC3292y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        this.f15511a = areqParamsFactory;
        this.f15512b = ephemeralKeyPairGenerator;
        this.f15513c = sdkReferenceNumber;
    }

    @Override // c4.t
    public s a(String directoryServerId, List rootCerts, PublicKey directoryServerPublicKey, String str, q sdkTransactionId, boolean z8, com.stripe.android.stripe3ds2.views.a brand) {
        AbstractC3292y.i(directoryServerId, "directoryServerId");
        AbstractC3292y.i(rootCerts, "rootCerts");
        AbstractC3292y.i(directoryServerPublicKey, "directoryServerPublicKey");
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3292y.i(brand, "brand");
        return new r(this.f15511a, directoryServerId, directoryServerPublicKey, str, sdkTransactionId, this.f15512b.a(), this.f15513c);
    }
}
