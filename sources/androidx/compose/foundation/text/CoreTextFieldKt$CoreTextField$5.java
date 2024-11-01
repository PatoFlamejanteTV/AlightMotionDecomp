package androidx.compose.foundation.text;

import Q5.I;
import Q5.w;
import Q5.x;
import R5.Q;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import e6.AbstractC2829a;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$5 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ Modifier $cursorModifier;
    final /* synthetic */ InterfaceC2073o $decorationBox;
    final /* synthetic */ Density $density;
    final /* synthetic */ Modifier $drawModifier;
    final /* synthetic */ Modifier $magnifierModifier;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ Modifier $onPositionedModifier;
    final /* synthetic */ Function1 $onTextLayout;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    final /* synthetic */ boolean $showHandleAndMagnifier;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
        final /* synthetic */ Modifier $cursorModifier;
        final /* synthetic */ Density $density;
        final /* synthetic */ Modifier $drawModifier;
        final /* synthetic */ Modifier $magnifierModifier;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ Modifier $onPositionedModifier;
        final /* synthetic */ Function1 $onTextLayout;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
        final /* synthetic */ boolean $showHandleAndMagnifier;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextStyle $textStyle;
        final /* synthetic */ TextFieldValue $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03151 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ Density $density;
            final /* synthetic */ TextFieldSelectionManager $manager;
            final /* synthetic */ int $maxLines;
            final /* synthetic */ OffsetMapping $offsetMapping;
            final /* synthetic */ Function1 $onTextLayout;
            final /* synthetic */ boolean $readOnly;
            final /* synthetic */ boolean $showHandleAndMagnifier;
            final /* synthetic */ TextFieldState $state;
            final /* synthetic */ TextFieldValue $value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03151(TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState, boolean z8, boolean z9, Function1 function1, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i8) {
                super(2);
                this.$manager = textFieldSelectionManager;
                this.$state = textFieldState;
                this.$showHandleAndMagnifier = z8;
                this.$readOnly = z9;
                this.$onTextLayout = function1;
                this.$value = textFieldValue;
                this.$offsetMapping = offsetMapping;
                this.$density = density;
                this.$maxLines = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-363167407, i8, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:649)");
                }
                final TextFieldState textFieldState = this.$state;
                final Function1 function1 = this.$onTextLayout;
                final TextFieldValue textFieldValue = this.$value;
                final OffsetMapping offsetMapping = this.$offsetMapping;
                final Density density = this.$density;
                final int i9 = this.$maxLines;
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return g.a(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i10) {
                        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
                        AbstractC3292y.i(measurables, "measurables");
                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public MeasureResult mo109measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
                        TextLayoutResult textLayoutResult;
                        int i10;
                        AbstractC3292y.i(measure, "$this$measure");
                        AbstractC3292y.i(measurables, "measurables");
                        Snapshot.Companion companion = Snapshot.Companion;
                        TextFieldState textFieldState2 = TextFieldState.this;
                        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                        try {
                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                            try {
                                TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                                if (layoutResult != null) {
                                    textLayoutResult = layoutResult.getValue();
                                } else {
                                    textLayoutResult = null;
                                }
                                createNonObservableSnapshot.dispose();
                                w m909layout_EkL_Y$foundation_release = TextFieldDelegate.Companion.m909layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j8, measure.getLayoutDirection(), textLayoutResult);
                                int intValue = ((Number) m909layout_EkL_Y$foundation_release.a()).intValue();
                                int intValue2 = ((Number) m909layout_EkL_Y$foundation_release.b()).intValue();
                                TextLayoutResult textLayoutResult2 = (TextLayoutResult) m909layout_EkL_Y$foundation_release.c();
                                if (!AbstractC3292y.d(textLayoutResult, textLayoutResult2)) {
                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(textLayoutResult2));
                                    function1.invoke(textLayoutResult2);
                                    CoreTextFieldKt.notifyFocusedRect(TextFieldState.this, textFieldValue, offsetMapping);
                                }
                                TextFieldState textFieldState3 = TextFieldState.this;
                                Density density2 = density;
                                if (i9 == 1) {
                                    i10 = TextDelegateKt.ceilToIntPx(textLayoutResult2.getLineBottom(0));
                                } else {
                                    i10 = 0;
                                }
                                textFieldState3.m929setMinHeightForSingleLineField0680j_4(density2.mo422toDpu2uoSUM(i10));
                                return measure.layout(intValue, intValue2, Q.k(x.a(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(AbstractC2829a.d(textLayoutResult2.getFirstBaseline()))), x.a(AlignmentLineKt.getLastBaseline(), Integer.valueOf(AbstractC2829a.d(textLayoutResult2.getLastBaseline())))), CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2.INSTANCE);
                            } finally {
                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                            }
                        } catch (Throwable th) {
                            createNonObservableSnapshot.dispose();
                            throw th;
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return g.c(this, intrinsicMeasureScope, list, i10);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                        return g.d(this, intrinsicMeasureScope, list, i10);
                    }
                };
                composer.startReplaceableGroup(-1323940314);
                Modifier.Companion companion = Modifier.Companion;
                boolean z8 = false;
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
                Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                if (this.$state.getHandleState() == HandleState.Selection && this.$state.getLayoutCoordinates() != null) {
                    LayoutCoordinates layoutCoordinates = this.$state.getLayoutCoordinates();
                    AbstractC3292y.f(layoutCoordinates);
                    if (layoutCoordinates.isAttached() && this.$showHandleAndMagnifier) {
                        z8 = true;
                    }
                }
                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z8, composer, 8);
                if (this.$state.getHandleState() == HandleState.Cursor && !this.$readOnly && this.$showHandleAndMagnifier) {
                    CoreTextFieldKt.TextFieldCursorHandle(this.$manager, composer, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldState textFieldState, TextStyle textStyle, int i8, int i9, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z8, boolean z9, Function1 function1, OffsetMapping offsetMapping, Density density) {
            super(2);
            this.$state = textFieldState;
            this.$textStyle = textStyle;
            this.$minLines = i8;
            this.$maxLines = i9;
            this.$scrollerPosition = textFieldScrollerPosition;
            this.$value = textFieldValue;
            this.$visualTransformation = visualTransformation;
            this.$cursorModifier = modifier;
            this.$drawModifier = modifier2;
            this.$onPositionedModifier = modifier3;
            this.$magnifierModifier = modifier4;
            this.$bringIntoViewRequester = bringIntoViewRequester;
            this.$manager = textFieldSelectionManager;
            this.$showHandleAndMagnifier = z8;
            this.$readOnly = z9;
            this.$onTextLayout = function1;
            this.$offsetMapping = offsetMapping;
            this.$density = density;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2032502107, i8, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:624)");
            }
            SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(HeightInLinesModifierKt.heightInLines(SizeKt.m612heightInVpY3zN4$default(Modifier.Companion, this.$state.m928getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), this.$textStyle, this.$minLines, this.$maxLines), this.$scrollerPosition, this.$value, this.$visualTransformation, new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1(this.$state)).then(this.$cursorModifier).then(this.$drawModifier), this.$textStyle).then(this.$onPositionedModifier).then(this.$magnifierModifier), this.$bringIntoViewRequester), ComposableLambdaKt.composableLambda(composer, -363167407, true, new C03151(this.$manager, this.$state, this.$showHandleAndMagnifier, this.$readOnly, this.$onTextLayout, this.$value, this.$offsetMapping, this.$density, this.$maxLines)), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5(InterfaceC2073o interfaceC2073o, int i8, TextFieldState textFieldState, TextStyle textStyle, int i9, int i10, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z8, boolean z9, Function1 function1, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.$decorationBox = interfaceC2073o;
        this.$$dirty1 = i8;
        this.$state = textFieldState;
        this.$textStyle = textStyle;
        this.$minLines = i9;
        this.$maxLines = i10;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = visualTransformation;
        this.$cursorModifier = modifier;
        this.$drawModifier = modifier2;
        this.$onPositionedModifier = modifier3;
        this.$magnifierModifier = modifier4;
        this.$bringIntoViewRequester = bringIntoViewRequester;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z8;
        this.$readOnly = z9;
        this.$onTextLayout = function1;
        this.$offsetMapping = offsetMapping;
        this.$density = density;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-374338080, i8, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:623)");
        }
        this.$decorationBox.invoke(ComposableLambdaKt.composableLambda(composer, 2032502107, true, new AnonymousClass1(this.$state, this.$textStyle, this.$minLines, this.$maxLines, this.$scrollerPosition, this.$value, this.$visualTransformation, this.$cursorModifier, this.$drawModifier, this.$onPositionedModifier, this.$magnifierModifier, this.$bringIntoViewRequester, this.$manager, this.$showHandleAndMagnifier, this.$readOnly, this.$onTextLayout, this.$offsetMapping, this.$density)), composer, Integer.valueOf(((this.$$dirty1 >> 12) & 112) | 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
