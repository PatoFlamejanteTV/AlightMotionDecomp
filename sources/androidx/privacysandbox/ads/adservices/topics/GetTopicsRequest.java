package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class GetTopicsRequest {
    private final String adsSdkName;
    private final boolean shouldRecordObservation;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        public final GetTopicsRequest build() {
            if (this.adsSdkName.length() > 0) {
                return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final Builder setAdsSdkName(String adsSdkName) {
            AbstractC3292y.i(adsSdkName, "adsSdkName");
            this.adsSdkName = adsSdkName;
            return this;
        }

        public final Builder setShouldRecordObservation(boolean z8) {
            this.shouldRecordObservation = z8;
            return this;
        }
    }

    public GetTopicsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        if (AbstractC3292y.d(this.adsSdkName, getTopicsRequest.adsSdkName) && this.shouldRecordObservation == getTopicsRequest.shouldRecordObservation) {
            return true;
        }
        return false;
    }

    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + androidx.compose.foundation.a.a(this.shouldRecordObservation);
    }

    public final boolean shouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public GetTopicsRequest(String adsSdkName, boolean z8) {
        AbstractC3292y.i(adsSdkName, "adsSdkName");
        this.adsSdkName = adsSdkName;
        this.shouldRecordObservation = z8;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? false : z8);
    }
}
