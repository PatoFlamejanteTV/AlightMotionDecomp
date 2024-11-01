package Y2;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11767a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f11768b = ComposableLambdaKt.composableLambdaInstance(633592435, false, C0260a.f11770a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2072n f11769c = ComposableLambdaKt.composableLambdaInstance(1366302894, false, b.f11771a);

    /* renamed from: Y2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0260a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0260a f11770a = new C0260a();

        C0260a() {
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
                ComposerKt.traceEventStart(633592435, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-1.<anonymous> (LinkInlineSignupFields.kt:63)");
            }
            i.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11771a = new b();

        b() {
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
                ComposerKt.traceEventStart(1366302894, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-2.<anonymous> (LinkInlineSignupFields.kt:76)");
            }
            i.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f11768b;
    }

    public final InterfaceC2072n b() {
        return f11769c;
    }
}
