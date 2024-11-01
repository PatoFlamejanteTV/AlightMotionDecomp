package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ai extends m {

    /* renamed from: a, reason: collision with root package name */
    private static int f21242a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f21243b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static int f21244c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static int f21245d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static int f21246e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f21247f = 7;

    /* renamed from: g, reason: collision with root package name */
    private static int f21248g = 14;

    /* renamed from: h, reason: collision with root package name */
    private static int f21249h = 19;

    /* renamed from: i, reason: collision with root package name */
    private static int f21250i = 16;

    /* renamed from: j, reason: collision with root package name */
    private static int f21251j = 26;

    /* renamed from: k, reason: collision with root package name */
    private static char[] f21252k = {'.', 'X'};

    /* renamed from: l, reason: collision with root package name */
    private static char[] f21253l = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: m, reason: collision with root package name */
    private static int f21254m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f21255n = true;

    /* renamed from: o, reason: collision with root package name */
    private static volatile Boolean f21256o = null;

    /* renamed from: p, reason: collision with root package name */
    private static String f21257p = "[一-龥]";

    /* renamed from: q, reason: collision with root package name */
    private static Pattern f21258q = Pattern.compile("[一-龥]");

    /* renamed from: r, reason: collision with root package name */
    private static Map<String, String> f21259r;

    /* renamed from: s, reason: collision with root package name */
    private static Map<String, String> f21260s;

    public static int a(int i8) {
        if ((i8 > 100 && i8 < 199) || i8 == 2) {
            return 1;
        }
        if ((i8 <= 200 || i8 >= 299) && i8 != 4) {
            return (i8 <= 500 || i8 >= 599) ? -1 : 5;
        }
        return 2;
    }

    public static int b(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                com.mbridge.msdk.c.h.a();
                b9 = com.mbridge.msdk.c.i.a();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return b9.aB();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int c(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return 0;
    }

    public static float d(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f8 = context.getResources().getDisplayMetrics().density;
            if (f8 == 0.0f) {
                return 2.5f;
            }
            return f8;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 2.5f;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return n(context).heightPixels;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return n(context).widthPixels;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static float i(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int j(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static boolean k(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("SameTools", "isNetworkAvailable", e8);
            }
            return false;
        }
    }

    public static boolean m(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return "wifi".equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US));
            }
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    private static DisplayMetrics n(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    public static String a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put(str2, str3);
                return a(str, hashMap);
            }
            return str;
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return str;
        }
    }

    public static synchronized String d(String str) {
        synchronized (ai.class) {
            String str2 = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str;
            Map<String, String> map = f21260s;
            if (map == null || !map.containsKey(str2)) {
                return null;
            }
            return f21260s.get(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            if (r4 == 0) goto L4c
            java.lang.String r0 = "dyview"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            if (r2 == 0) goto L24
            java.lang.String r0 = "view"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            goto L24
        L21:
            r4 = move-exception
            r0 = 0
            goto L4d
        L24:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            r3 = 1
            if (r2 != 0) goto L37
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L56
            goto L31
        L30:
            r0 = -1
        L31:
            int r0 = r0 % 2
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            java.lang.String r2 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            if (r4 != 0) goto L46
            r1 = 1
            goto L4c
        L46:
            r1 = r0
            goto L4c
        L48:
            r1 = r0
            goto L56
        L4a:
            r4 = move-exception
            goto L4d
        L4c:
            return r1
        L4d:
            java.lang.String r2 = "SameTools"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L48
            com.mbridge.msdk.foundation.tools.ad.b(r2, r4)     // Catch: java.lang.Throwable -> L48
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.i(java.lang.String):boolean");
    }

    public static final synchronized String e(String str) {
        String str2;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        JSONObject jSONObject;
        Map<String, String> map;
        synchronized (ai.class) {
            try {
                str2 = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str;
                com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b9 != null) {
                    z8 = b9.aC();
                    z9 = b9.aH();
                    i9 = Math.max(0, b9.ad());
                } else {
                    z8 = true;
                    i9 = 3;
                    z9 = false;
                }
            } catch (Exception e8) {
                ad.b("SameTools", e8.getMessage());
            } finally {
            }
            if (z9 && i9 != 0) {
                if (z8 && (map = f21259r) != null && map.containsKey(str2)) {
                    return f21259r.get(str2);
                }
                StringBuilder sb = new StringBuilder("");
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    List<String> a9 = a(stackTrace);
                    Collections.reverse(a9);
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : a9) {
                        if (!str3.startsWith(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_APP) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_REFLECT_METHOD) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_VIEW) && !arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                    int min = Math.min(arrayList.size(), i9);
                    if (min > 0) {
                        for (i8 = 0; i8 < min; i8++) {
                            sb.append((String) arrayList.get(i8));
                            if (i8 < min - 1) {
                                sb.append("|");
                            }
                        }
                    }
                    if (TextUtils.isEmpty(sb.toString())) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put("1", sb.toString());
                    }
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String a10 = C2594a.a(jSONObject.toString());
                        if (z8 && !TextUtils.isEmpty(a10)) {
                            if (f21259r == null) {
                                f21259r = new HashMap();
                            }
                            f21259r.put(str2, a10);
                        }
                        return a10;
                    }
                    return "";
                }
                return "";
            }
            return "";
        }
    }

    public static int f(String str) {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", null).invoke(z.b(str), null)).intValue();
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage());
            return 0;
        }
    }

    public static Object g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.mbridge.msdk.foundation.controller.c.m().c(), str);
        } catch (ClassNotFoundException e8) {
            ad.b("SameTools", e8.getMessage());
            return null;
        } catch (IllegalAccessException e9) {
            ad.b("SameTools", e9.getMessage());
            return null;
        } catch (NoSuchMethodException e10) {
            ad.b("SameTools", e10.getMessage());
            return null;
        } catch (InvocationTargetException e11) {
            ad.b("SameTools", e11.getMessage());
            return null;
        }
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_CAN_ANIM);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return false;
        }
    }

    public static <T extends String> boolean k(T t8) {
        return t8 == null || t8.length() == 0;
    }

    public static double m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0.0d;
        }
    }

    public static String c(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> a9;
        List<String> c8;
        if (TextUtils.isEmpty(str) || (a9 = com.mbridge.msdk.foundation.same.a.d.a(str)) == null || a9.size() <= 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (com.mbridge.msdk.foundation.entity.c cVar : a9.values()) {
            if (cVar != null) {
                long e8 = cVar.e();
                long f8 = cVar.f();
                long currentTimeMillis = System.currentTimeMillis();
                if (e8 <= 0) {
                    com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (b9 == null) {
                        com.mbridge.msdk.c.h.a();
                        b9 = com.mbridge.msdk.c.i.a();
                    }
                    if (f8 + (b9.ac() * 1000) >= currentTimeMillis) {
                        c8 = cVar.c();
                        if (c8 != null) {
                            arrayList.addAll(c8);
                        }
                    }
                } else if (f8 + (e8 * 1000) >= currentTimeMillis) {
                    c8 = cVar.c();
                    if (c8 != null && c8.size() > 0) {
                        arrayList.addAll(c8);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            return "";
        }
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        return arrayList.toString();
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.ENDCARD_URL_IS_PLAYABLE);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return false;
        }
    }

    private static String a(String str, Map<String, String> map) {
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                StringBuilder sb = new StringBuilder(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        String value = entry.getValue();
                        if (str.contains(entry.getKey())) {
                            if (value.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                            } else {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                            }
                        } else if (!value.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                            sb.append(entry.getKey() + entry.getValue());
                        }
                    }
                }
                return sb.toString();
            }
            return str;
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return str;
        }
    }

    public static String d() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        if (!an.a(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    public static <T extends String> boolean j(T t8) {
        return t8 != null && t8.length() > 0;
    }

    public static BitmapDrawable n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                return bitmapDrawable;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static void j() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
        builder.setDatabaseHandler(handler);
        builder.setDatabaseOpenHelper(new IDatabaseOpenHelper() { // from class: com.mbridge.msdk.foundation.tools.ai.2
            @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
            public final SQLiteDatabase getReadableDatabase() {
                return com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()).c();
            }

            @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
            public final SQLiteDatabase getWritableDatabase() {
                return com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()).d();
            }
        });
        builder.setLogger(new ILogger() { // from class: com.mbridge.msdk.foundation.tools.ai.3
            @Override // com.mbridge.msdk.foundation.download.utils.ILogger
            public final void log(String str, String str2) {
                ad.a(str, str2);
            }

            @Override // com.mbridge.msdk.foundation.download.utils.ILogger
            public final void log(String str, Exception exc) {
                ad.a(str, exc.getMessage());
            }
        });
        MBDownloadManager.getInstance().initialize(com.mbridge.msdk.foundation.controller.c.m().c(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100L).setMaxStorageTime(259200000L).build());
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return -1;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return -1;
        }
    }

    public static boolean f() {
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.m().h())) {
            return false;
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
            return true;
        } catch (ClassNotFoundException e8) {
            ad.b("SameTools", e8.getMessage());
            return false;
        }
    }

    public static boolean h() {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager a9 = u.a();
            if (a9 != null && (networkInfo = a9.getNetworkInfo(17)) != null) {
                return networkInfo.isConnected();
            }
            return false;
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return false;
        }
    }

    public static synchronized int d(Context context, String str) {
        int i8;
        synchronized (ai.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i8 = b(str, context) != null ? 1 : 0;
                    } catch (Exception unused) {
                        i8 = 3;
                    }
                }
            }
            if (context == null) {
                i8 = 5;
            } else {
                i8 = TextUtils.isEmpty(str) ? 2 : 4;
            }
        }
        return i8;
    }

    public static boolean g() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean i() {
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            int parseInt = Integer.parseInt(property2);
            ad.a("address = ", property + "~");
            ad.a("port = ", parseInt + "~");
            return (TextUtils.isEmpty(property) || parseInt == -1) ? false : true;
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: Exception -> 0x001c, LOOP:0: B:18:0x004c->B:19:0x004e, LOOP_END, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0002, B:5:0x0014, B:6:0x001e, B:8:0x0025, B:10:0x002c, B:12:0x0042, B:16:0x0048, B:19:0x004e, B:22:0x0056, B:24:0x005c), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(int r6) {
        /*
            java.lang.String r0 = ""
            com.mbridge.msdk.c.h r1 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r2.k()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.c.g r1 = r1.b(r2)     // Catch: java.lang.Exception -> L1c
            if (r1 != 0) goto L1e
            com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.c.g r1 = com.mbridge.msdk.c.i.a()     // Catch: java.lang.Exception -> L1c
            goto L1e
        L1c:
            r6 = move-exception
            goto L61
        L1e:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1c
            r2.<init>()     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L56
            int r1 = r1.q()     // Catch: java.lang.Exception -> L1c
            r3 = 1
            if (r1 != r3) goto L56
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L1c
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.foundation.db.h r1 = com.mbridge.msdk.foundation.db.h.a(r1)     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.foundation.db.k r1 = com.mbridge.msdk.foundation.db.k.a(r1)     // Catch: java.lang.Exception -> L1c
            long[] r1 = r1.b()     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L56
            int r3 = r1.length     // Catch: java.lang.Exception -> L1c
            if (r3 <= r6) goto L4b
            if (r6 != 0) goto L48
            goto L4b
        L48:
            int r6 = r3 - r6
            goto L4c
        L4b:
            r6 = 0
        L4c:
            if (r6 >= r3) goto L56
            r4 = r1[r6]     // Catch: java.lang.Exception -> L1c
            r2.put(r4)     // Catch: java.lang.Exception -> L1c
            int r6 = r6 + 1
            goto L4c
        L56:
            int r6 = r2.length()     // Catch: java.lang.Exception -> L1c
            if (r6 <= 0) goto L64
            java.lang.String r0 = a(r2)     // Catch: java.lang.Exception -> L1c
            goto L64
        L61:
            r6.printStackTrace()
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.b(int):java.lang.String");
    }

    public static String a(String str) {
        try {
            if (an.b(str)) {
                return URLEncoder.encode(str, "utf-8");
            }
            return "";
        } catch (Throwable th) {
            ad.a("SameTools", th.getMessage(), th);
            return "";
        }
    }

    public static void a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            imageView.setImageResource(0);
            imageView.setImageDrawable(null);
            imageView.setImageURI(null);
            imageView.setImageBitmap(null);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    private static final char[] c(int i8) {
        StringBuilder sb;
        if (i8 == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(ah.f21239a, f21247f)));
            sb.append(f21252k[f21246e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f21239a, f21247f, f21248g)));
            sb.append(f21252k[f21246e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f21239a, f21248g, f21250i)));
            sb.append(f21252k[f21246e]);
            sb.append(String.valueOf(ag.f21231a));
        } else if (i8 == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(ah.f21239a, f21247f)));
            sb.append(f21252k[f21246e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f21239a, f21247f, f21248g)));
            sb.append(f21252k[f21246e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f21239a, f21249h, f21251j)));
        } else if (i8 == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f21239a, f21250i, f21249h)));
            sb.append(String.valueOf(f21253l));
        } else if (i8 != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f21239a, f21250i, f21249h)));
            sb.append(String.valueOf(ag.f21231a));
        }
        return sb.toString().toCharArray();
    }

    public static final void a(final int i8, final ImageView imageView, final CampaignEx campaignEx, Context context, boolean z8, final com.mbridge.msdk.foundation.d.a aVar) {
        if (imageView == null || campaignEx == null) {
            return;
        }
        ad.a("configPrivacyButton", "configPrivacyButton");
        boolean z9 = campaignEx.getPrivacyButtonTemplateVisibility() == 0;
        ad.a("configPrivacyButton", "privacyButtonVisibilityGone: " + z9 + " isIgnoreCampaignPrivacyConfig: " + z8);
        if (!z8 && z9) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e8) {
                ad.b("SameTools", e8.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(a(campaignEx))) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e9) {
                ad.b("SameTools", e9.getMessage());
                return;
            }
        }
        try {
            imageView.setVisibility(0);
        } catch (Exception e10) {
            ad.b("SameTools", e10.getMessage());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.tools.ai.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    ai.a(campaignEx, aVar, i8, (String) imageView.getTag());
                } catch (Exception e11) {
                    ad.b("SameTools", e11.getMessage());
                }
            }
        });
    }

    public static JSONArray b(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                com.mbridge.msdk.c.h.a();
                b9 = com.mbridge.msdk.c.i.a();
            }
            if (b9 != null && b9.q() == 1) {
                ad.c("SameTools", "fqci cfc:" + b9.q());
                long[] b10 = com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(context)).b();
                if (b10 != null) {
                    for (long j8 : b10) {
                        ad.c("SameTools", "cfc campaignIds:" + b10);
                        jSONArray.put(j8);
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONArray;
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z8;
        synchronized (ai.class) {
            z8 = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (b(str, context) != null) {
                            z8 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z8;
    }

    public static boolean c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    public static int e() {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage());
            return 0;
        }
    }

    public static int c(String str, String str2) {
        return a(str, str2, 0);
    }

    public static int b() {
        int i8 = f21254m;
        f21254m = i8 + 1;
        return i8;
    }

    public static final String c() {
        return MIMManager.a.a().c();
    }

    public static String a(CampaignEx campaignEx) {
        com.mbridge.msdk.c.g b9;
        CampaignEx.a adchoice;
        String str = "";
        if (campaignEx != null) {
            try {
                str = campaignEx.getPrivacyUrl();
            } catch (Exception e8) {
                ad.b("SameTools", e8.getMessage());
                return "";
            }
        }
        if (TextUtils.isEmpty(str) && campaignEx != null && (adchoice = campaignEx.getAdchoice()) != null) {
            str = adchoice.c();
        }
        if (TextUtils.isEmpty(str) && (b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k())) != null) {
            str = b9.g();
        }
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.foundation.same.net.g.d.f().f20938f : str;
    }

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(c(f21242a))).getMethod(String.valueOf(c(f21244c)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(c(f21243b))).getMethod(String.valueOf(c(f21245d)), null).invoke(context, null), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    public static List<String> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                String optString = jSONArray.optString(i8);
                if (an.b(optString)) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            ad.a("SameTools", th.getMessage(), th);
            return null;
        }
    }

    public static void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.d.a aVar, int i8, String str) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str2 = campaignEx.getCampaignUnitId() + "_" + i8;
            com.mbridge.msdk.foundation.d.b.a().c(str2);
            com.mbridge.msdk.foundation.d.b.a().a(str2, campaignEx);
            com.mbridge.msdk.foundation.d.b.a().a(str2, aVar);
            com.mbridge.msdk.foundation.d.b.a().a(str2, i8);
            com.mbridge.msdk.foundation.d.b.a().a(str2, str);
            com.mbridge.msdk.foundation.d.b.a().a(str2).e();
        } catch (Throwable th) {
            ad.a("SameTools", "feedback error", th);
        }
    }

    public static synchronized void b(String str, String str2) {
        synchronized (ai.class) {
            try {
                if (f21260s == null) {
                    f21260s = new HashMap();
                }
                f21260s.put(com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int b(Context context, float f8) {
        float f9 = 2.5f;
        if (context != null) {
            try {
                float f10 = context.getResources().getDisplayMetrics().density;
                if (f10 != 0.0f) {
                    f9 = f10;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return (int) ((f8 / f9) + 0.5f);
    }

    public static int a(Context context, float f8) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f8 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static String b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("device");
                if (jSONObject2 == null) {
                    return str;
                }
                if (jSONObject2.has(str2)) {
                    if (str3.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                        jSONObject2.remove(str2);
                    } else {
                        jSONObject2.put(str2, str3);
                    }
                } else {
                    if (str3.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                        return str;
                    }
                    jSONObject2.put(str2, str3);
                }
                return jSONObject.toString();
            } catch (Exception e8) {
                ad.b("SameTools", e8.getMessage());
            }
        }
        return str;
    }

    public static double a(Double d8) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d8);
            if (an.b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0.0d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:            r2.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:            if (r2 == null) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:            if (r2 != null) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long a(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r3 == 0) goto L1f
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L18
            long r0 = (long) r4
            r2 = r3
            goto L22
        L15:
            r4 = move-exception
            r2 = r3
            goto L28
        L18:
            r2 = r3
            goto L2e
        L1b:
            r4 = move-exception
            goto L28
        L1d:
            goto L2e
        L1f:
            r4.createNewFile()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
        L22:
            if (r2 == 0) goto L31
        L24:
            r2.close()     // Catch: java.lang.Exception -> L31
            goto L31
        L28:
            if (r2 == 0) goto L2d
            r2.close()     // Catch: java.lang.Exception -> L2d
        L2d:
            throw r4
        L2e:
            if (r2 == 0) goto L31
            goto L24
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.a(java.io.File):long");
    }

    public static String a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b9 == null) {
            com.mbridge.msdk.c.h.a();
            b9 = com.mbridge.msdk.c.i.a();
        }
        int Y8 = b9.Y();
        if (jSONArray.length() > Y8) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i8 = 0; i8 < Y8; i8++) {
                try {
                    jSONArray2.put(jSONArray.get(i8));
                } catch (JSONException e8) {
                    e8.printStackTrace();
                }
            }
            return jSONArray2.toString();
        }
        return jSONArray.toString();
    }

    public static String a(Context context, String str) {
        String str2 = "";
        try {
            JSONArray b9 = b(context, str);
            if (b9.length() > 0) {
                str2 = a(b9);
            }
            ad.c("SameTools", "get excludes:" + str2);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return str2;
    }

    public static final int a() {
        if (f21256o == null) {
            try {
                f21256o = MIMManager.a.a().d();
            } catch (Exception e8) {
                ad.b("SameTools", e8.getMessage());
            }
        }
        if (f21256o != null) {
            return f21256o.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static synchronized String a(Context context, String str, String str2) {
        String sb;
        synchronized (ai.class) {
            StringBuilder sb2 = new StringBuilder(str2);
            try {
                sb2.append(a(str2, context, str));
            } catch (Exception unused) {
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    private static synchronized java.lang.String a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.ai> r0 = com.mbridge.msdk.foundation.tools.ai.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 == 0) goto L1d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 <= 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L1b:
            r2 = move-exception
            goto L46
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
        L2c:
            java.lang.Object r3 = b(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            if (r3 == 0) goto L37
            r3 = 1
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L37:
            r3 = 2
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L3c:
            r3 = 0
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b
        L40:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return r2
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    private static List<String> a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                arrayList.add(stackTraceElement.getClassName());
            }
        }
        return arrayList;
    }

    public static ImageView a(ImageView imageView, BitmapDrawable bitmapDrawable, DisplayMetrics displayMetrics) {
        try {
            bitmapDrawable.setTargetDensity(displayMetrics);
            imageView.setBackground(bitmapDrawable);
            imageView.setClickable(false);
            imageView.setFocusable(false);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return imageView;
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, CampaignEx campaignEx, int i8) {
        if (TextUtils.isEmpty(str) || campaignEx == null || com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return;
        }
        com.mbridge.msdk.foundation.db.j a9 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
        fVar.a(System.currentTimeMillis());
        fVar.b(str);
        fVar.a(campaignEx.getId());
        fVar.a(i8);
        a9.a(fVar);
    }

    public static boolean a(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0 || jSONObject.optInt("v", -1) != -1) ? false : true;
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                try {
                    Uri parse = Uri.parse(str2);
                    if (parse != null) {
                        return !TextUtils.isEmpty(parse.getQueryParameter(str));
                    }
                    return false;
                } catch (Exception e8) {
                    ad.b("SameTools", e8.getMessage());
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            ad.a("SameTools", th.getMessage(), th);
            return 0;
        }
    }

    public static int a(String str, String str2, int i8) {
        if (TextUtils.isEmpty(str)) {
            return i8;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                return TextUtils.isEmpty(queryParameter) ? i8 : (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
            }
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
        }
        return i8;
    }
}
