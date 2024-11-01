package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class AdData {
    private final String metadata;
    private final Uri renderUri;

    public AdData(Uri renderUri, String metadata) {
        AbstractC3292y.i(renderUri, "renderUri");
        AbstractC3292y.i(metadata, "metadata");
        this.renderUri = renderUri;
        this.metadata = metadata;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        if (AbstractC3292y.d(this.renderUri, adData.renderUri) && AbstractC3292y.d(this.metadata, adData.metadata)) {
            return true;
        }
        return false;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return (this.renderUri.hashCode() * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + '\'';
    }
}
