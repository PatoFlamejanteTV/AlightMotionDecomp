package E2;

import android.util.Log;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1559a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final String f1560b = e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static final String f1561c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f1562c = new a("ReactNative", 0, "com.facebook.react.bridge.NativeModule", "react-native");

        /* renamed from: d, reason: collision with root package name */
        public static final a f1563d = new a("Flutter", 1, "io.flutter.embedding.engine.FlutterEngine", "flutter");

        /* renamed from: e, reason: collision with root package name */
        public static final a f1564e = new a("Cordova", 2, "org.apache.cordova.CordovaActivity", "cordova");

        /* renamed from: f, reason: collision with root package name */
        public static final a f1565f = new a("Unity", 3, "com.unity3d.player.UnityPlayerActivity", "unity");

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f1566g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ W5.a f1567h;

        /* renamed from: a, reason: collision with root package name */
        private final String f1568a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1569b;

        static {
            a[] a9 = a();
            f1566g = a9;
            f1567h = W5.b.a(a9);
        }

        private a(String str, int i8, String str2, String str3) {
            this.f1568a = str2;
            this.f1569b = str3;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f1562c, f1563d, f1564e, f1565f};
        }

        public static W5.a c() {
            return f1567h;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1566g.clone();
        }

        public final String b() {
            return this.f1568a;
        }

        public final String d() {
            return this.f1569b;
        }
    }

    static {
        String str;
        Object obj;
        Iterator<E> it = a.c().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                if (f1559a.b(((a) obj).b())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar != null) {
            str = aVar.d();
        }
        f1561c = str;
    }

    private e() {
    }

    private final boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e8) {
            Log.d(f1560b, str + " not found: " + e8);
            return false;
        }
    }

    public final String a() {
        return f1561c;
    }
}
