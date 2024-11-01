package W6;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: W6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1487m implements InterfaceC1476d, J7.c {
    @Override // W6.InterfaceC1476d
    public abstract AbstractC1492s d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1476d)) {
            return false;
        }
        return d().o(((InterfaceC1476d) obj).d());
    }

    public void g(OutputStream outputStream) {
        C1491q.a(outputStream).s(this);
    }

    @Override // J7.c
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return d().hashCode();
    }

    public void j(OutputStream outputStream, String str) {
        C1491q.b(outputStream, str).s(this);
    }

    public byte[] k(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
