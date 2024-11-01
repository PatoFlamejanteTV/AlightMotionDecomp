package O3;

import O3.C1367o;
import R5.AbstractC1435t;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import g3.EnumC2906e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import o4.C3529c;
import o4.C3537k;

/* renamed from: O3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1358f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1358f f7547a = new C1358f();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2073o f7548b = ComposableLambdaKt.composableLambdaInstance(334930206, false, a.f7550a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2072n f7549c = ComposableLambdaKt.composableLambdaInstance(-1877684654, false, b.f7551a);

    /* renamed from: O3.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7550a = new a();

        a() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i8) {
            AbstractC3292y.i(TextButton, "$this$TextButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334930206, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-1.<anonymous> (EditPaymentMethod.kt:210)");
            }
            TextKt.m1391Text4IGK_g(StringResources_androidKt.stringResource(v3.w.f40600X, composer, 0), (Modifier) null, Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1149getError0d7_KjU(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, AbstractC3539m.i(C3537k.f35998a.b(), composer, C3529c.f35936e), composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: O3.f$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7551a = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.f$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7552a = new a();

            a() {
                super(1);
            }

            public final void a(InterfaceC1365m it) {
                AbstractC3292y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC1365m) obj);
                return Q5.I.f8786a;
            }
        }

        b() {
            super(2);
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
                ComposerKt.traceEventStart(-1877684654, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-2.<anonymous> (EditPaymentMethod.kt:311)");
            }
            C1367o.b bVar = C1367o.b.f7727a;
            C2.c b9 = C2.d.b("Card");
            EnumC2906e enumC2906e = EnumC2906e.f32124v;
            AbstractC1364l.f(new C1367o(bVar, "4242", b9, true, new C1367o.a(enumC2906e), AbstractC1435t.p(new C1367o.a(EnumC2906e.f32117o), new C1367o.a(enumC2906e)), true, false, null, 384, null), a.f7552a, null, composer, 56, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2073o a() {
        return f7548b;
    }
}
