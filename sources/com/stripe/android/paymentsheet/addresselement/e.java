package com.stripe.android.paymentsheet.addresselement;

import O3.AbstractC1356d;
import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
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
import com.stripe.android.paymentsheet.addresselement.e;
import com.stripe.android.paymentsheet.addresselement.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC3244b;
import k6.AbstractC3258j;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;
import n6.M;
import o4.AbstractC3539m;
import r4.C0;
import r4.s0;
import u2.AbstractC4075b;
import z4.AbstractC4271c;

/* loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N5.a f26893a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N5.a aVar, String str, int i8) {
            super(2);
            this.f26893a = aVar;
            this.f26894b = str;
            this.f26895c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.a(this.f26893a, this.f26894b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26895c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f26896a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Application application) {
            super(0);
            this.f26896a = application;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            return this.f26896a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusRequester f26898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusRequester focusRequester, U5.d dVar) {
            super(2, dVar);
            this.f26898b = focusRequester;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(FocusRequester focusRequester) {
            focusRequester.requestFocus();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f26898b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f26897a == 0) {
                t.b(obj);
                Handler handler = new Handler(Looper.getMainLooper());
                final FocusRequester focusRequester = this.f26898b;
                handler.post(new Runnable() { // from class: com.stripe.android.paymentsheet.addresselement.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c.j(FocusRequester.this);
                    }
                });
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26899a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26900a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.addresselement.g gVar) {
                super(0);
                this.f26900a = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5495invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5495invoke() {
                this.f26900a.l();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.paymentsheet.addresselement.g gVar) {
            super(2);
            this.f26899a = gVar;
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
                ComposerKt.traceEventStart(924601935, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:91)");
            }
            AbstractC1356d.a(false, new a(this.f26899a), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.addresselement.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0590e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26901a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.e$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26902a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.addresselement.g gVar) {
                super(0);
                this.f26902a = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5496invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5496invoke() {
                this.f26902a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0590e(com.stripe.android.paymentsheet.addresselement.g gVar) {
            super(2);
            this.f26901a = gVar;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            long m2947copywmQWz5c$default;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1873091664, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:96)");
            }
            if (AbstractC3539m.s(AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1159getSurface0d7_KjU())) {
                m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(Color.Companion.m2974getBlack0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(Color.Companion.m2985getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j8 = m2947copywmQWz5c$default;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxWidth$default(BackgroundKt.m259backgroundbw27NRU$default(Modifier.Companion, j8, null, 2, null), 0.0f, 1, null))), 0.0f, Dp.m5155constructorimpl(8), 1, null);
            com.stripe.android.paymentsheet.addresselement.g gVar = this.f26901a;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
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
            Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            w3.h.a(new a(gVar), composer, 0);
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
    public static final class f extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f26903a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26904b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f26905c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f26906d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f26907e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f26908f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ State f26909a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26910b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusRequester f26911c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ State f26912d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ State f26913e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Integer f26914f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.e$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0591a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26915a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ l4.d f26916b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0591a(com.stripe.android.paymentsheet.addresselement.g gVar, l4.d dVar) {
                    super(0);
                    this.f26915a = gVar;
                    this.f26916b = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5497invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5497invoke() {
                    this.f26915a.n(this.f26916b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(State state, com.stripe.android.paymentsheet.addresselement.g gVar, FocusRequester focusRequester, State state2, State state3, Integer num) {
                super(3);
                this.f26909a = state;
                this.f26910b = gVar;
                this.f26911c = focusRequester;
                this.f26912d = state2;
                this.f26913e = state3;
                this.f26914f = num;
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8786a;
            }

            public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i8) {
                Composer composer2 = composer;
                AbstractC3292y.i(ScrollableColumn, "$this$ScrollableColumn");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(186630339, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous>.<anonymous> (AutocompleteScreen.kt:125)");
                }
                Modifier.Companion companion = Modifier.Companion;
                float f8 = 0.0f;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                State state = this.f26909a;
                com.stripe.android.paymentsheet.addresselement.g gVar = this.f26910b;
                FocusRequester focusRequester = this.f26911c;
                State state2 = this.f26912d;
                State state3 = this.f26913e;
                Integer num = this.f26914f;
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor);
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
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f9 = 16;
                Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5155constructorimpl(f9), 0.0f, 2, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m579paddingVpY3zN4$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2473constructorimpl2 = Updater.m2473constructorimpl(composer);
                Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i9 = -483455358;
                com.stripe.android.paymentsheet.addresselement.g gVar2 = gVar;
                int i10 = 0;
                C0.e(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), focusRequester), gVar.k(), ImeAction.Companion.m4845getDoneeUduSuo(), true, false, null, null, composer, (s0.f38602x << 3) | 3456, 112);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (e.d(state2)) {
                    composer2.startReplaceableGroup(-1658727889);
                    AbstractC4075b.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, composer, 6, 2);
                    composer.endReplaceableGroup();
                } else if (!n.T((CharSequence) state.getValue())) {
                    composer2.startReplaceableGroup(-1658445913);
                    List<l4.d> c8 = e.c(state3);
                    if (c8 != null) {
                        composer2.startReplaceableGroup(-1854612285);
                        if (!c8.isEmpty()) {
                            float f10 = 8;
                            DividerKt.m1190DivideroMI9zvI(PaddingKt.m579paddingVpY3zN4$default(companion, 0.0f, Dp.m5155constructorimpl(f10), 1, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Function0 constructor3 = companion3.getConstructor();
                            InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer m2473constructorimpl3 = Updater.m2473constructorimpl(composer);
                            Updater.m2480setimpl(m2473constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            InterfaceC2072n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-915777576);
                            for (l4.d dVar : c8) {
                                SpannableString b9 = dVar.b();
                                SpannableString c9 = dVar.c();
                                com.stripe.android.paymentsheet.addresselement.g gVar3 = gVar2;
                                Modifier m578paddingVpY3zN4 = PaddingKt.m578paddingVpY3zN4(ClickableKt.m292clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.Companion, f8, 1, null), false, null, null, new C0591a(gVar3, dVar), 7, null), Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f10));
                                composer2.startReplaceableGroup(i9);
                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, i10);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i10);
                                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                Function0 constructor4 = companion4.getConstructor();
                                InterfaceC2073o modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m578paddingVpY3zN4);
                                if (!(composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer.useNode();
                                }
                                Composer m2473constructorimpl4 = Updater.m2473constructorimpl(composer);
                                Updater.m2480setimpl(m2473constructorimpl4, columnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                Updater.m2480setimpl(m2473constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                InterfaceC2072n setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                if (m2473constructorimpl4.getInserting() || !AbstractC3292y.d(m2473constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    m2473constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m2473constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                modifierMaterializerOf4.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer2, Integer.valueOf(i10));
                                composer2.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                List D8 = AbstractC3258j.D(l6.j.d(new l6.j(n.z((String) state.getValue(), " ", "|", false, 4, null), l6.l.f34786c), b9, i10, 2, null));
                                ArrayList arrayList = new ArrayList(AbstractC1435t.x(D8, 10));
                                Iterator it = D8.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((l6.h) it.next()).getValue());
                                }
                                ArrayList<String> arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (!n.T((String) obj)) {
                                        arrayList2.add(obj);
                                    }
                                }
                                String spannableString = b9.toString();
                                AbstractC3292y.h(spannableString, "toString(...)");
                                String str = spannableString;
                                for (String str2 : arrayList2) {
                                    str = n.z(str, str2, "<b>" + str2 + "</b>", false, 4, null);
                                }
                                AnnotatedString e8 = AbstractC4271c.e(str, null, null, composer, 0, 6);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i11 = MaterialTheme.$stable;
                                TextKt.m1392TextIbK3jfQ(e8, null, AbstractC3539m.n(materialTheme, composer2, i11).h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, materialTheme.getTypography(composer2, i11).getBody1(), composer, 0, 0, 131066);
                                String spannableString2 = c9.toString();
                                AbstractC3292y.h(spannableString2, "toString(...)");
                                TextKt.m1391Text4IGK_g(spannableString2, (Modifier) null, AbstractC3539m.n(materialTheme, composer, i11).h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i11).getBody1(), composer, 0, 0, 65530);
                                composer.endReplaceableGroup();
                                composer.endNode();
                                composer.endReplaceableGroup();
                                composer.endReplaceableGroup();
                                DividerKt.m1190DivideroMI9zvI(PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, Dp.m5155constructorimpl(f9), 0.0f, 2, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                                composer2 = composer;
                                f10 = f10;
                                i9 = -483455358;
                                i10 = 0;
                                f8 = 0.0f;
                                gVar2 = gVar3;
                            }
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                        }
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-1854521047);
                        if (num != null) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composer, 0), (String) null, TestTagKt.testTag(PaddingKt.m578paddingVpY3zN4(Modifier.Companion, Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f9)), "AutocompleteAttributionDrawable"), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                            I i12 = I.f8786a;
                        }
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1654922887);
                    composer.endReplaceableGroup();
                }
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
        f(State state, com.stripe.android.paymentsheet.addresselement.g gVar, FocusRequester focusRequester, State state2, State state3, Integer num) {
            super(3);
            this.f26903a = state;
            this.f26904b = gVar;
            this.f26905c = focusRequester;
            this.f26906d = state2;
            this.f26907e = state3;
            this.f26908f = num;
        }

        public final void a(PaddingValues paddingValues, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                if (composer.changed(paddingValues)) {
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
                ComposerKt.traceEventStart(-927416248, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:118)");
            }
            w3.g.a(PaddingKt.padding(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 1, null)), paddingValues), ComposableLambdaKt.composableLambda(composer, 186630339, true, new a(this.f26903a, this.f26904b, this.f26905c, this.f26906d, this.f26907e, this.f26908f)), composer, 48, 0);
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
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26917a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.paymentsheet.addresselement.g gVar, int i8) {
            super(2);
            this.f26917a = gVar;
            this.f26918b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            e.b(this.f26917a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26918b | 1));
        }
    }

    public static final void a(N5.a autoCompleteViewModelSubcomponentBuilderProvider, String str, Composer composer, int i8) {
        CreationExtras creationExtras;
        AbstractC3292y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        Composer startRestartGroup = composer.startRestartGroup(-1989348914);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1989348914, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreen (AutocompleteScreen.kt:57)");
        }
        Context applicationContext = ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
        AbstractC3292y.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        g.f fVar = new g.f(autoCompleteViewModelSubcomponentBuilderProvider, new g.c(str), new b((Application) applicationContext));
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) com.stripe.android.paymentsheet.addresselement.g.class, current, (String) null, fVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            b((com.stripe.android.paymentsheet.addresselement.g) viewModel, startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(autoCompleteViewModelSubcomponentBuilderProvider, str, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(com.stripe.android.paymentsheet.addresselement.g viewModel, Composer composer, int i8) {
        AbstractC3292y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-9884790);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9884790, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:74)");
        }
        State a9 = A4.f.a(viewModel.j(), startRestartGroup, 8);
        State a10 = A4.f.a(viewModel.i(), startRestartGroup, 8);
        State a11 = A4.f.a(viewModel.k().j(), startRestartGroup, 8);
        Integer d8 = InterfaceC3244b.a.d(InterfaceC3244b.f34501a, DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0), null, 2, null);
        startRestartGroup.startReplaceableGroup(703913545);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        I i9 = I.f8786a;
        startRestartGroup.startReplaceableGroup(703915444);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new c(focusRequester, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(i9, (InterfaceC2072n) rememberedValue2, startRestartGroup, 70);
        ScaffoldKt.m1297Scaffold27mzLpw(null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 924601935, true, new d(viewModel)), ComposableLambdaKt.composableLambda(startRestartGroup, 1873091664, true, new C0590e(viewModel)), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1159getSurface0d7_KjU(), 0L, ComposableLambdaKt.composableLambda(startRestartGroup, -927416248, true, new f(a11, viewModel, focusRequester, a10, a9, d8)), startRestartGroup, 3456, 12582912, 98291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(viewModel, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(State state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
