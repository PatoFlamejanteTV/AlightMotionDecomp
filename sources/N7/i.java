package N7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: g, reason: collision with root package name */
    private static final String f6891g = M7.b.i(i.class);

    /* renamed from: b, reason: collision with root package name */
    private final File f6893b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6894c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6895d;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f6892a = new LinkedBlockingQueue();

    /* renamed from: e, reason: collision with root package name */
    private long f6896e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6897f = false;

    public i(M7.e eVar) {
        this.f6894c = eVar.e();
        this.f6895d = eVar.f();
        try {
            File file = new File(new File(eVar.c().c().getCacheDir(), "piwik_cache"), new URL(eVar.a()).getHost());
            this.f6893b = file;
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles);
                for (File file2 : listFiles) {
                    this.f6896e += file2.length();
                    this.f6892a.add(file2);
                }
            }
        } catch (MalformedURLException e8) {
            throw new RuntimeException(e8);
        }
    }

    private void b() {
        long j8;
        long currentTimeMillis = System.currentTimeMillis();
        long j9 = this.f6894c;
        long j10 = 0;
        if (j9 < 0) {
            V7.a.b(f6891g).a("Caching is disabled.", new Object[0]);
            while (!this.f6892a.isEmpty()) {
                File file = (File) this.f6892a.poll();
                if (file.delete()) {
                    V7.a.b(f6891g).c("Deleted cache container %s", file.getPath());
                }
            }
        } else if (j9 > 0) {
            Iterator it = this.f6892a.iterator();
            while (it.hasNext()) {
                File file2 = (File) it.next();
                try {
                    j8 = Long.parseLong(file2.getName().split("_")[1]);
                } catch (Exception e8) {
                    V7.a.b(f6891g).d(e8);
                    j8 = j10;
                }
                if (j8 >= System.currentTimeMillis() - this.f6894c) {
                    break;
                }
                if (file2.delete()) {
                    V7.a.b(f6891g).c("Deleted cache container %s", file2.getPath());
                } else {
                    V7.a.b(f6891g).c("Failed to delete cache container %s", file2.getPath());
                }
                it.remove();
                j10 = 0;
            }
        }
        if (this.f6895d != 0) {
            Iterator it2 = this.f6892a.iterator();
            while (it2.hasNext() && this.f6896e > this.f6895d) {
                File file3 = (File) it2.next();
                this.f6896e -= file3.length();
                it2.remove();
                if (file3.delete()) {
                    V7.a.b(f6891g).c("Deleted cache container %s", file3.getPath());
                } else {
                    V7.a.b(f6891g).c("Failed to delete cache container %s", file3.getPath());
                }
            }
        }
        V7.a.b(f6891g).a("Cache check took %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    private boolean c() {
        if (this.f6894c >= 0) {
            return true;
        }
        return false;
    }

    private List e(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        if (!file.exists()) {
            return arrayList;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (IOException e8) {
                        e = e8;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (IOException e10) {
            V7.a.b(f6891g).d(e10);
        }
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                        throw th;
                    } catch (IOException e11) {
                        V7.a.b(f6891g).d(e11);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            fileInputStream2 = fileInputStream;
            V7.a.b(f6891g).d(e);
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            V7.a.b(f6891g).a("Restored %d events from %s", Integer.valueOf(arrayList.size()), file.getPath());
            return arrayList;
        }
        if (!"1".equals(bufferedReader.readLine())) {
            try {
                fileInputStream.close();
            } catch (IOException e13) {
                V7.a.b(f6891g).d(e13);
            }
            return arrayList;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f6894c;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(" ");
            if (indexOf != -1) {
                try {
                    long parseLong = Long.parseLong(readLine.substring(0, indexOf));
                    if (this.f6894c <= 0 || parseLong >= currentTimeMillis) {
                        arrayList.add(new g(parseLong, readLine.substring(indexOf + 1)));
                    }
                } catch (Exception e14) {
                    V7.a.b(f6891g).d(e14);
                }
            }
        }
        fileInputStream.close();
        V7.a.b(f6891g).a("Restored %d events from %s", Integer.valueOf(arrayList.size()), file.getPath());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File g(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.i.g(java.util.List):java.io.File");
    }

    public synchronized void a(List list) {
        try {
            if (c() && !list.isEmpty()) {
                b();
                long currentTimeMillis = System.currentTimeMillis();
                File g8 = g(list);
                if (g8 != null) {
                    this.f6892a.add(g8);
                    this.f6896e += g8.length();
                }
                V7.a.b(f6891g).a("Caching of %d events took %dms (%s)", Integer.valueOf(list.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), g8);
            }
        } finally {
        }
    }

    public synchronized boolean d() {
        try {
            if (!this.f6897f) {
                b();
                this.f6897f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6892a.isEmpty();
    }

    public synchronized List f() {
        try {
            ArrayList arrayList = new ArrayList();
            if (!c()) {
                return arrayList;
            }
            long currentTimeMillis = System.currentTimeMillis();
            while (!this.f6892a.isEmpty()) {
                File file = (File) this.f6892a.poll();
                if (file != null) {
                    arrayList.addAll(e(file));
                    if (!file.delete()) {
                        V7.a.b(f6891g).c("Failed to delete cache container %s", file.getPath());
                    }
                }
            }
            b();
            V7.a.b(f6891g).a("Uncaching of %d events took %dms", Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }
}
