package G3;

import Q5.I;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;
import n2.z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2826a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f2827b = ComposableLambdaKt.composableLambdaInstance(1407342519, false, C0048a.f2828a);

    /* renamed from: G3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0048a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0048a f2828a = new C0048a();

        C0048a() {
            super(2);
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
                ComposerKt.traceEventStart(1407342519, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.ComposableSingletons$USBankAccountFormKt.lambda-1.<anonymous> (USBankAccountForm.kt:448)");
            }
            IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(z.f35478N, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f2827b;
    }
}
