package O3;

import R5.AbstractC1435t;
import android.content.Context;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import c3.C2027g;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import x4.C4224g;

/* renamed from: O3.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1374w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7802a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f7803b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7804c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0152a extends kotlin.coroutines.jvm.internal.k implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f7805a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f7806b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f7807c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0152a(Function0 function0, U5.d dVar) {
                super(2, dVar);
                this.f7807c = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                C0152a c0152a = new C0152a(this.f7807c, dVar);
                c0152a.f7806b = obj;
                return c0152a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
                return ((C0152a) create(awaitPointerEventScope, dVar)).invokeSuspend(Q5.I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f7805a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f7806b;
                    this.f7805a = 1;
                    obj = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, this, 1, null);
                    if (obj == e8) {
                        return e8;
                    }
                }
                if (PointerEventType.m3942equalsimpl0(((PointerEvent) obj).m3935getType7fucELk(), PointerEventType.Companion.m3949getPress7fucELk())) {
                    this.f7807c.invoke();
                }
                return Q5.I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, U5.d dVar) {
            super(2, dVar);
            this.f7804c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f7804c, dVar);
            aVar.f7803b = obj;
            return aVar;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(PointerInputScope pointerInputScope, U5.d dVar) {
            return ((a) create(pointerInputScope, dVar)).invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7802a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f7803b;
                C0152a c0152a = new C0152a(this.f7804c, null);
                this.f7802a = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c0152a, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7808a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(1);
            this.f7808a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(FocusState state) {
            AbstractC3292y.i(state, "state");
            if (state.getHasFocus()) {
                this.f7808a.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f7811c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F3.a f7812d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ G3.d f7813e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f7814f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f7815g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f7816h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7817i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, String str, List list, F3.a aVar, G3.d dVar, float f8, Function1 function1, Function0 function0, int i8) {
            super(2);
            this.f7809a = z8;
            this.f7810b = str;
            this.f7811c = list;
            this.f7812d = aVar;
            this.f7813e = dVar;
            this.f7814f = f8;
            this.f7815g = function1;
            this.f7816h = function0;
            this.f7817i = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1374w.a(this.f7809a, this.f7810b, this.f7811c, this.f7812d, this.f7813e, this.f7814f, this.f7815g, this.f7816h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7817i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.w$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7818a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.w$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7819a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m45invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m45invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.w$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7820a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f7821b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7822c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f7823d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f7824e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ F3.a f7825f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ G3.d f7826g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7827h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f7828i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f7829j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7830k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7831l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z8, List list, String str, List list2, Function1 function1, F3.a aVar, G3.d dVar, Function1 function12, Modifier modifier, Function0 function0, int i8, int i9) {
            super(2);
            this.f7820a = z8;
            this.f7821b = list;
            this.f7822c = str;
            this.f7823d = list2;
            this.f7824e = function1;
            this.f7825f = aVar;
            this.f7826g = dVar;
            this.f7827h = function12;
            this.f7828i = modifier;
            this.f7829j = function0;
            this.f7830k = i8;
            this.f7831l = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1374w.b(this.f7820a, this.f7821b, this.f7822c, this.f7823d, this.f7824e, this.f7825f, this.f7826g, this.f7827h, this.f7828i, this.f7829j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7830k | 1), this.f7831l);
        }
    }

    public static final void a(boolean z8, String selectedPaymentMethodCode, List formElements, F3.a formArguments, G3.d usBankAccountFormArguments, float f8, Function1 onFormFieldValuesChanged, Function0 onInteractionEvent, Composer composer, int i8) {
        boolean z9;
        boolean z10;
        AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC3292y.i(formElements, "formElements");
        AbstractC3292y.i(formArguments, "formArguments");
        AbstractC3292y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC3292y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3292y.i(onInteractionEvent, "onInteractionEvent");
        Composer startRestartGroup = composer.startRestartGroup(1036417859);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1036417859, i8, -1, "com.stripe.android.paymentsheet.ui.FormElement (PaymentElement.kt:97)");
        }
        Object m2560rememberSaveable = RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0) d.f7818a, startRestartGroup, 3080, 6);
        AbstractC3292y.h(m2560rememberSaveable, "rememberSaveable(...)");
        String str = (String) m2560rememberSaveable;
        Modifier.Companion companion = Modifier.Companion;
        Modifier testTag = TestTagKt.testTag(companion, "FORM_ELEMENT_UI");
        startRestartGroup.startReplaceableGroup(-1853091545);
        int i9 = (29360128 & i8) ^ 12582912;
        if ((i9 > 8388608 && startRestartGroup.changed(onInteractionEvent)) || (i8 & 12582912) == 8388608) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(onInteractionEvent, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(testTag, "AddPaymentMethod", (InterfaceC2072n) rememberedValue);
        startRestartGroup.startReplaceableGroup(-1853081351);
        if ((i9 > 8388608 && startRestartGroup.changed(onInteractionEvent)) || (12582912 & i8) == 8388608) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new b(onInteractionEvent);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(pointerInput, (Function1) rememberedValue2);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onFocusChanged);
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
        Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (!AbstractC3292y.d(selectedPaymentMethodCode, o.p.f25745O.f25773a) && !AbstractC3292y.d(selectedPaymentMethodCode, o.p.f25754h.f25773a)) {
            startRestartGroup.startReplaceableGroup(-754595001);
            AbstractC1375x.a(str, formArguments, z8, onFormFieldValuesChanged, formElements, PaddingKt.m579paddingVpY3zN4$default(companion, f8, 0.0f, 2, null), startRestartGroup, ((i8 << 6) & 896) | 32832 | ((i8 >> 9) & 7168), 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-754845264);
            G3.e.k(formArguments, usBankAccountFormArguments, PaddingKt.m579paddingVpY3zN4$default(companion, f8, 0.0f, 2, null), startRestartGroup, 72, 0);
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, selectedPaymentMethodCode, formElements, formArguments, usBankAccountFormArguments, f8, onFormFieldValuesChanged, onInteractionEvent, i8));
        }
    }

    public static final void b(boolean z8, List supportedPaymentMethods, String selectedItemCode, List formElements, Function1 onItemSelectedListener, F3.a formArguments, G3.d usBankAccountFormArguments, Function1 onFormFieldValuesChanged, Modifier modifier, Function0 function0, Composer composer, int i8, int i9) {
        Modifier modifier2;
        Function0 function02;
        boolean z9;
        Composer composer2;
        Modifier modifier3;
        AbstractC3292y.i(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC3292y.i(selectedItemCode, "selectedItemCode");
        AbstractC3292y.i(formElements, "formElements");
        AbstractC3292y.i(onItemSelectedListener, "onItemSelectedListener");
        AbstractC3292y.i(formArguments, "formArguments");
        AbstractC3292y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC3292y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Composer startRestartGroup = composer.startRestartGroup(-145693783);
        if ((i9 & 256) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 512) != 0) {
            function02 = e.f7819a;
        } else {
            function02 = function0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-145693783, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentElement (PaymentElement.kt:45)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        startRestartGroup.startReplaceableGroup(-779278284);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Context applicationContext = context.getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            rememberedValue = new C4224g(applicationContext, null, null, null, null, 30, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        C4224g c4224g = (C4224g) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(v3.s.f40542e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-779271309);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(selectedItemCode)) || (i8 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean changed = z9 | startRestartGroup.changed(supportedPaymentMethods);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            List list = supportedPaymentMethods;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2027g) it.next()).d());
            }
            rememberedValue2 = Integer.valueOf(arrayList.indexOf(selectedItemCode));
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        int intValue = ((Number) rememberedValue2).intValue();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-779266315);
        boolean changed2 = startRestartGroup.changed(intValue) | startRestartGroup.changed(supportedPaymentMethods);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = (C2027g) supportedPaymentMethods.get(intValue);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        C2027g c2027g = (C2027g) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier modifier4 = modifier2;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1771952492);
        if (supportedPaymentMethods.size() > 1) {
            modifier3 = modifier4;
            composer2 = startRestartGroup;
            AbstractC1373v.a(supportedPaymentMethods, intValue, z8, onItemSelectedListener, c4224g, PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(12), 7, null), null, composer2, ((i8 << 6) & 896) | 196616 | ((i8 >> 3) & 7168) | (C4224g.f41044g << 12), 64);
        } else {
            composer2 = startRestartGroup;
            modifier3 = modifier4;
        }
        composer2.endReplaceableGroup();
        a(z8, c2027g.d(), formElements, formArguments, usBankAccountFormArguments, dimensionResource, onFormFieldValuesChanged, function02, composer2, (i8 & 14) | 37376 | (3670016 & (i8 >> 3)) | (29360128 & (i8 >> 6)));
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(z8, supportedPaymentMethods, selectedItemCode, formElements, onItemSelectedListener, formArguments, usBankAccountFormArguments, onFormFieldValuesChanged, modifier3, function02, i8, i9));
        }
    }
}
