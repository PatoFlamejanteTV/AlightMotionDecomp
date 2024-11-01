package j$.time.chrono;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2990h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32840e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    private final m f32841a;

    /* renamed from: b, reason: collision with root package name */
    final int f32842b;

    /* renamed from: c, reason: collision with root package name */
    final int f32843c;

    /* renamed from: d, reason: collision with root package name */
    final int f32844d;

    static {
        j$.com.android.tools.r8.a.h(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2990h(m mVar, int i8, int i9, int i10) {
        Objects.requireNonNull(mVar, "chrono");
        this.f32841a = mVar;
        this.f32842b = i8;
        this.f32843c = i9;
        this.f32844d = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f32841a.i());
        dataOutput.writeInt(this.f32842b);
        dataOutput.writeInt(this.f32843c);
        dataOutput.writeInt(this.f32844d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2990h)) {
            return false;
        }
        C2990h c2990h = (C2990h) obj;
        if (this.f32842b == c2990h.f32842b && this.f32843c == c2990h.f32843c && this.f32844d == c2990h.f32844d) {
            if (((AbstractC2983a) this.f32841a).equals(c2990h.f32841a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC2983a) this.f32841a).hashCode() ^ (Integer.rotateLeft(this.f32844d, 16) + (Integer.rotateLeft(this.f32843c, 8) + this.f32842b));
    }

    public final String toString() {
        m mVar = this.f32841a;
        int i8 = this.f32844d;
        int i9 = this.f32843c;
        int i10 = this.f32842b;
        if (i10 == 0 && i9 == 0 && i8 == 0) {
            return ((AbstractC2983a) mVar).i() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC2983a) mVar).i());
        sb.append(" P");
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        if (i8 != 0) {
            sb.append(i8);
            sb.append('D');
        }
        return sb.toString();
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }
}
