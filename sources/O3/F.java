package O3;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.content.res.ResourcesCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import o4.C3538l;

/* loaded from: classes4.dex */
public abstract class F {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7163a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f7164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f7165c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Typeface f7166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, long j8, long j9, Typeface typeface) {
            super(2);
            this.f7163a = i8;
            this.f7164b = j8;
            this.f7165c = j9;
            this.f7166d = typeface;
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
                ComposerKt.traceEventStart(1983637009, i8, -1, "com.stripe.android.paymentsheet.ui.EditButton.<anonymous> (PaymentSheetTopBar.kt:133)");
            }
            String upperCase = StringResources_androidKt.stringResource(this.f7163a, composer, 0).toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            long j8 = this.f7164b;
            long j9 = this.f7165c;
            Typeface editButtonTypeface = this.f7166d;
            AbstractC3292y.h(editButtonTypeface, "$editButtonTypeface");
            TextKt.m1391Text4IGK_g(upperCase, (Modifier) null, j8, j9, (FontStyle) null, (FontWeight) null, AndroidTypeface_androidKt.FontFamily(editButtonTypeface), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 130994);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7167a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7168b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f7169c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7170d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7171e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i8, boolean z8, long j8, Function0 function0, int i9) {
            super(2);
            this.f7167a = i8;
            this.f7168b = z8;
            this.f7169c = j8;
            this.f7170d = function0;
            this.f7171e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            F.a(this.f7167a, this.f7168b, this.f7169c, this.f7170d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7171e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f7172a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7173b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7174c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f7175d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7176e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g8, boolean z8, Function0 function0, float f8, int i8, int i9) {
            super(2);
            this.f7172a = g8;
            this.f7173b = z8;
            this.f7174c = function0;
            this.f7175d = f8;
            this.f7176e = i8;
            this.f7177f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            F.b(this.f7172a, this.f7173b, this.f7174c, this.f7175d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7176e | 1), this.f7177f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f7178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G g8) {
            super(2);
            this.f7178a = g8;
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
                ComposerKt.traceEventStart(477178712, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:68)");
            }
            if (this.f7178a.f()) {
                F.d(composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7179a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextInputService f7180b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7181c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f7182d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f7183e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextInputService f7184a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f7185b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TextInputService textInputService, Function0 function0) {
                super(0);
                this.f7184a = textInputService;
                this.f7185b = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m21invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21invoke() {
                TextInputService textInputService = this.f7184a;
                if (textInputService != null) {
                    textInputService.hideSoftwareKeyboard();
                }
                this.f7185b.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G f7186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f7187b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(G g8, long j8) {
                super(2);
                this.f7186a = g8;
                this.f7187b = j8;
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
                    ComposerKt.traceEventStart(-430730, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous>.<anonymous> (PaymentSheetTopBar.kt:82)");
                }
                IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(this.f7186a.c(), composer, 0), StringResources_androidKt.stringResource(this.f7186a.a(), composer, 0), (Modifier) null, this.f7187b, composer, 8, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, TextInputService textInputService, Function0 function0, G g8, long j8) {
            super(2);
            this.f7179a = z8;
            this.f7180b = textInputService;
            this.f7181c = function0;
            this.f7182d = g8;
            this.f7183e = j8;
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
                ComposerKt.traceEventStart(-1292292902, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:73)");
            }
            IconButtonKt.IconButton(new a(this.f7180b, this.f7181c), TestTagKt.testTag(Modifier.Companion, "SHEET_NAVIGATION_BUTTON_TAG"), this.f7179a, null, ComposableLambdaKt.composableLambda(composer, -430730, true, new b(this.f7182d, this.f7183e)), composer, 24624, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f7188a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7189b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f7190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(G g8, boolean z8, long j8) {
            super(3);
            this.f7188a = g8;
            this.f7189b = z8;
            this.f7190c = j8;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(RowScope TopAppBar, Composer composer, int i8) {
            AbstractC3292y.i(TopAppBar, "$this$TopAppBar");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(858400579, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:92)");
            }
            if (this.f7188a.e()) {
                F.a(this.f7188a.b(), this.f7189b, this.f7190c, this.f7188a.d(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f7191a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7192b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f7193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f7194d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7195e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(G g8, boolean z8, float f8, Function0 function0, int i8) {
            super(2);
            this.f7191a = g8;
            this.f7192b = z8;
            this.f7193c = f8;
            this.f7194d = function0;
            this.f7195e = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            F.c(this.f7191a, this.f7192b, this.f7193c, this.f7194d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7195e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7196a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8) {
            super(2);
            this.f7196a = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            F.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.f7196a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i8, boolean z8, long j8, Function0 function0, Composer composer, int i9) {
        int i10;
        Typeface typeface;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-555214987);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(i8)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555214987, i10, -1, "com.stripe.android.paymentsheet.ui.EditButton (PaymentSheetTopBar.kt:110)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            o4.n p8 = AbstractC3539m.p(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable);
            startRestartGroup.startReplaceableGroup(-1272534780);
            boolean changed = startRestartGroup.changed(p8);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Integer f8 = p8.f();
                if (f8 == null || (typeface = ResourcesCompat.getFont(context, f8.intValue())) == null) {
                    typeface = Typeface.DEFAULT;
                }
                rememberedValue = typeface;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Typeface typeface2 = (Typeface) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1272529119);
            boolean changed2 = startRestartGroup.changed(p8);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = TextUnit.m5332boximpl(density.mo427toSp0xMU5do(Dp.m5155constructorimpl(Dp.m5155constructorimpl(TextUnit.m5342getValueimpl(C3538l.f36005a.f().p())) * p8.g())));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            long m5351unboximpl = ((TextUnit) rememberedValue2).m5351unboximpl();
            startRestartGroup.endReplaceableGroup();
            IconButtonKt.IconButton(function0, PaddingKt.m581paddingqDBjuR0$default(TestTagKt.testTag(Modifier.Companion, "PaymentSheetEditButton"), 0.0f, 0.0f, Dp.m5155constructorimpl(10), 0.0f, 11, null), z8, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1983637009, true, new a(i8, j8, m5351unboximpl, typeface2)), startRestartGroup, ((i10 >> 9) & 14) | 24624 | ((i10 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(i8, z8, j8, function0, i9));
        }
    }

    public static final void b(G g8, boolean z8, Function0 handleBackPressed, float f8, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC3292y.i(handleBackPressed, "handleBackPressed");
        Composer startRestartGroup = composer.startRestartGroup(1055582764);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(g8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
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
            if (startRestartGroup.changedInstance(handleBackPressed)) {
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
            if (startRestartGroup.changed(f8)) {
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
                f8 = Dp.m5155constructorimpl(0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055582764, i10, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:45)");
            }
            if (g8 != null) {
                c(g8, z8, f8, handleBackPressed, startRestartGroup, (i10 & 126) | ((i10 >> 3) & 896) | ((i10 << 3) & 7168));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        float f9 = f8;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(g8, z8, handleBackPressed, f9, i8, i9));
        }
    }

    public static final void c(G state, boolean z8, float f8, Function0 onNavigationIconPressed, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(onNavigationIconPressed, "onNavigationIconPressed");
        Composer startRestartGroup = composer.startRestartGroup(-1941081964);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(state)) {
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
            if (startRestartGroup.changed(f8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(onNavigationIconPressed)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        int i14 = i9;
        if ((i14 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1941081964, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:62)");
            }
            TextInputService textInputService = (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            long c8 = AbstractC3539m.n(materialTheme, startRestartGroup, i15).c();
            long m1159getSurface0d7_KjU = materialTheme.getColors(startRestartGroup, i15).m1159getSurface0d7_KjU();
            composer2 = startRestartGroup;
            AppBarKt.m1084TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(startRestartGroup, 477178712, true, new d(state)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1292292902, true, new e(z8, textInputService, onNavigationIconPressed, state, c8)), ComposableLambdaKt.composableLambda(startRestartGroup, 858400579, true, new f(state, z8, c8)), m1159getSurface0d7_KjU, 0L, f8, composer2, ((i14 << 12) & 3670016) | 3462, 34);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(state, z8, f8, onNavigationIconPressed, i8));
        }
    }

    public static final void d(Composer composer, int i8) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1806667293);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1806667293, i8, -1, "com.stripe.android.paymentsheet.ui.TestModeBadge (PaymentSheetTopBar.kt:144)");
            }
            long colorResource = ColorResources_androidKt.colorResource(v3.r.f40536d, startRestartGroup, 0);
            long colorResource2 = ColorResources_androidKt.colorResource(v3.r.f40537e, startRestartGroup, 0);
            Modifier m578paddingVpY3zN4 = PaddingKt.m578paddingVpY3zN4(BackgroundKt.m258backgroundbw27NRU(Modifier.Companion, colorResource, RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(5))), Dp.m5155constructorimpl(6), Dp.m5155constructorimpl(2));
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m578paddingVpY3zN4);
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
            composer2 = startRestartGroup;
            TextKt.m1391Text4IGK_g("TEST MODE", (Modifier) null, colorResource2, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, 196614, 0, 131034);
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
            endRestartGroup.updateScope(new h(i8));
        }
    }
}
