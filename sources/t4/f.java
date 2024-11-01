package t4;

import Q5.I;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2076r;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f39607a = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t4.c f39609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f39610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f39611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f39612e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f39613f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2076r f39614g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f39615h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t4.c cVar, long j8, long j9, InterfaceC2073o interfaceC2073o, boolean z8, InterfaceC2076r interfaceC2076r, int i8) {
            super(2);
            this.f39609b = cVar;
            this.f39610c = j8;
            this.f39611d = j9;
            this.f39612e = interfaceC2073o;
            this.f39613f = z8;
            this.f39614g = interfaceC2076r;
            this.f39615h = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.this.a(this.f39609b, this.f39610c, this.f39611d, this.f39612e, this.f39613f, this.f39614g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39615h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39616a = new b();

        b() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateColor, Composer composer, int i8) {
            AbstractC3292y.i(animateColor, "$this$animateColor");
            composer.startReplaceableGroup(1796476355);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1796476355, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:434)");
            }
            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final c f39617a = new c();

        c() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateFloat, Composer composer, int i8) {
            AbstractC3292y.i(animateFloat, "$this$animateFloat");
            composer.startReplaceableGroup(-706009145);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-706009145, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:386)");
            }
            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final d f39618a = new d();

        d() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateColor, Composer composer, int i8) {
            AbstractC3292y.i(animateColor, "$this$animateColor");
            composer.startReplaceableGroup(-1399926130);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1399926130, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:424)");
            }
            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final e f39619a = new e();

        e() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateFloat, Composer composer, int i8) {
            FiniteAnimationSpec tween;
            AbstractC3292y.i(animateFloat, "$this$animateFloat");
            composer.startReplaceableGroup(-1726628034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1726628034, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:398)");
            }
            t4.c cVar = t4.c.f39571a;
            t4.c cVar2 = t4.c.f39572b;
            if (animateFloat.isTransitioningTo(cVar, cVar2)) {
                tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
            } else if (!animateFloat.isTransitioningTo(cVar2, cVar) && !animateFloat.isTransitioningTo(t4.c.f39573c, cVar2)) {
                tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            } else {
                tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween;
        }
    }

    /* renamed from: t4.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0894f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39620a;

        static {
            int[] iArr = new int[t4.c.values().length];
            try {
                iArr[t4.c.f39571a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t4.c.f39572b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t4.c.f39573c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39620a = iArr;
        }
    }

    private f() {
    }

    private static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final long d(State state) {
        return ((Color) state.getValue()).m2958unboximpl();
    }

    private static final long e(State state) {
        return ((Color) state.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01f9, code lost:            if (r32 != false) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ba, code lost:            if (r32 != false) goto L95;     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(t4.c r26, long r27, long r29, c6.InterfaceC2073o r31, boolean r32, c6.InterfaceC2076r r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.f.a(t4.c, long, long, c6.o, boolean, c6.r, androidx.compose.runtime.Composer, int):void");
    }
}
