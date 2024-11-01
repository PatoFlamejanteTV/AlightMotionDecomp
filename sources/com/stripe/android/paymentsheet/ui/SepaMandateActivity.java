package com.stripe.android.paymentsheet.ui;

import O3.X;
import Q5.I;
import Q5.s;
import Q5.t;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.ui.SepaMandateContract;
import com.stripe.android.paymentsheet.ui.e;
import j6.InterfaceC3216e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import o4.AbstractC3539m;
import s4.AbstractC3966h;
import s4.C3965g;
import u2.AbstractC4074a;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SepaMandateActivity extends AppCompatActivity {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27703b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0647a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SepaMandateActivity f27704a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27705b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0648a extends C3289v implements Function0 {
                C0648a(Object obj) {
                    super(0, obj, SepaMandateActivity.class, "finish", "finish()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5517invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5517invoke() {
                    ((SepaMandateActivity) this.receiver).finish();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f27706a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SepaMandateActivity f27707b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0649a extends AbstractC3293z implements Function0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f27708a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0649a(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f27708a = sepaMandateActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m5518invoke();
                        return I.f8786a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m5518invoke() {
                        Intent putExtra = new Intent().putExtra("extra_activity_result", e.a.f27866a);
                        AbstractC3292y.h(putExtra, "putExtra(...)");
                        this.f27708a.setResult(-1, putExtra);
                        this.f27708a.finish();
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0650b extends AbstractC3293z implements Function0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f27709a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0650b(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f27709a = sepaMandateActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m5519invoke();
                        return I.f8786a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m5519invoke() {
                        this.f27709a.finish();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, SepaMandateActivity sepaMandateActivity) {
                    super(2);
                    this.f27706a = str;
                    this.f27707b = sepaMandateActivity;
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
                        ComposerKt.traceEventStart(-380837143, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SepaMandateActivity.kt:58)");
                    }
                    String str = this.f27706a;
                    composer.startReplaceableGroup(-3848641);
                    boolean changed = composer.changed(this.f27707b);
                    SepaMandateActivity sepaMandateActivity = this.f27707b;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new C0649a(sepaMandateActivity);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-3836662);
                    boolean changed2 = composer.changed(this.f27707b);
                    SepaMandateActivity sepaMandateActivity2 = this.f27707b;
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new C0650b(sepaMandateActivity2);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    X.a(str, function0, (Function0) rememberedValue2, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0647a(SepaMandateActivity sepaMandateActivity, String str) {
                super(2);
                this.f27704a = sepaMandateActivity;
                this.f27705b = str;
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
                    ComposerKt.traceEventStart(-620021374, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous> (SepaMandateActivity.kt:52)");
                }
                C3965g b9 = AbstractC3966h.b(null, null, composer, 0, 3);
                SepaMandateActivity sepaMandateActivity = this.f27704a;
                composer.startReplaceableGroup(-934017577);
                boolean changed = composer.changed(sepaMandateActivity);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0648a(sepaMandateActivity);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                AbstractC4074a.a(b9, null, (Function0) ((InterfaceC3216e) rememberedValue), ComposableLambdaKt.composableLambda(composer, -380837143, true, new b(this.f27705b, this.f27704a)), composer, C3965g.f39091e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f27703b = str;
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
                ComposerKt.traceEventStart(2089289300, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous> (SepaMandateActivity.kt:51)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -620021374, true, new C0647a(SepaMandateActivity.this, this.f27703b)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b9;
        String str;
        SepaMandateContract.a a9;
        super.onCreate(bundle);
        try {
            s.a aVar = s.f8810b;
            SepaMandateContract.a.C0651a c0651a = SepaMandateContract.a.f27711b;
            Intent intent = getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            a9 = c0651a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        if (a9 != null) {
            b9 = s.b(a9);
            if (s.g(b9)) {
                b9 = null;
            }
            SepaMandateContract.a aVar3 = (SepaMandateContract.a) b9;
            if (aVar3 != null) {
                str = aVar3.a();
            } else {
                str = null;
            }
            if (str == null) {
                finish();
                return;
            } else {
                WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
                ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2089289300, true, new a(str)), 1, null);
                return;
            }
        }
        throw new IllegalArgumentException("SepaMandateActivity was started without arguments.".toString());
    }
}
