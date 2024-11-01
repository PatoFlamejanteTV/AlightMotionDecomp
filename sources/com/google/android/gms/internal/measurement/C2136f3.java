package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2136f3 {

    /* renamed from: com.google.android.gms.internal.measurement.f3$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile w0.g f16721a;

        public static w0.g a(Context context) {
            w0.g c8;
            boolean isDeviceProtectedStorage;
            w0.g gVar = f16721a;
            if (gVar == null) {
                synchronized (a.class) {
                    try {
                        gVar = f16721a;
                        if (gVar == null) {
                            new C2136f3();
                            if (!AbstractC2172j3.c(Build.TYPE, Build.TAGS)) {
                                c8 = w0.g.a();
                            } else {
                                if (R2.a()) {
                                    isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                                    if (!isDeviceProtectedStorage) {
                                        context = context.createDeviceProtectedStorageContext();
                                    }
                                }
                                c8 = C2136f3.c(context);
                            }
                            f16721a = c8;
                            gVar = c8;
                        }
                    } finally {
                    }
                }
            }
            return gVar;
        }
    }

    private static InterfaceC2145g3 a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length != 3) {
                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                        } else {
                            String b9 = b(split[0]);
                            String decode = Uri.decode(b(split[1]));
                            String str = (String) hashMap.get(split[2]);
                            if (str == null) {
                                String b10 = b(split[2]);
                                str = Uri.decode(b10);
                                if (str.length() < 1024 || str == b10) {
                                    hashMap.put(b10, str);
                                }
                            }
                            SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(b9);
                            if (simpleArrayMap2 == null) {
                                simpleArrayMap2 = new SimpleArrayMap();
                                simpleArrayMap.put(b9, simpleArrayMap2);
                            }
                            simpleArrayMap2.put(decode, str);
                        }
                    } else {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        X2 x22 = new X2(simpleArrayMap);
                        bufferedReader.close();
                        return x22;
                    }
                }
            } finally {
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static final String b(String str) {
        return new String(str);
    }

    static w0.g c(Context context) {
        w0.g a9;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            w0.g d8 = d(context);
            if (d8.c()) {
                a9 = w0.g.d(a(context, (File) d8.b()));
            } else {
                a9 = w0.g.a();
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a9;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static w0.g d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return w0.g.d(file);
            }
            return w0.g.a();
        } catch (RuntimeException e8) {
            Log.e("HermeticFileOverrides", "no data dir", e8);
            return w0.g.a();
        }
    }
}
