package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ab extends k {
    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                com.mbridge.msdk.c.h.a();
                b9 = com.mbridge.msdk.c.i.a();
            }
            long currentTimeMillis = System.currentTimeMillis() - (b9.i() * 1000);
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.lastModified() + currentTimeMillis < currentTimeMillis2) {
                            a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static void b() {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        String a9 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC);
                        try {
                            File file = new File(a9);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : ab.b(a9)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private static ArrayList<File> c(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.mbridge.msdk.foundation.tools.ab.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                if (!file3.isHidden() || file3.isDirectory()) {
                    return true;
                }
                return false;
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(c(file2));
            }
        }
        return arrayList;
    }

    private static long d(File file) throws Exception {
        long j8 = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            j8 = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e8) {
                            e = e8;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return j8;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        ad.b("获取文件大小", "文件不存在!");
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return j8;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long e(File file) throws Exception {
        long d8;
        File[] listFiles = file.listFiles();
        long j8 = 0;
        if (listFiles != null) {
            for (int i8 = 0; i8 < listFiles.length; i8++) {
                if (listFiles[i8].isDirectory()) {
                    d8 = e(listFiles[i8]);
                } else {
                    d8 = d(listFiles[i8]);
                }
                j8 += d8;
            }
        }
        return j8;
    }

    public static File[] b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:            if (r1 == null) goto L27;     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.io.File r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
        L13:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            if (r2 == 0) goto L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r3.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r4.append(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            goto L13
        L2e:
            r4 = move-exception
            r0 = r1
            goto L4f
        L31:
            r2 = move-exception
            goto L41
        L33:
            r1.close()     // Catch: java.io.IOException -> L37
            goto L47
        L37:
            goto L47
        L39:
            r2 = move-exception
            r4 = r0
            goto L41
        L3c:
            r4 = move-exception
            goto L4f
        L3e:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L41:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L47
            goto L33
        L47:
            if (r4 == 0) goto L4e
            java.lang.String r4 = r4.toString()
            return r4
        L4e:
            return r0
        L4f:
            if (r0 == 0) goto L54
            r0.close()     // Catch: java.io.IOException -> L54
        L54:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ab.b(java.io.File):java.lang.String");
    }

    private static void e(String str) {
        try {
            ArrayList<File> c8 = c(new File(str));
            Collections.sort(c8, new Comparator<File>() { // from class: com.mbridge.msdk.foundation.tools.ab.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    if (lastModified == 0) {
                        return 0;
                    }
                    return -1;
                }

                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }
            });
            int size = (c8.size() - 1) / 2;
            for (int i8 = 0; i8 < size; i8++) {
                File file = c8.get(i8);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            ad.b("SameFileTool", "del memory failed");
        }
    }

    public static String c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return SameMD5.getMD5(ao.b(str.trim()));
        }
        return "";
    }

    public static boolean d(String str) {
        if (com.mbridge.msdk.foundation.same.c.f.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f5, code lost:            r10.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f9, code lost:            r10 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00fa, code lost:            r10.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x011f, code lost:            r3.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0122, code lost:            if (r10 == null) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0124, code lost:            r10.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0128, code lost:            r10 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0129, code lost:            r10.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f3, code lost:            if (r10 == null) goto L78;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ab.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (b9 == null) {
                        com.mbridge.msdk.c.h.a();
                        b9 = com.mbridge.msdk.c.i.a();
                    }
                    ab.a(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_RES_MANAGER_DIR), b9.S());
                    ab.a(System.currentTimeMillis() - (b9.i() * 1000));
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                    }
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    public static void a(long j8) {
        try {
            Iterator<File> it = c(new File(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j8 && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th) {
            ad.a("SameFileTool", th.getMessage(), th);
        }
    }

    public static String a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (!file.isDirectory()) {
                return "";
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    a(file2);
                }
                file.delete();
                return "";
            }
            file.delete();
            return "";
        } catch (Exception e8) {
            return e8.getMessage();
        }
    }

    public static List<String> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e8) {
            ad.b("SameFileTool", e8.getMessage());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str + File.separator + "template_config.json");
            if (file.isFile() && file.exists()) {
                String b9 = b(file);
                if (TextUtils.isEmpty(b9)) {
                    return arrayList;
                }
                try {
                    JSONArray jSONArray = new JSONArray(b9);
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                            arrayList.add(str + File.separator + jSONObject.optString("name"));
                            if (jSONObject.has("ext_template")) {
                                jSONObject.put("folder_dir", str);
                                arrayList.add(jSONObject.toString());
                            }
                        }
                    }
                    return arrayList;
                } catch (JSONException e9) {
                    ad.b("SameFileTool", e9.getMessage());
                    return arrayList;
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public static boolean a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        return true;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static /* synthetic */ void a(String str, int i8) {
        try {
            if (e(new File(str)) > i8 * 1048576) {
                e(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        } catch (Throwable unused) {
            ad.b("SameFileTool", "clean memory failed");
        }
    }
}
