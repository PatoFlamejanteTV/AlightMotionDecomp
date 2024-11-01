package c2;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f15287a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15288b;

    /* renamed from: c, reason: collision with root package name */
    private final q f15289c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f15290d;

    public i(String str, String str2, q qVar, Object... objArr) {
        this.f15287a = str;
        this.f15288b = str2;
        this.f15289c = qVar;
        this.f15290d = objArr;
    }

    public q a() {
        return this.f15289c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] b() {
        return this.f15290d;
    }

    public String c() {
        return this.f15288b;
    }

    public String d() {
        return this.f15287a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15287a.equals(iVar.f15287a) && this.f15288b.equals(iVar.f15288b) && this.f15289c.equals(iVar.f15289c) && Arrays.equals(this.f15290d, iVar.f15290d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15287a.hashCode() ^ Integer.rotateLeft(this.f15288b.hashCode(), 8)) ^ Integer.rotateLeft(this.f15289c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f15290d), 24);
    }

    public String toString() {
        return this.f15287a + " : " + this.f15288b + ' ' + this.f15289c + ' ' + Arrays.toString(this.f15290d);
    }
}
