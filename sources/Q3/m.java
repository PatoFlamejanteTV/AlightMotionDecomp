package Q3;

import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f8615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8616b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8617c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8618d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8619e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f8620f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2073o interfaceC2073o, String str, String str2, boolean z8, String str3, InterfaceC2073o interfaceC2073o2) {
            super(3);
            this.f8615a = interfaceC2073o;
            this.f8616b = str;
            this.f8617c = str2;
            this.f8618d = z8;
            this.f8619e = str3;
            this.f8620f = interfaceC2073o2;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(ColumnScope RowButton, Composer composer, int i8) {
            AbstractC3292y.i(RowButton, "$this$RowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1618778555, i8, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButton.<anonymous> (PaymentMethodRowButton.kt:51)");
            }
            Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = Arrangement.INSTANCE.m491spacedBy0680j_4(Dp.m5155constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            InterfaceC2073o interfaceC2073o = this.f8615a;
            String str = this.f8616b;
            String str2 = this.f8617c;
            boolean z8 = this.f8618d;
            String str3 = this.f8619e;
            InterfaceC2073o interfaceC2073o2 = this.f8620f;
            composer.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m491spacedBy0680j_4, centerVertically, composer, 54);
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
            Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            interfaceC2073o.invoke(rowScopeInstance, composer, 6);
            m.b(str, str2, z8, str3, composer, 0);
            composer.startReplaceableGroup(-2131589125);
            if (interfaceC2073o2 != null) {
                SpacerKt.Spacer(androidx.compose.foundation.layout.e.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                interfaceC2073o2.invoke(rowScopeInstance, composer, 6);
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
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8622b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8623c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f8624d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8625e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f8626f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f8627g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f8628h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f8629i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f8630j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f8631k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f8632l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, boolean z10, InterfaceC2073o interfaceC2073o, String str, String str2, Function0 function0, String str3, Modifier modifier, InterfaceC2073o interfaceC2073o2, int i8, int i9) {
            super(2);
            this.f8621a = z8;
            this.f8622b = z9;
            this.f8623c = z10;
            this.f8624d = interfaceC2073o;
            this.f8625e = str;
            this.f8626f = str2;
            this.f8627g = function0;
            this.f8628h = str3;
            this.f8629i = modifier;
            this.f8630j = interfaceC2073o2;
            this.f8631k = i8;
            this.f8632l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            m.a(this.f8621a, this.f8622b, this.f8623c, this.f8624d, this.f8625e, this.f8626f, this.f8627g, this.f8628h, this.f8629i, this.f8630j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8631k | 1), this.f8632l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f8633a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            String str = this.f8633a;
            if (str != null) {
                SemanticsPropertiesKt.setContentDescription(semantics, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8636c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8637d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8638e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, boolean z8, String str3, int i8) {
            super(2);
            this.f8634a = str;
            this.f8635b = str2;
            this.f8636c = z8;
            this.f8637d = str3;
            this.f8638e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            m.b(this.f8634a, this.f8635b, this.f8636c, this.f8637d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8638e | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r26, boolean r27, boolean r28, c6.InterfaceC2073o r29, java.lang.String r30, java.lang.String r31, kotlin.jvm.functions.Function0 r32, java.lang.String r33, androidx.compose.ui.Modifier r34, c6.InterfaceC2073o r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.m.a(boolean, boolean, boolean, c6.o, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, String str2, boolean z8, String str3, Composer composer, int i8) {
        int i9;
        TextStyle m4696copyv2rsoow;
        long m2947copywmQWz5c$default;
        boolean z9;
        Composer composer2;
        TextStyle m4696copyv2rsoow2;
        long m2947copywmQWz5c$default2;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1878365604);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(str2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(str3)) {
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
                ComposerKt.traceEventStart(1878365604, i9, -1, "com.stripe.android.paymentsheet.verticalmode.TitleContent (PaymentMethodRowButton.kt:73)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            long h8 = AbstractC3539m.n(materialTheme, startRestartGroup, i14).h();
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
            Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle body1 = materialTheme.getTypography(startRestartGroup, i14).getBody1();
            FontWeight.Companion companion3 = FontWeight.Companion;
            m4696copyv2rsoow = body1.m4696copyv2rsoow((r48 & 1) != 0 ? body1.spanStyle.m4628getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? body1.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? body1.spanStyle.getFontWeight() : companion3.getMedium(), (r48 & 8) != 0 ? body1.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? body1.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? body1.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? body1.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? body1.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? body1.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? body1.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? body1.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? body1.spanStyle.m4626getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? body1.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? body1.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? body1.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5052boximpl(body1.paragraphStyle.m4584getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5066boximpl(body1.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? body1.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? body1.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? body1.platformStyle : null, (r48 & 1048576) != 0 ? body1.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4972boximpl(body1.paragraphStyle.m4581getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4962boximpl(body1.paragraphStyle.m4579getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? body1.paragraphStyle.getTextMotion() : null);
            if (z8) {
                m2947copywmQWz5c$default = h8;
            } else {
                m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(h8, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            int m5109getEllipsisgIe3tQ8 = TextOverflow.Companion.m5109getEllipsisgIe3tQ8();
            startRestartGroup.startReplaceableGroup(1678923623);
            if ((i9 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new c(str3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.m1391Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), m2947copywmQWz5c$default, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m5109getEllipsisgIe3tQ8, false, 1, 0, (Function1) null, m4696copyv2rsoow, startRestartGroup, i9 & 14, 3120, 55288);
            startRestartGroup.startReplaceableGroup(1678929216);
            if (str2 != null) {
                long j8 = AbstractC3539m.n(materialTheme, startRestartGroup, i14).j();
                m4696copyv2rsoow2 = r18.m4696copyv2rsoow((r48 & 1) != 0 ? r18.spanStyle.m4628getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r18.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r18.spanStyle.getFontWeight() : companion3.getNormal(), (r48 & 8) != 0 ? r18.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r18.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r18.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r18.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r18.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r18.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r18.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r18.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r18.spanStyle.m4626getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r18.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r18.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r18.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5052boximpl(r18.paragraphStyle.m4584getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5066boximpl(r18.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r18.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r18.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r18.platformStyle : null, (r48 & 1048576) != 0 ? r18.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4972boximpl(r18.paragraphStyle.m4581getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4962boximpl(r18.paragraphStyle.m4579getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? materialTheme.getTypography(startRestartGroup, i14).getCaption().paragraphStyle.getTextMotion() : null);
                if (z8) {
                    m2947copywmQWz5c$default2 = j8;
                } else {
                    m2947copywmQWz5c$default2 = Color.m2947copywmQWz5c$default(j8, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composer2 = startRestartGroup;
                TextKt.m1391Text4IGK_g(str2, (Modifier) null, m2947copywmQWz5c$default2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, m4696copyv2rsoow2, composer2, (i9 >> 3) & 14, 0, 65530);
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
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
            endRestartGroup.updateScope(new d(str, str2, z8, str3, i8));
        }
    }
}
