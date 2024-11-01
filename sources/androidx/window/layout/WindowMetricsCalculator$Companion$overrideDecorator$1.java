package androidx.window.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;

/* loaded from: classes3.dex */
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends C3289v implements Function1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator p02) {
        AbstractC3292y.i(p02, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p02);
    }
}
