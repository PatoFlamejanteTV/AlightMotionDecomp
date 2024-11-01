package androidx.compose.foundation.text;

import U5.d;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldScrollKt$textFieldScrollable$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z8, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$enabled = z8;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        Modifier scrollable;
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(805428266);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(805428266, i8, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:66)");
        }
        boolean z8 = this.$scrollerPosition.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(textFieldScrollerPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(textFieldScrollerPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ScrollableState rememberScrollableState = ScrollableStateKt.rememberScrollableState((Function1) rememberedValue, composer, 0);
        final TextFieldScrollerPosition textFieldScrollerPosition2 = this.$scrollerPosition;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(rememberScrollableState) | composer.changed(textFieldScrollerPosition2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScrollableState(textFieldScrollerPosition2) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                private final State canScrollBackward$delegate;
                private final State canScrollForward$delegate;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2(textFieldScrollerPosition2));
                    this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2(textFieldScrollerPosition2));
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public float dispatchRawDelta(float f8) {
                    return ScrollableState.this.dispatchRawDelta(f8);
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean getCanScrollBackward() {
                    return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean getCanScrollForward() {
                    return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean isScrollInProgress() {
                    return ScrollableState.this.isScrollInProgress();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public Object scroll(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, d dVar) {
                    return ScrollableState.this.scroll(mutatePriority, interfaceC2072n, dVar);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        scrollable = ScrollableKt.scrollable(Modifier.Companion, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue2, this.$scrollerPosition.getOrientation(), (r14 & 4) != 0 ? true : this.$enabled && this.$scrollerPosition.getMaximum() != 0.0f, (r14 & 8) != 0 ? false : z8, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : this.$interactionSource);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollable;
    }
}
