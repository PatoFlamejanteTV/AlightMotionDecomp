package a3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1665a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1665a f14084a = new C1665a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f14085b = ComposableLambdaKt.composableLambdaInstance(-1700090362, false, C0278a.f14086a);

    /* renamed from: a3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0278a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0278a f14086a = new C0278a();

        C0278a() {
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
                ComposerKt.traceEventStart(-1700090362, i8, -1, "com.stripe.android.link.utils.ComposableSingletons$InlineContentTemplateBuilderKt.lambda-1.<anonymous> (InlineContentTemplateBuilder.kt:46)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f14085b;
    }
}
