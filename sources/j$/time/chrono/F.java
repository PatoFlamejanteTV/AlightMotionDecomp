package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    private byte f32826a;

    /* renamed from: b, reason: collision with root package name */
    private Object f32827b;

    public F() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(byte b9, Object obj) {
        this.f32826a = b9;
        this.f32827b = obj;
    }

    private Object readResolve() {
        return this.f32827b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object j8;
        byte readByte = objectInput.readByte();
        this.f32826a = readByte;
        switch (readByte) {
            case 1:
                int i8 = AbstractC2983a.f32835c;
                j8 = AbstractC2983a.j(objectInput.readUTF());
                break;
            case 2:
                j8 = ((InterfaceC2984b) objectInput.readObject()).t((j$.time.k) objectInput.readObject());
                break;
            case 3:
                j8 = ((InterfaceC2987e) objectInput.readObject()).o((ZoneOffset) objectInput.readObject()).h((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = y.f32874d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                w.f32872d.getClass();
                j8 = new y(j$.time.h.P(readInt, readByte2, readByte3));
                break;
            case 5:
                z zVar = z.f32878d;
                j8 = z.y(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                pVar.getClass();
                j8 = r.L(pVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                B.f32822d.getClass();
                j8 = new D(j$.time.h.P(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                H.f32829d.getClass();
                j8 = new J(j$.time.h.P(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i9 = C2990h.f32840e;
                j8 = new C2990h(AbstractC2983a.j(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f32827b = j8;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b9 = this.f32826a;
        Object obj = this.f32827b;
        objectOutput.writeByte(b9);
        switch (b9) {
            case 1:
                objectOutput.writeUTF(((AbstractC2983a) obj).i());
                return;
            case 2:
                ((C2989g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((z) obj).E(objectOutput);
                return;
            case 6:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 7:
                D d8 = (D) obj;
                d8.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(d8, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(d8, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(d8, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j8 = (J) obj;
                j8.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(j8, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(j8, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(j8, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C2990h) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
