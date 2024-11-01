package u;

import java.util.Arrays;
import s.C3936c;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C3936c f40128a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f40129b;

    public h(C3936c c3936c, byte[] bArr) {
        if (c3936c != null) {
            if (bArr != null) {
                this.f40128a = c3936c;
                this.f40129b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.f40129b;
    }

    public C3936c b() {
        return this.f40128a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f40128a.equals(hVar.f40128a)) {
            return false;
        }
        return Arrays.equals(this.f40129b, hVar.f40129b);
    }

    public int hashCode() {
        return ((this.f40128a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f40129b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f40128a + ", bytes=[...]}";
    }
}
