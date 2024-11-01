package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x extends ZoneId {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33010d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b, reason: collision with root package name */
    private final String f33011b;

    /* renamed from: c, reason: collision with root package name */
    private final transient j$.time.zone.f f33012c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(String str, j$.time.zone.f fVar) {
        this.f33011b = str;
        this.f33012c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x I(String str, boolean z8) {
        j$.time.zone.f fVar;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i8 == 0) && ((charAt < '0' || charAt > '9' || i8 == 0) && ((charAt != '~' || i8 == 0) && ((charAt != '.' || i8 == 0) && ((charAt != '_' || i8 == 0) && ((charAt != '+' || i8 == 0) && (charAt != '-' || i8 == 0))))))))) {
                throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            fVar = j$.time.zone.j.a(str, true);
        } catch (j$.time.zone.g e8) {
            if (z8) {
                throw e8;
            }
            fVar = null;
        }
        return new x(str, fVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f D() {
        j$.time.zone.f fVar = this.f33012c;
        return fVar != null ? fVar : j$.time.zone.j.a(this.f33011b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void H(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f33011b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f33011b);
    }

    @Override // j$.time.ZoneId
    public final String i() {
        return this.f33011b;
    }
}
