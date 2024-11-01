package J0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* renamed from: J0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1253j {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f3912a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 J0.j$a, still in use, count: 1, list:
  (r0v0 J0.j$a) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 J0.j$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: J0.j$a */
    /* loaded from: classes3.dex */
    static final class a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* renamed from: k, reason: collision with root package name */
        private static final Map f3923k;

        static {
            HashMap hashMap = new HashMap(4);
            f3923k = hashMap;
            hashMap.put("armeabi-v7a", new a());
            hashMap.put("armeabi", new a());
            hashMap.put("arm64-v8a", new a());
            hashMap.put("x86", new a());
        }

        private a() {
        }

        static a b() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                G0.g.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) f3923k.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                return UNKNOWN;
            }
            return aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f3924l.clone();
        }
    }

    public static String A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j8;
        synchronized (AbstractC1253j.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j8 = memoryInfo.totalMem;
        }
        return j8;
    }

    public static long c(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    public static boolean d(Context context) {
        if (!e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e8) {
                G0.g.f().e(str, e8);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return null;
        }
        return z(sb2);
    }

    public static boolean i(Context context, String str, boolean z8) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int p8 = p(context, str, "bool");
            if (p8 > 0) {
                return resources.getBoolean(p8);
            }
            int p9 = p(context, str, TypedValues.Custom.S_STRING);
            if (p9 > 0) {
                return Boolean.parseBoolean(context.getString(p9));
            }
        }
        return z8;
    }

    public static List j(Context context) {
        ArrayList arrayList = new ArrayList();
        int p8 = p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int p9 = p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int p10 = p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (p8 != 0 && p9 != 0 && p10 != 0) {
            String[] stringArray = context.getResources().getStringArray(p8);
            String[] stringArray2 = context.getResources().getStringArray(p9);
            String[] stringArray3 = context.getResources().getStringArray(p10);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                for (int i8 = 0; i8 < stringArray3.length; i8++) {
                    arrayList.add(new C1250g(stringArray[i8], stringArray2[i8], stringArray3[i8]));
                }
                return arrayList;
            }
            G0.g.f().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        G0.g.f().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(p8), Integer.valueOf(p9), Integer.valueOf(p10)));
        return arrayList;
    }

    public static int k() {
        return a.b().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l() {
        boolean w8 = w();
        ?? r02 = w8;
        if (x()) {
            r02 = (w8 ? 1 : 0) | 2;
        }
        if (v()) {
            return r02 | 4;
        }
        return r02;
    }

    public static String m(Context context) {
        int p8 = p(context, "com.google.firebase.crashlytics.mapping_file_id", TypedValues.Custom.S_STRING);
        if (p8 == 0) {
            p8 = p(context, "com.crashlytics.android.build_id", TypedValues.Custom.S_STRING);
        }
        if (p8 != 0) {
            return context.getResources().getString(p8);
        }
        return null;
    }

    public static boolean n(Context context) {
        if (w() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) {
            return false;
        }
        return true;
    }

    public static String o(Context context) {
        int i8 = context.getApplicationContext().getApplicationInfo().icon;
        if (i8 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i8);
                if ("android".equals(resourcePackageName)) {
                    return context.getPackageName();
                }
                return resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static int p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, o(context));
    }

    public static SharedPreferences q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private static String r(String str, String str2) {
        return s(str.getBytes(), str2);
    }

    private static String s(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return t(messageDigest.digest());
        } catch (NoSuchAlgorithmException e8) {
            G0.g.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e8);
            return "";
        }
    }

    public static String t(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b9 = bArr[i8];
            int i9 = i8 * 2;
            char[] cArr2 = f3912a;
            cArr[i9] = cArr2[(b9 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public static boolean u(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean v() {
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return false;
        }
        return true;
    }

    public static boolean w() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean x() {
        boolean w8 = w();
        String str = Build.TAGS;
        if ((!w8 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!w8 && file.exists()) {
            return true;
        }
        return false;
    }

    public static boolean y(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    public static String z(String str) {
        return r(str, "SHA-1");
    }
}
