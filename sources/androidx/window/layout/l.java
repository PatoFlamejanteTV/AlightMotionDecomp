package androidx.window.layout;

import androidx.window.layout.WindowMetricsCalculator;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class l {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
    }

    public static WindowMetricsCalculator a() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    public static void b(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    public static void c() {
        WindowMetricsCalculator.Companion.reset();
    }
}
