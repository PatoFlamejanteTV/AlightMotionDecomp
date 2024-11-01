package com.mbridge.msdk.foundation.same.report.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f21062b;

    /* renamed from: a, reason: collision with root package name */
    Handler f21063a = new Handler() { // from class: com.mbridge.msdk.foundation.same.report.b.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Context context;
            HashMap hashMap;
            super.handleMessage(message);
            if (message.what != 101 || (context = (Context) d.this.f21064c.get()) == null) {
                return;
            }
            Object obj = message.obj;
            if ((obj instanceof HashMap) && (hashMap = (HashMap) obj) != null) {
                new i(context).a((String) hashMap.get("crashinfo"), (File) hashMap.get("file"));
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f21064c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f21065d;

    /* renamed from: e, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f21066e;

    private d(Context context) {
        this.f21064c = new WeakReference<>(context);
    }

    private static String b(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("", e8.getMessage());
            return "";
        }
    }

    private HashMap<String, Object> c() {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f21065d == null) {
            return null;
        }
        String a9 = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_CRASH_INFO);
        File file = new File(a9 + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(a9 + "/sdkcrash" + format + ".txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            printWriter.println(a(this.f21065d, format));
            printWriter.println("====");
            this.f21065d.printStackTrace(printWriter);
            printWriter.close();
            hashMap.put("file", file2);
            hashMap.put("time", format);
            return hashMap;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        g.a().b();
        try {
            this.f21065d = th;
            String a9 = a();
            List<String> a10 = a(a9);
            if (a10.size() > 0) {
                for (int i8 = 0; i8 < a10.size(); i8++) {
                    a(a(th), a10.get(i8), th, thread);
                }
                return;
            }
            a(a(th), a9, th, thread);
        } catch (Exception e8) {
            a(thread, th);
            e8.printStackTrace();
        }
    }

    public static d a(Context context) {
        if (f21062b == null) {
            synchronized (d.class) {
                try {
                    if (f21062b == null) {
                        f21062b = new d(context);
                    }
                } finally {
                }
            }
        }
        return f21062b;
    }

    public final JSONObject b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context context = this.f21064c.get();
        if (context == null) {
            return null;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        long usableSpace = externalStorageDirectory.getUsableSpace();
        long totalSpace = externalStorageDirectory.getTotalSpace();
        String formatFileSize = Formatter.formatFileSize(context, usableSpace);
        String formatFileSize2 = Formatter.formatFileSize(context, totalSpace);
        jSONObject.put("max_memory", String.valueOf((float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d)));
        jSONObject.put("memoryby_app", String.valueOf((float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d)));
        jSONObject.put("remaining_memory", (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d));
        jSONObject.put("sdcard_remainder", formatFileSize);
        jSONObject.put("totalspacestr", formatFileSize2);
        jSONObject.put("crashtime", str);
        String a9 = com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID);
        if (!TextUtils.isEmpty(a9)) {
            jSONObject.put("appid", a9);
        }
        try {
            jSONObject.put("osversion", Build.VERSION.SDK_INT);
            jSONObject.put("appversioncode", d(context));
            jSONObject.put("appversionname", b(context));
            jSONObject.put("appname", c(context));
        } catch (Exception unused) {
            jSONObject.put("osversion", 0);
            jSONObject.put("appversioncode", "-1");
            jSONObject.put("appversionname", "-1");
            jSONObject.put("appname", "");
        }
        return jSONObject;
    }

    private static List<String> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return arrayList;
    }

    public static String a() {
        try {
            com.mbridge.msdk.c.g b9 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                h.a();
                b9 = com.mbridge.msdk.c.i.a();
            }
            String U8 = b9.U();
            return TextUtils.isEmpty(U8) ? "<mvpackage>mbridge</mvpackage>" : U8;
        } catch (Exception unused) {
            return "<mvpackage>mbridge</mvpackage>";
        }
    }

    private String c(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static List<String> a(String str) {
        try {
            List<String> a9 = a(str, "<mvpackage>(.*?)</mvpackage>");
            return a9 == null ? new ArrayList() : a9;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private String a(Throwable th, String str) {
        try {
            JSONObject b9 = b(str);
            if (b9 == null) {
                return "";
            }
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            b9.put("crashinfo", stringWriter.toString());
            String jSONObject = b9.toString();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000052");
            stringBuffer.append("&");
            stringBuffer.append("crash_first_index_from_mtg=");
            stringBuffer.append(c.b(th.getStackTrace()));
            stringBuffer.append("&exception=" + jSONObject);
            return stringBuffer.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public final void b() {
        this.f21066e = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private String a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        return sb.toString();
    }

    private void a(String str, String str2, Throwable th, Thread thread) {
        if (str.contains(str2)) {
            HashMap<String, Object> c8 = c();
            if (c8 == null || c8.get("file") == null) {
                return;
            }
            Message obtain = Message.obtain();
            HashMap hashMap = new HashMap();
            hashMap.put("crashinfo", a(th, (String) c8.get("time")));
            hashMap.put("file", c8.get("file"));
            obtain.obj = hashMap;
            obtain.what = 101;
            this.f21063a.sendMessage(obtain);
            a(thread, th);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21066e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private void a(Thread thread, Throwable th) {
        try {
            Thread.sleep(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        } catch (InterruptedException e8) {
            e8.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }
}
