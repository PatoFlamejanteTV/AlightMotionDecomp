package c5;

import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: c5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2044i {

    /* renamed from: f, reason: collision with root package name */
    public static final a f15873f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f15874a;

    /* renamed from: b, reason: collision with root package name */
    private String f15875b;

    /* renamed from: c, reason: collision with root package name */
    private int f15876c;

    /* renamed from: d, reason: collision with root package name */
    private String f15877d;

    /* renamed from: e, reason: collision with root package name */
    private int f15878e;

    /* renamed from: c5.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C2044i a(JSONObject jsonObjectData) {
            AbstractC3292y.i(jsonObjectData, "jsonObjectData");
            C2044i c2044i = new C2044i();
            c2044i.f(jsonObjectData);
            return c2044i;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.f15874a = jSONObject.getLong("id");
        }
        if (!jSONObject.isNull("sha256")) {
            this.f15875b = jSONObject.getString("sha256");
        }
        if (!jSONObject.isNull("active")) {
            this.f15876c = jSONObject.getInt("active");
        }
        if (!jSONObject.isNull("url")) {
            this.f15877d = jSONObject.getString("url");
        }
        if (!jSONObject.isNull("isTurbo")) {
            this.f15878e = jSONObject.getInt("isTurbo");
        }
    }

    public final int b() {
        return this.f15876c;
    }

    public final String c() {
        if (this.f15877d != null) {
            return this.f15877d + UptodownApp.f29249C.t() + ":webp";
        }
        return null;
    }

    public final long d() {
        return this.f15874a;
    }

    public final String e() {
        return this.f15877d;
    }
}
