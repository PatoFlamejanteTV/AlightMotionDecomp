package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface MarqueeSpacing {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @ExperimentalFoundationApi
        public final MarqueeSpacing fractionOfContainer(final float f8) {
            return new MarqueeSpacing() { // from class: androidx.compose.foundation.MarqueeSpacing$Companion$fractionOfContainer$1
                @Override // androidx.compose.foundation.MarqueeSpacing
                public final int calculateSpacing(Density MarqueeSpacing, int i8, int i9) {
                    AbstractC3292y.i(MarqueeSpacing, "$this$MarqueeSpacing");
                    return AbstractC2829a.d(f8 * i9);
                }
            };
        }
    }

    @ExperimentalFoundationApi
    int calculateSpacing(Density density, int i8, int i9);
}
