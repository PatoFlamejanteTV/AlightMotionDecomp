package O3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class E {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f7156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2072n interfaceC2072n) {
            super(2);
            this.f7156a = interfaceC2072n;
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
                ComposerKt.traceEventStart(2068457937, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold.<anonymous>.<anonymous> (PaymentSheetScaffold.kt:47)");
            }
            this.f7156a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f7157a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f7158b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f7159c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7160d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7161e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7157a = interfaceC2072n;
            this.f7158b = interfaceC2072n2;
            this.f7159c = modifier;
            this.f7160d = i8;
            this.f7161e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            E.a(this.f7157a, this.f7158b, this.f7159c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7160d | 1), this.f7161e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScrollState f7162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollState scrollState) {
            super(0);
            this.f7162a = scrollState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Dp.m5153boximpl(m20invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m20invokeD9Ej5fM() {
            if (this.f7162a.getValue() > 0) {
                return Dp.m5155constructorimpl(8);
            }
            return Dp.m5155constructorimpl(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(c6.InterfaceC2072n r25, c6.InterfaceC2072n r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.E.a(c6.n, c6.n, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float b(State state) {
        return ((Dp) state.getValue()).m5169unboximpl();
    }

    private static final float c(State state) {
        return ((Dp) state.getValue()).m5169unboximpl();
    }
}
