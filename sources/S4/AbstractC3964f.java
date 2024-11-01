package s4;

import Q5.I;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* renamed from: s4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3964f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f39080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3965g f39081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f39082c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3965g c3965g, Function0 function0, U5.d dVar) {
            super(2, dVar);
            this.f39081b = c3965g;
            this.f39082c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f39081b, this.f39082c, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r4.f39080a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Q5.t.b(r5)
                goto L37
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                Q5.t.b(r5)
                goto L2c
            L1e:
                Q5.t.b(r5)
                s4.g r5 = r4.f39081b
                r4.f39080a = r3
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                s4.g r5 = r4.f39081b
                r4.f39080a = r2
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L37
                return r0
            L37:
                s4.g$a r5 = (s4.C3965g.a) r5
                s4.g$a r0 = s4.C3965g.a.f39097b
                if (r5 != r0) goto L42
                kotlin.jvm.functions.Function0 r5 = r4.f39082c
                r5.invoke()
            L42:
                Q5.I r5 = Q5.I.f8786a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC3964f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39083a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2072n interfaceC2072n) {
            super(3);
            this.f39083a = interfaceC2072n;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(ColumnScope ModalBottomSheetLayout, Composer composer, int i8) {
            AbstractC3292y.i(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959122039, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout.<anonymous> (StripeBottomSheetLayout.kt:58)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "BottomSheetContentTestTag");
            InterfaceC2072n interfaceC2072n = this.f39083a;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC2072n.invoke(composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3965g f39084a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3962d f39085b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f39086c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f39087d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f39088e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39089f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f39090g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3965g c3965g, C3962d c3962d, Modifier modifier, Function0 function0, InterfaceC2072n interfaceC2072n, int i8, int i9) {
            super(2);
            this.f39084a = c3965g;
            this.f39085b = c3962d;
            this.f39086c = modifier;
            this.f39087d = function0;
            this.f39088e = interfaceC2072n;
            this.f39089f = i8;
            this.f39090g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3964f.a(this.f39084a, this.f39085b, this.f39086c, this.f39087d, this.f39088e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39089f | 1), this.f39090g);
        }
    }

    public static final void a(C3965g state, C3962d layoutInfo, Modifier modifier, Function0 onDismissed, InterfaceC2072n sheetContent, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(layoutInfo, "layoutInfo");
        AbstractC3292y.i(onDismissed, "onDismissed");
        AbstractC3292y.i(sheetContent, "sheetContent");
        Composer startRestartGroup = composer.startRestartGroup(217685577);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(217685577, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout (StripeBottomSheetLayout.kt:37)");
        }
        EffectsKt.LaunchedEffect(I.f8786a, new a(state, onDismissed, null), startRestartGroup, 70);
        Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.statusBarsPadding(modifier2));
        long a9 = layoutInfo.a();
        long b9 = layoutInfo.b();
        float m5155constructorimpl = Dp.m5155constructorimpl(0);
        ModalBottomSheetKt.m1254ModalBottomSheetLayoutGs3lGvM(ComposableLambdaKt.composableLambda(startRestartGroup, 1959122039, true, new b(sheetContent)), imePadding, state.b(), false, layoutInfo.c(), m5155constructorimpl, b9, 0L, a9, C3959a.f39067a.a(), startRestartGroup, (ModalBottomSheetState.$stable << 6) | 805506054, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(state, layoutInfo, modifier2, onDismissed, sheetContent, i8, i9));
        }
    }
}
