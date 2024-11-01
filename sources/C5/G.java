package c5;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;
import q5.C3791p;

/* loaded from: classes5.dex */
public final class G {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15593e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f15594a;

    /* renamed from: b, reason: collision with root package name */
    private String f15595b;

    /* renamed from: c, reason: collision with root package name */
    private String f15596c;

    /* renamed from: d, reason: collision with root package name */
    private String f15597d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3292y.i(context, "context");
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            a9.Y0();
            a9.i();
        }

        public final G b(JSONObject jsonObjectData) {
            AbstractC3292y.i(jsonObjectData, "jsonObjectData");
            G g8 = new G();
            g8.g(jsonObjectData);
            return g8;
        }

        public final G c(Cursor c8) {
            AbstractC3292y.i(c8, "c");
            G g8 = new G();
            g8.j(c8.getLong(0));
            return g8;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(JSONObject jSONObject) {
        if (!jSONObject.isNull("appID")) {
            this.f15594a = jSONObject.getLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f15595b = jSONObject.getString("name");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f15596c = jSONObject.getString("iconURL");
        }
        if (!jSONObject.isNull("expireDate")) {
            this.f15597d = jSONObject.getString("expireDate");
        }
    }

    public final long b() {
        return this.f15594a;
    }

    public final String c() {
        return this.f15596c;
    }

    public final String d() {
        return this.f15595b;
    }

    public final String e() {
        return this.f15597d;
    }

    public final void f(Cursor c8) {
        AbstractC3292y.i(c8, "c");
        this.f15594a = c8.getLong(0);
    }

    public final void h(Context context) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        if (a9.m0(this.f15594a) == null) {
            a9.J0(this);
        }
        a9.i();
    }

    public final void i(Context context) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        a9.Z0(this.f15594a);
        a9.i();
    }

    public final void j(long j8) {
        this.f15594a = j8;
    }

    public final void k(String str) {
        this.f15596c = str;
    }

    public final void l(String str) {
        this.f15595b = str;
    }

    public String toString() {
        return "PreRegister(appID=" + this.f15594a + ", name=" + this.f15595b + ", icon=" + this.f15596c + ", releaseDate=" + this.f15597d + ')';
    }

    public G(long j8, String name, String str, String str2) {
        AbstractC3292y.i(name, "name");
        this.f15594a = j8;
        this.f15595b = name;
        this.f15596c = str;
        this.f15597d = str2;
    }
}
