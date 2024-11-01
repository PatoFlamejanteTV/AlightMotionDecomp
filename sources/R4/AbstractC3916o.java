package r4;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.InfoKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import r4.C3914m;

/* renamed from: r4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3916o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.o$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3289v implements Function1 {
        a(Object obj) {
            super(1, obj, C3914m.class, "onValueChange", "onValueChange(Z)V", 0);
        }

        public final void d(boolean z8) {
            ((C3914m) this.receiver).z(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d(((Boolean) obj).booleanValue());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.o$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3914m f38538a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3914m c3914m) {
            super(2);
            this.f38538a = c3914m;
        }

        public final String a(Composer composer, int i8) {
            String stringResource;
            composer.startReplaceableGroup(-67320510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-67320510, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous> (CheckboxFieldUI.kt:52)");
            }
            C3914m.b x8 = this.f38538a.x();
            if (x8 == null) {
                stringResource = null;
            } else {
                int b9 = x8.b();
                Object[] a9 = x8.a();
                stringResource = StringResources_androidKt.stringResource(b9, Arrays.copyOf(a9, a9.length), composer, 64);
            }
            if (stringResource == null) {
                stringResource = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return stringResource;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.o$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f38539a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C c8) {
            super(2);
            this.f38539a = c8;
        }

        public final String a(Composer composer, int i8) {
            String stringResource;
            composer.startReplaceableGroup(-116662898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116662898, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous>.<anonymous> (CheckboxFieldUI.kt:58)");
            }
            Object[] b9 = this.f38539a.b();
            composer.startReplaceableGroup(-956550707);
            if (b9 == null) {
                stringResource = null;
            } else {
                stringResource = StringResources_androidKt.stringResource(this.f38539a.a(), Arrays.copyOf(b9, b9.length), composer, 64);
            }
            composer.endReplaceableGroup();
            if (stringResource == null) {
                stringResource = StringResources_androidKt.stringResource(this.f38539a.a(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return stringResource;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.o$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f38540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3914m f38541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38542c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f38543d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f38544e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier, C3914m c3914m, boolean z8, int i8, int i9) {
            super(2);
            this.f38540a = modifier;
            this.f38541b = c3914m;
            this.f38542c = z8;
            this.f38543d = i8;
            this.f38544e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3916o.a(this.f38540a, this.f38541b, this.f38542c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38543d | 1), this.f38544e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.o$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38545a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f38545a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setStateDescription(semantics, this.f38545a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.o$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f38546a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38547b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38548c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f38549d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f38550e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38551f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38552g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38553h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38554i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Modifier modifier, boolean z8, boolean z9, String str, Function1 function1, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8, int i9) {
            super(2);
            this.f38546a = modifier;
            this.f38547b = z8;
            this.f38548c = z9;
            this.f38549d = str;
            this.f38550e = function1;
            this.f38551f = interfaceC2072n;
            this.f38552g = interfaceC2072n2;
            this.f38553h = i8;
            this.f38554i = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3916o.d(this.f38546a, this.f38547b, this.f38548c, this.f38549d, this.f38550e, this.f38551f, this.f38552g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38553h | 1), this.f38554i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.o$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f38555a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f38556b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC2072n interfaceC2072n, long j8, int i8) {
            super(2);
            this.f38555a = interfaceC2072n;
            this.f38556b = j8;
            this.f38557c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3916o.e(this.f38555a, this.f38556b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38557c | 1));
        }
    }

    public static final void a(Modifier modifier, C3914m controller, boolean z8, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        c cVar;
        AbstractC3292y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(1442026933);
        if ((i9 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1442026933, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI (CheckboxFieldUI.kt:41)");
        }
        State a9 = A4.f.a(controller.y(), startRestartGroup, 8);
        State a10 = A4.f.a(controller.getError(), startRestartGroup, 8);
        boolean b9 = b(a9);
        String w8 = controller.w();
        a aVar = new a(controller);
        b bVar = new b(controller);
        C c8 = c(a10);
        if (c8 != null) {
            cVar = new c(c8);
        } else {
            cVar = null;
        }
        d(modifier2, b9, z9, w8, aVar, bVar, cVar, startRestartGroup, i8 & 910, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(modifier2, controller, z9, i8, i9));
        }
    }

    private static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final C c(State state) {
        return (C) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.Modifier r46, boolean r47, boolean r48, java.lang.String r49, kotlin.jvm.functions.Function1 r50, c6.InterfaceC2072n r51, c6.InterfaceC2072n r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.AbstractC3916o.d(androidx.compose.ui.Modifier, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function1, c6.n, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC2072n interfaceC2072n, long j8, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(701185681);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(j8)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        int i12 = i9;
        if ((i12 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(701185681, i12, -1, "com.stripe.android.uicore.elements.Error (CheckboxFieldUI.kt:140)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, Dp.m5155constructorimpl(f8), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            IconKt.m1244Iconww6aTOc(InfoKt.getInfo(Icons.Outlined.INSTANCE), (String) null, PaddingKt.m581paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5155constructorimpl(f8), 0.0f, 11, null), j8, startRestartGroup, ((i12 << 6) & 7168) | 432, 0);
            composer2 = startRestartGroup;
            TextKt.m1391Text4IGK_g((String) interfaceC2072n.invoke(startRestartGroup, Integer.valueOf(i12 & 14)), (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, (i12 << 3) & 896, 0, 131066);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(interfaceC2072n, j8, i8));
        }
    }
}
