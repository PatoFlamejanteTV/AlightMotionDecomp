package com.stripe.android.paymentsheet;

import Q5.InterfaceC1416k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4127g;

/* loaded from: classes4.dex */
public abstract class r {

    /* loaded from: classes4.dex */
    public static final class a extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27652a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final e f27653b = e.f27671b;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f27654c = false;

        private a() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.r
        public e a() {
            return f27653b;
        }

        @Override // com.stripe.android.paymentsheet.r
        public boolean b() {
            return f27654c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27655a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final e f27656b = e.f27672c;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f27657c = false;

        private b() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.r
        public e a() {
            return f27656b;
        }

        @Override // com.stripe.android.paymentsheet.r
        public boolean b() {
            return f27657c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27658a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final e f27659b = e.f27673d;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f27660c = false;

        private c() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.r
        public e a() {
            return f27659b;
        }

        @Override // com.stripe.android.paymentsheet.r
        public boolean b() {
            return f27660c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends r {

        /* renamed from: a, reason: collision with root package name */
        private final C4127g f27661a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27662b;

        /* renamed from: c, reason: collision with root package name */
        private final e f27663c;

        /* renamed from: d, reason: collision with root package name */
        private final C2.c f27664d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.o f27665e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC1416k f27666f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC1416k f27667g;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.f() || d.this.f27662b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.d().f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C4127g displayableSavedPaymentMethod, boolean z8) {
            super(null);
            AbstractC3292y.i(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            this.f27661a = displayableSavedPaymentMethod;
            this.f27662b = z8;
            this.f27663c = e.f27670a;
            this.f27664d = displayableSavedPaymentMethod.b();
            this.f27665e = displayableSavedPaymentMethod.d();
            this.f27666f = Q5.l.b(new b());
            this.f27667g = Q5.l.b(new a());
        }

        @Override // com.stripe.android.paymentsheet.r
        public e a() {
            return this.f27663c;
        }

        @Override // com.stripe.android.paymentsheet.r
        public boolean b() {
            return ((Boolean) this.f27667g.getValue()).booleanValue();
        }

        public final C4127g d() {
            return this.f27661a;
        }

        public final com.stripe.android.model.o e() {
            return this.f27665e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3292y.d(this.f27661a, dVar.f27661a) && this.f27662b == dVar.f27662b;
        }

        public final boolean f() {
            return ((Boolean) this.f27666f.getValue()).booleanValue();
        }

        public int hashCode() {
            return (this.f27661a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f27662b);
        }

        public String toString() {
            return "SavedPaymentMethod(displayableSavedPaymentMethod=" + this.f27661a + ", canRemovePaymentMethods=" + this.f27662b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27670a = new e("SavedPaymentMethod", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f27671b = new e("AddCard", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f27672c = new e("GooglePay", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final e f27673d = new e("Link", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f27674e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f27675f;

        static {
            e[] a9 = a();
            f27674e = a9;
            f27675f = W5.b.a(a9);
        }

        private e(String str, int i8) {
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f27670a, f27671b, f27672c, f27673d};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f27674e.clone();
        }
    }

    private r() {
    }

    public abstract e a();

    public abstract boolean b();

    public /* synthetic */ r(AbstractC3284p abstractC3284p) {
        this();
    }
}
