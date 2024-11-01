package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    @RequiresApi(29)
    private static final Modifier excludeFromSystemGestureQ(Function1 function1) {
        return new ExcludeFromSystemGestureElement(function1);
    }

    public static final Modifier systemGestureExclusion(Modifier modifier) {
        AbstractC3292y.i(modifier, "<this>");
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    public static final Modifier systemGestureExclusion(Modifier modifier, Function1 exclusion) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(exclusion, "exclusion");
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(exclusion));
    }
}
