package O3;

import D3.f;
import E3.c;
import O3.V;
import R5.a0;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.r;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import q6.InterfaceC3813L;
import r4.p0;
import v3.C4127g;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class U {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f7353a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7354b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7355c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f7356d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7357e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7358f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f8, boolean z8, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7353a = f8;
            this.f7354b = z8;
            this.f7355c = function0;
            this.f7356d = modifier;
            this.f7357e = i8;
            this.f7358f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.a(this.f7353a, this.f7354b, this.f7355c, this.f7356d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7357e | 1), this.f7358f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7359a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7360b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusManager f7361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, FocusManager focusManager, U5.d dVar) {
            super(2, dVar);
            this.f7360b = z8;
            this.f7361c = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f7360b, this.f7361c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f7359a == 0) {
                Q5.t.b(obj);
                if (this.f7360b) {
                    androidx.compose.ui.focus.b.a(this.f7361c, false, 1, null);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7363b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f7364c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, MutableState mutableState, U5.d dVar) {
            super(2, dVar);
            this.f7363b = i8;
            this.f7364c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f7363b, this.f7364c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7362a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                long j8 = this.f7363b;
                this.f7362a = 1;
                if (n6.X.b(j8, this) == e8) {
                    return e8;
                }
            }
            U.c(this.f7364c, true);
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7365a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i8) {
            return Integer.valueOf(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f7366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j4.S f7367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusRequester f7369d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j4.S f7370a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f7371b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusRequester f7372c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j4.S s8, boolean z8, FocusRequester focusRequester) {
                super(2);
                this.f7370a = s8;
                this.f7371b = z8;
                this.f7372c = focusRequester;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Q5.I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408385964, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:471)");
                }
                j4.Q i9 = this.f7370a.i();
                boolean z8 = !this.f7371b;
                j4.S s8 = this.f7370a;
                Modifier focusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), this.f7372c);
                Set f8 = a0.f();
                FocusDirection.Companion companion = FocusDirection.Companion;
                i9.f(z8, s8, focusRequester, f8, null, companion.m2637getExitdhqQ8s(), companion.m2640getPreviousdhqQ8s(), composer, (j4.S.f33979f << 3) | 27648 | (r4.G.f37990d << 9) | (j4.Q.f33933x << 21));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(State state, j4.S s8, boolean z8, FocusRequester focusRequester) {
            super(3);
            this.f7366a = state;
            this.f7367b = s8;
            this.f7368c = z8;
            this.f7369d = focusRequester;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1074270777, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:458)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 20;
            float f9 = 0;
            Modifier m580paddingqDBjuR0 = PaddingKt.m580paddingqDBjuR0(companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f9));
            State state = this.f7366a;
            j4.S s8 = this.f7367b;
            boolean z8 = this.f7368c;
            FocusRequester focusRequester = this.f7369d;
            composer.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m580paddingqDBjuR0);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(v3.w.f40583G, composer, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m1391Text4IGK_g(stringResource, (Modifier) null, AbstractC3539m.n(materialTheme, composer, i9).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i9).getBody1(), composer, 0, 0, 65530);
            float f10 = 8;
            p0.b(IntrinsicKt.height(PaddingKt.m580paddingqDBjuR0(companion, Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f10), Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f10)), IntrinsicSize.Min), null, false, 0L, null, ComposableLambdaKt.composableLambda(composer, 408385964, true, new a(s8, z8, focusRequester)), composer, 196614, 30);
            r4.C c8 = (r4.C) state.getValue();
            Integer valueOf = c8 != null ? Integer.valueOf(c8.a()) : null;
            composer.startReplaceableGroup(272129292);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2473constructorimpl2 = Updater.m2473constructorimpl(composer);
                Updater.m2480setimpl(m2473constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                p0.c(StringResources_androidKt.stringResource(intValue, composer, 0), composer, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
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
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f7373a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7374b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7376d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7377e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7378f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC3813L interfaceC3813L, boolean z8, int i8, int i9, int i10, int i11) {
            super(2);
            this.f7373a = interfaceC3813L;
            this.f7374b = z8;
            this.f7375c = i8;
            this.f7376d = i9;
            this.f7377e = i10;
            this.f7378f = i11;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.b(this.f7373a, this.f7374b, this.f7375c, this.f7376d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7377e | 1), this.f7378f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1) {
            super(0);
            this.f7379a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m27invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27invoke() {
            this.f7379a.invoke(f.c.f1258a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f7380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7381b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7382c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f7383d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f7384e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7385f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7386g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7380a = f8;
            this.f7381b = z8;
            this.f7382c = z9;
            this.f7383d = function1;
            this.f7384e = modifier;
            this.f7385f = i8;
            this.f7386g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.f(this.f7380a, this.f7381b, this.f7382c, this.f7383d, this.f7384e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7385f | 1), this.f7386g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7387a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(0);
            this.f7387a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m28invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
            this.f7387a.invoke(f.d.f1259a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f7388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7390c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f7391d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f7392e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7393f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7394g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7388a = f8;
            this.f7389b = z8;
            this.f7390c = z9;
            this.f7391d = function1;
            this.f7392e = modifier;
            this.f7393f = i8;
            this.f7394g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.g(this.f7388a, this.f7389b, this.f7390c, this.f7391d, this.f7392e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7393f | 1), this.f7394g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.r f7395a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f7396b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7397c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7398d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7399e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f7400f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f7401g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7402h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f7403i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f7404j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7405k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7406l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.paymentsheet.r rVar, float f8, boolean z8, boolean z9, boolean z10, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7395a = rVar;
            this.f7396b = f8;
            this.f7397c = z8;
            this.f7398d = z9;
            this.f7399e = z10;
            this.f7400f = function0;
            this.f7401g = function1;
            this.f7402h = function12;
            this.f7403i = function13;
            this.f7404j = modifier;
            this.f7405k = i8;
            this.f7406l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.i(this.f7395a, this.f7396b, this.f7397c, this.f7398d, this.f7399e, this.f7400f, this.f7401g, this.f7402h, this.f7403i, this.f7404j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7405k | 1), this.f7406l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7407a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7408b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7409c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, String str, boolean z9) {
            super(1);
            this.f7407a = z8;
            this.f7408b = str;
            this.f7409c = z9;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "PaymentSheetSavedPaymentOption");
            SemanticsPropertiesKt.setSelected(semantics, this.f7407a);
            SemanticsPropertiesKt.setText(semantics, new AnnotatedString(this.f7408b, null, null, 6, null));
            if (this.f7409c) {
                return;
            }
            SemanticsPropertiesKt.disabled(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r.d f7411b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Function1 function1, r.d dVar) {
            super(0);
            this.f7410a = function1;
            this.f7411b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m29invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m29invoke() {
            this.f7410a.invoke(this.f7411b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7412a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r.d f7413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, r.d dVar) {
            super(0);
            this.f7412a = function1;
            this.f7413b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m30invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m30invoke() {
            this.f7412a.invoke(this.f7413b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f7414a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r.d f7415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Function1 function1, r.d dVar) {
            super(0);
            this.f7414a = function1;
            this.f7415b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m31invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m31invoke() {
            this.f7414a.invoke(com.stripe.android.paymentsheet.u.c(this.f7415b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.d f7416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f7417b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7418c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7419d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7420e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7421f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f7422g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7423h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f7424i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f7425j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7426k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7427l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(r.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7416a = dVar;
            this.f7417b = f8;
            this.f7418c = z8;
            this.f7419d = z9;
            this.f7420e = z10;
            this.f7421f = z11;
            this.f7422g = function1;
            this.f7423h = function12;
            this.f7424i = function13;
            this.f7425j = modifier;
            this.f7426k = i8;
            this.f7427l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f7416a, this.f7417b, this.f7418c, this.f7419d, this.f7420e, this.f7421f, this.f7422g, this.f7423h, this.f7424i, this.f7425j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7426k | 1), this.f7427l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r.d f7428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f7429b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7430c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7431d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7432e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7433f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f7434g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7435h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f7436i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f7437j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7438k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7439l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(r.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7428a = dVar;
            this.f7429b = f8;
            this.f7430c = z8;
            this.f7431d = z9;
            this.f7432e = z10;
            this.f7433f = z11;
            this.f7434g = function1;
            this.f7435h = function12;
            this.f7436i = function13;
            this.f7437j = modifier;
            this.f7438k = i8;
            this.f7439l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f7428a, this.f7429b, this.f7430c, this.f7431d, this.f7432e, this.f7433f, this.f7434g, this.f7435h, this.f7436i, this.f7437j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7438k | 1), this.f7439l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f7440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(V v8) {
            super(0);
            this.f7440a = v8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m32invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m32invoke() {
            this.f7440a.a(V.b.a.f7500a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f7441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(V v8) {
            super(1);
            this.f7441a = v8;
        }

        public final void a(D3.f fVar) {
            this.f7441a.a(new V.b.d(fVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D3.f) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f7442a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(V v8) {
            super(1);
            this.f7442a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3292y.i(it, "it");
            this.f7442a.a(new V.b.c(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f7443a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(V v8) {
            super(1);
            this.f7443a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3292y.i(it, "it");
            this.f7443a.a(new V.b.C0138b(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f7444a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.j.b f7445b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f7446c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7447d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(V v8, c.j.b bVar, Modifier modifier, int i8) {
            super(2);
            this.f7444a = v8;
            this.f7445b = bVar;
            this.f7446c = modifier;
            this.f7447d = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.j(this.f7444a, this.f7445b, this.f7446c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7447d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7448a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LazyListState f7449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f7450c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7451d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.r f7452e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f7453f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f7454g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7455h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f7456i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f7457a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f7458b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7459c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.r f7460d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f7461e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0 f7462f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f7463g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f7464h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1 f7465i;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: O3.U$w$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0137a extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final C0137a f7466a = new C0137a();

                C0137a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.stripe.android.paymentsheet.r it) {
                    AbstractC3292y.i(it, "it");
                    return com.stripe.android.paymentsheet.s.a(it);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final b f7467a = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Q5.I.f8786a;
                }

                public final void invoke(SemanticsPropertyReceiver semantics) {
                    AbstractC3292y.i(semantics, "$this$semantics");
                    SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                }
            }

            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final c f7468a = new c();

                public c() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Object obj) {
                    return null;
                }
            }

            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f7469a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f7470b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Function1 function1, List list) {
                    super(1);
                    this.f7469a = function1;
                    this.f7470b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f7469a.invoke(this.f7470b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f7471a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f7472b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(Function1 function1, List list) {
                    super(1);
                    this.f7471a = function1;
                    this.f7472b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f7471a.invoke(this.f7472b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class f extends AbstractC3293z implements InterfaceC2074p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f7473a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f7474b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f7475c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.r f7476d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f7477e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0 f7478f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function1 f7479g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function1 f7480h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Function1 f7481i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.r rVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                    super(4);
                    this.f7473a = list;
                    this.f7474b = z8;
                    this.f7475c = z9;
                    this.f7476d = rVar;
                    this.f7477e = f8;
                    this.f7478f = function0;
                    this.f7479g = function1;
                    this.f7480h = function12;
                    this.f7481i = function13;
                }

                @Override // c6.InterfaceC2074p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return Q5.I.f8786a;
                }

                public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
                    int i10;
                    AbstractC3292y.i(items, "$this$items");
                    if ((i9 & 14) == 0) {
                        i10 = i9 | (composer.changed(items) ? 4 : 2);
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 112) == 0) {
                        i10 |= composer.changed(i8) ? 32 : 16;
                    }
                    if ((i10 & 731) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                    }
                    com.stripe.android.paymentsheet.r rVar = (com.stripe.android.paymentsheet.r) this.f7473a.get(i8);
                    composer.startReplaceableGroup(1592562601);
                    boolean z8 = !this.f7474b && (!this.f7475c || rVar.b());
                    U.i(rVar, this.f7477e, z8, this.f7475c, AbstractC3292y.d(rVar, this.f7476d) && !this.f7475c, this.f7478f, this.f7479g, this.f7480h, this.f7481i, androidx.compose.foundation.lazy.a.a(items, TestTagKt.testTag(SemanticsModifierKt.semantics$default(Modifier.Companion, false, b.f7467a, 1, null), rVar.a().name()), null, 1, null), composer, 0, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.r rVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                super(1);
                this.f7457a = list;
                this.f7458b = z8;
                this.f7459c = z9;
                this.f7460d = rVar;
                this.f7461e = f8;
                this.f7462f = function0;
                this.f7463g = function1;
                this.f7464h = function12;
                this.f7465i = function13;
            }

            public final void a(LazyListScope LazyRow) {
                d dVar;
                AbstractC3292y.i(LazyRow, "$this$LazyRow");
                List list = this.f7457a;
                C0137a c0137a = C0137a.f7466a;
                boolean z8 = this.f7458b;
                boolean z9 = this.f7459c;
                com.stripe.android.paymentsheet.r rVar = this.f7460d;
                float f8 = this.f7461e;
                Function0 function0 = this.f7462f;
                Function1 function1 = this.f7463g;
                Function1 function12 = this.f7464h;
                Function1 function13 = this.f7465i;
                c cVar = c.f7468a;
                int size = list.size();
                if (c0137a != null) {
                    dVar = new d(c0137a, list);
                } else {
                    dVar = null;
                }
                LazyRow.items(size, dVar, new e(cVar, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(list, z8, z9, rVar, f8, function0, function1, function12, function13)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LazyListScope) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z8, LazyListState lazyListState, List list, boolean z9, com.stripe.android.paymentsheet.r rVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
            super(3);
            this.f7448a = z8;
            this.f7449b = lazyListState;
            this.f7450c = list;
            this.f7451d = z9;
            this.f7452e = rVar;
            this.f7453f = function0;
            this.f7454g = function1;
            this.f7455h = function12;
            this.f7456i = function13;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912695486, i9, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:138)");
            }
            LazyDslKt.LazyRow(null, this.f7449b, PaddingKt.m572PaddingValuesYgX7TsA$default(Dp.m5155constructorimpl(17), 0.0f, 2, null), false, null, null, null, !this.f7448a, new a(this.f7450c, this.f7448a, this.f7451d, this.f7452e, U.s(BoxWithConstraints.mo517getMaxWidthD9Ej5fM(), composer, 0), this.f7453f, this.f7454g, this.f7455h, this.f7456i), composer, 384, 121);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f7482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.r f7483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7485d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f7486e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f7487f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f7488g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7489h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f7490i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LazyListState f7491j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7492k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7493l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(List list, com.stripe.android.paymentsheet.r rVar, boolean z8, boolean z9, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, LazyListState lazyListState, int i8, int i9) {
            super(2);
            this.f7482a = list;
            this.f7483b = rVar;
            this.f7484c = z8;
            this.f7485d = z9;
            this.f7486e = function0;
            this.f7487f = function1;
            this.f7488g = function12;
            this.f7489h = function13;
            this.f7490i = modifier;
            this.f7491j = lazyListState;
            this.f7492k = i8;
            this.f7493l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            U.k(this.f7482a, this.f7483b, this.f7484c, this.f7485d, this.f7486e, this.f7487f, this.f7488g, this.f7489h, this.f7490i, this.f7491j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7492k | 1), this.f7493l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(float r29, boolean r30, kotlin.jvm.functions.Function0 r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.U.a(float, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(InterfaceC3813L cvcControllerFlow, boolean z8, int i8, int i9, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z9;
        AbstractC3292y.i(cvcControllerFlow, "cvcControllerFlow");
        Composer startRestartGroup = composer.startRestartGroup(685072799);
        if ((i11 & 4) != 0) {
            i12 = 500;
        } else {
            i12 = i8;
        }
        if ((i11 & 8) != 0) {
            i13 = 400;
        } else {
            i13 = i9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(685072799, i10, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField (SavedPaymentMethodTabLayoutUI.kt:431)");
        }
        State a9 = A4.f.a(cvcControllerFlow, startRestartGroup, 8);
        State a10 = A4.f.a(d(a9).getError(), startRestartGroup, 8);
        j4.S s8 = new j4.S(new r4.G(), d(a9));
        startRestartGroup.startReplaceableGroup(-1879197778);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1879196205);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Boolean.valueOf(z8), new b(z8, (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), null), startRestartGroup, ((i10 >> 3) & 14) | 64);
        Q5.I i14 = Q5.I.f8786a;
        startRestartGroup.startReplaceableGroup(-1879186954);
        if ((((i10 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(i13)) || (i10 & 3072) == 2048) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new c(i13, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(i14, (InterfaceC2072n) rememberedValue3, startRestartGroup, 70);
        AnimatedVisibilityKt.AnimatedVisibility(e(mutableState), (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(i12, i13, null, 4, null), null, false, d.f7365a, 6, null), (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1074270777, true, new e(a10, s8, z8, focusRequester)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(cvcControllerFlow, z8, i12, i13, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final j4.Q d(State state) {
        return (j4.Q) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(float r30, boolean r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.U.f(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(float r30, boolean r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.U.g(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(r.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        String a9;
        boolean z12;
        boolean z13;
        C c8;
        Composer startRestartGroup = composer.startRestartGroup(-411046220);
        if ((i9 & 512) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-411046220, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab (SavedPaymentMethodTabLayoutUI.kt:370)");
        }
        Integer e8 = B.e(dVar.e());
        C2.c d8 = B.d(dVar.e());
        startRestartGroup.startReplaceableGroup(358888102);
        if (d8 == null) {
            a9 = null;
        } else {
            a9 = AbstractC4246a.a(d8, startRestartGroup, 8);
        }
        startRestartGroup.endReplaceableGroup();
        if (a9 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new q(dVar, f8, z8, z9, z10, z11, function1, function12, function13, modifier2, i8, i9));
                return;
            }
            return;
        }
        Modifier.Companion companion = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(358890484);
        if ((((458752 & i8) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && startRestartGroup.changed(z11)) || (i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean changed = z12 | startRestartGroup.changed(a9);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(z8)) || (i8 & 384) == 256) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z14 = changed | z13;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new l(z11, a9, z8);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (z8 && z9 && z10) {
            c8 = C.f7149c;
        } else if (z8 && z9) {
            c8 = C.f7148b;
        } else {
            c8 = C.f7147a;
        }
        C c9 = c8;
        int g8 = B.g(dVar.e(), false, 1, null);
        C4127g d9 = dVar.d();
        String a10 = AbstractC1353a.a(AbstractC4246a.a(dVar.d().a(), startRestartGroup, 8));
        String a11 = AbstractC1353a.a(AbstractC4246a.a(dVar.d().c(), startRestartGroup, 8));
        Modifier modifier3 = modifier2;
        T.e(f8, z11, c9, z8, !z9, g8, modifier3, null, e8, a9, d9, a10, false, new m(function13, dVar), new n(function12, dVar), AbstractC1353a.a(AbstractC4246a.a(dVar.d().e(), startRestartGroup, 8)), a11, new o(function1, dVar), startRestartGroup, ((i8 >> 3) & 14) | ((i8 >> 12) & 112) | ((i8 << 3) & 7168) | ((i8 >> 9) & 3670016), 8, 4224);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p(dVar, f8, z8, z9, z10, z11, function1, function12, function13, modifier2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(com.stripe.android.paymentsheet.r r26, float r27, boolean r28, boolean r29, boolean r30, kotlin.jvm.functions.Function0 r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.U.i(com.stripe.android.paymentsheet.r, float, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void j(V interactor, c.j.b cvcRecollectionState, Modifier modifier, Composer composer, int i8) {
        int i9;
        Composer composer2;
        r.d dVar;
        com.stripe.android.model.o e8;
        int i10;
        int i11;
        int i12;
        AbstractC3292y.i(interactor, "interactor");
        AbstractC3292y.i(cvcRecollectionState, "cvcRecollectionState");
        AbstractC3292y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-1088084493);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(cvcRecollectionState)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088084493, i9, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:78)");
            }
            State a9 = A4.f.a(interactor.getState(), startRestartGroup, 8);
            composer2 = startRestartGroup;
            k(l(a9).d(), l(a9).e(), l(a9).f(), l(a9).g(), new r(interactor), new s(interactor), new t(interactor), new u(interactor), TestTagKt.testTag(modifier, "PaymentSheetSavedPaymentOptionTabLayout"), null, startRestartGroup, 8, 512);
            if (cvcRecollectionState instanceof c.j.b.C0033b) {
                com.stripe.android.paymentsheet.r e9 = l(a9).e();
                o.p pVar = null;
                if (e9 instanceof r.d) {
                    dVar = (r.d) e9;
                } else {
                    dVar = null;
                }
                if (dVar != null && (e8 = dVar.e()) != null) {
                    pVar = e8.f25635e;
                }
                if (pVar == o.p.f25755i) {
                    b(((c.j.b.C0033b) cvcRecollectionState).a(), l(a9).g(), 0, 0, composer2, 8, 12);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v(interactor, cvcRecollectionState, modifier, i8));
        }
    }

    public static final void k(List paymentOptionsItems, com.stripe.android.paymentsheet.r rVar, boolean z8, boolean z9, Function0 onAddCardPressed, Function1 onItemSelected, Function1 onModifyItem, Function1 onItemRemoved, Modifier modifier, LazyListState lazyListState, Composer composer, int i8, int i9) {
        Modifier modifier2;
        LazyListState lazyListState2;
        int i10;
        AbstractC3292y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3292y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3292y.i(onItemSelected, "onItemSelected");
        AbstractC3292y.i(onModifyItem, "onModifyItem");
        AbstractC3292y.i(onItemRemoved, "onItemRemoved");
        Composer startRestartGroup = composer.startRestartGroup(1549652);
        if ((i9 & 256) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 512) != 0) {
            i10 = i8 & (-1879048193);
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
        } else {
            lazyListState2 = lazyListState;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1549652, i10, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:136)");
        }
        Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 912695486, true, new w(z9, lazyListState2, paymentOptionsItems, z8, rVar, onAddCardPressed, onItemSelected, onModifyItem, onItemRemoved)), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x(paymentOptionsItems, rVar, z8, z9, onAddCardPressed, onItemSelected, onModifyItem, onItemRemoved, modifier3, lazyListState2, i8, i9));
        }
    }

    private static final V.a l(State state) {
        return (V.a) state.getValue();
    }

    public static final float s(float f8, Composer composer, int i8) {
        boolean z8;
        composer.startReplaceableGroup(-1122512013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1122512013, i8, -1, "com.stripe.android.paymentsheet.ui.rememberItemWidth (SavedPaymentMethodTabLayoutUI.kt:224)");
        }
        composer.startReplaceableGroup(697167163);
        if ((((i8 & 14) ^ 6) > 4 && composer.changed(f8)) || (i8 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Dp.m5153boximpl(Dp.m5155constructorimpl(Dp.m5155constructorimpl(f8 - Dp.m5155constructorimpl(Dp.m5155constructorimpl(17) * 2)) / (((int) (Dp.m5155constructorimpl(r0 * r3) / Dp.m5155constructorimpl(Dp.m5155constructorimpl(100) + Dp.m5155constructorimpl(Dp.m5155constructorimpl(6) * r0)))) / 2.0f)));
            composer.updateRememberedValue(rememberedValue);
        }
        float m5169unboximpl = ((Dp) rememberedValue).m5169unboximpl();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m5169unboximpl;
    }
}
