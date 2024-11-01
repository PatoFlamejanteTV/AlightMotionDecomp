package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    public static final int $stable = 0;
    private final String verbatim;

    public VerbatimTtsAnnotation(String str) {
        super(null);
        this.verbatim = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VerbatimTtsAnnotation) && AbstractC3292y.d(this.verbatim, ((VerbatimTtsAnnotation) obj).verbatim)) {
            return true;
        }
        return false;
    }

    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
    }
}
