package J3;

import Q5.I;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import c6.InterfaceC2072n;
import g3.EnumC2906e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.t;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4086a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f4087b = ComposableLambdaKt.composableLambdaInstance(-1155375669, false, a.f4089a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2072n f4088c = ComposableLambdaKt.composableLambdaInstance(-167185745, false, C0075b.f4090a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4089a = new a();

        a() {
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
                ComposerKt.traceEventStart(-1155375669, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-1.<anonymous> (CvcRecollectionScreen.kt:233)");
            }
            IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(t.f40563r, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: J3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0075b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0075b f4090a = new C0075b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4091a = new a();

            a() {
                super(1);
            }

            public final void a(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c it) {
                AbstractC3292y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c) obj);
                return I.f8786a;
            }
        }

        C0075b() {
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
                ComposerKt.traceEventStart(-167185745, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-2.<anonymous> (CvcRecollectionScreen.kt:274)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.e("4242", false, new g("", EnumC2906e.f32117o), a.f4091a, composer, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f4087b;
    }
}
