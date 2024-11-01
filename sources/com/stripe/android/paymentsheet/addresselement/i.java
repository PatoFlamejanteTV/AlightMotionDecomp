package com.stripe.android.paymentsheet.addresselement;

import O3.AbstractC1356d;
import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.paymentsheet.addresselement.j;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import r4.AbstractC3913l;
import u2.AbstractC4075b;
import u2.AbstractC4076c;
import v3.w;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f26962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f26963b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0597a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusManager f26964a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f26965b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0597a(FocusManager focusManager, Function0 function0) {
                super(0);
                this.f26964a = focusManager;
                this.f26965b = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5499invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5499invoke() {
                androidx.compose.ui.focus.b.a(this.f26964a, false, 1, null);
                this.f26965b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FocusManager focusManager, Function0 function0) {
            super(2);
            this.f26962a = focusManager;
            this.f26963b = function0;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833687647, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:45)");
            }
            AbstractC1356d.a(true, new C0597a(this.f26962a, this.f26963b), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f26967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f26968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f26970e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusManager f26971f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f26972g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f26973a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2073o f26974b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2073o f26975c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f26976d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f26977e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FocusManager f26978f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0 f26979g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0598a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FocusManager f26980a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0 f26981b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0598a(FocusManager focusManager, Function0 function0) {
                    super(0);
                    this.f26980a = focusManager;
                    this.f26981b = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5500invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5500invoke() {
                    androidx.compose.ui.focus.b.a(this.f26980a, false, 1, null);
                    this.f26981b.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, String str2, boolean z8, FocusManager focusManager, Function0 function0) {
                super(3);
                this.f26973a = str;
                this.f26974b = interfaceC2073o;
                this.f26975c = interfaceC2073o2;
                this.f26976d = str2;
                this.f26977e = z8;
                this.f26978f = focusManager;
                this.f26979g = function0;
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8786a;
            }

            public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i8) {
                AbstractC3292y.i(ScrollableColumn, "$this$ScrollableColumn");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(178055957, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:57)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(companion, Dp.m5155constructorimpl(20), 0.0f, 2, null);
                String str = this.f26973a;
                InterfaceC2073o interfaceC2073o = this.f26974b;
                InterfaceC2073o interfaceC2073o2 = this.f26975c;
                String str2 = this.f26976d;
                boolean z8 = this.f26977e;
                FocusManager focusManager = this.f26978f;
                Function0 function0 = this.f26979g;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m579paddingVpY3zN4$default);
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
                Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1391Text4IGK_g(str, PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH4(), composer, 48, 0, 65532);
                interfaceC2073o.invoke(columnScopeInstance, composer, 6);
                interfaceC2073o2.invoke(columnScopeInstance, composer, 6);
                AbstractC4076c.a(str2, z8, new C0598a(focusManager, function0), PaddingKt.m579paddingVpY3zN4$default(companion, 0.0f, Dp.m5155constructorimpl(16), 1, null), false, false, composer, 3072, 48);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, String str2, boolean z8, FocusManager focusManager, Function0 function0) {
            super(3);
            this.f26966a = str;
            this.f26967b = interfaceC2073o;
            this.f26968c = interfaceC2073o2;
            this.f26969d = str2;
            this.f26970e = z8;
            this.f26971f = focusManager;
            this.f26972g = function0;
        }

        public final void a(PaddingValues it, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(it, "it");
            if ((i8 & 14) == 0) {
                if (composer.changed(it)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 |= i9;
            }
            if ((i8 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(973020890, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:54)");
            }
            w3.g.a(PaddingKt.padding(Modifier.Companion, it), ComposableLambdaKt.composableLambda(composer, 178055957, true, new a(this.f26966a, this.f26967b, this.f26968c, this.f26969d, this.f26970e, this.f26971f, this.f26972g)), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26983b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26984c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f26985d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f26986e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f26987f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f26988g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26989h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, String str, String str2, Function0 function0, Function0 function02, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, int i8) {
            super(2);
            this.f26982a = z8;
            this.f26983b = str;
            this.f26984c = str2;
            this.f26985d = function0;
            this.f26986e = function02;
            this.f26987f = interfaceC2073o;
            this.f26988g = interfaceC2073o2;
            this.f26989h = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(this.f26982a, this.f26983b, this.f26984c, this.f26985d, this.f26986e, this.f26987f, this.f26988g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26989h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f26990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f26992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j jVar, State state, State state2) {
            super(0);
            this.f26990a = jVar;
            this.f26991b = state;
            this.f26992c = state2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5501invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5501invoke() {
            this.f26990a.j(i.d(this.f26991b), i.f(this.f26992c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f26993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j jVar) {
            super(0);
            this.f26993a = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5502invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5502invoke() {
            com.stripe.android.paymentsheet.addresselement.a.b(this.f26993a.r(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w3.i f26994a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f26995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(w3.i iVar, j jVar) {
            super(3);
            this.f26994a = iVar;
            this.f26995b = jVar;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i8) {
            AbstractC3292y.i(InputAddressScreen, "$this$InputAddressScreen");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(814782016, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:119)");
            }
            g4.i.b(this.f26994a.d(), this.f26995b.q(), this.f26994a.b(), this.f26994a.e(), null, composer, 4680, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f26996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26997b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f26998c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f26999a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ State f27000b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, State state) {
                super(1);
                this.f26999a = jVar;
                this.f27000b = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return I.f8786a;
            }

            public final void invoke(boolean z8) {
                this.f26999a.i(!i.f(this.f27000b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j jVar, State state, State state2) {
            super(3);
            this.f26996a = jVar;
            this.f26997b = state;
            this.f26998c = state2;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i8) {
            w3.d a9;
            AbstractC3292y.i(InputAddressScreen, "$this$InputAddressScreen");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1989616575, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:127)");
            }
            w3.e a10 = this.f26996a.l().a();
            String a11 = (a10 == null || (a9 = a10.a()) == null) ? null : a9.a();
            if (a11 != null) {
                State state = this.f26997b;
                AbstractC3913l.a(null, null, i.f(state), a11, i.e(this.f26998c), new a(this.f26996a, state), composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N5.a f27001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(N5.a aVar, int i8) {
            super(2);
            this.f27001a = aVar;
            this.f27002b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f27001a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27002b | 1));
        }
    }

    public static final void a(N5.a inputAddressViewModelSubcomponentBuilderProvider, Composer composer, int i8) {
        CreationExtras creationExtras;
        String str;
        AbstractC3292y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        Composer startRestartGroup = composer.startRestartGroup(1998888381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1998888381, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:84)");
        }
        j.d dVar = new j.d(inputAddressViewModelSubcomponentBuilderProvider);
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) j.class, current, (String) null, dVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            j jVar = (j) viewModel;
            State a9 = A4.f.a(jVar.p(), startRestartGroup, 8);
            String str2 = null;
            if (c(a9) == null) {
                startRestartGroup.startReplaceableGroup(-1514223121);
                AbstractC4075b.b(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0L, startRestartGroup, 6, 2);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1514070105);
                w3.i c8 = c(a9);
                if (c8 != null) {
                    State a10 = A4.f.a(c8.a(), startRestartGroup, 8);
                    w3.e a11 = jVar.l().a();
                    if (a11 != null) {
                        str = a11.l();
                    } else {
                        str = null;
                    }
                    startRestartGroup.startReplaceableGroup(-1988501175);
                    boolean z8 = false;
                    if (str == null) {
                        str = StringResources_androidKt.stringResource(w.f40629n, startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceableGroup();
                    w3.e a12 = jVar.l().a();
                    if (a12 != null) {
                        str2 = a12.s();
                    }
                    startRestartGroup.startReplaceableGroup(-1988495675);
                    if (str2 == null) {
                        str2 = StringResources_androidKt.stringResource(w.f40631o, startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceableGroup();
                    State a13 = A4.f.a(jVar.q(), startRestartGroup, 8);
                    State a14 = A4.f.a(jVar.m(), startRestartGroup, 8);
                    if (d(a10) != null) {
                        z8 = true;
                    }
                    b(z8, str, str2, new d(jVar, a10, a14), new e(jVar), ComposableLambdaKt.composableLambda(startRestartGroup, 814782016, true, new f(c8, jVar)), ComposableLambdaKt.composableLambda(startRestartGroup, -1989616575, true, new g(jVar, a14, a13)), startRestartGroup, 1769472);
                }
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new h(inputAddressViewModelSubcomponentBuilderProvider, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(boolean z8, String primaryButtonText, String title, Function0 onPrimaryButtonClick, Function0 onCloseClick, InterfaceC2073o formContent, InterfaceC2073o checkboxContent, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3292y.i(primaryButtonText, "primaryButtonText");
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(onPrimaryButtonClick, "onPrimaryButtonClick");
        AbstractC3292y.i(onCloseClick, "onCloseClick");
        AbstractC3292y.i(formContent, "formContent");
        AbstractC3292y.i(checkboxContent, "checkboxContent");
        Composer startRestartGroup = composer.startRestartGroup(642189468);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i9 = i16 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(primaryButtonText)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i9 |= i15;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(title)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i9 |= i14;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(onPrimaryButtonClick)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i9 |= i13;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changedInstance(onCloseClick)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i9 |= i12;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changedInstance(formContent)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i9 |= i11;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changedInstance(checkboxContent)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i9 |= i10;
        }
        if ((2995931 & i9) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(642189468, i9, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:37)");
            }
            FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            composer2 = startRestartGroup;
            ScaffoldKt.m1297Scaffold27mzLpw(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -833687647, true, new a(focusManager, onCloseClick)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1159getSurface0d7_KjU(), 0L, ComposableLambdaKt.composableLambda(composer2, 973020890, true, new b(title, formContent, checkboxContent, primaryButtonText, z8, focusManager, onPrimaryButtonClick)), composer2, 384, 12582912, 98298);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, primaryButtonText, title, onPrimaryButtonClick, onCloseClick, formContent, checkboxContent, i8));
        }
    }

    private static final w3.i c(State state) {
        return (w3.i) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d(State state) {
        return (Map) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
