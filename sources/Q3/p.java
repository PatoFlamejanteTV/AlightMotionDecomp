package Q3;

import O3.AbstractC1353a;
import O3.AbstractC1376y;
import O3.B;
import Q5.I;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.model.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4127g;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8698a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m61invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m61invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f8699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4127g c4127g) {
            super(3);
            this.f8699a = c4127g;
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
                ComposerKt.traceEventStart(284170116, i8, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:49)");
            }
            o.g gVar = this.f8699a.d().f25638h;
            String str = gVar != null ? gVar.f25709l : null;
            int f8 = B.f(this.f8699a.d(), true);
            Alignment center = Alignment.Companion.getCenter();
            Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(4));
            r rVar = r.f8709a;
            AbstractC1376y.b(f8, null, center, P3.e.b(SizeKt.m629width3ABfNKs(SizeKt.m610height3ABfNKs(m577padding3ABfNKs, rVar.a()), rVar.b()), str), composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f8700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8702c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8703d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8704e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f8705f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f8706g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f8707h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f8708i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4127g c4127g, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, InterfaceC2073o interfaceC2073o, int i8, int i9) {
            super(2);
            this.f8700a = c4127g;
            this.f8701b = z8;
            this.f8702c = z9;
            this.f8703d = z10;
            this.f8704e = modifier;
            this.f8705f = function0;
            this.f8706g = interfaceC2073o;
            this.f8707h = i8;
            this.f8708i = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            p.a(this.f8700a, this.f8701b, this.f8702c, this.f8703d, this.f8704e, this.f8705f, this.f8706g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8707h | 1), this.f8708i);
        }
    }

    public static final void a(C4127g displayableSavedPaymentMethod, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, InterfaceC2073o interfaceC2073o, Composer composer, int i8, int i9) {
        boolean z11;
        int i10;
        Modifier modifier2;
        Function0 function02;
        InterfaceC2073o interfaceC2073o2;
        AbstractC3292y.i(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(-1517844735);
        if ((i9 & 4) != 0) {
            i10 = i8 & (-897);
            z11 = z8;
        } else {
            z11 = z9;
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 32) != 0) {
            function02 = a.f8698a;
        } else {
            function02 = function0;
        }
        if ((i9 & 64) != 0) {
            interfaceC2073o2 = null;
        } else {
            interfaceC2073o2 = interfaceC2073o;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1517844735, i10, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton (SavedPaymentMethodRowButton.kt:34)");
        }
        String a9 = AbstractC1353a.a(AbstractC4246a.a(displayableSavedPaymentMethod.a(), startRestartGroup, 8));
        C2.c d8 = B.d(displayableSavedPaymentMethod.d());
        if (d8 == null) {
            d8 = displayableSavedPaymentMethod.b();
        }
        String str = displayableSavedPaymentMethod.d().f25631a;
        Modifier modifier3 = modifier2;
        m.a(z8, z10, z11, ComposableLambdaKt.composableLambda(startRestartGroup, 284170116, true, new b(displayableSavedPaymentMethod)), AbstractC4246a.a(d8, startRestartGroup, 8), null, function02, a9, TestTagKt.testTag(modifier2, "saved_payment_method_row_button_" + str), interfaceC2073o2, startRestartGroup, ((i10 >> 3) & 14) | 199680 | ((i10 >> 6) & 112) | (i10 & 896) | (3670016 & (i10 << 3)) | ((i10 << 9) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(displayableSavedPaymentMethod, z8, z11, z10, modifier3, function02, interfaceC2073o2, i8, i9));
        }
    }
}
