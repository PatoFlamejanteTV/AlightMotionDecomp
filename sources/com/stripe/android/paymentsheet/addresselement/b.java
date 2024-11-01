package com.stripe.android.paymentsheet.addresselement;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f26882a;

    /* loaded from: classes4.dex */
    public static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final C0587a f26883c = new C0587a(null);

        /* renamed from: b, reason: collision with root package name */
        private final String f26884b;

        /* renamed from: com.stripe.android.paymentsheet.addresselement.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0587a {
            private C0587a() {
            }

            public /* synthetic */ C0587a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String country) {
            super("Autocomplete?country=" + country, null);
            AbstractC3292y.i(country, "country");
            this.f26884b = country;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.addresselement.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0588b extends b {

        /* renamed from: b, reason: collision with root package name */
        public static final C0588b f26885b = new C0588b();

        private C0588b() {
            super("InputAddress", null);
        }
    }

    public /* synthetic */ b(String str, AbstractC3284p abstractC3284p) {
        this(str);
    }

    public String a() {
        return this.f26882a;
    }

    private b(String str) {
        this.f26882a = str;
    }
}
