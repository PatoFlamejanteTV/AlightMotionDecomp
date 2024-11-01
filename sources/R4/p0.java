package r4;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class p0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f38563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f38565c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f38566d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38567e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38568f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38569g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38570h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38571i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num, String str, Modifier modifier, boolean z8, boolean z9, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8, int i9) {
            super(2);
            this.f38563a = num;
            this.f38564b = str;
            this.f38565c = modifier;
            this.f38566d = z8;
            this.f38567e = z9;
            this.f38568f = interfaceC2072n;
            this.f38569g = interfaceC2072n2;
            this.f38570h = i8;
            this.f38571i = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.a(this.f38563a, this.f38564b, this.f38565c, this.f38566d, this.f38567e, this.f38568f, this.f38569g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38570h | 1), this.f38571i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38572a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2072n interfaceC2072n) {
            super(2);
            this.f38572a = interfaceC2072n;
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
                ComposerKt.traceEventStart(-72062207, i8, -1, "com.stripe.android.uicore.elements.SectionCard.<anonymous> (SectionUI.kt:93)");
            }
            InterfaceC2072n interfaceC2072n = this.f38572a;
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
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f38573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Shape f38574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38575c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f38576d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BorderStroke f38577e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38578f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38579g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38580h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Modifier modifier, Shape shape, boolean z8, long j8, BorderStroke borderStroke, InterfaceC2072n interfaceC2072n, int i8, int i9) {
            super(2);
            this.f38573a = modifier;
            this.f38574b = shape;
            this.f38575c = z8;
            this.f38576d = j8;
            this.f38577e = borderStroke;
            this.f38578f = interfaceC2072n;
            this.f38579g = i8;
            this.f38580h = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.b(this.f38573a, this.f38574b, this.f38575c, this.f38576d, this.f38577e, this.f38578f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38579g | 1), this.f38580h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f38581a = new d();

        d() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, int i8) {
            super(2);
            this.f38582a = str;
            this.f38583b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.c(this.f38582a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38583b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f38584a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.heading(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f38585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Integer num, int i8) {
            super(2);
            this.f38585a = num;
            this.f38586b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.d(this.f38585a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38586b | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Integer r30, java.lang.String r31, androidx.compose.ui.Modifier r32, boolean r33, boolean r34, c6.InterfaceC2072n r35, c6.InterfaceC2072n r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.p0.a(java.lang.Integer, java.lang.String, androidx.compose.ui.Modifier, boolean, boolean, c6.n, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.Modifier r23, androidx.compose.ui.graphics.Shape r24, boolean r25, long r26, androidx.compose.foundation.BorderStroke r28, c6.InterfaceC2072n r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.p0.b(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, boolean, long, androidx.compose.foundation.BorderStroke, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(String error, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        AbstractC3292y.i(error, "error");
        Composer startRestartGroup = composer.startRestartGroup(-985456758);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(error)) {
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
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985456758, i9, -1, "com.stripe.android.uicore.elements.SectionError (SectionUI.kt:104)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1391Text4IGK_g(error, SemanticsModifierKt.semantics(Modifier.Companion, true, d.f38581a), materialTheme.getColors(startRestartGroup, i11).m1149getError0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i11).getH6(), composer2, i9 & 14, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(error, i8));
        }
    }

    public static final void d(Integer num, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1654170730);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(num)) {
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
                ComposerKt.traceEventStart(1654170730, i9, -1, "com.stripe.android.uicore.elements.SectionTitle (SectionUI.kt:59)");
            }
            if (num != null) {
                F.a(StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, i9 & 14), SemanticsModifierKt.semantics(PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(4), 7, null), true, f.f38584a), startRestartGroup, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(num, i8));
        }
    }
}
