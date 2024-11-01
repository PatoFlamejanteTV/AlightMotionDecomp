package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideInOut$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ State<Slide> $slideIn;
    final /* synthetic */ State<Slide> $slideOut;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInOut$1(Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        super(3);
        this.$transition = transition;
        this.$slideIn = state;
        this.$slideOut = state2;
        this.$labelPrefix = str;
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(158379472);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(158379472, i8, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:949)");
        }
        Transition<EnterExitState> transition = this.$transition;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        if (this.$transition.getCurrentState() == this.$transition.getTargetState() && !this.$transition.isSeeking()) {
            invoke$lambda$2(mutableState, false);
        } else if (this.$slideIn.getValue() != null || this.$slideOut.getValue() != null) {
            invoke$lambda$2(mutableState, true);
        }
        if (invoke$lambda$1(mutableState)) {
            Transition<EnterExitState> transition2 = this.$transition;
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            String str = this.$labelPrefix;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = str + " slide";
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition2, vectorConverter, (String) rememberedValue2, composer, 448, 0);
            Transition<EnterExitState> transition3 = this.$transition;
            State<Slide> state = this.$slideIn;
            State<Slide> state2 = this.$slideOut;
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(transition3);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SlideModifier(createDeferredAnimation, state, state2);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            composed = composed.then((SlideModifier) rememberedValue3);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composed;
    }
}
