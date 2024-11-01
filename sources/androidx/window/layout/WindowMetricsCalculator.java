package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Function1 decorator = WindowMetricsCalculator$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator) decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void overrideDecorator(WindowMetricsCalculatorDecorator overridingDecorator) {
            AbstractC3292y.i(overridingDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(overridingDecorator);
        }

        @ExperimentalWindowApi
        @RestrictTo({RestrictTo.Scope.TESTS})
        public final void reset() {
            decorator = WindowMetricsCalculator$Companion$reset$1.INSTANCE;
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);
}
