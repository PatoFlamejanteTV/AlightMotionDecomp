package j$.time.zone;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a, reason: collision with root package name */
    private byte f33014a;

    /* renamed from: b, reason: collision with root package name */
    private Object f33015b;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(byte b9, Object obj) {
        this.f33014a = b9;
        this.f33015b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.M(dataInput.readInt()) : ZoneOffset.M(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long j8, DataOutput dataOutput) {
        if (j8 < -4575744000L || j8 >= 10413792000L || j8 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j8);
        } else {
            int i8 = (int) ((j8 + 4575744000L) / 900);
            dataOutput.writeByte((i8 >>> 16) & 255);
            dataOutput.writeByte((i8 >>> 8) & 255);
            dataOutput.writeByte(i8 & 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int J8 = zoneOffset.J();
        int i8 = J8 % TypedValues.Custom.TYPE_INT == 0 ? J8 / TypedValues.Custom.TYPE_INT : ModuleDescriptor.MODULE_VERSION;
        dataOutput.writeByte(i8);
        if (i8 == 127) {
            dataOutput.writeInt(J8);
        }
    }

    private Object readResolve() {
        return this.f33015b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object k8;
        byte readByte = objectInput.readByte();
        this.f33014a = readByte;
        if (readByte == 1) {
            k8 = f.k(objectInput);
        } else if (readByte == 2) {
            long a9 = a(objectInput);
            ZoneOffset b9 = b(objectInput);
            ZoneOffset b10 = b(objectInput);
            if (b9.equals(b10)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            k8 = new b(a9, b9, b10);
        } else if (readByte == 3) {
            k8 = e.b(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            k8 = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f33015b = k8;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b9 = this.f33014a;
        Object obj = this.f33015b;
        objectOutput.writeByte(b9);
        if (b9 == 1) {
            ((f) obj).l(objectOutput);
            return;
        }
        if (b9 == 2) {
            ((b) obj).D(objectOutput);
        } else if (b9 == 3) {
            ((e) obj).c(objectOutput);
        } else {
            if (b9 != 100) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((f) obj).m(objectOutput);
        }
    }
}
