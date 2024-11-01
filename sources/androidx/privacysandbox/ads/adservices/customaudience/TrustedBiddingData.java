package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class TrustedBiddingData {
    private final List<String> trustedBiddingKeys;
    private final Uri trustedBiddingUri;

    public TrustedBiddingData(Uri trustedBiddingUri, List<String> trustedBiddingKeys) {
        AbstractC3292y.i(trustedBiddingUri, "trustedBiddingUri");
        AbstractC3292y.i(trustedBiddingKeys, "trustedBiddingKeys");
        this.trustedBiddingUri = trustedBiddingUri;
        this.trustedBiddingKeys = trustedBiddingKeys;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedBiddingData)) {
            return false;
        }
        TrustedBiddingData trustedBiddingData = (TrustedBiddingData) obj;
        if (AbstractC3292y.d(this.trustedBiddingUri, trustedBiddingData.trustedBiddingUri) && AbstractC3292y.d(this.trustedBiddingKeys, trustedBiddingData.trustedBiddingKeys)) {
            return true;
        }
        return false;
    }

    public final List<String> getTrustedBiddingKeys() {
        return this.trustedBiddingKeys;
    }

    public final Uri getTrustedBiddingUri() {
        return this.trustedBiddingUri;
    }

    public int hashCode() {
        return (this.trustedBiddingUri.hashCode() * 31) + this.trustedBiddingKeys.hashCode();
    }

    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.trustedBiddingUri + " trustedBiddingKeys=" + this.trustedBiddingKeys;
    }
}
