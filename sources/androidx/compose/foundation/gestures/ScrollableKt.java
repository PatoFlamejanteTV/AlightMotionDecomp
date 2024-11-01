package androidx.compose.foundation.gestures;

import U5.g;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final InterfaceC2073o NoOpOnDragStarted = new ScrollableKt$NoOpOnDragStarted$1(null);
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f8) {
            return f8;
        }
    };
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(ScrollableKt$ModifierLocalScrollableContainer$1.INSTANCE);
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // androidx.compose.ui.MotionDurationScale, U5.g.b, U5.g
        public <R> R fold(R r8, InterfaceC2072n interfaceC2072n) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r8, interfaceC2072n);
        }

        @Override // androidx.compose.ui.MotionDurationScale, U5.g.b, U5.g
        public <E extends g.b> E get(g.c cVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale, U5.g.b
        public /* synthetic */ g.c getKey() {
            return androidx.compose.ui.c.a(this);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.MotionDurationScale, U5.g.b, U5.g
        public g minusKey(g.c cVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale, U5.g
        public g plus(g gVar) {
            return MotionDurationScale.DefaultImpls.plus(this, gVar);
        }
    };

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            Q5.t.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Q5.t.b(r6)
        L38:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.ui.input.pointer.b.t(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            int r2 = r6.m3935getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
            int r4 = r4.m3951getScroll7fucELk()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventType.m3942equalsimpl0(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, U5.d):java.lang.Object");
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final Modifier pointerScrollable(Modifier modifier, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z8, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect, boolean z9, Composer composer, int i8) {
        FlingBehavior flingBehavior2;
        composer.startReplaceableGroup(-2012025036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012025036, i8, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:247)");
        }
        composer.startReplaceableGroup(-1730185954);
        if (flingBehavior == null) {
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer, 6);
        } else {
            flingBehavior2 = flingBehavior;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new NestedScrollDispatcher(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new ScrollingLogic(orientation, z8, mutableState, scrollableState, flingBehavior2, overscrollEffect), composer, 0);
        Object valueOf = Boolean.valueOf(z9);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = scrollableNestedScrollConnection(rememberUpdatedState, z9);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new ScrollDraggableState(rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        ScrollDraggableState scrollDraggableState = (ScrollDraggableState) rememberedValue3;
        ScrollConfig platformScrollConfig = AndroidScrollable_androidKt.platformScrollConfig(composer, 0);
        InterfaceC2073o interfaceC2073o = NoOpOnDragStarted;
        ScrollableKt$pointerScrollable$1 scrollableKt$pointerScrollable$1 = ScrollableKt$pointerScrollable$1.INSTANCE;
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(rememberUpdatedState);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new ScrollableKt$pointerScrollable$2$1(rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) rememberedValue4;
        composer.startReplaceableGroup(511388516);
        boolean changed3 = composer.changed(mutableState) | composer.changed(rememberUpdatedState);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed3 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new ScrollableKt$pointerScrollable$3$1(mutableState, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(modifier.then(new DraggableElement(scrollDraggableState, scrollableKt$pointerScrollable$1, orientation, z9, mutableInteractionSource, function0, interfaceC2073o, (InterfaceC2073o) rememberedValue5, false)).then(new MouseWheelScrollElement(rememberUpdatedState, platformScrollConfig)), nestedScrollConnection, (NestedScrollDispatcher) mutableState.getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScroll;
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState state, Orientation orientation, boolean z8, boolean z9, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        return scrollable(modifier, state, orientation, null, z8, z9, flingBehavior, mutableInteractionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z8) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(state, z8);
    }

    @ExperimentalFoundationApi
    public static final Modifier scrollable(Modifier modifier, ScrollableState state, Orientation orientation, OverscrollEffect overscrollEffect, boolean z8, boolean z9, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ScrollableKt$scrollable$$inlined$debugInspectorInfo$1(orientation, state, overscrollEffect, z8, z9, flingBehavior, mutableInteractionSource) : InspectableValueKt.getNoInspectorInfo(), new ScrollableKt$scrollable$2(orientation, state, z9, mutableInteractionSource, flingBehavior, overscrollEffect, z8));
    }
}
