package androidx.compose.foundation;

import Q5.I;
import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;

@Stable
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(ScrollState$Companion$Saver$1.INSTANCE, ScrollState$Companion$Saver$2.INSTANCE);
    private float accumulator;
    private final MutableIntState value$delegate;
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new ScrollState$scrollableState$1(this));
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new ScrollState$canScrollForward$2(this));
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new ScrollState$canScrollBackward$2(this));

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ScrollState(int i8) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i8, AnimationSpec animationSpec, d dVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i8, animationSpec, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i8) {
        this.value$delegate.setIntValue(i8);
    }

    public final Object animateScrollTo(int i8, AnimationSpec<Float> animationSpec, d dVar) {
        Object animateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i8 - getValue(), animationSpec, dVar);
        if (animateScrollBy == V5.b.e()) {
            return animateScrollBy;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f8) {
        return this.scrollableState.dispatchRawDelta(f8);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getViewportSize$foundation_release() {
        return this.viewportSize$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, d dVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, interfaceC2072n, dVar);
        if (scroll == V5.b.e()) {
            return scroll;
        }
        return I.f8786a;
    }

    public final Object scrollTo(int i8, d dVar) {
        return ScrollExtensionsKt.scrollBy(this, i8 - getValue(), dVar);
    }

    public final void setMaxValue$foundation_release(int i8) {
        this._maxValueState.setIntValue(i8);
        if (getValue() > i8) {
            setValue(i8);
        }
    }

    public final void setViewportSize$foundation_release(int i8) {
        this.viewportSize$delegate.setIntValue(i8);
    }
}
