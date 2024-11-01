package W6;

/* renamed from: W6.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1493t extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f10872a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10873b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f10874c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1493t(boolean z8, int i8, byte[] bArr) {
        this.f10872a = z8;
        this.f10873b = i8;
        this.f10874c = J7.a.d(bArr);
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        boolean z8 = this.f10872a;
        return ((z8 ? 1 : 0) ^ this.f10873b) ^ J7.a.k(this.f10874c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof AbstractC1493t)) {
            return false;
        }
        AbstractC1493t abstractC1493t = (AbstractC1493t) abstractC1492s;
        if (this.f10872a != abstractC1493t.f10872a || this.f10873b != abstractC1493t.f10873b || !J7.a.a(this.f10874c, abstractC1493t.f10874c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.b(this.f10873b) + E0.a(this.f10874c.length) + this.f10874c.length;
    }

    @Override // W6.AbstractC1492s
    public boolean r() {
        return this.f10872a;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (r()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(u()));
        stringBuffer.append("]");
        if (this.f10874c != null) {
            stringBuffer.append(" #");
            str = K7.b.c(this.f10874c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int u() {
        return this.f10873b;
    }
}
