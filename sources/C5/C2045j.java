package c5;

import android.content.Context;
import android.content.res.Resources;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: c5.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2045j extends AbstractC2038c {

    /* renamed from: n, reason: collision with root package name */
    public static final a f15879n = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private final long f15880k;

    /* renamed from: l, reason: collision with root package name */
    private final String f15881l;

    /* renamed from: m, reason: collision with root package name */
    private String f15882m;

    /* renamed from: c5.j$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3292y.i(context, "context");
            SettingsPreferences.f30529b.a(context);
        }

        public final boolean b(Context context, long j8) {
            AbstractC3292y.i(context, "context");
            if (j8 > -1) {
                return AbstractC2038c.f15738j.a(d(context), j8);
            }
            return false;
        }

        public final C2045j c(JSONObject jsonObjectData) {
            String str;
            String str2;
            long j8;
            AbstractC3292y.i(jsonObjectData, "jsonObjectData");
            if (!jsonObjectData.isNull("imgURL")) {
                str = jsonObjectData.getString("imgURL");
                com.squareup.picasso.s.h().l(str).d();
            } else {
                str = null;
            }
            if (!jsonObjectData.isNull("packageName")) {
                str2 = jsonObjectData.getString("packageName");
            } else {
                str2 = null;
            }
            if (!jsonObjectData.isNull("appID")) {
                j8 = jsonObjectData.getLong("appID");
            } else {
                j8 = -1;
            }
            if (j8 <= -1 || str2 == null || str == null) {
                return null;
            }
            return new C2045j(j8, str2, str);
        }

        public final C2045j d(Context context) {
            AbstractC3292y.i(context, "context");
            return SettingsPreferences.f30529b.g(context);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2045j(long j8, String packageName, String imageUrl) {
        super(j8, packageName, imageUrl, "banner");
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(imageUrl, "imageUrl");
        this.f15880k = j8;
        this.f15881l = packageName;
        this.f15882m = imageUrl;
    }

    public final String A(Resources resources) {
        AbstractC3292y.i(resources, "resources");
        return n();
    }

    public void B(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.f15882m = str;
    }

    @Override // c5.AbstractC2038c
    public long k() {
        return this.f15880k;
    }

    @Override // c5.AbstractC2038c
    public String n() {
        return this.f15882m;
    }

    @Override // c5.AbstractC2038c
    public String r() {
        return this.f15881l;
    }

    @Override // c5.AbstractC2038c
    public void t(Context context) {
        AbstractC3292y.i(context, "context");
        SettingsPreferences.f30529b.o0(context, this);
    }
}
