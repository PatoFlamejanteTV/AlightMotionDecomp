package u1;

import Q5.I;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4073c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u1.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC4071a f40191a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC4072b f40192b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f40194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC4071a enumC4071a, EnumC4072b enumC4072b, int i8, String str) {
            super(1);
            this.f40191a = enumC4071a;
            this.f40192b = enumC4072b;
            this.f40193c = i8;
            this.f40194d = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayButton invoke(Context context) {
            AbstractC3292y.i(context, "context");
            PayButton payButton = new PayButton(context);
            EnumC4071a enumC4071a = this.f40191a;
            EnumC4072b enumC4072b = this.f40192b;
            int i8 = this.f40193c;
            payButton.a(ButtonOptions.z().c(enumC4071a.b()).d(enumC4072b.b()).e(i8).b(this.f40194d).a());
            return payButton;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u1.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40195a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f40196b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u1.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f40197a;

            a(Function0 function0) {
                this.f40197a = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40197a.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, Function0 function0) {
            super(1);
            this.f40195a = z8;
            this.f40196b = function0;
        }

        public final void a(PayButton button) {
            float f8;
            AbstractC3292y.i(button, "button");
            boolean z8 = this.f40195a;
            Function0 function0 = this.f40196b;
            if (z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.5f;
            }
            button.setAlpha(f8);
            button.setEnabled(z8);
            if (z8) {
                button.setOnClickListener(new a(function0));
            } else {
                button.setOnClickListener(null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PayButton) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u1.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0897c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f40198a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f40199b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f40200c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC4071a f40201d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumC4072b f40202e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f40203f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f40204g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f40205h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f40206i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0897c(Function0 function0, String str, Modifier modifier, EnumC4071a enumC4071a, EnumC4072b enumC4072b, float f8, boolean z8, int i8, int i9) {
            super(2);
            this.f40198a = function0;
            this.f40199b = str;
            this.f40200c = modifier;
            this.f40201d = enumC4071a;
            this.f40202e = enumC4072b;
            this.f40203f = f8;
            this.f40204g = z8;
            this.f40205h = i8;
            this.f40206i = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4073c.a(this.f40198a, this.f40199b, this.f40200c, this.f40201d, this.f40202e, this.f40203f, this.f40204g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40205h | 1), this.f40206i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156 A[LOOP:0: B:49:0x0154->B:50:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function0 r21, java.lang.String r22, androidx.compose.ui.Modifier r23, u1.EnumC4071a r24, u1.EnumC4072b r25, float r26, boolean r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.AbstractC4073c.a(kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, u1.a, u1.b, float, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
