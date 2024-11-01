package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ReportImpressionRequest {
    private final AdSelectionConfig adSelectionConfig;
    private final long adSelectionId;

    public ReportImpressionRequest(long j8, AdSelectionConfig adSelectionConfig) {
        AbstractC3292y.i(adSelectionConfig, "adSelectionConfig");
        this.adSelectionId = j8;
        this.adSelectionConfig = adSelectionConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportImpressionRequest)) {
            return false;
        }
        ReportImpressionRequest reportImpressionRequest = (ReportImpressionRequest) obj;
        if (this.adSelectionId == reportImpressionRequest.adSelectionId && AbstractC3292y.d(this.adSelectionConfig, reportImpressionRequest.adSelectionConfig)) {
            return true;
        }
        return false;
    }

    public final AdSelectionConfig getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.adSelectionId) * 31) + this.adSelectionConfig.hashCode();
    }

    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }
}
