package Q3;

import Q3.n;
import Q5.I;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import o4.AbstractC3539m;
import v3.C4127g;
import v3.w;
import x4.C4224g;
import y3.AbstractC4245c;

/* loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f8656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, int i8) {
            super(2);
            this.f8656a = function0;
            this.f8657b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            o.a(this.f8656a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8657b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(0);
            this.f8658a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m57invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m57invoke() {
            this.f8658a.a(n.c.e.f8655a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f8659a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m58invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m58invoke() {
            this.f8659a.a(n.c.d.f8654a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(1);
            this.f8660a = nVar;
        }

        public final void a(C4127g it) {
            AbstractC3292y.i(it, "it");
            this.f8660a.a(new n.c.a(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4127g) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n nVar) {
            super(1);
            this.f8661a = nVar;
        }

        public final void a(C4127g it) {
            AbstractC3292y.i(it, "it");
            this.f8661a.a(new n.c.C0180c(it.d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4127g) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f8663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8664c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8665d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n nVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f8662a = nVar;
            this.f8663b = modifier;
            this.f8664c = i8;
            this.f8665d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            o.b(this.f8662a, this.f8663b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8664c | 1), this.f8665d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f8666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4127g f8667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, C4127g c4127g) {
            super(0);
            this.f8666a = function1;
            this.f8667b = c4127g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m59invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m59invoke() {
            this.f8666a.invoke(this.f8667b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f8668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.a f8669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f8670c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f8671d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f8672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C4127g c4127g, n.a aVar, Function0 function0, Function0 function02, Function1 function1) {
            super(3);
            this.f8668a = c4127g;
            this.f8669b = aVar;
            this.f8670c = function0;
            this.f8671d = function02;
            this.f8672e = function1;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3292y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1047630137, i8, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI.<anonymous>.<anonymous> (PaymentMethodVerticalLayoutUI.kt:115)");
            }
            o.e(this.f8668a, this.f8669b, this.f8670c, this.f8671d, this.f8672e, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f8673a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4127g f8674b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.a f8675c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ D3.f f8676d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8677e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f8678f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f8679g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f8680h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f8681i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C4224g f8682j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Modifier f8683k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f8684l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f8685m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f8686n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, C4127g c4127g, n.a aVar, D3.f fVar, boolean z8, Function0 function0, Function0 function02, Function1 function1, Function1 function12, C4224g c4224g, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f8673a = list;
            this.f8674b = c4127g;
            this.f8675c = aVar;
            this.f8676d = fVar;
            this.f8677e = z8;
            this.f8678f = function0;
            this.f8679g = function02;
            this.f8680h = function1;
            this.f8681i = function12;
            this.f8682j = c4224g;
            this.f8683k = modifier;
            this.f8684l = i8;
            this.f8685m = i9;
            this.f8686n = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            o.c(this.f8673a, this.f8674b, this.f8675c, this.f8676d, this.f8677e, this.f8678f, this.f8679g, this.f8680h, this.f8681i, this.f8682j, this.f8683k, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8684l | 1), RecomposeScopeImplKt.updateChangedFlags(this.f8685m), this.f8686n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f8687a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4127g f8688b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1 function1, C4127g c4127g) {
            super(0);
            this.f8687a = function1;
            this.f8688b = c4127g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m60invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m60invoke() {
            this.f8687a.invoke(this.f8688b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4127g f8689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.a f8690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f8691c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f8692d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f8693e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8694f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C4127g c4127g, n.a aVar, Function0 function0, Function0 function02, Function1 function1, int i8) {
            super(2);
            this.f8689a = c4127g;
            this.f8690b = aVar;
            this.f8691c = function0;
            this.f8692d = function02;
            this.f8693e = function1;
            this.f8694f = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            o.e(this.f8689a, this.f8690b, this.f8691c, this.f8692d, this.f8693e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8694f | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f8695a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8696b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function0 function0, int i8) {
            super(2);
            this.f8695a = function0;
            this.f8696b = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            o.f(this.f8695a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8696b | 1));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8697a;

        static {
            int[] iArr = new int[n.a.values().length];
            try {
                iArr[n.a.f8639a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.a.f8640b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.a.f8641c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.a.f8642d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8697a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-716177738);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-716177738, i9, -1, "com.stripe.android.paymentsheet.verticalmode.EditButton (PaymentMethodVerticalLayoutUI.kt:171)");
            }
            String stringResource = StringResources_androidKt.stringResource(AbstractC3394E.f35237i0, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            long m1155getPrimary0d7_KjU = materialTheme.getColors(startRestartGroup, i11).m1155getPrimary0d7_KjU();
            TextStyle subtitle1 = materialTheme.getTypography(startRestartGroup, i11).getSubtitle1();
            composer2 = startRestartGroup;
            TextKt.m1391Text4IGK_g(stringResource, PaddingKt.m577padding3ABfNKs(ClickableKt.m292clickableXHw0xAI$default(TestTagKt.testTag(Modifier.Companion, "TEST_TAG_VERTICAL_MODE_SAVED_PM_EDIT"), false, null, null, function0, 7, null), Dp.m5155constructorimpl(4)), m1155getPrimary0d7_KjU, 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, subtitle1, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(function0, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(Q3.n r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.o.b(Q3.n, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(List paymentMethods, C4127g c4127g, n.a savedPaymentMethodAction, D3.f fVar, boolean z8, Function0 onViewMorePaymentMethods, Function0 onManageOneSavedPaymentMethod, Function1 onEditPaymentMethod, Function1 onSelectSavedPaymentMethod, C4224g imageLoader, Modifier modifier, Composer composer, int i8, int i9, int i10) {
        Composer composer2;
        int i11;
        int i12;
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        AbstractC3292y.i(savedPaymentMethodAction, "savedPaymentMethodAction");
        AbstractC3292y.i(onViewMorePaymentMethods, "onViewMorePaymentMethods");
        AbstractC3292y.i(onManageOneSavedPaymentMethod, "onManageOneSavedPaymentMethod");
        AbstractC3292y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3292y.i(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        AbstractC3292y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(1650746819);
        Modifier modifier2 = (i10 & 1024) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650746819, i8, i9, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI (PaymentMethodVerticalLayoutUI.kt:98)");
        }
        Arrangement.HorizontalOrVertical m491spacedBy0680j_4 = Arrangement.INSTANCE.m491spacedBy0680j_4(Dp.m5155constructorimpl(12));
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m491spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i13 = MaterialTheme.$stable;
        TextStyle subtitle1 = materialTheme.getTypography(startRestartGroup, i13).getSubtitle1();
        long h8 = AbstractC3539m.n(materialTheme, startRestartGroup, i13).h();
        startRestartGroup.startReplaceableGroup(962085386);
        if (c4127g != null) {
            TextKt.m1391Text4IGK_g(StringResources_androidKt.stringResource(w.f40610d0, startRestartGroup, 0), TestTagKt.testTag(Modifier.Companion, "TEST_TAG_SAVED_TEXT"), h8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, subtitle1, startRestartGroup, 48, 0, 65528);
            composer2 = startRestartGroup;
            i12 = 1;
            p.a(c4127g, z8, false, fVar != null && D3.g.b(fVar), null, new g(onSelectSavedPaymentMethod, c4127g), ComposableLambdaKt.composableLambda(startRestartGroup, -1047630137, true, new h(c4127g, savedPaymentMethodAction, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onEditPaymentMethod)), composer2, ((i8 >> 9) & 112) | 1572872, 20);
            i11 = 0;
            TextKt.m1391Text4IGK_g(StringResources_androidKt.stringResource(w.f40590N, composer2, 0), (Modifier) null, h8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, subtitle1, composer2, 0, 0, 65530);
        } else {
            composer2 = startRestartGroup;
            i11 = 0;
            i12 = 1;
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(962125394);
        boolean changed = composer2.changed(fVar) | composer2.changed(paymentMethods);
        Object rememberedValue = composer2.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            int i14 = -1;
            if (fVar != null && !D3.g.b(fVar)) {
                String c8 = AbstractC4245c.c(fVar);
                Iterator it = paymentMethods.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC3292y.d(((Q3.e) it.next()).a(), c8)) {
                        i14 = i11;
                        break;
                    }
                    i11 += i12;
                }
            }
            rememberedValue = Integer.valueOf(i14);
            composer2.updateRememberedValue(rememberedValue);
        }
        int intValue = ((Number) rememberedValue).intValue();
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        Q3.l.a(paymentMethods, intValue, z8, imageLoader, null, composer2, ((i8 >> 6) & 896) | 8 | (C4224g.f41044g << 9) | ((i8 >> 18) & 7168), 16);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(paymentMethods, c4127g, savedPaymentMethodAction, fVar, z8, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onEditPaymentMethod, onSelectSavedPaymentMethod, imageLoader, modifier2, i8, i9, i10));
        }
    }

    private static final n.b d(State state) {
        return (n.b) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4127g c4127g, n.a aVar, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(801308256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(801308256, i8, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodTrailingContent (PaymentMethodVerticalLayoutUI.kt:153)");
        }
        int i9 = m.f8697a[aVar.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        startRestartGroup.startReplaceableGroup(1196038968);
                        startRestartGroup.endReplaceableGroup();
                    } else {
                        startRestartGroup.startReplaceableGroup(1195916735);
                        f(function0, startRestartGroup, (i8 >> 6) & 14);
                        startRestartGroup.endReplaceableGroup();
                    }
                } else {
                    startRestartGroup.startReplaceableGroup(1195755597);
                    a(function02, startRestartGroup, (i8 >> 9) & 14);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                startRestartGroup.startReplaceableGroup(1195573782);
                a(new j(function1, c4127g), startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            }
        } else {
            startRestartGroup.startReplaceableGroup(-99983570);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k(c4127g, aVar, function0, function02, function1, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 function0, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-446496442);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446496442, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ViewMoreButton (PaymentMethodVerticalLayoutUI.kt:187)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier m577padding3ABfNKs = PaddingKt.m577padding3ABfNKs(ClickableKt.m292clickableXHw0xAI$default(TestTagKt.testTag(Modifier.Companion, "TEST_TAG_VIEW_MORE"), false, null, null, function0, 7, null), Dp.m5155constructorimpl(4));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m577padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(w.f40630n0, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1391Text4IGK_g(stringResource, (Modifier) null, materialTheme.getColors(startRestartGroup, i11).m1155getPrimary0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i11).getSubtitle1(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            IconKt.m1244Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE), (String) null, (Modifier) null, materialTheme.getColors(composer2, i11).m1155getPrimary0d7_KjU(), composer2, 48, 4);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(function0, i8));
        }
    }
}
