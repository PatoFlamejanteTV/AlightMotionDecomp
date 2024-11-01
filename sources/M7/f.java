package M7;

import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f6313a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6314b;

    /* renamed from: c, reason: collision with root package name */
    private String f6315c;

    /* renamed from: d, reason: collision with root package name */
    private String f6316d;

    public f(String str, int i8, String str2) {
        try {
            new URL(str);
            this.f6313a = str;
            this.f6314b = i8;
            this.f6315c = str2;
        } catch (MalformedURLException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static f b(String str, int i8) {
        return new f(str, i8, "Default Tracker");
    }

    public e a(b bVar) {
        if (this.f6316d == null) {
            this.f6316d = String.format("https://%s/", bVar.c().getPackageName());
        }
        return new e(bVar, this);
    }

    public String c() {
        return this.f6313a;
    }

    public String d() {
        return this.f6316d;
    }

    public int e() {
        return this.f6314b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f6314b == fVar.f6314b && this.f6313a.equals(fVar.f6313a) && this.f6315c.equals(fVar.f6315c)) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.f6315c;
    }

    public int hashCode() {
        return (((this.f6313a.hashCode() * 31) + this.f6314b) * 31) + this.f6315c.hashCode();
    }
}
