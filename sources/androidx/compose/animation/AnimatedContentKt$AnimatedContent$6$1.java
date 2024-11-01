package androidx.compose.animation;

import Q5.I;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2074p $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ Function1 $transitionSpec;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ ContentTransform $specOnEnter;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C02991 extends AbstractC3293z implements Function1 {
            final /* synthetic */ Placeable $placeable;
            final /* synthetic */ ContentTransform $specOnEnter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02991(Placeable placeable, ContentTransform contentTransform) {
                super(1);
                this.$placeable = placeable;
                this.$specOnEnter = contentTransform;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return I.f8786a;
            }

            public final void invoke(Placeable.PlacementScope layout) {
                AbstractC3292y.i(layout, "$this$layout");
                layout.place(this.$placeable, 0, 0, this.$specOnEnter.getTargetContentZIndex());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentTransform contentTransform) {
            super(3);
            this.$specOnEnter = contentTransform;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m107invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m5129unboximpl());
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final MeasureResult m107invoke3p2s80s(MeasureScope layout, Measurable measurable, long j8) {
            AbstractC3292y.i(layout, "$this$layout");
            AbstractC3292y.i(measurable, "measurable");
            Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
            return MeasureScope.CC.q(layout, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new C02991(mo4108measureBRTryo0, this.$specOnEnter), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3293z implements Function1 {
        final /* synthetic */ S $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(S s8) {
            super(1);
            this.$stateForContent = s8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass3) obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(S s8) {
            return Boolean.valueOf(AbstractC3292y.d(s8, this.$stateForContent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2074p $content;
        final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
        final /* synthetic */ S $stateForContent;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
            final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
            final /* synthetic */ S $stateForContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SnapshotStateList<S> snapshotStateList, S s8, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
                super(1);
                this.$currentlyVisible = snapshotStateList;
                this.$stateForContent = s8;
                this.$rootScope = animatedContentTransitionScopeImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
                final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
                final S s8 = this.$stateForContent;
                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.$rootScope;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        SnapshotStateList.this.remove(s8);
                        animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().remove(s8);
                    }
                };
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, S s8, SnapshotStateList<S> snapshotStateList, InterfaceC2074p interfaceC2074p, int i8) {
            super(3);
            this.$rootScope = animatedContentTransitionScopeImpl;
            this.$stateForContent = s8;
            this.$currentlyVisible = snapshotStateList;
            this.$content = interfaceC2074p;
            this.$$dirty = i8;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if ((i8 & 14) == 0) {
                i8 |= composer.changed(AnimatedVisibility) ? 4 : 2;
            }
            if ((i8 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1894897681, i8, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:768)");
            }
            EffectsKt.DisposableEffect(AnimatedVisibility, new AnonymousClass1(this.$currentlyVisible, this.$stateForContent, this.$rootScope), composer, i8 & 14);
            this.$rootScope.getTargetSizeMap$animation_release().put(this.$stateForContent, ((AnimatedVisibilityScopeImpl) AnimatedVisibility).getTargetSize$animation_release());
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedContentScopeImpl(AnimatedVisibility);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            this.$content.invoke((AnimatedContentScopeImpl) rememberedValue, this.$stateForContent, composer, Integer.valueOf((this.$$dirty >> 9) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1(Transition<S> transition, S s8, int i8, Function1 function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, InterfaceC2074p interfaceC2074p) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s8;
        this.$$dirty = i8;
        this.$transitionSpec = function1;
        this.$rootScope = animatedContentTransitionScopeImpl;
        this.$currentlyVisible = snapshotStateList;
        this.$content = interfaceC2074p;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        ExitTransition initialContentExit;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885640742, i8, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:739)");
        }
        Function1 function1 = this.$transitionSpec;
        Object obj = this.$rootScope;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = (ContentTransform) function1.invoke(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ContentTransform contentTransform = (ContentTransform) rememberedValue;
        Boolean valueOf = Boolean.valueOf(AbstractC3292y.d(this.$this_AnimatedContent.getSegment().getTargetState(), this.$stateForContent));
        Transition<S> transition = this.$this_AnimatedContent;
        S s8 = this.$stateForContent;
        Function1 function12 = this.$transitionSpec;
        Object obj2 = this.$rootScope;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            if (AbstractC3292y.d(transition.getSegment().getTargetState(), s8)) {
                initialContentExit = ExitTransition.Companion.getNone();
            } else {
                initialContentExit = ((ContentTransform) function12.invoke(obj2)).getInitialContentExit();
            }
            rememberedValue2 = initialContentExit;
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ExitTransition exitTransition = (ExitTransition) rememberedValue2;
        S s9 = this.$stateForContent;
        Transition<S> transition2 = this.$this_AnimatedContent;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new AnimatedContentTransitionScopeImpl.ChildData(AbstractC3292y.d(s9, transition2.getTargetState()));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) rememberedValue3;
        EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
        Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new AnonymousClass1(contentTransform));
        childData.setTarget(AbstractC3292y.d(this.$stateForContent, this.$this_AnimatedContent.getTargetState()));
        AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedContent, new AnonymousClass3(this.$stateForContent), layout.then(childData), targetContentEnter, exitTransition, ComposableLambdaKt.composableLambda(composer, -1894897681, true, new AnonymousClass4(this.$rootScope, this.$stateForContent, this.$currentlyVisible, this.$content, this.$$dirty)), composer, 196608 | (this.$$dirty & 14), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
