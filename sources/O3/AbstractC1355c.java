package O3;

import D3.f;
import O3.InterfaceC1354b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import c3.C2027g;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import com.stripe.android.model.r;
import d3.C2752d;
import g3.EnumC2906e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import w4.C4156a;

/* renamed from: O3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1355c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1354b f7530a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1354b interfaceC1354b) {
            super(1);
            this.f7530a = interfaceC1354b;
        }

        public final void a(C2027g selectedLpm) {
            AbstractC3292y.i(selectedLpm, "selectedLpm");
            this.f7530a.d(new InterfaceC1354b.AbstractC0139b.C0140b(selectedLpm.d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2027g) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1354b f7531a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f7532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1354b interfaceC1354b, State state) {
            super(1);
            this.f7531a = interfaceC1354b;
            this.f7532b = state;
        }

        public final void a(B3.c cVar) {
            this.f7531a.d(new InterfaceC1354b.AbstractC0139b.a(cVar, AbstractC1355c.b(this.f7532b).f()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B3.c) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0141c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1354b f7533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f7534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0141c(InterfaceC1354b interfaceC1354b, State state) {
            super(0);
            this.f7533a = interfaceC1354b;
            this.f7534b = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m33invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33invoke() {
            this.f7533a.d(new InterfaceC1354b.AbstractC0139b.c(AbstractC1355c.b(this.f7534b).f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1354b f7535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7537c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7538d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1354b interfaceC1354b, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7535a = interfaceC1354b;
            this.f7536b = modifier;
            this.f7537c = i8;
            this.f7538d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1355c.a(this.f7535a, this.f7536b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7537c | 1), this.f7538d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(O3.InterfaceC1354b r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r0 = r19
            r1 = r22
            r2 = r23
            java.lang.String r3 = "interactor"
            kotlin.jvm.internal.AbstractC3292y.i(r0, r3)
            r3 = -1093227002(0xffffffffbed6ae06, float:-0.41929644)
            r4 = r21
            androidx.compose.runtime.Composer r15 = r4.startRestartGroup(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L1b
            r4 = r1 | 6
            goto L2b
        L1b:
            r4 = r1 & 14
            if (r4 != 0) goto L2a
            boolean r4 = r15.changed(r0)
            if (r4 == 0) goto L27
            r4 = 4
            goto L28
        L27:
            r4 = 2
        L28:
            r4 = r4 | r1
            goto L2b
        L2a:
            r4 = r1
        L2b:
            r5 = r2 & 2
            if (r5 == 0) goto L34
            r4 = r4 | 48
        L31:
            r6 = r20
            goto L46
        L34:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L31
            r6 = r20
            boolean r7 = r15.changed(r6)
            if (r7 == 0) goto L43
            r7 = 32
            goto L45
        L43:
            r7 = 16
        L45:
            r4 = r4 | r7
        L46:
            r7 = r4 & 91
            r8 = 18
            if (r7 != r8) goto L5a
            boolean r7 = r15.getSkipping()
            if (r7 != 0) goto L53
            goto L5a
        L53:
            r15.skipToGroupEnd()
            r18 = r15
            goto Ld7
        L5a:
            if (r5 == 0) goto L60
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            r14 = r5
            goto L61
        L60:
            r14 = r6
        L61:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L6d
            r5 = -1
            java.lang.String r6 = "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:26)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r4, r5, r6)
        L6d:
            q6.L r3 = r19.getState()
            r4 = 8
            androidx.compose.runtime.State r3 = A4.f.a(r3, r15, r4)
            O3.b$a r4 = b(r3)
            boolean r4 = r4.e()
            r4 = r4 ^ 1
            O3.b$a r5 = b(r3)
            java.util.List r5 = r5.g()
            O3.b$a r6 = b(r3)
            java.lang.String r6 = r6.f()
            O3.b$a r7 = b(r3)
            java.util.List r7 = r7.d()
            O3.c$a r8 = new O3.c$a
            r8.<init>(r0)
            O3.b$a r9 = b(r3)
            F3.a r9 = r9.c()
            O3.b$a r10 = b(r3)
            G3.d r10 = r10.h()
            O3.c$b r11 = new O3.c$b
            r11.<init>(r0, r3)
            java.lang.String r12 = "PaymentSheetAddPaymentMethodForm"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.platform.TestTagKt.testTag(r14, r12)
            O3.c$c r13 = new O3.c$c
            r13.<init>(r0, r3)
            r3 = 2363456(0x241040, float:3.311907E-39)
            r16 = 0
            r17 = r14
            r14 = r15
            r18 = r15
            r15 = r3
            O3.AbstractC1374w.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto Ld5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Ld5:
            r6 = r17
        Ld7:
            androidx.compose.runtime.ScopeUpdateScope r3 = r18.endRestartGroup()
            if (r3 == 0) goto Le5
            O3.c$d r4 = new O3.c$d
            r4.<init>(r0, r6, r1, r2)
            r3.updateScope(r4)
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.AbstractC1355c.a(O3.b, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1354b.a b(State state) {
        return (InterfaceC1354b.a) state.getValue();
    }

    public static final com.stripe.android.model.q d(B3.c cVar, String paymentMethodCode) {
        AbstractC3292y.i(cVar, "<this>");
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        return g4.g.f32298a.h(cVar.a(), paymentMethodCode);
    }

    public static final com.stripe.android.model.p e(B3.c cVar, String paymentMethodCode, C2752d paymentMethodMetadata) {
        AbstractC3292y.i(cVar, "<this>");
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        return g4.g.f32298a.g(cVar.a(), paymentMethodCode, paymentMethodMetadata.d0(paymentMethodCode), paymentMethodMetadata.a(cVar.b()));
    }

    public static final com.stripe.android.model.r f(B3.c cVar, String paymentMethodCode) {
        AbstractC3292y.i(cVar, "<this>");
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        return g4.g.f32298a.i(cVar.a(), paymentMethodCode);
    }

    public static final D3.f g(B3.c cVar, C2027g paymentMethod, C2752d paymentMethodMetadata) {
        String str;
        AbstractC3292y.i(cVar, "<this>");
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        com.stripe.android.model.p e8 = e(cVar, paymentMethod.d(), paymentMethodMetadata);
        com.stripe.android.model.r f8 = f(cVar, paymentMethod.d());
        com.stripe.android.model.q d8 = d(cVar, paymentMethod.d());
        if (AbstractC3292y.d(paymentMethod.d(), o.p.f25755i.f25773a)) {
            r.b bVar = new r.b(null, null, cVar.b().b(), 3, null);
            EnumC2906e.a aVar = EnumC2906e.f32115m;
            C4156a c4156a = (C4156a) cVar.a().get(r4.G.Companion.f());
            if (c4156a != null) {
                str = c4156a.c();
            } else {
                str = null;
            }
            return new f.e.a(e8, aVar.b(str), cVar.b(), bVar, null, 16, null);
        }
        if (paymentMethodMetadata.Z(paymentMethod.d())) {
            return new f.b(paymentMethod.d(), e8.l(), paymentMethod.f(), paymentMethod.h(), paymentMethod.i(), paymentMethod.e());
        }
        return new f.e.b(paymentMethod.f(), paymentMethod.h(), paymentMethod.i(), paymentMethod.e(), e8, cVar.b(), f8, d8);
    }
}
