package o2;

import B2.InterfaceC0949a;
import Q5.x;
import R5.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;
import m6.EnumC3377d;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3520b implements InterfaceC0949a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0817b f35910a = new C0817b(null);

    /* renamed from: o2.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3520b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35911b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35912c;

        public a() {
            super(null);
            this.f35911b = "bi_card_number_completed";
            this.f35912c = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f35911b;
        }

        @Override // o2.AbstractC3520b
        public Map b() {
            return this.f35912c;
        }
    }

    /* renamed from: o2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0817b {
        private C0817b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(long j8) {
            return (float) C3374a.K(j8, EnumC3377d.f35046e);
        }

        public /* synthetic */ C0817b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: o2.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3520b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35913b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35914c;

        public c() {
            super(null);
            this.f35913b = "bi_load_started";
            this.f35914c = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f35913b;
        }

        @Override // o2.AbstractC3520b
        public Map b() {
            return this.f35914c;
        }
    }

    /* renamed from: o2.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3520b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35915b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35916c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String code) {
            super(null);
            AbstractC3292y.i(code, "code");
            this.f35915b = "bi_form_interacted";
            this.f35916c = Q.e(x.a("selected_lpm", code));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f35915b;
        }

        @Override // o2.AbstractC3520b
        public Map b() {
            return this.f35916c;
        }
    }

    /* renamed from: o2.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3520b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35917b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String code) {
            super(null);
            AbstractC3292y.i(code, "code");
            this.f35917b = "bi_form_shown";
            this.f35918c = Q.e(x.a("selected_lpm", code));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f35917b;
        }

        @Override // o2.AbstractC3520b
        public Map b() {
            return this.f35918c;
        }
    }

    /* renamed from: o2.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3520b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35919b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35920c;

        public /* synthetic */ f(String str, C3374a c3374a, AbstractC3284p abstractC3284p) {
            this(str, c3374a);
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f35919b;
        }

        @Override // o2.AbstractC3520b
        public Map b() {
            return this.f35920c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private f(String code, C3374a c3374a) {
            super(0 == true ? 1 : 0);
            AbstractC3292y.i(code, "code");
            this.f35919b = "bi_done_button_tapped";
            this.f35920c = Q.k(x.a("selected_lpm", code), x.a(TypedValues.TransitionType.S_DURATION, c3374a != null ? Float.valueOf(AbstractC3520b.f35910a.b(c3374a.P())) : null));
        }
    }

    private AbstractC3520b() {
    }

    public abstract Map b();

    public /* synthetic */ AbstractC3520b(AbstractC3284p abstractC3284p) {
        this();
    }
}
