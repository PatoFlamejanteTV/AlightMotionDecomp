package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class JoinCustomAudienceRequest {
    private final CustomAudience customAudience;

    public JoinCustomAudienceRequest(CustomAudience customAudience) {
        AbstractC3292y.i(customAudience, "customAudience");
        this.customAudience = customAudience;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinCustomAudienceRequest)) {
            return false;
        }
        return AbstractC3292y.d(this.customAudience, ((JoinCustomAudienceRequest) obj).customAudience);
    }

    public final CustomAudience getCustomAudience() {
        return this.customAudience;
    }

    public int hashCode() {
        return this.customAudience.hashCode();
    }

    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.customAudience;
    }
}
