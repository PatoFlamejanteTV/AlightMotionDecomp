package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final WindowInsetsConnection_androidKt$imeNestedScroll$2 INSTANCE = new WindowInsetsConnection_androidKt$imeNestedScroll$2();

    WindowInsetsConnection_androidKt$imeNestedScroll$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-369978792);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-369978792, i8, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:79)");
        }
        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(composed, WindowInsetsConnection_androidKt.m647rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.Companion.current(composer, 8).getIme(), WindowInsetsSides.Companion.m668getBottomJoeWqyM(), composer, 48), null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScroll$default;
    }
}
