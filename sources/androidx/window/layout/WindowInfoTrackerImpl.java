package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        AbstractC3292y.i(windowMetricsCalculator, "windowMetricsCalculator");
        AbstractC3292y.i(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC3821f windowLayoutInfo(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        return AbstractC3823h.z(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}
