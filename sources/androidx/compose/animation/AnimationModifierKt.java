package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnimationModifierKt {
    public static final Modifier animateContentSize(Modifier modifier, FiniteAnimationSpec<IntSize> animationSpec, InterfaceC2072n interfaceC2072n) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(animationSpec, "animationSpec");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1(animationSpec, interfaceC2072n);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new AnimationModifierKt$animateContentSize$2(interfaceC2072n, animationSpec));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, interfaceC2072n);
    }
}
