package x0;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class z {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    private static abstract class a implements w0.c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40928a = new C0931a("KEY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f40929b = new b("VALUE", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f40930c = a();

        /* renamed from: x0.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        enum C0931a extends a {
            C0931a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // w0.c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* loaded from: classes3.dex */
        enum b extends a {
            b(String str, int i8) {
                super(str, i8, null);
            }

            @Override // w0.c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i8) {
        }

        private static /* synthetic */ a[] a() {
            return new a[]{f40928a, f40929b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f40930c.clone();
        }

        /* synthetic */ a(String str, int i8, y yVar) {
            this(str, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w0.c b() {
        return a.f40928a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Map map) {
        StringBuilder a9 = AbstractC4185h.a(map.size());
        a9.append('{');
        boolean z8 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z8) {
                a9.append(", ");
            }
            a9.append(entry.getKey());
            a9.append('=');
            a9.append(entry.getValue());
            z8 = false;
        }
        a9.append('}');
        return a9.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w0.c d() {
        return a.f40929b;
    }
}
