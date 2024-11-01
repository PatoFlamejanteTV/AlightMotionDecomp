package r4;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import y4.AbstractC4246a;

/* loaded from: classes4.dex */
public abstract class u0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38649a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5574invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5574invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f38650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f38650a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5575invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5575invoke() {
            this.f38650a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38651a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f38652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38653c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f38654d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f38655e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f38656f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38657g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Integer num, boolean z8, long j8, Function0 function0, int i8, int i9) {
            super(2);
            this.f38651a = str;
            this.f38652b = num;
            this.f38653c = z8;
            this.f38654d = j8;
            this.f38655e = function0;
            this.f38656f = i8;
            this.f38657g = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            u0.a(this.f38651a, this.f38652b, this.f38653c, this.f38654d, this.f38655e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38656f | 1), this.f38657g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2.c f38658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f38659b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f38660c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0 f38661d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f38662e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f38663f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f38664a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t0 f38665b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1, t0 t0Var) {
                super(0);
                this.f38664a = function1;
                this.f38665b = t0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5576invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5576invoke() {
                this.f38664a.invoke(this.f38665b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2.c cVar, long j8, List list, t0 t0Var, long j9, Function1 function1) {
            super(3);
            this.f38658a = cVar;
            this.f38659b = j8;
            this.f38660c = list;
            this.f38661d = t0Var;
            this.f38662e = j9;
            this.f38663f = function1;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(ColumnScope DropdownMenu, Composer composer, int i8) {
            AbstractC3292y.i(DropdownMenu, "$this$DropdownMenu");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072682231, i8, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown.<anonymous> (SingleChoiceDropdownUI.kt:48)");
            }
            TextKt.m1391Text4IGK_g(AbstractC4246a.a(this.f38658a, composer, 8), PaddingKt.m578paddingVpY3zN4(Modifier.Companion, Dp.m5155constructorimpl(13), Dp.m5155constructorimpl(5)), this.f38659b, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131064);
            List<t0> list = this.f38660c;
            t0 t0Var = this.f38661d;
            long j8 = this.f38662e;
            Function1 function1 = this.f38663f;
            for (t0 t0Var2 : list) {
                u0.a(AbstractC4246a.a(t0Var2.b(), composer, 8), t0Var2.getIcon(), AbstractC3292y.d(t0Var2, t0Var), j8, new a(function1, t0Var2), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2.c f38667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0 f38668c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f38669d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f38670e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f38671f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f38672g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f38673h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f38674i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, C2.c cVar, t0 t0Var, List list, Function1 function1, long j8, long j9, Function0 function0, int i8) {
            super(2);
            this.f38666a = z8;
            this.f38667b = cVar;
            this.f38668c = t0Var;
            this.f38669d = list;
            this.f38670e = function1;
            this.f38671f = j8;
            this.f38672g = j9;
            this.f38673h = function0;
            this.f38674i = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            u0.b(this.f38666a, this.f38667b, this.f38668c, this.f38669d, this.f38670e, this.f38671f, this.f38672g, this.f38673h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38674i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r33, java.lang.Integer r34, boolean r35, long r36, kotlin.jvm.functions.Function0 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.u0.a(java.lang.String, java.lang.Integer, boolean, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z8, C2.c title, t0 t0Var, List choices, Function1 onChoiceSelected, long j8, long j9, Function0 onDismiss, Composer composer, int i8) {
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(choices, "choices");
        AbstractC3292y.i(onChoiceSelected, "onChoiceSelected");
        AbstractC3292y.i(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1512223510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1512223510, i8, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown (SingleChoiceDropdownUI.kt:43)");
        }
        AndroidMenu_androidKt.m1077DropdownMenu4kj_NE(z8, onDismiss, null, 0L, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -2072682231, true, new d(title, j8, choices, t0Var, j9, onChoiceSelected)), startRestartGroup, (i8 & 14) | 1572864 | ((i8 >> 18) & 112), 60);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(z8, title, t0Var, choices, onChoiceSelected, j8, j9, onDismiss, i8));
        }
    }
}
