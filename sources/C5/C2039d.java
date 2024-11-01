package c5;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;
import q5.C3795t;

/* renamed from: c5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2039d {

    /* renamed from: h, reason: collision with root package name */
    public static final a f15748h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f15749a;

    /* renamed from: b, reason: collision with root package name */
    private String f15750b;

    /* renamed from: c, reason: collision with root package name */
    private String f15751c;

    /* renamed from: d, reason: collision with root package name */
    private String f15752d;

    /* renamed from: e, reason: collision with root package name */
    private String f15753e;

    /* renamed from: f, reason: collision with root package name */
    private String f15754f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15755g;

    /* renamed from: c5.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C2039d a(JSONObject jsonObjectData) {
            AbstractC3292y.i(jsonObjectData, "jsonObjectData");
            C2039d c2039d = new C2039d();
            if (!jsonObjectData.isNull("affiliatedURL")) {
                c2039d.j(jsonObjectData.getString("affiliatedURL"));
            }
            if (!jsonObjectData.isNull(CampaignEx.JSON_KEY_TITLE)) {
                c2039d.o(jsonObjectData.getString(CampaignEx.JSON_KEY_TITLE));
            }
            if (!jsonObjectData.isNull("description")) {
                c2039d.l(jsonObjectData.getString("description"));
            }
            if (!jsonObjectData.isNull("buttonText")) {
                c2039d.k(jsonObjectData.getString("buttonText"));
            }
            if (!jsonObjectData.isNull("mainColor")) {
                c2039d.m(jsonObjectData.getString("mainColor"));
            }
            if (!jsonObjectData.isNull("secondaryColor")) {
                c2039d.n(jsonObjectData.getString("secondaryColor"));
            }
            return c2039d;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final void a(Context context, Long l8) {
        AbstractC3292y.i(context, "context");
        Bundle bundle = new Bundle();
        if (l8 != null && l8.longValue() > 0) {
            bundle.putString("appId", l8.toString());
        }
        bundle.putString("type", "clicked");
        new C3795t(context).e("affiliated", bundle);
    }

    public final void b(Context context, Long l8) {
        AbstractC3292y.i(context, "context");
        if (!this.f15755g) {
            this.f15755g = true;
            Bundle bundle = new Bundle();
            if (l8 != null && l8.longValue() > 0) {
                bundle.putString("appId", l8.toString());
            }
            bundle.putString("type", "shown");
            new C3795t(context).e("affiliated", bundle);
        }
    }

    public final String c() {
        return this.f15749a;
    }

    public final String d() {
        return this.f15752d;
    }

    public final String e() {
        return this.f15751c;
    }

    public final String f() {
        return this.f15753e;
    }

    public final String g() {
        return this.f15754f;
    }

    public final boolean h() {
        return this.f15755g;
    }

    public final String i() {
        return this.f15750b;
    }

    public final void j(String str) {
        this.f15749a = str;
    }

    public final void k(String str) {
        this.f15752d = str;
    }

    public final void l(String str) {
        this.f15751c = str;
    }

    public final void m(String str) {
        this.f15753e = str;
    }

    public final void n(String str) {
        this.f15754f = str;
    }

    public final void o(String str) {
        this.f15750b = str;
    }
}
