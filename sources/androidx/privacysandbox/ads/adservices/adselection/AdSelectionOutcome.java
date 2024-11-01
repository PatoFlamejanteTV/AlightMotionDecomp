package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class AdSelectionOutcome {
    private final long adSelectionId;
    private final Uri renderUri;

    public AdSelectionOutcome(long j8, Uri renderUri) {
        AbstractC3292y.i(renderUri, "renderUri");
        this.adSelectionId = j8;
        this.renderUri = renderUri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        if (this.adSelectionId == adSelectionOutcome.adSelectionId && AbstractC3292y.d(this.renderUri, adSelectionOutcome.renderUri)) {
            return true;
        }
        return false;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.adSelectionId) * 31) + this.renderUri.hashCode();
    }

    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }
}
