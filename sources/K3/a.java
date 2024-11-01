package K3;

import Q5.I;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import g4.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;
import v3.s;
import v3.t;
import v3.w;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4578a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2073o f4579b = ComposableLambdaKt.composableLambdaInstance(-2126683352, false, C0081a.f4587a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2072n f4580c = ComposableLambdaKt.composableLambdaInstance(662623310, false, b.f4588a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC2072n f4581d = ComposableLambdaKt.composableLambdaInstance(792710640, false, c.f4589a);

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC2073o f4582e = ComposableLambdaKt.composableLambdaInstance(-1743939445, false, d.f4590a);

    /* renamed from: f, reason: collision with root package name */
    public static InterfaceC2072n f4583f = ComposableLambdaKt.composableLambdaInstance(2030747547, false, e.f4591a);

    /* renamed from: g, reason: collision with root package name */
    public static InterfaceC2072n f4584g = ComposableLambdaKt.composableLambdaInstance(1074415455, false, f.f4593a);

    /* renamed from: h, reason: collision with root package name */
    public static InterfaceC2072n f4585h = ComposableLambdaKt.composableLambdaInstance(-742473454, false, g.f4594a);

    /* renamed from: i, reason: collision with root package name */
    public static InterfaceC2072n f4586i = ComposableLambdaKt.composableLambdaInstance(-1698805546, false, h.f4596a);

    /* renamed from: K3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0081a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final C0081a f4587a = new C0081a();

        C0081a() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i8) {
            AbstractC3292y.i(TextButton, "$this$TextButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2126683352, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-1.<anonymous> (PollingScreen.kt:136)");
            }
            TextKt.m1391Text4IGK_g(StringResources_androidKt.stringResource(w.f40620i0, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4588a = new b();

        b() {
            super(2);
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
                ComposerKt.traceEventStart(662623310, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-2.<anonymous> (PollingScreen.kt:149)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4589a = new c();

        c() {
            super(2);
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
                ComposerKt.traceEventStart(792710640, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-3.<anonymous> (PollingScreen.kt:154)");
            }
            IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(t.f40552g, composer, 0), StringResources_androidKt.stringResource(n.f32394c, composer, 0), (Modifier) null, 0L, composer, 8, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4590a = new d();

        d() {
            super(3);
        }

        public final void a(PaddingValues paddingValues, Composer composer, int i8) {
            int i9;
            int i10;
            AbstractC3292y.i(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                if (composer.changed(paddingValues)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i8 | i10;
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1743939445, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-4.<anonymous> (PollingScreen.kt:164)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
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
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            SpacerKt.Spacer(androidx.compose.foundation.layout.d.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier m578paddingVpY3zN4 = PaddingKt.m578paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(s.f40542e, composer, 0), PrimitiveResources_androidKt.dimensionResource(s.f40543f, composer, 0));
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m578paddingVpY3zN4);
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
            Updater.m2480setimpl(m2473constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            Painter painterResource = PainterResources_androidKt.painterResource(t.f40568w, composer, 0);
            K3.g gVar = K3.g.f4633a;
            ImageKt.Image(painterResource, (String) null, PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, gVar.a(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
            String stringResource = StringResources_androidKt.stringResource(w.f40628m0, composer, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            TextStyle h42 = materialTheme.getTypography(composer, i11).getH4();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextKt.m1391Text4IGK_g(stringResource, PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, gVar.b(), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5052boximpl(companion4.m5059getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, h42, composer, 48, 0, 65020);
            String stringResource2 = StringResources_androidKt.stringResource(w.f40626l0, composer, 0);
            TextAlign m5052boximpl = TextAlign.m5052boximpl(companion4.m5059getCentere0LSkKk());
            long m4700getFontSizeXSAIIZE = materialTheme.getTypography(composer, i11).getBody1().m4700getFontSizeXSAIIZE();
            TextUnitKt.m5355checkArithmeticR2X_6o(m4700getFontSizeXSAIIZE);
            TextKt.m1391Text4IGK_g(stringResource2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, m5052boximpl, TextUnitKt.pack(TextUnit.m5340getRawTypeimpl(m4700getFontSizeXSAIIZE), TextUnit.m5342getValueimpl(m4700getFontSizeXSAIIZE) * 1.3f), 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 129534);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            SpacerKt.Spacer(androidx.compose.foundation.layout.d.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
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

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4591a = new e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0082a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0082a f4592a = new C0082a();

            C0082a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m17invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m17invoke() {
            }
        }

        e() {
            super(2);
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
                ComposerKt.traceEventStart(2030747547, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-5.<anonymous> (PollingScreen.kt:240)");
            }
            C3374a.C0804a c0804a = C3374a.f35036b;
            K3.d.c(new K3.f(AbstractC3376c.s(83, EnumC3377d.f35046e), w.f40624k0, K3.e.f4624a, null), C0082a.f4592a, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f4593a = new f();

        f() {
            super(2);
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
                ComposerKt.traceEventStart(1074415455, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-6.<anonymous> (PollingScreen.kt:239)");
            }
            SurfaceKt.m1330SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, a.f4578a.e(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f4594a = new g();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0083a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0083a f4595a = new C0083a();

            C0083a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m18invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18invoke() {
            }
        }

        g() {
            super(2);
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
                ComposerKt.traceEventStart(-742473454, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-7.<anonymous> (PollingScreen.kt:257)");
            }
            C3374a.C0804a c0804a = C3374a.f35036b;
            K3.d.c(new K3.f(AbstractC3376c.s(83, EnumC3377d.f35046e), w.f40624k0, K3.e.f4626c, null), C0083a.f4595a, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f4596a = new h();

        h() {
            super(2);
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
                ComposerKt.traceEventStart(-1698805546, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-8.<anonymous> (PollingScreen.kt:256)");
            }
            SurfaceKt.m1330SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, a.f4578a.f(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2073o a() {
        return f4579b;
    }

    public final InterfaceC2072n b() {
        return f4580c;
    }

    public final InterfaceC2072n c() {
        return f4581d;
    }

    public final InterfaceC2073o d() {
        return f4582e;
    }

    public final InterfaceC2072n e() {
        return f4583f;
    }

    public final InterfaceC2072n f() {
        return f4585h;
    }
}
