package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavOptionsBuilderKt {
    public static final NavOptions navOptions(Function1 optionsBuilder) {
        AbstractC3292y.i(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        return navOptionsBuilder.build$navigation_common_release();
    }
}
