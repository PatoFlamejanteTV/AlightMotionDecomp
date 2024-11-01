package O3;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4127g;

/* loaded from: classes4.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    private static final long f7271a = ColorKt.Color(2566914048L);

    /* renamed from: b, reason: collision with root package name */
    private static final long f7272b = Color.Companion.m2985getWhite0d7_KjU();

    /* renamed from: c, reason: collision with root package name */
    private static final long f7273c = ColorKt.Color(4293256682L);

    /* renamed from: d, reason: collision with root package name */
    private static final long f7274d = ColorKt.Color(4283585106L);

    /* renamed from: e, reason: collision with root package name */
    private static final float f7275e = Dp.m5155constructorimpl(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f7277b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f7278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7279d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7280e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7276a = str;
            this.f7277b = function0;
            this.f7278c = modifier;
            this.f7279d = i8;
            this.f7280e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.a(this.f7276a, this.f7277b, this.f7278c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7279d | 1), this.f7280e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f7282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f7283c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7284d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7285e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7281a = str;
            this.f7282b = function0;
            this.f7283c = modifier;
            this.f7284d = i8;
            this.f7285e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.b(this.f7281a, this.f7282b, this.f7283c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7284d | 1), this.f7285e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7286a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f7286a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m23invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m23invoke() {
            Function0 function0 = this.f7286a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f7287a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MutableState mutableState) {
            super(0);
            this.f7287a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m24invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m24invoke() {
            this.f7287a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7288a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f7289b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f7290c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7291d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7292e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f7293f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7294g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7295h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, C c8, MutableState mutableState, Function0 function0, String str, String str2, int i8, int i9) {
            super(2);
            this.f7288a = z8;
            this.f7289b = c8;
            this.f7290c = mutableState;
            this.f7291d = function0;
            this.f7292e = str;
            this.f7293f = str2;
            this.f7294g = i8;
            this.f7295h = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.c(this.f7288a, this.f7289b, this.f7290c, this.f7291d, this.f7292e, this.f7293f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7294g | 1), this.f7295h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7297b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7298c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7299d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7300e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Color f7301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z8, boolean z9, Function0 function0, int i8, Color color) {
            super(2);
            this.f7296a = str;
            this.f7297b = z8;
            this.f7298c = z9;
            this.f7299d = function0;
            this.f7300e = i8;
            this.f7301f = color;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            ColorFilter colorFilter;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852290854, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodCard.<anonymous> (SavedPaymentMethodTab.kt:188)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            Modifier m802selectableXHw0xAI$default = SelectableKt.m802selectableXHw0xAI$default(TestTagKt.testTag(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_" + this.f7296a), this.f7297b, this.f7298c, null, this.f7299d, 4, null);
            int i9 = this.f7300e;
            Color color = this.f7301f;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m802selectableXHw0xAI$default);
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
            Painter painterResource = PainterResources_androidKt.painterResource(i9, composer, 0);
            if (color != null) {
                colorFilter = ColorFilter.Companion.m2989tintxETnrds$default(ColorFilter.Companion, color.m2958unboximpl(), 0, 2, null);
            } else {
                colorFilter = null;
            }
            ImageKt.Image(painterResource, (String) null, SizeKt.m629width3ABfNKs(SizeKt.m610height3ABfNKs(companion, Dp.m5155constructorimpl(40)), Dp.m5155constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, colorFilter, composer, 440, 56);
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
        final /* synthetic */ boolean f7302a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7304c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Color f7305d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7306e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f7307f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f7308g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7309h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7310i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z8, boolean z9, int i8, Color color, String str, Function0 function0, Modifier modifier, int i9, int i10) {
            super(2);
            this.f7302a = z8;
            this.f7303b = z9;
            this.f7304c = i8;
            this.f7305d = color;
            this.f7306e = str;
            this.f7307f = function0;
            this.f7308g = modifier;
            this.f7309h = i9;
            this.f7310i = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.d(this.f7302a, this.f7303b, this.f7304c, this.f7305d, this.f7306e, this.f7307f, this.f7308g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7309h | 1), this.f7310i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f7312b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f7313c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7314d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7315e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f7316f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, C c8, MutableState mutableState, Function0 function0, String str, String str2) {
            super(3);
            this.f7311a = z8;
            this.f7312b = c8;
            this.f7313c = mutableState;
            this.f7314d = function0;
            this.f7315e = str;
            this.f7316f = str2;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(BoxScope BadgedBox, Composer composer, int i8) {
            AbstractC3292y.i(BadgedBox, "$this$BadgedBox");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355851704, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:89)");
            }
            T.c(this.f7311a, this.f7312b, this.f7313c, this.f7314d, this.f7315e, this.f7316f, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7318b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7319c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Color f7320d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7321e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f7322f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f7323g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f7324h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f7325i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f7326a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f7326a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Q5.I.f8786a;
            }

            public final void invoke(SemanticsPropertyReceiver semantics) {
                AbstractC3292y.i(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, AbstractC1353a.a(this.f7326a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z8, boolean z9, int i8, Color color, String str, Function0 function0, String str2, Integer num, boolean z10) {
            super(3);
            this.f7317a = z8;
            this.f7318b = z9;
            this.f7319c = i8;
            this.f7320d = color;
            this.f7321e = str;
            this.f7322f = function0;
            this.f7323g = str2;
            this.f7324h = num;
            this.f7325i = z10;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(BoxScope BadgedBox, Composer composer, int i8) {
            AbstractC3292y.i(BadgedBox, "$this$BadgedBox");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766600890, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:99)");
            }
            boolean z8 = this.f7317a;
            boolean z9 = this.f7318b;
            int i9 = this.f7319c;
            Color color = this.f7320d;
            String str = this.f7321e;
            Function0 function0 = this.f7322f;
            String str2 = this.f7323g;
            Integer num = this.f7324h;
            boolean z10 = this.f7325i;
            composer.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
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
            T.d(z8, z9, i9, color, str, function0, null, composer, 0, 64);
            long m1154getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1154getOnSurface0d7_KjU();
            float f8 = 6;
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(companion, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(4), Dp.m5155constructorimpl(f8), 0.0f, 8, null);
            composer.startReplaceableGroup(1159217395);
            boolean changed = composer.changed(str2);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(str2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            r.a(num, str, m1154getOnSurface0d7_KjU, SemanticsModifierKt.semantics$default(m581paddingqDBjuR0$default, false, (Function1) rememberedValue, 1, null), z10, composer, 0, 0);
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
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f7327a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f7328b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState, Function0 function0) {
            super(0);
            this.f7327a = mutableState;
            this.f7328b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            this.f7327a.setValue(Boolean.FALSE);
            this.f7328b.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f7329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MutableState mutableState) {
            super(0);
            this.f7329a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m26invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26invoke() {
            this.f7329a.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f7330a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7331b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C f7332c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7333d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7334e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7335f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f7336g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Color f7337h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f7338i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f7339j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C4127g f7340k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f7341l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f7342m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f7343n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f7344o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f7345p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f7346q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f7347r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7348s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7349t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f7350u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(float f8, boolean z8, C c8, boolean z9, boolean z10, int i8, Modifier modifier, Color color, Integer num, String str, C4127g c4127g, String str2, boolean z11, Function0 function0, Function0 function02, String str3, String str4, Function0 function03, int i9, int i10, int i11) {
            super(2);
            this.f7330a = f8;
            this.f7331b = z8;
            this.f7332c = c8;
            this.f7333d = z9;
            this.f7334e = z10;
            this.f7335f = i8;
            this.f7336g = modifier;
            this.f7337h = color;
            this.f7338i = num;
            this.f7339j = str;
            this.f7340k = c4127g;
            this.f7341l = str2;
            this.f7342m = z11;
            this.f7343n = function0;
            this.f7344o = function02;
            this.f7345p = str3;
            this.f7346q = str4;
            this.f7347r = function03;
            this.f7348s = i9;
            this.f7349t = i10;
            this.f7350u = i11;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            T.e(this.f7330a, this.f7331b, this.f7332c, this.f7333d, this.f7334e, this.f7335f, this.f7336g, this.f7337h, this.f7338i, this.f7339j, this.f7340k, this.f7341l, this.f7342m, this.f7343n, this.f7344o, this.f7345p, this.f7346q, this.f7347r, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7348s | 1), RecomposeScopeImplKt.updateChangedFlags(this.f7349t), this.f7350u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7351a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z8) {
            super(0);
            this.f7351a = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.f7351a), null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class n {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7352a;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.f7149c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.f7148b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.f7147a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7352a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r22, kotlin.jvm.functions.Function0 r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r22, kotlin.jvm.functions.Function0 r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T.b(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(boolean r18, O3.C r19, androidx.compose.runtime.MutableState r20, kotlin.jvm.functions.Function0 r21, java.lang.String r22, java.lang.String r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T.c(boolean, O3.C, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(boolean r20, boolean r21, int r22, androidx.compose.ui.graphics.Color r23, java.lang.String r24, kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T.d(boolean, boolean, int, androidx.compose.ui.graphics.Color, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(float r41, boolean r42, O3.C r43, boolean r44, boolean r45, int r46, androidx.compose.ui.Modifier r47, androidx.compose.ui.graphics.Color r48, java.lang.Integer r49, java.lang.String r50, v3.C4127g r51, java.lang.String r52, boolean r53, kotlin.jvm.functions.Function0 r54, kotlin.jvm.functions.Function0 r55, java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function0 r58, androidx.compose.runtime.Composer r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.T.e(float, boolean, O3.C, boolean, boolean, int, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, java.lang.Integer, java.lang.String, v3.g, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final float j() {
        return f7275e;
    }
}
