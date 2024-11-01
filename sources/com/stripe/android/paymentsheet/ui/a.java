package com.stripe.android.paymentsheet.ui;

import O3.K;
import O3.O;
import Q5.I;
import Q5.p;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.ui.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.m;
import u1.EnumC4072b;
import v3.r;

/* loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0652a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27713a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0653a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f27714a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0653a(Function0 function0) {
                super(0);
                this.f27714a = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                this.f27714a.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0652a(Function0 function0) {
            super(1);
            this.f27713a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.onClick$default(semantics, null, new C0653a(this.f27713a), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f27715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27716b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D3.b f27717c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m.a f27718d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f27719e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f27720f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f27721g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f27722h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f27723i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PrimaryButton.a aVar, boolean z8, D3.b bVar, m.a aVar2, boolean z9, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27715a = aVar;
            this.f27716b = z8;
            this.f27717c = bVar;
            this.f27718d = aVar2;
            this.f27719e = z9;
            this.f27720f = function0;
            this.f27721g = modifier;
            this.f27722h = i8;
            this.f27723i = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            a.a(this.f27715a, this.f27716b, this.f27717c, this.f27718d, this.f27719e, this.f27720f, this.f27721g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27722h | 1), this.f27723i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f27724a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.ui.d f27725b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f27726c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0654a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.a f27727a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0654a(PrimaryButton.a aVar) {
                super(0);
                this.f27727a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5520invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5520invoke() {
                PrimaryButton.a aVar = this.f27727a;
                if (aVar instanceof PrimaryButton.a.C0646a) {
                    ((PrimaryButton.a.C0646a) aVar).a().invoke();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f27728a = new b();

            b() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5521invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5521invoke();
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Modifier modifier, com.stripe.android.paymentsheet.ui.d dVar, PrimaryButton.a aVar) {
            super(2);
            this.f27724a = modifier;
            this.f27725b = dVar;
            this.f27726c = aVar;
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
                ComposerKt.traceEventStart(-1177645661, i8, -1, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton.<anonymous> (GooglePayButton.kt:115)");
            }
            Modifier testTag = TestTagKt.testTag(this.f27724a, "google-pay-primary-button");
            com.stripe.android.paymentsheet.ui.d dVar = this.f27725b;
            PrimaryButton.a aVar = this.f27726c;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-549772482);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0654a(aVar);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            com.stripe.android.paymentsheet.ui.c.i("", true, true, dVar, (Function0) rememberedValue, b.f27728a, composer, 197046, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f27729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f27730b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27731c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27732d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier, PrimaryButton.a aVar, int i8, int i9) {
            super(2);
            this.f27729a = modifier;
            this.f27730b = aVar;
            this.f27731c = i8;
            this.f27732d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            a.b(this.f27729a, this.f27730b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27731c | 1), this.f27732d);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27733a;

        static {
            int[] iArr = new int[D3.b.values().length];
            try {
                iArr[D3.b.f1234b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D3.b.f1233a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D3.b.f1235c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[D3.b.f1236d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[D3.b.f1237e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[D3.b.f1238f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[D3.b.f1240h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[D3.b.f1239g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f27733a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.stripe.android.paymentsheet.ui.PrimaryButton.a r19, boolean r20, D3.b r21, n2.m.a r22, boolean r23, kotlin.jvm.functions.Function0 r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.a.a(com.stripe.android.paymentsheet.ui.PrimaryButton$a, boolean, D3.b, n2.m$a, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Modifier modifier, PrimaryButton.a aVar, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        com.stripe.android.paymentsheet.ui.d dVar;
        Composer startRestartGroup = composer.startRestartGroup(206308520);
        int i13 = i9 & 1;
        if (i13 != 0) {
            i10 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            modifier2 = modifier;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i13 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206308520, i10, -1, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton (GooglePayButton.kt:92)");
            }
            if (aVar instanceof PrimaryButton.a.C0646a) {
                dVar = d.a.f27863a;
            } else {
                dVar = d.c.f27865a;
            }
            int i14 = r.f40533a;
            long colorResource = ColorResources_androidKt.colorResource(i14, startRestartGroup, 0);
            int i15 = r.f40534b;
            O.a(new K(colorResource, ColorResources_androidKt.colorResource(i15, startRestartGroup, 0), ColorResources_androidKt.colorResource(i14, startRestartGroup, 0), ColorResources_androidKt.colorResource(i15, startRestartGroup, 0), 0L, 16, null), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1177645661, true, new c(modifier3, dVar, aVar)), startRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(modifier3, aVar, i8, i9));
        }
    }

    private static final EnumC4072b d(D3.b bVar) {
        switch (e.f27733a[bVar.ordinal()]) {
            case 1:
                return EnumC4072b.Book;
            case 2:
                return EnumC4072b.Buy;
            case 3:
                return EnumC4072b.Checkout;
            case 4:
                return EnumC4072b.Donate;
            case 5:
                return EnumC4072b.Order;
            case 6:
                return EnumC4072b.Pay;
            case 7:
                return EnumC4072b.Plain;
            case 8:
                return EnumC4072b.Subscribe;
            default:
                throw new p();
        }
    }
}
