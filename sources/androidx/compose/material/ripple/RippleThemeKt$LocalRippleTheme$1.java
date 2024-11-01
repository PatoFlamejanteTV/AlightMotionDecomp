package androidx.compose.material.ripple;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class RippleThemeKt$LocalRippleTheme$1 extends AbstractC3293z implements Function0 {
    public static final RippleThemeKt$LocalRippleTheme$1 INSTANCE = new RippleThemeKt$LocalRippleTheme$1();

    RippleThemeKt$LocalRippleTheme$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final RippleTheme invoke() {
        return DebugRippleTheme.INSTANCE;
    }
}
