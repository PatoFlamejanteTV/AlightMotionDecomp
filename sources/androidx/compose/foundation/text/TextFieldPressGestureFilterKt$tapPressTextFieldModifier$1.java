package androidx.compose.foundation.text;

import Q5.I;
import Q5.t;
import U5.d;
import U5.h;
import V5.b;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function1 $onTap;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2072n {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ State<Function1> $onTapState;
        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        final /* synthetic */ M $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends l implements InterfaceC2073o {
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
            final /* synthetic */ M $scope;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C03171 extends l implements InterfaceC2072n {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ long $it;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03171(MutableState<PressInteraction.Press> mutableState, long j8, MutableInteractionSource mutableInteractionSource, d dVar) {
                    super(2, dVar);
                    this.$pressedInteraction = mutableState;
                    this.$it = j8;
                    this.$interactionSource = mutableInteractionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new C03171(this.$pressedInteraction, this.$it, this.$interactionSource, dVar);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        java.lang.Object r0 = V5.b.e()
                        int r1 = r7.label
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r4) goto L1f
                        if (r1 != r3) goto L17
                        java.lang.Object r0 = r7.L$0
                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                        Q5.t.b(r8)
                        goto L66
                    L17:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1f:
                        java.lang.Object r1 = r7.L$0
                        androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                        Q5.t.b(r8)
                        goto L4b
                    L27:
                        Q5.t.b(r8)
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                        java.lang.Object r8 = r8.getValue()
                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                        if (r8 == 0) goto L4f
                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r6.<init>(r8)
                        if (r1 == 0) goto L4c
                        r7.L$0 = r5
                        r7.label = r4
                        java.lang.Object r8 = r1.emit(r6, r7)
                        if (r8 != r0) goto L4a
                        return r0
                    L4a:
                        r1 = r5
                    L4b:
                        r5 = r1
                    L4c:
                        r5.setValue(r2)
                    L4f:
                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                        long r4 = r7.$it
                        r8.<init>(r4, r2)
                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                        if (r1 == 0) goto L67
                        r7.L$0 = r8
                        r7.label = r3
                        java.lang.Object r1 = r1.emit(r8, r7)
                        if (r1 != r0) goto L65
                        return r0
                    L65:
                        r0 = r8
                    L66:
                        r8 = r0
                    L67:
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r7.$pressedInteraction
                        r0.setValue(r8)
                        Q5.I r8 = Q5.I.f8786a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1.AnonymousClass2.AnonymousClass1.C03171.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, d dVar) {
                    return ((C03171) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C03182 extends l implements InterfaceC2072n {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                final /* synthetic */ boolean $success;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03182(MutableState<PressInteraction.Press> mutableState, boolean z8, MutableInteractionSource mutableInteractionSource, d dVar) {
                    super(2, dVar);
                    this.$pressedInteraction = mutableState;
                    this.$success = z8;
                    this.$interactionSource = mutableInteractionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new C03182(this.$pressedInteraction, this.$success, this.$interactionSource, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    MutableState<PressInteraction.Press> mutableState;
                    Interaction cancel;
                    MutableState<PressInteraction.Press> mutableState2;
                    Object e8 = b.e();
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            mutableState2 = (MutableState) this.L$0;
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                        if (value != null) {
                            boolean z8 = this.$success;
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            mutableState = this.$pressedInteraction;
                            if (z8) {
                                cancel = new PressInteraction.Release(value);
                            } else {
                                cancel = new PressInteraction.Cancel(value);
                            }
                            if (mutableInteractionSource != null) {
                                this.L$0 = mutableState;
                                this.label = 1;
                                if (mutableInteractionSource.emit(cancel, this) == e8) {
                                    return e8;
                                }
                                mutableState2 = mutableState;
                            }
                            mutableState.setValue(null);
                        }
                        return I.f8786a;
                    }
                    mutableState = mutableState2;
                    mutableState.setValue(null);
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, d dVar) {
                    return ((C03182) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(M m8, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, d dVar) {
                super(3, dVar);
                this.$scope = m8;
                this.$pressedInteraction = mutableState;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m920invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m2722unboximpl(), (d) obj3);
            }

            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m920invoked4ec7I(PressGestureScope pressGestureScope, long j8, d dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, dVar);
                anonymousClass1.L$0 = pressGestureScope;
                anonymousClass1.J$0 = j8;
                return anonymousClass1.invokeSuspend(I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    AbstractC3462k.d(this.$scope, null, null, new C03171(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                    this.label = 1;
                    obj = pressGestureScope.tryAwaitRelease(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                AbstractC3462k.d(this.$scope, null, null, new C03182(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03192 extends AbstractC3293z implements Function1 {
            final /* synthetic */ State<Function1> $onTapState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03192(State<? extends Function1> state) {
                super(1);
                this.$onTapState = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m921invokek4lQ0M(((Offset) obj).m2722unboximpl());
                return I.f8786a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m921invokek4lQ0M(long j8) {
                this.$onTapState.getValue().invoke(Offset.m2701boximpl(j8));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(M m8, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1> state, d dVar) {
            super(2, dVar);
            this.$scope = m8;
            this.$pressedInteraction = mutableState;
            this.$interactionSource = mutableInteractionSource;
            this.$onTapState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
            return ((AnonymousClass2) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                C03192 c03192 = new C03192(this.$onTapState);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, c03192, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(Function1 function1, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$onTap = function1;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-102778667);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-102778667, i8, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:39)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f10149a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$onTap, composer, 0);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(mutableState) | composer.changed(mutableInteractionSource);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(mutableState, mutableInteractionSource);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(mutableInteractionSource, (Function1) rememberedValue3, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource2, new AnonymousClass2(coroutineScope, mutableState, mutableInteractionSource2, rememberUpdatedState, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }
}
