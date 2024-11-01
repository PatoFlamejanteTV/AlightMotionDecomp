package com.stripe.android.view;

/* loaded from: classes4.dex */
public interface A {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28355a = new a("CardNumber", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f28356b = new a("ExpiryDate", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f28357c = new a("Cvc", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f28358d = new a("PostalCode", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f28359e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f28360f;

        static {
            a[] a9 = a();
            f28359e = a9;
            f28360f = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f28355a, f28356b, f28357c, f28358d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28359e.clone();
        }
    }

    void a();

    void b();

    void c();

    void d(a aVar);

    void e();
}
