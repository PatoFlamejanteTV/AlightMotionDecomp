package a1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a1.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1661k {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f14058a;

    public C1661k(Context context, String str) {
        this.f14058a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j8 = this.f14058a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f14058a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f14058a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f14058a.edit().putStringSet(str, hashSet).putLong("fire-count", j8 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String d(long j8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j8)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j8));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f14058a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        try {
            String e8 = e(str);
            if (e8 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f14058a.getStringSet(e8, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f14058a.edit().remove(e8).commit();
            } else {
                this.f14058a.edit().putStringSet(e8, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f14058a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f14058a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f14058a.edit();
            int i8 = 0;
            for (Map.Entry<String, ?> entry : this.f14058a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d8 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d8)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d8);
                        i8++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i8 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i8);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f14058a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(AbstractC1662l.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized boolean f(long j8, long j9) {
        return d(j8).equals(d(j9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        String d8 = d(System.currentTimeMillis());
        this.f14058a.edit().putString("last-used-date", d8).commit();
        h(d8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean i(long j8) {
        return j("fire-global", j8);
    }

    synchronized boolean j(String str, long j8) {
        if (this.f14058a.contains(str)) {
            if (!f(this.f14058a.getLong(str, -1L), j8)) {
                this.f14058a.edit().putLong(str, j8).commit();
                return true;
            }
            return false;
        }
        this.f14058a.edit().putLong(str, j8).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void k(long j8, String str) {
        String d8 = d(j8);
        if (this.f14058a.getString("last-used-date", "").equals(d8)) {
            String e8 = e(d8);
            if (e8 == null) {
                return;
            }
            if (e8.equals(str)) {
                return;
            }
            m(str, d8);
            return;
        }
        long j9 = this.f14058a.getLong("fire-count", 0L);
        if (j9 + 1 == 30) {
            a();
            j9 = this.f14058a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f14058a.getStringSet(str, new HashSet()));
        hashSet.add(d8);
        this.f14058a.edit().putStringSet(str, hashSet).putLong("fire-count", j9 + 1).putString("last-used-date", d8).commit();
    }

    synchronized void l(long j8) {
        this.f14058a.edit().putLong("fire-global", j8).commit();
    }
}
