package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface DragInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Cancel implements DragInteraction {
        public static final int $stable = 0;
        private final Start start;

        public Cancel(Start start) {
            AbstractC3292y.i(start, "start");
            this.start = start;
        }

        public final Start getStart() {
            return this.start;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Start implements DragInteraction {
        public static final int $stable = 0;
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Stop implements DragInteraction {
        public static final int $stable = 0;
        private final Start start;

        public Stop(Start start) {
            AbstractC3292y.i(start, "start");
            this.start = start;
        }

        public final Start getStart() {
            return this.start;
        }
    }
}
