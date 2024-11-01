package G3;

import G3.f;
import Q5.I;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class k {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f3048a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f3049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, f fVar) {
            super(0);
            this.f3048a = function1;
            this.f3049b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            this.f3048a.invoke(this.f3049b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2.c f3050a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f3052c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3053d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f3054e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f3055a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f3056b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f3057c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: G3.k$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0060a extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final C0060a f3058a = new C0060a();

                C0060a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
                    if (bVar != null) {
                        return PrimaryButton.b.b(bVar, null, null, false, false, 11, null);
                    }
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z8, d dVar, Function0 function0) {
                super(0);
                this.f3055a = z8;
                this.f3056b = dVar;
                this.f3057c = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m9invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m9invoke() {
                if (this.f3055a) {
                    this.f3056b.j().invoke(PrimaryButton.a.c.f27694b);
                }
                this.f3057c.invoke();
                this.f3056b.k().invoke(C0060a.f3058a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2.c cVar, boolean z8, d dVar, boolean z9, Function0 function0) {
            super(1);
            this.f3050a = cVar;
            this.f3051b = z8;
            this.f3052c = dVar;
            this.f3053d = z9;
            this.f3054e = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
            return new PrimaryButton.b(this.f3050a, new a(this.f3053d, this.f3052c, this.f3054e), this.f3051b, this.f3052c.o());
        }
    }

    public static final void a(d dVar, f screenState, boolean z8, Function1 onPrimaryButtonClick) {
        boolean z9;
        AbstractC3292y.i(dVar, "<this>");
        AbstractC3292y.i(screenState, "screenState");
        AbstractC3292y.i(onPrimaryButtonClick, "onPrimaryButtonClick");
        C2.c a9 = screenState.a();
        if (a9 != null) {
            dVar.h().invoke(a9);
        }
        if (!(screenState instanceof f.a) && !dVar.o()) {
            z9 = false;
        } else {
            z9 = true;
        }
        b(dVar, screenState.f(), new a(onPrimaryButtonClick, screenState), z9, z8);
        dVar.i().invoke(screenState.b(), Boolean.FALSE);
    }

    private static final void b(d dVar, C2.c cVar, Function0 function0, boolean z8, boolean z9) {
        dVar.k().invoke(new b(cVar, z9, dVar, z8, function0));
    }
}
