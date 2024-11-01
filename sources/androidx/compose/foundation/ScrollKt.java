package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ScrollKt {
    public static final Modifier horizontalScroll(Modifier modifier, ScrollState state, boolean z8, FlingBehavior flingBehavior, boolean z9) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        return scroll(modifier, state, z9, flingBehavior, z8, false);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z8, FlingBehavior flingBehavior, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        if ((i8 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i8 & 8) != 0) {
            z9 = false;
        }
        return horizontalScroll(modifier, scrollState, z8, flingBehavior, z9);
    }

    @Composable
    public static final ScrollState rememberScrollState(int i8, Composer composer, int i9, int i10) {
        composer.startReplaceableGroup(-1464256199);
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i9, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:72)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i8);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ScrollKt$rememberScrollState$1$1(i8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z8, FlingBehavior flingBehavior, boolean z9, boolean z10) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ScrollKt$scroll$$inlined$debugInspectorInfo$1(scrollState, z8, flingBehavior, z9, z10);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new ScrollKt$scroll$2(z10, z8, scrollState, z9, flingBehavior));
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState state, boolean z8, FlingBehavior flingBehavior, boolean z9) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        return scroll(modifier, state, z9, flingBehavior, z8, true);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z8, FlingBehavior flingBehavior, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        if ((i8 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i8 & 8) != 0) {
            z9 = false;
        }
        return verticalScroll(modifier, scrollState, z8, flingBehavior, z9);
    }
}
