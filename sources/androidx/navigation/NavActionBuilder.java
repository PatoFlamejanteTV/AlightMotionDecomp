package androidx.navigation;

import Q5.r;
import R5.Q;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@NavDestinationDsl
/* loaded from: classes3.dex */
public final class NavActionBuilder {
    private final Map<String, Object> defaultArguments = new LinkedHashMap();
    private int destinationId;
    private NavOptions navOptions;

    public final NavAction build$navigation_common_release() {
        Bundle bundleOf;
        int i8 = this.destinationId;
        NavOptions navOptions = this.navOptions;
        if (this.defaultArguments.isEmpty()) {
            bundleOf = null;
        } else {
            r[] rVarArr = (r[]) Q.D(this.defaultArguments).toArray(new r[0]);
            bundleOf = BundleKt.bundleOf((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        }
        return new NavAction(i8, navOptions, bundleOf);
    }

    public final Map<String, Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void navOptions(Function1 optionsBuilder) {
        AbstractC3292y.i(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.navOptions = navOptionsBuilder.build$navigation_common_release();
    }

    public final void setDestinationId(int i8) {
        this.destinationId = i8;
    }
}
