package B2;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private Map f390a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f391b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f392b = new a(ShareTarget.METHOD_GET, 0, ShareTarget.METHOD_GET);

        /* renamed from: c, reason: collision with root package name */
        public static final a f393c = new a(ShareTarget.METHOD_POST, 1, ShareTarget.METHOD_POST);

        /* renamed from: d, reason: collision with root package name */
        public static final a f394d = new a("DELETE", 2, "DELETE");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f395e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f396f;

        /* renamed from: a, reason: collision with root package name */
        private final String f397a;

        static {
            a[] a9 = a();
            f395e = a9;
            f396f = W5.b.a(a9);
        }

        private a(String str, int i8, String str2) {
            this.f397a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f392b, f393c, f394d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f395e.clone();
        }

        public final String b() {
            return this.f397a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f398b = new b("Form", 0, ShareTarget.ENCODING_TYPE_URL_ENCODED);

        /* renamed from: c, reason: collision with root package name */
        public static final b f399c = new b("MultipartForm", 1, ShareTarget.ENCODING_TYPE_MULTIPART);

        /* renamed from: d, reason: collision with root package name */
        public static final b f400d = new b("Json", 2, "application/json");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f401e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f402f;

        /* renamed from: a, reason: collision with root package name */
        private final String f403a;

        static {
            b[] a9 = a();
            f401e = a9;
            f402f = W5.b.a(a9);
        }

        private b(String str, int i8, String str2) {
            this.f403a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f398b, f399c, f400d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f401e.clone();
        }

        public final String b() {
            return this.f403a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f403a;
        }
    }

    public abstract Map a();

    public abstract a b();

    public Map c() {
        return this.f390a;
    }

    public abstract Iterable d();

    public boolean e() {
        return this.f391b;
    }

    public abstract String f();

    public void g(OutputStream outputStream) {
        AbstractC3292y.i(outputStream, "outputStream");
    }
}
