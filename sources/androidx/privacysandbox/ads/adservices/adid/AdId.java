package androidx.privacysandbox.ads.adservices.adid;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class AdId {
    private final String adId;
    private final boolean isLimitAdTrackingEnabled;

    public AdId(String adId, boolean z8) {
        AbstractC3292y.i(adId, "adId");
        this.adId = adId;
        this.isLimitAdTrackingEnabled = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        if (AbstractC3292y.d(this.adId, adId.adId) && this.isLimitAdTrackingEnabled == adId.isLimitAdTrackingEnabled) {
            return true;
        }
        return false;
    }

    public final String getAdId() {
        return this.adId;
    }

    public int hashCode() {
        return (this.adId.hashCode() * 31) + androidx.compose.foundation.a.a(this.isLimitAdTrackingEnabled);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public String toString() {
        return "AdId: adId=" + this.adId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled;
    }

    public /* synthetic */ AdId(String str, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? false : z8);
    }
}
