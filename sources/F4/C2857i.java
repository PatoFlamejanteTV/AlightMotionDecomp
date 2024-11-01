package f4;

import Q5.InterfaceC1416k;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import e4.C2817a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: f4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2857i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31880a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.q f31881b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends Dialog {

        /* renamed from: a, reason: collision with root package name */
        private final Y3.q f31882a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1416k f31883b;

        /* renamed from: f4.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0734a extends AbstractC3293z implements Function0 {
            C0734a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final V3.d invoke() {
                V3.d c8 = V3.d.c(a.this.getLayoutInflater());
                AbstractC3292y.h(c8, "inflate(...)");
                return c8;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Y3.q uiCustomization) {
            super(context);
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(uiCustomization, "uiCustomization");
            this.f31882a = uiCustomization;
            this.f31883b = Q5.l.b(new C0734a());
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final V3.d a() {
            return (V3.d) this.f31883b.getValue();
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            setContentView(a().getRoot());
            C2817a c2817a = C2817a.f31704a;
            CircularProgressIndicator progressBar = a().f10558b;
            AbstractC3292y.h(progressBar, "progressBar");
            c2817a.a(progressBar, this.f31882a);
        }
    }

    public C2857i(Context context, Y3.q uiCustomization) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        this.f31880a = context;
        this.f31881b = uiCustomization;
    }

    public Dialog a() {
        return new a(this.f31880a, this.f31881b);
    }
}
