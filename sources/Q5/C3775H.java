package q5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import c5.C2041f;
import c5.C2043h;
import c5.C2052q;
import c5.C2053s;
import c5.C2055u;
import c5.K;
import c5.M;
import c5.O;
import c5.T;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.activities.preferences.SettingsPreferences;
import d5.ResultReceiverC2761d;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r5.C3929c;

/* renamed from: q5.H, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3775H {

    /* renamed from: c, reason: collision with root package name */
    public static final a f37269c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f37270a;

    /* renamed from: b, reason: collision with root package name */
    private ResultReceiverC2761d f37271b;

    /* renamed from: q5.H$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final byte[] a(String string) {
            AbstractC3292y.i(string, "string");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(string.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = string.getBytes(C3338d.f34755b);
            AbstractC3292y.h(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            AbstractC3292y.f(byteArray);
            return byteArray;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
        public final String b(String str) {
            String str2;
            if (str == null) {
                return "en";
            }
            switch (str.hashCode()) {
                case 3121:
                    str2 = "ar";
                    if (!str.equals("ar")) {
                        return "en";
                    }
                    return str2;
                case 3179:
                    if (!str.equals("cn")) {
                        return "en";
                    }
                    return "cn";
                case 3201:
                    str2 = DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR;
                    if (!str.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                        return "en";
                    }
                    return str2;
                case 3241:
                    str.equals("en");
                    return "en";
                case 3246:
                    str2 = "es";
                    if (!str.equals("es")) {
                        return "en";
                    }
                    return str2;
                case 3276:
                    str2 = "fr";
                    if (!str.equals("fr")) {
                        return "en";
                    }
                    return str2;
                case 3329:
                    if (!str.equals("hi")) {
                        return "en";
                    }
                    return "in";
                case 3355:
                    if (!str.equals("id")) {
                        return "en";
                    }
                    return "id";
                case 3365:
                    if (!str.equals("in")) {
                        return "en";
                    }
                    return "id";
                case 3371:
                    str2 = "it";
                    if (!str.equals("it")) {
                        return "en";
                    }
                    return str2;
                case 3383:
                    if (!str.equals("ja")) {
                        return "en";
                    }
                    return "jp";
                case 3428:
                    if (!str.equals("ko")) {
                        return "en";
                    }
                    return "kr";
                case 3431:
                    if (!str.equals("kr")) {
                        return "en";
                    }
                    return "kr";
                case 3588:
                    if (!str.equals("pt")) {
                        return "en";
                    }
                    return TtmlNode.TAG_BR;
                case 3645:
                    str2 = "ro";
                    if (!str.equals("ro")) {
                        return "en";
                    }
                    return str2;
                case 3651:
                    str2 = "ru";
                    if (!str.equals("ru")) {
                        return "en";
                    }
                    return str2;
                case 3700:
                    str2 = "th";
                    if (!str.equals("th")) {
                        return "en";
                    }
                    return str2;
                case 3710:
                    str2 = "tr";
                    if (!str.equals("tr")) {
                        return "en";
                    }
                    return str2;
                case 3763:
                    str2 = "vi";
                    if (!str.equals("vi")) {
                        return "en";
                    }
                    return str2;
                case 3886:
                    if (!str.equals("zh")) {
                        return "en";
                    }
                    return "cn";
                default:
                    return "en";
            }
        }

        public final String c(Context context) {
            AbstractC3292y.i(context, "context");
            return l6.n.z("https://www.uptodown.com/turbo?platform=android", "www", b(SettingsPreferences.f30529b.p(context)), false, 4, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3775H(Context context) {
        AbstractC3292y.i(context, "context");
        this.f37270a = context;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final c5.K A(java.lang.String r26, java.util.HashMap r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 4519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C3775H.A(java.lang.String, java.util.HashMap, java.lang.String, boolean):c5.K");
    }

    static /* synthetic */ K B(C3775H c3775h, String str, HashMap hashMap, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return c3775h.A(str, hashMap, str2, z8);
    }

    private final K C(String str, HashMap hashMap) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        if (this.f37271b != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "\n*******Request*******\n" + str);
            ResultReceiverC2761d resultReceiverC2761d = this.f37271b;
            if (resultReceiverC2761d != null) {
                resultReceiverC2761d.send(137, bundle);
            }
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject = jSONObject3;
        } else {
            jSONObject = null;
        }
        K a9 = new C3929c().a(jSONObject2, jSONObject, this.f37271b, this.f37270a, str);
        a9.a(this.f37270a);
        return a9;
    }

    private final JSONArray D0(ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                JSONObject jSONObject = new JSONObject();
                if (((C2041f) arrayList.get(i8)).f() != null) {
                    jSONObject.put("name", ((C2041f) arrayList.get(i8)).f());
                } else if (((C2041f) arrayList.get(i8)).z() != null) {
                    jSONObject.put("name", ((C2041f) arrayList.get(i8)).z());
                } else if (((C2041f) arrayList.get(i8)).Q() != null) {
                    jSONObject.put("name", ((C2041f) arrayList.get(i8)).Q());
                }
                jSONObject.put("packagename", ((C2041f) arrayList.get(i8)).Q());
                if (((C2041f) arrayList.get(i8)).Q() != null) {
                    C3784i c3784i = new C3784i();
                    Context context = this.f37270a;
                    String Q8 = ((C2041f) arrayList.get(i8)).Q();
                    AbstractC3292y.f(Q8);
                    String i9 = c3784i.i(context, Q8);
                    if (new C3784i().y(i9)) {
                        jSONObject.put("installerPackagename", i9);
                    }
                }
                jSONObject.put("versionCode", ((C2041f) arrayList.get(i8)).f0());
                jSONObject.put("versionName", ((C2041f) arrayList.get(i8)).h0());
                jSONObject.put("isSystemApp", ((C2041f) arrayList.get(i8)).k0());
                jSONObject.put("md5", ((C2041f) arrayList.get(i8)).w());
                jSONObject.put("sha256Base", ((C2041f) arrayList.get(i8)).X());
                jSONObject.put("md5Signature", ((C2041f) arrayList.get(i8)).x());
                jSONObject.put("minSDKVersion", ((C2041f) arrayList.get(i8)).y());
                if (((C2041f) arrayList.get(i8)).d0() > 0) {
                    jSONObject.put("targetSDKVersion", ((C2041f) arrayList.get(i8)).d0());
                }
                if (((C2041f) arrayList.get(i8)).I() != null) {
                    AbstractC3292y.f(((C2041f) arrayList.get(i8)).I());
                    if (!r5.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList I8 = ((C2041f) arrayList.get(i8)).I();
                        AbstractC3292y.f(I8);
                        Iterator it = I8.iterator();
                        AbstractC3292y.h(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            C2055u c2055u = (C2055u) next;
                            if (c2055u.b() != null && c2055u.d() != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", c2055u.c());
                                jSONObject2.put("md5", c2055u.b());
                                jSONObject2.put("sha256", c2055u.d());
                                jSONArray2.put(jSONObject2);
                            }
                        }
                        if (jSONArray2.length() > 0) {
                            jSONObject.put("obbs", jSONArray2);
                        }
                    }
                }
                if (((C2041f) arrayList.get(i8)).b0() != null) {
                    AbstractC3292y.f(((C2041f) arrayList.get(i8)).b0());
                    if (!r5.isEmpty()) {
                        JSONArray jSONArray3 = new JSONArray();
                        ArrayList b02 = ((C2041f) arrayList.get(i8)).b0();
                        AbstractC3292y.f(b02);
                        Iterator it2 = b02.iterator();
                        AbstractC3292y.h(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            AbstractC3292y.h(next2, "next(...)");
                            C2055u c2055u2 = (C2055u) next2;
                            if (c2055u2.b() != null && c2055u2.d() != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", c2055u2.c());
                                jSONObject3.put("md5", c2055u2.b());
                                jSONObject3.put("sha256", c2055u2.d());
                                jSONArray3.put(jSONObject3);
                            }
                        }
                        if (jSONArray3.length() > 0) {
                            jSONObject.put("splits", jSONArray3);
                        }
                    }
                }
                if (jSONObject.length() > 0) {
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private final String E0(C2052q c2052q) {
        String jSONObject = c2052q.j().toString(2);
        AbstractC3292y.h(jSONObject, "toString(...)");
        return jSONObject;
    }

    private final String F0(c5.z zVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (zVar.c() > 0) {
                jSONObject.put("total_memory", zVar.c());
            }
            if (zVar.a() > 0) {
                jSONObject.put("free_memory", zVar.a());
            }
            if (zVar.d() > 0) {
                jSONObject.put("total_ram_memory", zVar.d());
            }
            if (zVar.a() > 0) {
                jSONObject.put("free_ram_memory", zVar.b());
            }
            return jSONObject.toString(2);
        } catch (JSONException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    private final JSONObject H0(O o8) {
        if (o8 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lang", o8.d());
                if (o8.i()) {
                    jSONObject.put("notifications_on", 1);
                } else {
                    jSONObject.put("notifications_on", 0);
                }
                jSONObject.put("notifications_frecuency", Integer.parseInt(o8.c()));
                if (o8.j()) {
                    jSONObject.put("only_wifi", 1);
                } else {
                    jSONObject.put("only_wifi", 0);
                }
                jSONObject.put("download_updates_options", o8.g());
                if (o8.f()) {
                    jSONObject.put("delete_apk", 1);
                } else {
                    jSONObject.put("delete_apk", 0);
                }
                if (o8.h()) {
                    jSONObject.put("install_apk_root", 1);
                } else {
                    jSONObject.put("install_apk_root", 0);
                }
                jSONObject.put("versioncode", o8.e());
                return jSONObject;
            } catch (JSONException e8) {
                e8.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private final String L(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z8 = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (z8) {
                z8 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            sb.append("=");
            sb.append(URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ K l0(C3775H c3775h, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c3775h.k0(str, i8);
    }

    public static /* synthetic */ K n0(C3775H c3775h, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c3775h.m0(str, i8);
    }

    private final HashMap r() {
        HashMap hashMap = new HashMap();
        C2052q c2052q = new C2052q();
        c2052q.i(this.f37270a);
        String c8 = c2052q.c();
        if (c8 != null && c8.length() != 0) {
            hashMap.put("countryIsoCode", c8);
        }
        return hashMap;
    }

    public final K A0(ArrayList events) {
        AbstractC3292y.i(events, "events");
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = events.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            C2053s c2053s = (C2053s) next;
            if (c2053s.b() != null) {
                String b9 = c2053s.b();
                AbstractC3292y.f(b9);
                jSONArray.put(new JSONObject(b9));
            }
        }
        hashMap.put("events", jSONArray.toString());
        return B(this, C3789n.f37282a.a() + "/eapi/logs/event", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K B0(String email, String pass) {
        AbstractC3292y.i(email, "email");
        AbstractC3292y.i(pass, "pass");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        String f8 = S4.d.f9430a.f(pass);
        AbstractC3292y.f(f8);
        hashMap.put(HintConstants.AUTOFILL_HINT_PASSWORD, f8);
        return B(this, C3789n.f37282a.a() + "/eapi/v2/user/login", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K C0(long j8, int i8, int i9) {
        C2052q c2052q = new C2052q();
        c2052q.h(this.f37270a);
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/app/" + j8 + "/device/" + c2052q.d() + "/compatible/versions", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K D(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/apps/latest-updates", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K E(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/apps/latest-updates-home", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K F() {
        return B(this, C3789n.f37282a.a() + "/eapi/main-app", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K G(long j8) {
        return A(C3789n.f37282a.a() + "/eapi/app/" + j8 + "/my-comment", null, ShareTarget.METHOD_GET, true);
    }

    public final ArrayList G0(K res) {
        int i8;
        JSONArray jSONArray;
        AbstractC3292y.i(res, "res");
        ArrayList arrayList = new ArrayList();
        if (!res.b() && res.d() != null) {
            String d8 = res.d();
            AbstractC3292y.f(d8);
            JSONObject jSONObject = new JSONObject(d8);
            if (!jSONObject.isNull("success")) {
                i8 = jSONObject.getInt("success");
            } else {
                i8 = 0;
            }
            if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            } else {
                jSONArray = null;
            }
            if (i8 == 1 && jSONArray != null) {
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                    AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
                    arrayList.add(C2043h.f15796F0.a(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    public final K H(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/apps/new-releases", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K I(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/apps/new-releases-home", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K I0(long j8, String text) {
        String str;
        AbstractC3292y.i(text, "text");
        HashMap hashMap = new HashMap();
        hashMap.put(MimeTypes.BASE_TYPE_TEXT, text);
        try {
            PackageManager packageManager = this.f37270a.getPackageManager();
            AbstractC3292y.h(packageManager, "getPackageManager(...)");
            String packageName = this.f37270a.getPackageName();
            AbstractC3292y.h(packageName, "getPackageName(...)");
            str = ' ' + S4.r.d(packageManager, packageName, 0).versionName;
        } catch (Exception e8) {
            e8.printStackTrace();
            str = "";
        }
        hashMap.put("uagent", "uptodownandroid" + str);
        return A(C3789n.f37282a.a() + "/eapi/comments/" + j8 + "/answers", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final K J(long j8, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i8));
        return B(this, C3789n.f37282a.a() + "/eapi/organization/" + j8 + "/apps", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K J0(long j8, M review) {
        String str;
        String str2;
        AbstractC3292y.i(review, "review");
        HashMap hashMap = new HashMap();
        if (review.u() != null) {
            String u8 = review.u();
            AbstractC3292y.f(u8);
            if (u8.length() > 0) {
                String u9 = review.u();
                AbstractC3292y.f(u9);
                hashMap.put(MimeTypes.BASE_TYPE_TEXT, u9);
            }
        }
        hashMap.put(CampaignEx.JSON_KEY_STAR, String.valueOf(review.s()));
        try {
            PackageManager packageManager = this.f37270a.getPackageManager();
            AbstractC3292y.h(packageManager, "getPackageManager(...)");
            String packageName = this.f37270a.getPackageName();
            AbstractC3292y.h(packageName, "getPackageName(...)");
            str = ' ' + S4.r.d(packageManager, packageName, 0).versionName;
        } catch (Exception e8) {
            e8.printStackTrace();
            str = "";
        }
        hashMap.put("uagent", "uptodownandroid" + str);
        T e9 = T.f15689k.e(this.f37270a);
        if (e9 != null) {
            str2 = e9.getId();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            String id = e9.getId();
            AbstractC3292y.f(id);
            hashMap.put("id_user", id);
        }
        return A(C3789n.f37282a.a() + "/eapi/apps/" + j8 + "/comments", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final K K(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/organization/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K K0(String email, String email2) {
        AbstractC3292y.i(email, "email");
        AbstractC3292y.i(email2, "email2");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put("email2", email2);
        return B(this, C3789n.f37282a.a() + "/eapi/user/recoverPasswordMail", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K L0(C2052q device, boolean z8) {
        AbstractC3292y.i(device, "device");
        JSONObject j8 = device.j();
        String str = C3789n.f37282a.b() + "/eapi/v2/tracker/device";
        HashMap hashMap = new HashMap();
        hashMap.put("device", j8.toString());
        if (z8) {
            return C(str, hashMap);
        }
        return B(this, str, hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K M(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/apps/" + j8 + "/permissions", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K M0(ArrayList apps, String identifier, boolean z8) {
        AbstractC3292y.i(apps, "apps");
        AbstractC3292y.i(identifier, "identifier");
        String str = C3789n.f37282a.b() + "/eapi/v3/tracker/apps/save";
        JSONArray D02 = D0(apps);
        if (this.f37271b != null) {
            Iterator it = apps.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            int i8 = 0;
            int i9 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                C2041f c2041f = (C2041f) next;
                if (c2041f.b0() != null) {
                    ArrayList b02 = c2041f.b0();
                    AbstractC3292y.f(b02);
                    i8 += b02.size();
                }
                if (c2041f.I() != null) {
                    ArrayList I8 = c2041f.I();
                    AbstractC3292y.f(I8);
                    i9 += I8.size();
                }
            }
            String str2 = "apps count = " + apps.size() + ", splits count = " + i8 + ", obbs count = " + i9;
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str2);
            ResultReceiverC2761d resultReceiverC2761d = this.f37271b;
            if (resultReceiverC2761d != null) {
                resultReceiverC2761d.send(137, bundle);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("identifier", identifier);
        hashMap.put("apps", String.valueOf(D02));
        hashMap.put("app_version", "633");
        if (z8) {
            return C(str, hashMap);
        }
        return B(this, str, hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K N(String identifier) {
        AbstractC3292y.i(identifier, "identifier");
        return B(this, C3789n.f37282a.a() + "/eapi/v2/virus-total-by-identifier/" + identifier + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K N0(String text, int i8, int i9) {
        String str;
        int i10;
        boolean z8;
        AbstractC3292y.i(text, "text");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        String str2 = null;
        try {
            String f8 = new l6.j("\\n").f(text, " ");
            int length = f8.length() - 1;
            int i11 = 0;
            boolean z9 = false;
            while (i11 <= length) {
                if (!z9) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (AbstractC3292y.k(f8.charAt(i10), 32) <= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z9) {
                    if (!z8) {
                        z9 = true;
                    } else {
                        i11++;
                    }
                } else {
                    if (!z8) {
                        break;
                    }
                    length--;
                }
            }
            str2 = f8.subSequence(i11, length + 1).toString();
            str = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            str = str2;
        }
        return B(this, C3789n.f37282a.a() + "/eapi/v2/apps/search/" + str, hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K O(int i8, int i9, String orderBy, String direction) {
        AbstractC3292y.i(orderBy, "orderBy");
        AbstractC3292y.i(direction, "direction");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        hashMap.put("sort[field]", orderBy);
        hashMap.put("sort[direction]", direction);
        hashMap.putAll(r());
        return B(this, C3789n.f37282a.a() + "/eapi/pre-register", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K O0(C2052q device, O o8, ResultReceiverC2761d resultReceiverC2761d) {
        String str;
        AbstractC3292y.i(device, "device");
        HashMap hashMap = new HashMap();
        String E02 = E0(device);
        hashMap.put("device", E02);
        JSONObject H02 = H0(o8);
        if (H02 != null) {
            str = H02.toString();
            hashMap.put("settings", str);
        } else {
            str = null;
        }
        if (resultReceiverC2761d != null) {
            String e8 = l6.n.e("\n                " + ("\n*******Params*******\n\n\nDevice\n") + "\n                " + E02 + "\n                ");
            StringBuilder sb = new StringBuilder();
            sb.append(e8);
            sb.append("\n\nSettingsUTD\n");
            String e9 = l6.n.e("\n                " + sb.toString() + "\n                " + str + "\n                ");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, e9);
            resultReceiverC2761d.send(137, bundle);
        }
        return B(this, C3789n.f37282a.b() + "/eapi/v2/tracker/identifier/" + device.d() + "/settings", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K P() {
        return A(C3789n.f37282a.a() + "/eapi/pre-register-apps-by-user", r(), ShareTarget.METHOD_GET, true);
    }

    public final K P0(String email, String suggestion, C2052q device, c5.z memory) {
        AbstractC3292y.i(email, "email");
        AbstractC3292y.i(suggestion, "suggestion");
        AbstractC3292y.i(device, "device");
        AbstractC3292y.i(memory, "memory");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put(NotificationCompat.CATEGORY_MESSAGE, suggestion);
        hashMap.put("device", E0(device));
        hashMap.put("memory", F0(memory));
        if (this.f37271b != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "\n*******Request sendSuggestion*******\n");
            ResultReceiverC2761d resultReceiverC2761d = this.f37271b;
            if (resultReceiverC2761d != null) {
                resultReceiverC2761d.send(137, bundle);
            }
        }
        return B(this, C3789n.f37282a.a() + "/eapi/nativeapp/sendsuggestion", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K Q(long j8) {
        if (j8 == 0) {
            K k8 = new K();
            k8.j(MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", 0);
            k8.i(jSONObject.toString());
            return k8;
        }
        HashMap hashMap = new HashMap();
        C2052q c2052q = new C2052q();
        c2052q.i(this.f37270a);
        String c8 = c2052q.c();
        if (c8 != null && c8.length() != 0) {
            hashMap.put("countryIsoCode", c8);
        }
        return B(this, C3789n.f37282a.a() + "/eapi/v2/apps/" + j8 + "/device/" + c2052q.d(), hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K Q0(long j8) {
        HashMap hashMap = new HashMap();
        hashMap.put("avatarID", String.valueOf(j8));
        return A(C3789n.f37282a.a() + "/eapi/user/avatar", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final K R() {
        return A(C3789n.f37282a.a() + "/eapi/promo-assign/provider/1", null, ShareTarget.METHOD_GET, true);
    }

    public final K R0(String name, String pass, String email) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(pass, "pass");
        AbstractC3292y.i(email, "email");
        HashMap hashMap = new HashMap();
        hashMap.put(HintConstants.AUTOFILL_HINT_USERNAME, name);
        String f8 = S4.d.f9430a.f(pass);
        AbstractC3292y.f(f8);
        hashMap.put(HintConstants.AUTOFILL_HINT_PASSWORD, f8);
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put("terms", "1");
        return B(this, C3789n.f37282a.a() + "/eapi/user/signup", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K S(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/apps/" + j8 + "/promoted", new HashMap(), ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K S0(String accessToken, String provider) {
        AbstractC3292y.i(accessToken, "accessToken");
        AbstractC3292y.i(provider, "provider");
        HashMap hashMap = new HashMap();
        hashMap.put("provider", provider);
        hashMap.put("accessToken", accessToken);
        return B(this, C3789n.f37282a.a() + "/eapi/user/usertokenSignup", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K T(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3789n.f37282a.a() + "/eapi/categories/" + i8 + "/apps/news", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K T0(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/" + j8 + "/similar", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K U(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/v2/apps/recent/featured", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K V(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/comments/" + j8 + "/answers", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K W(long j8, int i8, int i9, String ordination) {
        AbstractC3292y.i(ordination, "ordination");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        hashMap.put("order", ordination);
        return B(this, C3789n.f37282a.a() + "/eapi/apps/" + j8 + "/comments", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K X(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/apps/" + j8 + "/comments-with-text", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K Y(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/app/" + j8 + "/screenshots", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K Z(String identifier) {
        AbstractC3292y.i(identifier, "identifier");
        return A(C3789n.f37282a.b() + "/eapi/v2/tracker/device/" + identifier + "/status", null, ShareTarget.METHOD_GET, false);
    }

    public final K a(long j8) {
        return A(C3789n.f37282a.a() + "/eapi/app/" + j8 + "/pre-register/add", r(), ShareTarget.METHOD_POST, true);
    }

    public final K a0(String userID) {
        AbstractC3292y.i(userID, "userID");
        return B(this, C3789n.f37282a.a() + "/eapi/turbosubscription/get-url-portal/" + userID + '/', null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K b(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/app/" + j8 + "/alternatives", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K b0(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3789n.f37282a.a() + "/eapi/v2/app/top-platform", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K c() {
        return B(this, C3789n.f37282a.a() + "/eapi/event-log/version", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K c0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3789n.f37282a.a() + "/eapi/category/" + i8 + "/apps/top", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K d(long j8) {
        return A(C3789n.f37282a.a() + "/eapi/app/" + j8 + "/pre-register/cancel", r(), ShareTarget.METHOD_POST, true);
    }

    public final K d0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3789n.f37282a.a() + "/eapi/v2/leaf-category/" + i8 + "/apps/top", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K e(String password, String repeatPassword) {
        AbstractC3292y.i(password, "password");
        AbstractC3292y.i(repeatPassword, "repeatPassword");
        HashMap hashMap = new HashMap();
        hashMap.put("password1", password);
        hashMap.put("password2", repeatPassword);
        return A(C3789n.f37282a.a() + "/eapi/user/set-new-password", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final K e0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3789n.f37282a.a() + "/eapi/floating-category/" + i8 + "/apps", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K f(String username, int i8) {
        AbstractC3292y.i(username, "username");
        HashMap hashMap = new HashMap();
        hashMap.put(HintConstants.AUTOFILL_HINT_NEW_USERNAME, username);
        hashMap.put("usernameFormatID", String.valueOf(i8));
        return A(C3789n.f37282a.a() + "/eapi/user/change-username", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final K f0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3789n.f37282a.a() + "/eapi/v2/apps/category/" + i8 + "/top/featured", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final boolean g(K res) {
        long j8;
        JSONObject jSONObject;
        AbstractC3292y.i(res, "res");
        boolean z8 = false;
        if (res.b()) {
            if (res.e() == 503) {
                if (res.d() != null) {
                    String d8 = res.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        try {
                            String d9 = res.d();
                            AbstractC3292y.f(d9);
                            jSONObject = new JSONObject(d9);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        if (!jSONObject.isNull("seconds")) {
                            j8 = jSONObject.getLong("seconds");
                            SettingsPreferences.f30529b.c1(this.f37270a, j8);
                            C3791p a9 = C3791p.f37286s.a(this.f37270a);
                            a9.a();
                            a9.N();
                            a9.i();
                        }
                    }
                }
                j8 = 86400;
                SettingsPreferences.f30529b.c1(this.f37270a, j8);
                C3791p a92 = C3791p.f37286s.a(this.f37270a);
                a92.a();
                a92.N();
                a92.i();
            }
            return false;
        }
        String d10 = res.d();
        if (d10 == null || d10.length() == 0) {
            z8 = true;
        }
        return !z8;
    }

    public final K g0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3789n.f37282a.a() + "/eapi/floating-category/" + i8 + "/apps-list", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K h(long j8) {
        return A(C3789n.f37282a.a() + "/eapi/app/" + j8 + "/pre-registered", r(), ShareTarget.METHOD_GET, true);
    }

    public final K h0() {
        C2052q c2052q = new C2052q();
        c2052q.h(this.f37270a);
        return A(C3789n.f37282a.b() + "/eapi/androidtracker/device-apps-installed/" + c2052q.d(), null, ShareTarget.METHOD_GET, false);
    }

    public final K i(String costumerId, String priceId, String productType) {
        AbstractC3292y.i(costumerId, "costumerId");
        AbstractC3292y.i(priceId, "priceId");
        AbstractC3292y.i(productType, "productType");
        HashMap hashMap = new HashMap();
        hashMap.put("userID", costumerId);
        hashMap.put("priceID", priceId);
        hashMap.put("productType", productType);
        C2052q c2052q = new C2052q();
        c2052q.i(this.f37270a);
        hashMap.put("country", String.valueOf(c2052q.c()));
        return A(C3789n.f37282a.a() + "/eapi/turbosubscription/subscription-stripe", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final K i0() {
        return B(this, C3789n.f37282a.a() + "/eapi/turbosubscription/get-turbo-products", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K j(ArrayList categories, int i8, int i9) {
        AbstractC3292y.i(categories, "categories");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        hashMap.put("categoryIDs", categories.toString());
        return B(this, C3789n.f37282a.a() + "/eapi/floating-category/additional/apps", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K j0(String identifier) {
        AbstractC3292y.i(identifier, "identifier");
        return B(this, C3789n.f37282a.b() + "/eapi/v2/tracker/updates/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K k(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/app/" + j8 + "/affiliated-app", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K k0(String fileId, int i8) {
        AbstractC3292y.i(fileId, "fileId");
        HashMap hashMap = new HashMap();
        hashMap.put("update", String.valueOf(i8));
        return B(this, C3789n.f37282a.a() + "/eapi/apps/file/" + fileId + "/downloadUrl", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K l(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/v2/app/" + j8 + "/abis", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K m(String packagename) {
        AbstractC3292y.i(packagename, "packagename");
        return B(this, C3789n.f37282a.a() + "/eapi/apps/byPackagename/" + packagename, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K m0(String idFichero, int i8) {
        AbstractC3292y.i(idFichero, "idFichero");
        HashMap hashMap = new HashMap();
        hashMap.put("update", String.valueOf(i8));
        return B(this, C3789n.f37282a.a() + "/eapi/apps/file/" + idFichero + "/resumeDownloadURL", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K n(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/v2/app/" + j8 + "/languages", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K o() {
        return B(this, C3789n.f37282a.a() + "/eapi/v2/app/floating-banner", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K o0(String str, String str2) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packagename", str);
            jSONObject.put("md5Signature", str2);
            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject.toString());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return B(this, C3789n.f37282a.a() + "/eapi/nativeapp/getappurlbypackagenamemd5signature", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K p() {
        return B(this, C3789n.f37282a.a() + "/eapi/categories/parents", new HashMap(), ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K p0() {
        return A(C3789n.f37282a.a() + "/eapi/v2/user/avatars", null, ShareTarget.METHOD_GET, true);
    }

    public final K q(int i8) {
        return B(this, C3789n.f37282a.a() + "/eapi/v2/categories/" + i8 + "/leaf-categories", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K q0(String userID, int i8, int i9) {
        boolean z8;
        AbstractC3292y.i(userID, "userID");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        T e8 = T.f15689k.e(this.f37270a);
        if (e8 != null && AbstractC3292y.d(e8.getId(), userID)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return A(C3789n.f37282a.a() + "/eapi/user/" + userID + "/comments", hashMap, ShareTarget.METHOD_GET, z8);
    }

    public final K r0() {
        return A(C3789n.f37282a.a() + "/eapi/user/getUpdatedData", null, ShareTarget.METHOD_GET, true);
    }

    public final K s(String identifier) {
        AbstractC3292y.i(identifier, "identifier");
        return B(this, C3789n.f37282a.b() + "/eapi/v2/tracker/device/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K s0(String userID) {
        AbstractC3292y.i(userID, "userID");
        return A(C3789n.f37282a.a() + "/eapi/user/" + userID + "/reviews-number", null, ShareTarget.METHOD_GET, false);
    }

    public final K t(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/faq/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K t0() {
        return A(C3789n.f37282a.a() + "/eapi/user/username-formats", null, ShareTarget.METHOD_GET, true);
    }

    public final K u(String identifier) {
        AbstractC3292y.i(identifier, "identifier");
        return B(this, C3789n.f37282a.b() + "/eapi/v2/tracker/app-to-upload/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K u0(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/apps/" + j8 + "/video", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K v() {
        return B(this, C3789n.f37282a.a() + "/eapi/categories/floating", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K v0(String fileId) {
        AbstractC3292y.i(fileId, "fileId");
        return B(this, C3789n.f37282a.a() + "/eapi/v2/virus-total/" + fileId + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K w(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/floating-categories/app/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K w0(String sha256) {
        AbstractC3292y.i(sha256, "sha256");
        return B(this, C3789n.f37282a.a() + "/eapi/v2/virus-total-by-sha256/" + sha256 + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K x(int i8) {
        return B(this, C3789n.f37282a.a() + "/eapi/floating-category-related/" + i8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K x0() {
        return B(this, "https://adservice.google.com/getconfig/pubvendors", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K y() {
        return B(this, C3789n.f37282a.a() + "/eapi/home/features", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K y0(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/answer/" + j8 + "/like", null, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final K z() {
        return B(this, C3789n.f37282a.a() + "/eapi/v2/app/interstitial-banner", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final K z0(long j8) {
        return B(this, C3789n.f37282a.a() + "/eapi/comment/" + j8 + "/like", null, ShareTarget.METHOD_POST, false, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3775H(Context context, ResultReceiverC2761d resultReceiverC2761d) {
        this(context);
        AbstractC3292y.i(context, "context");
        this.f37271b = resultReceiverC2761d;
    }
}
