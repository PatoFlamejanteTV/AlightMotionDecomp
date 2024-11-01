package s;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3936c {

    /* renamed from: a, reason: collision with root package name */
    private final String f38900a;

    private C3936c(String str) {
        if (str != null) {
            this.f38900a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static C3936c b(String str) {
        return new C3936c(str);
    }

    public String a() {
        return this.f38900a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3936c)) {
            return false;
        }
        return this.f38900a.equals(((C3936c) obj).f38900a);
    }

    public int hashCode() {
        return this.f38900a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f38900a + "\"}";
    }
}
