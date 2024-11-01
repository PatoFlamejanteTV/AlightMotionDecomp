package O3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;

/* renamed from: O3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1360h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1360h f7558a = new C1360h();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f7559b = ComposableLambdaKt.composableLambdaInstance(-1448355750, false, a.f7561a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2073o f7560c = ComposableLambdaKt.composableLambdaInstance(72907088, false, b.f7562a);

    /* renamed from: O3.h$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7561a = new a();

        a() {
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
                ComposerKt.traceEventStart(-1448355750, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SepaMandateActivityKt.lambda-1.<anonymous> (SepaMandateActivity.kt:93)");
            }
            IconKt.m1243Iconww6aTOc(PainterResources_androidKt.painterResource(v3.t.f40563r, composer, 0), StringResources_androidKt.stringResource(v3.w.f40581E, composer, 0), (Modifier) null, AbstractC3539m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).c(), composer, 8, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: O3.h$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7562a = new b();

        b() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(RowScope Button, Composer composer, int i8) {
            AbstractC3292y.i(Button, "$this$Button");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72907088, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SepaMandateActivityKt.lambda-2.<anonymous> (SepaMandateActivity.kt:123)");
            }
            TextKt.m1391Text4IGK_g(StringResources_androidKt.stringResource(g4.n.f32418o, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f7559b;
    }

    public final InterfaceC2073o b() {
        return f7560c;
    }
}
