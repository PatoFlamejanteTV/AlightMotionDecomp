package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ Function0 $magnifierCenter;
    final /* synthetic */ Function1 $platformMagnifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(Function0 function0, Function1 function1) {
        super(3);
        this.$magnifierCenter = function0;
        this.$platformMagnifier = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$0(State<Offset> state) {
        return state.getValue().m2722unboximpl();
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        State rememberAnimatedMagnifierPosition;
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(759876635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(759876635, i8, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
        }
        rememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
        Function1 function1 = this.$platformMagnifier;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(rememberAnimatedMagnifierPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(rememberAnimatedMagnifierPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifier = (Modifier) function1.invoke(rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }
}
