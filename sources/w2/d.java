package W2;

import Q5.I;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f10759a = CompositionLocalKt.staticCompositionLocalOf(c.f10766a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W2.b f10760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f10761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W2.b bVar, InterfaceC2072n interfaceC2072n) {
            super(2);
            this.f10760a = bVar;
            this.f10761b = interfaceC2072n;
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
                ComposerKt.traceEventStart(1467984557, i8, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous> (Theme.kt:19)");
            }
            MaterialThemeKt.MaterialTheme(this.f10760a.g(), e.a(), MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable), this.f10761b, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f10762a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f10763b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10764c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10765d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, InterfaceC2072n interfaceC2072n, int i8, int i9) {
            super(2);
            this.f10762a = z8;
            this.f10763b = interfaceC2072n;
            this.f10764c = i8;
            this.f10765d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            d.a(this.f10762a, this.f10763b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10764c | 1), this.f10765d);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10766a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W2.b invoke() {
            return W2.c.f10756a.a(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:            if ((r10 & 1) != 0) goto L35;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r6, c6.InterfaceC2072n r7, androidx.compose.runtime.Composer r8, int r9, int r10) {
        /*
            r0 = 0
            r1 = 2
            r2 = 1
            java.lang.String r3 = "content"
            kotlin.jvm.internal.AbstractC3292y.i(r7, r3)
            r3 = -327817747(0xffffffffec75e5ed, float:-1.1890905E27)
            androidx.compose.runtime.Composer r8 = r8.startRestartGroup(r3)
            r4 = r9 & 14
            if (r4 != 0) goto L22
            r4 = r10 & 1
            if (r4 != 0) goto L1f
            boolean r4 = r8.changed(r6)
            if (r4 == 0) goto L1f
            r4 = 4
            goto L20
        L1f:
            r4 = 2
        L20:
            r4 = r4 | r9
            goto L23
        L22:
            r4 = r9
        L23:
            r1 = r1 & r10
            if (r1 == 0) goto L29
            r4 = r4 | 48
            goto L39
        L29:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L39
            boolean r1 = r8.changedInstance(r7)
            if (r1 == 0) goto L36
            r1 = 32
            goto L38
        L36:
            r1 = 16
        L38:
            r4 = r4 | r1
        L39:
            r1 = r4 & 91
            r5 = 18
            if (r1 != r5) goto L4a
            boolean r1 = r8.getSkipping()
            if (r1 != 0) goto L46
            goto L4a
        L46:
            r8.skipToGroupEnd()
            goto La4
        L4a:
            r8.startDefaults()
            r1 = r9 & 1
            if (r1 == 0) goto L62
            boolean r1 = r8.getDefaultsInvalid()
            if (r1 == 0) goto L58
            goto L62
        L58:
            r8.skipToGroupEnd()
            r1 = r10 & 1
            if (r1 == 0) goto L6b
        L5f:
            r4 = r4 & (-15)
            goto L6b
        L62:
            r1 = r10 & 1
            if (r1 == 0) goto L6b
            boolean r6 = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(r8, r0)
            goto L5f
        L6b:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L7a
            r1 = -1
            java.lang.String r5 = "com.stripe.android.link.theme.DefaultLinkTheme (Theme.kt:15)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r4, r1, r5)
        L7a:
            W2.c r1 = W2.c.f10756a
            W2.b r1 = r1.a(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = W2.d.f10759a
            androidx.compose.runtime.ProvidedValue r3 = r3.provides(r1)
            androidx.compose.runtime.ProvidedValue[] r4 = new androidx.compose.runtime.ProvidedValue[r2]
            r4[r0] = r3
            W2.d$a r0 = new W2.d$a
            r0.<init>(r1, r7)
            r1 = 1467984557(0x577faaad, float:2.8110851E14)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r1, r2, r0)
            r1 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(r4, r0, r8, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto La4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        La4:
            androidx.compose.runtime.ScopeUpdateScope r8 = r8.endRestartGroup()
            if (r8 == 0) goto Lb2
            W2.d$b r0 = new W2.d$b
            r0.<init>(r6, r7, r9, r10)
            r8.updateScope(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.d.a(boolean, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final W2.b b(MaterialTheme materialTheme, Composer composer, int i8) {
        AbstractC3292y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1842304894, i8, -1, "com.stripe.android.link.theme.<get-linkColors> (Theme.kt:32)");
        }
        W2.b bVar = (W2.b) composer.consume(f10759a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }
}
