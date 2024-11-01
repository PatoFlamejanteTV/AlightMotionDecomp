package androidx.compose.ui.window;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {303}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$Popup$5 extends l implements InterfaceC2072n {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(long j8) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, d dVar) {
        super(2, dVar);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, dVar);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r3.L$0
            n6.M r1 = (n6.M) r1
            Q5.t.b(r4)
            goto L36
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1b:
            Q5.t.b(r4)
            java.lang.Object r4 = r3.L$0
            n6.M r4 = (n6.M) r4
            r1 = r4
        L23:
            boolean r4 = n6.N.g(r1)
            if (r4 == 0) goto L3c
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r4 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.AnonymousClass1.INSTANCE
            r3.L$0 = r1
            r3.label = r2
            java.lang.Object r4 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r3)
            if (r4 != r0) goto L36
            return r0
        L36:
            androidx.compose.ui.window.PopupLayout r4 = r3.$popupLayout
            r4.pollForLocationOnScreenChange()
            goto L23
        L3c:
            Q5.I r4 = Q5.I.f8786a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AndroidPopup_androidKt$Popup$5) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
