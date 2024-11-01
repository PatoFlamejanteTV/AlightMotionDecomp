package X2;

import P2.j;
import Q5.I;
import a3.C1666b;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;
import n2.AbstractC3394E;
import o4.AbstractC3532f;
import o4.C3537k;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final float f10971a = Dp.m5155constructorimpl(10);

    /* renamed from: b, reason: collision with root package name */
    private static final float f10972b = Dp.m5155constructorimpl(25);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f10973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f10974b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10975c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10976d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X2.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0232a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f10977a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f10978b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f10979c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f10980d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: X2.f$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0233a extends AbstractC3293z implements InterfaceC2073o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f10981a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0233a(String str) {
                    super(3);
                    this.f10981a = str;
                }

                @Override // c6.InterfaceC2073o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return I.f8786a;
                }

                public final void invoke(RowScope Button, Composer composer, int i8) {
                    AbstractC3292y.i(Button, "$this$Button");
                    if ((i8 & 14) == 0) {
                        i8 |= composer.changed(Button) ? 4 : 2;
                    }
                    if ((i8 & 91) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1019595551, i8, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButton.kt:127)");
                    }
                    if (this.f10981a == null) {
                        composer.startReplaceableGroup(2065964928);
                        f.f(Button, composer, i8 & 14);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(2066034740);
                        f.e(Button, this.f10981a, composer, i8 & 14);
                        composer.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0232a(Function0 function0, Modifier modifier, boolean z8, String str) {
                super(2);
                this.f10977a = function0;
                this.f10978b = modifier;
                this.f10979c = z8;
                this.f10980d = str;
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
                    ComposerKt.traceEventStart(123468017, i8, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous> (LinkButton.kt:106)");
                }
                Function0 function0 = this.f10977a;
                Modifier testTag = TestTagKt.testTag(ClipKt.clip(SizeKt.m609defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(this.f10978b, 0.0f, 1, null), 0.0f, Dp.m5155constructorimpl(48), 1, null), f.m()), "LinkButtonTestTag");
                boolean z8 = this.f10979c;
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                float f8 = 0;
                float m5155constructorimpl = Dp.m5155constructorimpl(f8);
                float m5155constructorimpl2 = Dp.m5155constructorimpl(f8);
                float m5155constructorimpl3 = Dp.m5155constructorimpl(f8);
                float m5155constructorimpl4 = Dp.m5155constructorimpl(f8);
                float m5155constructorimpl5 = Dp.m5155constructorimpl(f8);
                int i9 = ButtonDefaults.$stable;
                ButtonElevation m1120elevationR_JCAzs = buttonDefaults.m1120elevationR_JCAzs(m5155constructorimpl, m5155constructorimpl2, m5155constructorimpl3, m5155constructorimpl4, m5155constructorimpl5, composer, (i9 << 15) | 28086, 0);
                RoundedCornerShape m8 = f.m();
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i10 = MaterialTheme.$stable;
                ButtonKt.Button(function0, testTag, z8, null, m1120elevationR_JCAzs, m8, null, buttonDefaults.m1119buttonColorsro_MJ88(materialTheme.getColors(composer, i10).m1155getPrimary0d7_KjU(), 0L, materialTheme.getColors(composer, i10).m1155getPrimary0d7_KjU(), 0L, composer, i9 << 12, 10), PaddingKt.m573PaddingValuesa9UjIt4(f.f10972b, f.f10971a, f.f10972b, f.f10971a), ComposableLambdaKt.composableLambda(composer, -1019595551, true, new C0233a(this.f10980d)), composer, 905969664, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, Modifier modifier, boolean z8, String str) {
            super(2);
            this.f10973a = function0;
            this.f10974b = modifier;
            this.f10975c = z8;
            this.f10976d = str;
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
                ComposerKt.traceEventStart(173300341, i8, -1, "com.stripe.android.link.ui.LinkButton.<anonymous> (LinkButton.kt:105)");
            }
            W2.d.a(false, ComposableLambdaKt.composableLambda(composer, 123468017, true, new C0232a(this.f10973a, this.f10974b, this.f10975c, this.f10976d)), composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10983b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f10984c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f10985d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10986e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10987f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z8, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f10982a = str;
            this.f10983b = z8;
            this.f10984c = function0;
            this.f10985d = modifier;
            this.f10986e = i8;
            this.f10987f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.a(this.f10982a, this.f10983b, this.f10984c, this.f10985d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10986e | 1), this.f10987f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10988a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8) {
            super(2);
            this.f10988a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.f10988a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10989a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i8) {
            super(2);
            this.f10989a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.c(composer, RecomposeScopeImplKt.updateChangedFlags(this.f10989a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f10990a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i8) {
            super(2);
            this.f10990a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.f10990a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X2.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0234f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RowScope f10991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10993c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0234f(RowScope rowScope, String str, int i8) {
            super(2);
            this.f10991a = rowScope;
            this.f10992b = str;
            this.f10993c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.e(this.f10991a, this.f10992b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10993c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RowScope f10994a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(RowScope rowScope, int i8) {
            super(2);
            this.f10994a = rowScope;
            this.f10995b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.f(this.f10994a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10995b | 1));
        }
    }

    public static final void a(String str, boolean z8, Function0 onClick, Modifier modifier, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float disabled;
        AbstractC3292y.i(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1316244043);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((2 & i9) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(onClick)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        int i15 = i9 & 8;
        if (i15 != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i15 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316244043, i10, -1, "com.stripe.android.link.ui.LinkButton (LinkButton.kt:96)");
            }
            startRestartGroup.startReplaceableGroup(830337743);
            if (z8) {
                disabled = 1.0f;
            } else {
                disabled = ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, ComposableLambdaKt.composableLambda(startRestartGroup, 173300341, true, new a(onClick, modifier, z8, str)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(str, z8, onClick, modifier2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(414444570);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(414444570, i8, -1, "com.stripe.android.link.ui.LinkDivider (LinkButton.kt:237)");
            }
            DividerKt.m1190DivideroMI9zvI(SizeKt.fillMaxHeight$default(SizeKt.m629width3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(1)), 0.0f, 1, null), W2.d.b(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).c(), 0.0f, 0.0f, startRestartGroup, 6, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(594106890);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(594106890, i8, -1, "com.stripe.android.link.ui.LinkIcon (LinkButton.kt:225)");
            }
            IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3532f.f35947c, startRestartGroup, 0), StringResources_androidKt.stringResource(AbstractC3394E.f35271z0, startRestartGroup, 0), AlphaKt.alpha(AspectRatioKt.aspectRatio$default(Modifier.Companion, 2.7692308f, false, 2, null), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue()), Color.Companion.m2984getUnspecified0d7_KjU(), startRestartGroup, 3080, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Composer composer, int i8) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(628395052);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628395052, i8, -1, "com.stripe.android.link.ui.LinkIconAndDivider (LinkButton.kt:189)");
            }
            startRestartGroup.startReplaceableGroup(-1036640735);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                InlineTextContentKt.appendInlineContent(builder, "LinkIcon", "[icon]");
                InlineTextContentKt.appendInlineContent(builder, "LinkDividerSpacer", "[divider_spacer]");
                InlineTextContentKt.appendInlineContent(builder, "LinkDivider", "[divider]");
                InlineTextContentKt.appendInlineContent(builder, "LinkDividerSpacer", "[divider_spacer]");
                rememberedValue = builder.toAnnotatedString();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AnnotatedString annotatedString = (AnnotatedString) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            long sp = TextUnitKt.getSp(16);
            int m5109getEllipsisgIe3tQ8 = TextOverflow.Companion.m5109getEllipsisgIe3tQ8();
            C1666b c1666b = new C1666b();
            long em = TextUnitKt.getEm(3);
            long em2 = TextUnitKt.getEm(1.1d);
            X2.a aVar = X2.a.f10952a;
            C1666b.b(c1666b, "LinkIcon", em, em2, 0, aVar.b(), 8, null);
            C1666b.b(c1666b, "LinkDivider", TextUnitKt.getEm(0.1d), TextUnitKt.getEm(1.3d), 0, aVar.c(), 8, null);
            C1666b.d(c1666b, "LinkDividerSpacer", TextUnitKt.getEm(0.5d), 0, 4, null);
            I i9 = I.f8786a;
            Map e8 = c1666b.e();
            composer2 = startRestartGroup;
            TextKt.m1392TextIbK3jfQ(annotatedString, null, 0L, sp, null, null, null, 0L, null, null, 0L, m5109getEllipsisgIe3tQ8, false, 1, 0, e8, null, null, composer2, 3078, 265264, 219126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(RowScope rowScope, String str, Composer composer, int i8) {
        int i9;
        boolean z8;
        Composer composer2;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(295991352);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(rowScope)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(str)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(295991352, i9, -1, "com.stripe.android.link.ui.SignedInButtonContent (LinkButton.kt:138)");
            }
            startRestartGroup.startReplaceableGroup(-196631129);
            if ((i9 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(str);
                rememberedValue = builder.toAnnotatedString();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AnnotatedString annotatedString = (AnnotatedString) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            long m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(W2.d.b(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).d(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            d(startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.m1392TextIbK3jfQ(annotatedString, rowScope.weight(Modifier.Companion, 0.5f, false), m2947copywmQWz5c$default, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m5109getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composer2, 3072, 3120, 251888);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0234f(rowScope, str, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(RowScope rowScope, Composer composer, int i8) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1138308412);
        if ((i8 & 1) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1138308412, i8, -1, "com.stripe.android.link.ui.SignedOutButtonContent (LinkButton.kt:160)");
            }
            String stringResource = StringResources_androidKt.stringResource(j.f8046c, startRestartGroup, 0);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(n.K0(stringResource, "Link", null, 2, null));
            InlineTextContentKt.appendInlineContent(builder, "LinkIcon", "[icon]");
            builder.append(n.E0(stringResource, "Link", null, 2, null));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            int m5059getCentere0LSkKk = TextAlign.Companion.m5059getCentere0LSkKk();
            C1666b c1666b = new C1666b();
            C1666b.b(c1666b, "LinkIcon", TextUnitKt.getEm(2.6d), TextUnitKt.getEm(0.9d), 0, X2.a.f10952a.a(), 8, null);
            Map e8 = c1666b.e();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, Dp.m5155constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
            long m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(W2.d.b(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).d(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            long sp = TextUnitKt.getSp(21);
            int m5109getEllipsisgIe3tQ8 = TextOverflow.Companion.m5109getEllipsisgIe3tQ8();
            TextAlign m5052boximpl = TextAlign.m5052boximpl(m5059getCentere0LSkKk);
            composer2 = startRestartGroup;
            TextKt.m1392TextIbK3jfQ(annotatedString, fillMaxWidth$default, m2947copywmQWz5c$default, sp, null, null, null, 0L, null, m5052boximpl, 0L, m5109getEllipsisgIe3tQ8, false, 1, 0, e8, null, null, composer2, 3120, 265264, 218608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(rowScope, i8));
        }
    }

    public static final /* synthetic */ RoundedCornerShape m() {
        return o();
    }

    private static final RoundedCornerShape o() {
        return RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(C3537k.f35998a.b().d().b()));
    }
}
