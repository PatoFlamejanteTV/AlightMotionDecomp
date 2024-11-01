package V;

import Q.AbstractC1396p;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static String f10397a;

    /* renamed from: b, reason: collision with root package name */
    private static int f10398b;

    public static String a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (f10397a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f10397a = processName;
            } else {
                int i8 = f10398b;
                if (i8 == 0) {
                    i8 = Process.myPid();
                    f10398b = i8;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i8 > 0) {
                    try {
                        str = "/proc/" + i8 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            AbstractC1396p.l(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            j.a(bufferedReader2);
                            throw th;
                        }
                        j.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f10397a = str2;
            }
        }
        return f10397a;
    }
}
