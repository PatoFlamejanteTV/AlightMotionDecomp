package Q3;

import O3.AbstractC1376y;
import Q5.I;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import x4.C4224g;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f8583a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.f8583a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m56invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m56invoke() {
            this.f8583a.g().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f8586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4224g f8587d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8588e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8589f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8590g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, e eVar, C4224g c4224g, Modifier modifier, int i8, int i9) {
            super(2);
            this.f8584a = z8;
            this.f8585b = z9;
            this.f8586c = eVar;
            this.f8587d = c4224g;
            this.f8588e = modifier;
            this.f8589f = i8;
            this.f8590g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            k.b(this.f8584a, this.f8585b, this.f8586c, this.f8587d, this.f8588e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8589f | 1), this.f8590g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8592b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4224g f8593c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8594d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8595e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, String str, C4224g c4224g, boolean z8, Modifier modifier) {
            super(3);
            this.f8591a = i8;
            this.f8592b = str;
            this.f8593c = c4224g;
            this.f8594d = z8;
            this.f8595e = modifier;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3292y.i(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213494546, i8, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton.<anonymous> (NewPaymentMethodRowButton.kt:65)");
            }
            int i9 = this.f8591a;
            String str = this.f8592b;
            C4224g c4224g = this.f8593c;
            boolean z8 = this.f8594d;
            Modifier modifier = this.f8595e;
            r rVar = r.f8709a;
            AbstractC1376y.a(i9, str, c4224g, z8, SizeKt.m629width3ABfNKs(SizeKt.m610height3ABfNKs(modifier, rVar.a()), rVar.b()), Alignment.Companion.getCenter(), composer, (C4224g.f41044g << 6) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8597b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8598c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8599d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4224g f8600e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f8601f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8602g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f8603h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f8604i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f8605j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f8606k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f8607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, int i8, String str, C4224g c4224g, String str2, String str3, boolean z10, Function0 function0, Modifier modifier, int i9, int i10) {
            super(2);
            this.f8596a = z8;
            this.f8597b = z9;
            this.f8598c = i8;
            this.f8599d = str;
            this.f8600e = c4224g;
            this.f8601f = str2;
            this.f8602g = str3;
            this.f8603h = z10;
            this.f8604i = function0;
            this.f8605j = modifier;
            this.f8606k = i9;
            this.f8607l = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            k.a(this.f8596a, this.f8597b, this.f8598c, this.f8599d, this.f8600e, this.f8601f, this.f8602g, this.f8603h, this.f8604i, this.f8605j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8606k | 1), this.f8607l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r22, boolean r23, int r24, java.lang.String r25, x4.C4224g r26, java.lang.String r27, java.lang.String r28, boolean r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.k.a(boolean, boolean, int, java.lang.String, x4.g, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z8, boolean z9, e displayablePaymentMethod, C4224g imageLoader, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        String f8;
        String a9;
        AbstractC3292y.i(displayablePaymentMethod, "displayablePaymentMethod");
        AbstractC3292y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(-585829252);
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-585829252, i8, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:26)");
        }
        if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) && displayablePaymentMethod.b() != null) {
            f8 = displayablePaymentMethod.b();
        } else {
            f8 = displayablePaymentMethod.f();
        }
        String str = f8;
        int e8 = displayablePaymentMethod.e();
        String a10 = AbstractC4246a.a(displayablePaymentMethod.c(), startRestartGroup, 8);
        C2.c h8 = displayablePaymentMethod.h();
        startRestartGroup.startReplaceableGroup(-1560062597);
        if (h8 == null) {
            a9 = null;
        } else {
            a9 = AbstractC4246a.a(h8, startRestartGroup, 8);
        }
        String str2 = a9;
        startRestartGroup.endReplaceableGroup();
        a(z8, z9, e8, str, imageLoader, a10, str2, displayablePaymentMethod.d(), new a(displayablePaymentMethod), TestTagKt.testTag(modifier2, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_" + displayablePaymentMethod.a()), startRestartGroup, (i8 & 126) | (C4224g.f41044g << 12) | ((i8 << 3) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, z9, displayablePaymentMethod, imageLoader, modifier2, i8, i9));
        }
    }
}
