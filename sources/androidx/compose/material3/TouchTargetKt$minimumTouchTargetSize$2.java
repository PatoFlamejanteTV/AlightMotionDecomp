package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TouchTargetKt$minimumTouchTargetSize$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final TouchTargetKt$minimumTouchTargetSize$2 INSTANCE = new TouchTargetKt$minimumTouchTargetSize$2();

    TouchTargetKt$minimumTouchTargetSize$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        Modifier modifier;
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-1937671640);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1937671640, i8, -1, "androidx.compose.material3.minimumTouchTargetSize.<anonymous> (TouchTarget.kt:42)");
        }
        if (((Boolean) composer.consume(TouchTargetKt.getLocalMinimumTouchTargetEnforcement())).booleanValue()) {
            modifier = new MinimumTouchTargetModifier(((ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration())).mo4233getMinimumTouchTargetSizeMYxV2XQ(), null);
        } else {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }
}
