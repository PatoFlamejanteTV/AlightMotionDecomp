package j$.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class r implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final r f32964d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    private final int f32965a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32966b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32967c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.h(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    private r(int i8, int i9, int i10) {
        this.f32965a = i8;
        this.f32966b = i9;
        this.f32967c = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r a(DataInput dataInput) {
        int readInt = dataInput.readInt();
        int readInt2 = dataInput.readInt();
        int readInt3 = dataInput.readInt();
        return ((readInt | readInt2) | readInt3) == 0 ? f32964d : new r(readInt, readInt2, readInt3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(DataOutput dataOutput) {
        dataOutput.writeInt(this.f32965a);
        dataOutput.writeInt(this.f32966b);
        dataOutput.writeInt(this.f32967c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f32965a == rVar.f32965a && this.f32966b == rVar.f32966b && this.f32967c == rVar.f32967c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f32967c, 16) + Integer.rotateLeft(this.f32966b, 8) + this.f32965a;
    }

    public final String toString() {
        if (this == f32964d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i8 = this.f32965a;
        if (i8 != 0) {
            sb.append(i8);
            sb.append('Y');
        }
        int i9 = this.f32966b;
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        int i10 = this.f32967c;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('D');
        }
        return sb.toString();
    }
}
