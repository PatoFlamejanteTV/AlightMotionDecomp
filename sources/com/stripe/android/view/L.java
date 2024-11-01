package com.stripe.android.view;

/* loaded from: classes4.dex */
public interface L {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28649a = new a("Number", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f28650b = new a("Expiry", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f28651c = new a("Cvc", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f28652d = new a("Postal", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f28653e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f28654f;

        static {
            a[] a9 = a();
            f28653e = a9;
            f28654f = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f28649a, f28650b, f28651c, f28652d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28653e.clone();
        }
    }
}
