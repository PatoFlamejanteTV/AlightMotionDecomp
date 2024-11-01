package c5;

import android.content.Context;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;
import q5.C3791p;
import q5.C3796u;

/* renamed from: c5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2053s {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15944d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f15945a;

    /* renamed from: b, reason: collision with root package name */
    private String f15946b;

    /* renamed from: c, reason: collision with root package name */
    private long f15947c;

    /* renamed from: c5.s$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final String a(String str, String str2) {
            String str3 = "uptodown.native.1." + str;
            if (str2 != null) {
                return str3 + '.' + str2;
            }
            return str3;
        }

        private final boolean b(String str) {
            if (!AbstractC3292y.d(str, TypedValues.TransitionType.S_DURATION) && !AbstractC3292y.d(str, "speed")) {
                return false;
            }
            return true;
        }

        private final boolean c(String str) {
            if (!AbstractC3292y.d(str, "deeplink") && !AbstractC3292y.d(str, "update")) {
                return false;
            }
            return true;
        }

        private final boolean d(String str) {
            if (!AbstractC3292y.d(str, "responseCode") && !AbstractC3292y.d(str, "exception") && !AbstractC3292y.d(str, CampaignEx.JSON_NATIVE_VIDEO_ERROR) && !AbstractC3292y.d(str, "filehashCalculated")) {
                return false;
            }
            return true;
        }

        private final boolean e(String str) {
            if (!AbstractC3292y.d(str, "host") && !AbstractC3292y.d(str, "connectionType") && !AbstractC3292y.d(str, "downBandwidthKbps") && !AbstractC3292y.d(str, "upBandwidthKbps")) {
                return false;
            }
            return true;
        }

        private final void f(String str, JSONObject jSONObject, Bundle bundle) {
            C3796u c3796u = C3796u.f37312a;
            if (c3796u.c(str)) {
                jSONObject.put(str, bundle.getLong(str));
            } else if (c3796u.b(str)) {
                jSONObject.put(str, bundle.getInt(str));
            } else {
                jSONObject.put(str, bundle.getString(str));
            }
        }

        public final void g(String name, Bundle params, Context context) {
            long j8;
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(params, "params");
            if (context != null && SettingsPreferences.f30529b.L(context)) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                C2052q c2052q = new C2052q();
                c2052q.h(context);
                jSONObject2.put("identifier", c2052q.d());
                jSONObject2.put("storeVersionCode", 633);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("occurred_on", currentTimeMillis / 1000);
                if (l6.n.s(name, "download", false)) {
                    JSONObject jSONObject6 = new JSONObject();
                    String str = null;
                    for (String str2 : params.keySet()) {
                        long j9 = currentTimeMillis;
                        if (AbstractC3292y.d(str2, "type")) {
                            str = params.getString(str2);
                        } else {
                            AbstractC3292y.f(str2);
                            if (d(str2)) {
                                f(str2, jSONObject3, params);
                            } else if (b(str2)) {
                                f(str2, jSONObject2, params);
                            } else if (e(str2)) {
                                f(str2, jSONObject4, params);
                            } else if (c(str2)) {
                                f(str2, jSONObject6, params);
                            } else {
                                f(str2, jSONObject, params);
                            }
                        }
                        currentTimeMillis = j9;
                    }
                    j8 = currentTimeMillis;
                    if (jSONObject4.length() > 0) {
                        jSONObject2.put("network", jSONObject4);
                    }
                    if (jSONObject6.length() > 0) {
                        jSONObject.put("download", jSONObject6);
                    }
                    jSONObject5.put("messageName", a(name, str));
                } else {
                    j8 = currentTimeMillis;
                    if (l6.n.s(name, "install", false)) {
                        String str3 = null;
                        for (String str4 : params.keySet()) {
                            if (AbstractC3292y.d(str4, "type")) {
                                str3 = params.getString(str4);
                            } else {
                                AbstractC3292y.f(str4);
                                if (d(str4)) {
                                    f(str4, jSONObject3, params);
                                } else {
                                    f(str4, jSONObject, params);
                                }
                            }
                        }
                        jSONObject5.put("messageName", a(name, str3));
                    } else if (l6.n.s(name, "upload", false)) {
                        String str5 = null;
                        for (String str6 : params.keySet()) {
                            if (AbstractC3292y.d(str6, "type")) {
                                str5 = params.getString(str6);
                            } else {
                                AbstractC3292y.f(str6);
                                if (d(str6)) {
                                    f(str6, jSONObject3, params);
                                } else if (e(str6)) {
                                    f(str6, jSONObject4, params);
                                } else if (b(str6)) {
                                    f(str6, jSONObject2, params);
                                } else {
                                    f(str6, jSONObject, params);
                                }
                            }
                        }
                        if (jSONObject4.length() > 0) {
                            jSONObject2.put("network", jSONObject4);
                        }
                        jSONObject5.put("messageName", a(name, str5));
                    }
                }
                if (jSONObject2.length() > 0) {
                    jSONObject5.put("context", jSONObject2);
                }
                if (jSONObject.length() > 0) {
                    jSONObject5.put("payload", jSONObject);
                }
                if (jSONObject3.length() > 0) {
                    jSONObject5.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, jSONObject3);
                }
                if (!jSONObject5.isNull("messageName")) {
                    String jSONObject7 = jSONObject5.toString();
                    AbstractC3292y.h(jSONObject7, "toString(...)");
                    C2053s c2053s = new C2053s();
                    c2053s.e(jSONObject7);
                    c2053s.f(j8);
                    C3791p a9 = C3791p.f37286s.a(context);
                    a9.a();
                    a9.E0(c2053s);
                    a9.i();
                }
            }
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final long a() {
        return this.f15945a;
    }

    public final String b() {
        return this.f15946b;
    }

    public final long c() {
        return this.f15947c;
    }

    public final void d(long j8) {
        this.f15945a = j8;
    }

    public final void e(String str) {
        this.f15946b = str;
    }

    public final void f(long j8) {
        this.f15947c = j8;
    }
}
