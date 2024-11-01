package y4;

import C2.c;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4246a {
    public static final String a(c cVar, Composer composer, int i8) {
        AbstractC3292y.i(cVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2089170298, i8, -1, "com.stripe.android.uicore.strings.resolve (ResolvableStringComposeUtils.kt:18)");
        }
        String R8 = cVar.R((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return R8;
    }
}
