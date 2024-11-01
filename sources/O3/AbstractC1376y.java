package O3;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import x4.C4224g;

/* renamed from: O3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1376y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.y$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f7854a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2072n interfaceC2072n) {
            super(3);
            this.f7854a = interfaceC2072n;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer, int i8) {
            AbstractC3292y.i(StripeImage, "$this$StripeImage");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1956875215, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous>.<anonymous> (PaymentMethodIcon.kt:62)");
            }
            this.f7854a.invoke(composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.y$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f7855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2072n interfaceC2072n) {
            super(3);
            this.f7855a = interfaceC2072n;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer, int i8) {
            AbstractC3292y.i(StripeImage, "$this$StripeImage");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-155295931, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous>.<anonymous> (PaymentMethodIcon.kt:61)");
            }
            this.f7855a.invoke(composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.y$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7856a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4224g f7858c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7859d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f7860e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Alignment f7861f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7862g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7863h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, String str, C4224g c4224g, boolean z8, Modifier modifier, Alignment alignment, int i9, int i10) {
            super(2);
            this.f7856a = i8;
            this.f7857b = str;
            this.f7858c = c4224g;
            this.f7859d = z8;
            this.f7860e = modifier;
            this.f7861f = alignment;
            this.f7862g = i9;
            this.f7863h = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1376y.a(this.f7856a, this.f7857b, this.f7858c, this.f7859d, this.f7860e, this.f7861f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7862g | 1), this.f7863h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.y$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7864a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ColorFilter f7865b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Alignment f7866c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f7867d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i8, ColorFilter colorFilter, Alignment alignment, Modifier modifier) {
            super(2);
            this.f7864a = i8;
            this.f7865b = colorFilter;
            this.f7866c = alignment;
            this.f7867d = modifier;
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
                ComposerKt.traceEventStart(-1193756126, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous> (PaymentMethodIcon.kt:43)");
            }
            AbstractC1376y.b(this.f7864a, this.f7865b, this.f7866c, this.f7867d, composer, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.y$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7868a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ColorFilter f7869b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Alignment f7870c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f7871d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7872e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i8, ColorFilter colorFilter, Alignment alignment, Modifier modifier, int i9) {
            super(2);
            this.f7868a = i8;
            this.f7869b = colorFilter;
            this.f7870c = alignment;
            this.f7871d = modifier;
            this.f7872e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1376y.b(this.f7868a, this.f7869b, this.f7870c, this.f7871d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7872e | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r22, java.lang.String r23, x4.C4224g r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.Alignment r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.AbstractC1376y.a(int, java.lang.String, x4.g, boolean, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(int i8, ColorFilter colorFilter, Alignment alignment, Modifier modifier, Composer composer, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC3292y.i(alignment, "alignment");
        AbstractC3292y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-808382466);
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
            if (startRestartGroup.changed(colorFilter)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(alignment)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changed(modifier)) {
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
                ComposerKt.traceEventStart(-808382466, i10, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIconFromResource (PaymentMethodIcon.kt:79)");
            }
            if (i8 != 0) {
                ImageKt.Image(PainterResources_androidKt.painterResource(i8, startRestartGroup, i10 & 14), (String) null, TestTagKt.testTag(modifier, "PaymentMethodIconFomRes"), alignment, (ContentScale) null, 0.0f, colorFilter, startRestartGroup, ((i10 << 3) & 7168) | 56 | ((i10 << 15) & 3670016), 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i8, colorFilter, alignment, modifier, i9));
        }
    }
}
