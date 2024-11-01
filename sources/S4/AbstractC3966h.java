package s4;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: s4.h */
/* loaded from: classes4.dex */
public abstract class AbstractC3966h {

    /* renamed from: s4.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        public static final a f39122a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ModalBottomSheetValue it) {
            AbstractC3292y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: s4.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        int f39123a;

        /* renamed from: b */
        int f39124b;

        /* renamed from: c */
        Object f39125c;

        /* renamed from: d */
        /* synthetic */ Object f39126d;

        /* renamed from: e */
        int f39127e;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39126d = obj;
            this.f39127e |= Integer.MIN_VALUE;
            return AbstractC3966h.c(0, null, this);
        }
    }

    public static final /* synthetic */ Object a(int i8, Function1 function1, U5.d dVar) {
        return c(i8, function1, dVar);
    }

    public static final C3965g b(ModalBottomSheetValue modalBottomSheetValue, Function1 function1, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(2070707701);
        if ((i9 & 1) != 0) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        }
        ModalBottomSheetValue modalBottomSheetValue2 = modalBottomSheetValue;
        if ((i9 & 2) != 0) {
            function1 = a.f39122a;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2070707701, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetState (StripeBottomSheetState.kt:22)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue2, (AnimationSpec<Float>) AnimationSpecKt.tween$default(0, 0, null, 7, null), function12, true, composer, (i8 & 14) | 3120 | ((i8 << 3) & 896), 0);
        C3960b a9 = AbstractC3961c.a(composer, 0);
        composer.startReplaceableGroup(-21674716);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3965g(rememberModalBottomSheetState, a9);
            composer.updateRememberedValue(rememberedValue);
        }
        C3965g c3965g = (C3965g) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3965g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0053
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(int r4, kotlin.jvm.functions.Function1 r5, U5.d r6) {
        /*
            boolean r0 = r6 instanceof s4.AbstractC3966h.b
            if (r0 == 0) goto L13
            r0 = r6
            s4.h$b r0 = (s4.AbstractC3966h.b) r0
            int r1 = r0.f39127e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39127e = r1
            goto L18
        L13:
            s4.h$b r0 = new s4.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39126d
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f39127e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r4 = r0.f39124b
            int r5 = r0.f39123a
            java.lang.Object r2 = r0.f39125c
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            Q5.t.b(r6)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L55
        L31:
            r6 = r2
            goto L53
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Q5.t.b(r6)
            r6 = 0
            r6 = r5
            r5 = r4
            r4 = 0
        L42:
            if (r4 >= r5) goto L55
            r0.f39125c = r6     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f39123a = r5     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f39124b = r4     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f39127e = r3     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r4 = r6.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L53
            if (r4 != r1) goto L55
            return r1
        L53:
            int r4 = r4 + r3
            goto L42
        L55:
            Q5.I r4 = Q5.I.f8786a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC3966h.c(int, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }
}
