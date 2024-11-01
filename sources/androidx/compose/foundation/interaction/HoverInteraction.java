package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface HoverInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Enter implements HoverInteraction {
        public static final int $stable = 0;
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Exit implements HoverInteraction {
        public static final int $stable = 0;
        private final Enter enter;

        public Exit(Enter enter) {
            AbstractC3292y.i(enter, "enter");
            this.enter = enter;
        }

        public final Enter getEnter() {
            return this.enter;
        }
    }
}
