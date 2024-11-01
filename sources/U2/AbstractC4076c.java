package u2;

import Q5.I;
import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import g4.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import o4.C3537k;
import v3.s;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4076c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f40228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f40229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f40230c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RoundedCornerShape f40231d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BorderStroke f40232e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f40233f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f40234g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f40235h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextStyle f40236i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f40237j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f40238k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u2.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0900a extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f40239a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f40240b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextStyle f40241c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f40242d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f40243e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f40244f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0900a(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10) {
                super(3);
                this.f40239a = str;
                this.f40240b = j8;
                this.f40241c = textStyle;
                this.f40242d = z8;
                this.f40243e = z9;
                this.f40244f = z10;
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
                    ComposerKt.traceEventStart(-154386641, i8, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButton.kt:80)");
                }
                AbstractC4076c.b(this.f40239a, Color.m2947copywmQWz5c$default(this.f40240b, ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), this.f40241c, this.f40242d, this.f40243e, this.f40244f, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, Function0 function0, boolean z8, RoundedCornerShape roundedCornerShape, BorderStroke borderStroke, long j8, String str, long j9, TextStyle textStyle, boolean z9, boolean z10) {
            super(2);
            this.f40228a = modifier;
            this.f40229b = function0;
            this.f40230c = z8;
            this.f40231d = roundedCornerShape;
            this.f40232e = borderStroke;
            this.f40233f = j8;
            this.f40234g = str;
            this.f40235h = j9;
            this.f40236i = textStyle;
            this.f40237j = z9;
            this.f40238k = z10;
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
                ComposerKt.traceEventStart(-1403289044, i8, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:61)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(this.f40228a, 0.0f, 1, null);
            Alignment center = Alignment.Companion.getCenter();
            Function0 function0 = this.f40229b;
            boolean z8 = this.f40230c;
            RoundedCornerShape roundedCornerShape = this.f40231d;
            BorderStroke borderStroke = this.f40232e;
            long j8 = this.f40233f;
            String str = this.f40234g;
            long j9 = this.f40235h;
            TextStyle textStyle = this.f40236i;
            boolean z9 = this.f40237j;
            boolean z10 = this.f40238k;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ButtonKt.TextButton(function0, SizeKt.m609defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(s.f40544g, composer, 0), 1, null), z8, null, null, roundedCornerShape, borderStroke, ButtonDefaults.INSTANCE.m1119buttonColorsro_MJ88(j8, 0L, j8, 0L, composer, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.composableLambda(composer, -154386641, true, new C0900a(str, j9, textStyle, z8, z9, z10)), composer, 805306368, 280);
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
    /* renamed from: u2.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f40246b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f40247c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f40248d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f40249e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f40250f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f40251g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f40252h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z8, Function0 function0, Modifier modifier, boolean z9, boolean z10, int i8, int i9) {
            super(2);
            this.f40245a = str;
            this.f40246b = z8;
            this.f40247c = function0;
            this.f40248d = modifier;
            this.f40249e = z9;
            this.f40250f = z10;
            this.f40251g = i8;
            this.f40252h = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4076c.a(this.f40245a, this.f40246b, this.f40247c, this.f40248d, this.f40249e, this.f40250f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40251g | 1), this.f40252h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0901c extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40253a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f40255c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f40256d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f40257e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f40258f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f40259g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0901c(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, long j9, boolean z10) {
            super(3);
            this.f40253a = str;
            this.f40254b = j8;
            this.f40255c = textStyle;
            this.f40256d = z8;
            this.f40257e = z9;
            this.f40258f = j9;
            this.f40259g = z10;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
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
                ComposerKt.traceEventStart(1456958795, i9, -1, "com.stripe.android.common.ui.PrimaryButtonContent.<anonymous> (PrimaryButton.kt:106)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            TextKt.m1391Text4IGK_g(this.f40253a, BoxWithConstraints.align(companion, companion2.getCenter()), this.f40254b, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, this.f40255c, composer, 0, 0, 65528);
            if (this.f40256d) {
                composer.startReplaceableGroup(290615605);
                Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(SizeKt.m629width3ABfNKs(companion, BoxWithConstraints.mo517getMaxWidthD9Ej5fM()), 0.0f, 0.0f, Dp.m5155constructorimpl(8), 0.0f, 11, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
                InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m581paddingqDBjuR0$default);
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
                Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                AbstractC4075b.b(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterEnd()), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1152getOnPrimary0d7_KjU(), composer, 0, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (this.f40257e) {
                composer.startReplaceableGroup(291002144);
                Modifier m581paddingqDBjuR0$default2 = PaddingKt.m581paddingqDBjuR0$default(SizeKt.m629width3ABfNKs(companion, BoxWithConstraints.mo517getMaxWidthD9Ej5fM()), 0.0f, 0.0f, Dp.m5155constructorimpl(8), 0.0f, 11, null);
                long j8 = this.f40258f;
                boolean z8 = this.f40259g;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                Function0 constructor2 = companion4.getConstructor();
                InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m581paddingqDBjuR0$default2);
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
                Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Painter painterResource = PainterResources_androidKt.painterResource(k.f32335d, composer, 0);
                composer.startReplaceableGroup(747079535);
                float floatValue = z8 ? ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue() : 0.5f;
                composer.endReplaceableGroup();
                IconKt.m1243Iconww6aTOc(painterResource, "lock", boxScopeInstance.align(companion, companion2.getCenterEnd()), Color.m2947copywmQWz5c$default(j8, floatValue, 0.0f, 0.0f, 0.0f, 14, null), composer, 56, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(291697908);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f40262c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f40263d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f40264e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f40265f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f40266g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10, int i8) {
            super(2);
            this.f40260a = str;
            this.f40261b = j8;
            this.f40262c = textStyle;
            this.f40263d = z8;
            this.f40264e = z9;
            this.f40265f = z10;
            this.f40266g = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4076c.b(this.f40260a, this.f40261b, this.f40262c, this.f40263d, this.f40264e, this.f40265f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40266g | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r24, boolean r25, kotlin.jvm.functions.Function0 r26, androidx.compose.ui.Modifier r27, boolean r28, boolean r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.AbstractC4076c.a(java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(81045877);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(j8)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(z9)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(z10)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81045877, i9, -1, "com.stripe.android.common.ui.PrimaryButtonContent (PrimaryButton.kt:101)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(null, Alignment.Companion.getCenterStart(), false, ComposableLambdaKt.composableLambda(startRestartGroup, 1456958795, true, new C0901c(str, j8, textStyle, z9, z10, ColorKt.Color(AbstractC3539m.k(C3537k.f35998a.b(), (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), z8)), startRestartGroup, 3120, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(str, j8, textStyle, z8, z9, z10, i8));
        }
    }
}
