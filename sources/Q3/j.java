package Q3;

import O3.W;
import Q3.i;
import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4127g;

/* loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8565a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4127g f8566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, C4127g c4127g) {
            super(0);
            this.f8565a = iVar;
            this.f8566b = c4127g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m55invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m55invoke() {
            this.f8565a.a(new i.b.c(this.f8566b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8567a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4127g f8568b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f8569c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f8570d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f8571a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f8571a = iVar;
            }

            public final void a(C4127g paymentMethod) {
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f8571a.a(new i.b.a(paymentMethod));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4127g) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q3.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0179b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f8572a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0179b(i iVar) {
                super(1);
                this.f8572a = iVar;
            }

            public final void a(C4127g paymentMethod) {
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f8572a.a(new i.b.C0178b(paymentMethod));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4127g) obj);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C4127g c4127g, State state, i iVar) {
            super(3);
            this.f8567a = z8;
            this.f8568b = c4127g;
            this.f8569c = state;
            this.f8570d = iVar;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3292y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(77758085, i8, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI.<anonymous>.<anonymous>.<anonymous> (ManageScreenUI.kt:40)");
            }
            j.c(this.f8567a, j.b(this.f8569c).e(), this.f8568b.f(), j.b(this.f8569c).b(), this.f8568b, new a(this.f8570d), new C0179b(this.f8570d), composer, 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i iVar, int i8) {
            super(2);
            this.f8573a = iVar;
            this.f8574b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            j.a(this.f8573a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8574b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8577c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8578d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4127g f8579e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f8580f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f8581g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f8582h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, boolean z10, boolean z11, C4127g c4127g, Function1 function1, Function1 function12, int i8) {
            super(2);
            this.f8575a = z8;
            this.f8576b = z9;
            this.f8577c = z10;
            this.f8578d = z11;
            this.f8579e = c4127g;
            this.f8580f = function1;
            this.f8581g = function12;
            this.f8582h = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            j.c(this.f8575a, this.f8576b, this.f8577c, this.f8578d, this.f8579e, this.f8580f, this.f8581g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8582h | 1));
        }
    }

    public static final void a(i interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3292y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-655977581);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-655977581, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI (ManageScreenUI.kt:18)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(v3.s.f40542e, startRestartGroup, 0);
            State a9 = A4.f.a(interactor.getState(), startRestartGroup, 8);
            Modifier testTag = TestTagKt.testTag(PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, dimensionResource, 0.0f, 2, null), "manage_screen_saved_pms_list");
            Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = Arrangement.INSTANCE.m491spacedBy0680j_4(Dp.m5155constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m491spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-648129373);
            for (C4127g c4127g : b(a9).d()) {
                boolean d8 = AbstractC3292y.d(c4127g, b(a9).c());
                p.a(c4127g, true, !b(a9).e(), d8, null, new a(interactor, c4127g), ComposableLambdaKt.composableLambda(startRestartGroup, 77758085, true, new b(d8, c4127g, a9, interactor)), startRestartGroup, 1572920, 16);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(interactor, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.a b(State state) {
        return (i.a) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z8, boolean z9, boolean z10, boolean z11, C4127g c4127g, Function1 function1, Function1 function12, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-176682203);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176682203, i8, -1, "com.stripe.android.paymentsheet.verticalmode.TrailingContent (ManageScreenUI.kt:75)");
        }
        if (z9 && z10) {
            startRestartGroup.startReplaceableGroup(-959522877);
            Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = Arrangement.INSTANCE.m491spacedBy0680j_4(Dp.m5155constructorimpl(12));
            startRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m491spacedBy0680j_4, Alignment.Companion.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            h.b(c4127g, function12, startRestartGroup, ((i8 >> 15) & 112) | 8);
            startRestartGroup.startReplaceableGroup(114380678);
            if (z11) {
                h.a(c4127g, function1, startRestartGroup, ((i8 >> 12) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else if (z9 && z11) {
            startRestartGroup.startReplaceableGroup(-959251782);
            h.a(c4127g, function1, startRestartGroup, ((i8 >> 12) & 112) | 8);
            startRestartGroup.endReplaceableGroup();
        } else if (z8) {
            startRestartGroup.startReplaceableGroup(-959169415);
            W.a(null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-959139624);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(z8, z9, z10, z11, c4127g, function1, function12, i8));
        }
    }
}
