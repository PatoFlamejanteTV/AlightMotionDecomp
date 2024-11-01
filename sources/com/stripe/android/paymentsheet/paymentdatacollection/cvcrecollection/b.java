package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import O3.F;
import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldKt;
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
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import j4.AbstractC3183h0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.M;
import o4.AbstractC3539m;
import r4.C0;
import r4.X;
import r4.p0;
import r4.x0;
import v3.w;
import z4.AbstractC4269a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27511a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f27511a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5510invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5510invoke() {
            this.f27511a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0635b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27512a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f27513b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0635b(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f27512a = z8;
            this.f27513b = function0;
            this.f27514c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f27512a, this.f27513b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27514c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27515a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusRequester f27516b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusRequester focusRequester, U5.d dVar) {
            super(2, dVar);
            this.f27516b = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f27516b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f27515a == 0) {
                t.b(obj);
                this.f27516b.requestFocus();
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
        final /* synthetic */ long f27517a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27518b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f27519c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J3.g f27520d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f27521e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f27522f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27523a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1) {
                super(1);
                this.f27523a = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return I.f8786a;
            }

            public final void invoke(String it) {
                AbstractC3292y.i(it, "it");
                this.f27523a.invoke(it);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0636b extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ J3.g f27524a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0636b(J3.g gVar) {
                super(2);
                this.f27524a = gVar;
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
                    ComposerKt.traceEventStart(-173061439, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:199)");
                }
                X.a(StringResources_androidKt.stringResource(this.f27524a.d(), composer, 0), TestTagKt.testTag(Modifier.Companion, "TEST_TAG_CVC_LABEL"), false, composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ J3.g f27525a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J3.g gVar) {
                super(2);
                this.f27525a = gVar;
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
                    ComposerKt.traceEventStart(-1996484604, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:205)");
                }
                C0.u(this.f27525a.c(), false, null, composer, x0.c.f38702e | 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j8, Function1 function1, FocusRequester focusRequester, J3.g gVar, boolean z8, String str) {
            super(2);
            this.f27517a = j8;
            this.f27518b = function1;
            this.f27519c = focusRequester;
            this.f27520d = gVar;
            this.f27521e = z8;
            this.f27522f = str;
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
                ComposerKt.traceEventStart(-404027903, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous> (CvcRecollectionScreen.kt:139)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier height = IntrinsicKt.height(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), IntrinsicSize.Min);
            long j8 = this.f27517a;
            Function1 function1 = this.f27518b;
            FocusRequester focusRequester = this.f27519c;
            J3.g gVar = this.f27520d;
            boolean z8 = this.f27521e;
            String str = this.f27522f;
            composer.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(height);
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
            Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier m259backgroundbw27NRU$default = BackgroundKt.m259backgroundbw27NRU$default(SizeKt.fillMaxSize$default(rowScopeInstance.weight(companion, 0.5f, true), 0.0f, 1, null), j8, null, 2, null);
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m259backgroundbw27NRU$default);
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
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterStart()), Dp.m5155constructorimpl(12));
            Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = arrangement.m491spacedBy0680j_4(Dp.m5155constructorimpl(6));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m491spacedBy0680j_4, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m577padding3ABfNKs);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m2473constructorimpl3 = Updater.m2473constructorimpl(composer);
            Updater.m2480setimpl(m2473constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(gVar.a().k(), composer, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 124);
            String stringResource = StringResources_androidKt.stringResource(w.f40597U, new Object[]{" " + str}, composer, 64);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m1391Text4IGK_g(stringResource, TestTagKt.testTag(companion, "TEST_TAG_CVC_LAST_FOUR"), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i9).getBody1(), composer, 48, 0, 65532);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            DividerKt.m1190DivideroMI9zvI(SizeKt.fillMaxHeight$default(SizeKt.m629width3ABfNKs(companion, Dp.m5155constructorimpl(1)), 0.0f, 1, null), AbstractC3539m.n(materialTheme, composer, i9).e(), 0.0f, 0.0f, composer, 6, 12);
            List e8 = AbstractC1435t.e(AutofillType.CreditCardSecurityCode);
            composer.startReplaceableGroup(1517719920);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            TextFieldKt.TextField(gVar.b(), function1, TestTagKt.testTag(FocusRequesterModifierKt.focusRequester(rowScopeInstance.weight(SizeKt.fillMaxWidth$default(AbstractC4269a.a(companion, e8, (Function1) rememberedValue, composer, 54), 0.0f, 1, null), 0.5f, true), focusRequester), "TEST_TAG_CVC_FIELD"), z8, false, (TextStyle) null, (InterfaceC2072n) ComposableLambdaKt.composableLambda(composer, -173061439, true, new C0636b(gVar)), (InterfaceC2072n) null, (InterfaceC2072n) null, (InterfaceC2072n) ComposableLambdaKt.composableLambda(composer, -1996484604, true, new c(gVar)), false, (VisualTransformation) null, new KeyboardOptions(0, false, KeyboardType.Companion.m4896getNumberPasswordPjHm6EE(), 0, 11, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) materialTheme.getShapes(composer, i9).getLarge(), C0.d(false, composer, 0, 1), composer, 806879232, 24960, 241072);
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
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J3.g f27528c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f27529d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27530e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, boolean z8, J3.g gVar, Function1 function1, int i8) {
            super(2);
            this.f27526a = str;
            this.f27527b = z8;
            this.f27528c = gVar;
            this.f27529d = function1;
            this.f27530e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f27526a, this.f27527b, this.f27528c, this.f27529d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27530e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J3.e f27531a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f27532b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3289v implements Function1 {
            a(Object obj) {
                super(1, obj, J3.e.class, "onCvcChanged", "onCvcChanged(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3292y.i(p02, "p0");
                ((J3.e) this.receiver).b(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(J3.e eVar, State state) {
            super(2);
            this.f27531a = eVar;
            this.f27532b = state;
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
                ComposerKt.traceEventStart(66292912, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen.<anonymous> (CvcRecollectionScreen.kt:97)");
            }
            Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(BackgroundKt.m259backgroundbw27NRU$default(Modifier.Companion, AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1159getSurface0d7_KjU(), null, 2, null), Dp.m5155constructorimpl(20), 0.0f, 2, null);
            J3.e eVar = this.f27531a;
            State state = this.f27532b;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b.f(composer, 0);
            b.b(b.d(state).d(), b.d(state).e(), b.d(state).c(), new a(eVar), composer, 0);
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
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J3.e f27533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(J3.e eVar, int i8) {
            super(2);
            this.f27533a = eVar;
            this.f27534b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f27533a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27534b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27537c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J3.g f27538d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27539a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1) {
                super(0);
                this.f27539a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5511invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5511invoke() {
                this.f27539a.invoke(c.a.f27552a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$h$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0637b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27540a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0637b(Function1 function1) {
                super(1);
                this.f27540a = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return I.f8786a;
            }

            public final void invoke(String it) {
                AbstractC3292y.i(it, "it");
                this.f27540a.invoke(new c.C0638c(it));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27541a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Function1 function1) {
                super(0);
                this.f27541a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5512invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5512invoke() {
                this.f27541a.invoke(c.b.f27553a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, Function1 function1, String str, J3.g gVar) {
            super(2);
            this.f27535a = z8;
            this.f27536b = function1;
            this.f27537c = str;
            this.f27538d = gVar;
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
                ComposerKt.traceEventStart(891453526, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen.<anonymous> (CvcRecollectionScreen.kt:66)");
            }
            Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(BackgroundKt.m259backgroundbw27NRU$default(Modifier.Companion, AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1159getSurface0d7_KjU(), null, 2, null), Dp.m5155constructorimpl(20), 0.0f, 2, null);
            boolean z8 = this.f27535a;
            Function1 function1 = this.f27536b;
            String str = this.f27537c;
            J3.g gVar = this.f27538d;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(161246301);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            b.g(z8, (Function0) rememberedValue, composer, 0);
            b.f(composer, 0);
            composer.startReplaceableGroup(161256097);
            boolean changed2 = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new C0637b(function1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            b.b(str, true, gVar, (Function1) rememberedValue2, composer, 48);
            boolean e8 = gVar.e();
            composer.startReplaceableGroup(161261472);
            boolean changed3 = composer.changed(function1);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new c(function1);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            b.a(e8, (Function0) rememberedValue3, composer, 0);
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
    public static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ J3.g f27544c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f27545d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27546e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, boolean z8, J3.g gVar, Function1 function1, int i8) {
            super(2);
            this.f27542a = str;
            this.f27543b = z8;
            this.f27544c = gVar;
            this.f27545d = function1;
            this.f27546e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.e(this.f27542a, this.f27543b, this.f27544c, this.f27545d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27546e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27547a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i8) {
            super(2);
            this.f27547a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.f(composer, RecomposeScopeImplKt.updateChangedFlags(this.f27547a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function0 function0) {
            super(0);
            this.f27548a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5513invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5513invoke() {
            this.f27548a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f27550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f27549a = z8;
            this.f27550b = function0;
            this.f27551c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            b.g(this.f27549a, this.f27550b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27551c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z8, Function0 function0, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1690775401);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1690775401, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionButton (CvcRecollectionScreen.kt:252)");
            }
            boolean z9 = false;
            float f8 = 0;
            Modifier testTag = TestTagKt.testTag(PaddingKt.m580paddingqDBjuR0(SizeKt.fillMaxWidth(Modifier.Companion, 1.0f), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(32), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(20)), "CVC_CONFIRM");
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(w.f40582F, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(78261620);
            if ((i9 & 112) == 32) {
                z9 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            com.stripe.android.paymentsheet.ui.c.i(stringResource, false, z8, null, null, (Function0) rememberedValue, startRestartGroup, ((i9 << 6) & 896) | 48, 24);
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
            endRestartGroup.updateScope(new C0635b(z8, function0, i8));
        }
    }

    public static final void b(String lastFour, boolean z8, J3.g cvcState, Function1 onValueChanged, Composer composer, int i8) {
        int i9;
        long m2947copywmQWz5c$default;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(lastFour, "lastFour");
        AbstractC3292y.i(cvcState, "cvcState");
        AbstractC3292y.i(onValueChanged, "onValueChanged");
        Composer startRestartGroup = composer.startRestartGroup(715675132);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(lastFour)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(cvcState)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(onValueChanged)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(715675132, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField (CvcRecollectionScreen.kt:121)");
            }
            if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
                m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(Color.Companion.m2985getWhite0d7_KjU(), 0.075f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(Color.Companion.m2974getBlack0d7_KjU(), 0.075f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j8 = m2947copywmQWz5c$default;
            startRestartGroup.startReplaceableGroup(331793905);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(331795492);
            if (!((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                I i14 = I.f8786a;
                startRestartGroup.startReplaceableGroup(331797501);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new c(focusRequester, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(i14, (InterfaceC2072n) rememberedValue2, startRestartGroup, 70);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            p0.b(null, null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -404027903, true, new d(j8, onValueChanged, focusRequester, cvcState, z8, lastFour)), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(lastFour, z8, cvcState, onValueChanged, i8));
        }
    }

    public static final void c(J3.e interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3292y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-1132926818);
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
                ComposerKt.traceEventStart(-1132926818, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen (CvcRecollectionScreen.kt:93)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 66292912, true, new f(interactor, A4.f.a(interactor.a(), startRestartGroup, 8))), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(interactor, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J3.f d(State state) {
        return (J3.f) state.getValue();
    }

    public static final void e(String lastFour, boolean z8, J3.g cvcState, Function1 viewActionHandler, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(lastFour, "lastFour");
        AbstractC3292y.i(cvcState, "cvcState");
        AbstractC3292y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(-694222012);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(lastFour)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(cvcState)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(viewActionHandler)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-694222012, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen (CvcRecollectionScreen.kt:64)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 891453526, true, new h(z8, viewActionHandler, lastFour, cvcState)), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(lastFour, z8, cvcState, viewActionHandler, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(802797669);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802797669, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTitle (CvcRecollectionScreen.kt:239)");
            }
            float f8 = 0;
            AbstractC3183h0.a(StringResources_androidKt.stringResource(w.f40583G, startRestartGroup, 0), TestTagKt.testTag(PaddingKt.m580paddingqDBjuR0(Modifier.Companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(16)), "TEST_TAG_CONFIRM_CVC"), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new j(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z8, Function0 function0, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1018538037);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1018538037, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTopBar (CvcRecollectionScreen.kt:219)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean z9 = false;
            float f8 = 0;
            float f9 = 16;
            Modifier m610height3ABfNKs = SizeKt.m610height3ABfNKs(PaddingKt.m580paddingqDBjuR0(companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8)), Dp.m5155constructorimpl(32));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m610height3ABfNKs);
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
            startRestartGroup.startReplaceableGroup(-1173681114);
            if (z8) {
                F.d(startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(androidx.compose.foundation.layout.e.a(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1173676502);
            if ((i9 & 112) == 32) {
                z9 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new k(function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) rememberedValue, OffsetKt.m537offsetVpY3zN4(companion, Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(-Dp.m5155constructorimpl(8))), false, null, J3.b.f4086a.a(), startRestartGroup, 24576, 12);
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
            endRestartGroup.updateScope(new l(z8, function0, i8));
        }
    }
}
