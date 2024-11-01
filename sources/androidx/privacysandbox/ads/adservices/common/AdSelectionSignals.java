package androidx.privacysandbox.ads.adservices.common;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class AdSelectionSignals {
    private final String signals;

    public AdSelectionSignals(String signals) {
        AbstractC3292y.i(signals, "signals");
        this.signals = signals;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionSignals)) {
            return false;
        }
        return AbstractC3292y.d(this.signals, ((AdSelectionSignals) obj).signals);
    }

    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    public String toString() {
        return "AdSelectionSignals: " + this.signals;
    }
}
