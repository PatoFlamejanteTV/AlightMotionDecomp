package c2;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f15335a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15336b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15337c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15338d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15339e;

    public q(int i8, String str, String str2, String str3, boolean z8) {
        this.f15335a = i8;
        this.f15336b = str;
        this.f15337c = str2;
        this.f15338d = str3;
        this.f15339e = z8;
    }

    public String a() {
        return this.f15338d;
    }

    public String b() {
        return this.f15337c;
    }

    public String c() {
        return this.f15336b;
    }

    public int d() {
        return this.f15335a;
    }

    public boolean e() {
        return this.f15339e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15335a == qVar.f15335a && this.f15339e == qVar.f15339e && this.f15336b.equals(qVar.f15336b) && this.f15337c.equals(qVar.f15337c) && this.f15338d.equals(qVar.f15338d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int i9 = this.f15335a;
        if (this.f15339e) {
            i8 = 64;
        } else {
            i8 = 0;
        }
        return i9 + i8 + (this.f15336b.hashCode() * this.f15337c.hashCode() * this.f15338d.hashCode());
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15336b);
        sb.append('.');
        sb.append(this.f15337c);
        sb.append(this.f15338d);
        sb.append(" (");
        sb.append(this.f15335a);
        if (this.f15339e) {
            str = " itf";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
