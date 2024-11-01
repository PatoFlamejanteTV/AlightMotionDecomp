package androidx.window.layout;

import R5.AbstractC1435t;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public WindowLayoutInfo(List<? extends DisplayFeature> displayFeatures) {
        AbstractC3292y.i(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC3292y.d(WindowLayoutInfo.class, obj.getClass())) {
            return AbstractC3292y.d(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
        }
        return false;
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return AbstractC1435t.w0(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
