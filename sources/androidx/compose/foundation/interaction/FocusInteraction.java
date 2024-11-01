package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface FocusInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Focus implements FocusInteraction {
        public static final int $stable = 0;
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Unfocus implements FocusInteraction {
        public static final int $stable = 0;
        private final Focus focus;

        public Unfocus(Focus focus) {
            AbstractC3292y.i(focus, "focus");
            this.focus = focus;
        }

        public final Focus getFocus() {
            return this.focus;
        }
    }
}
