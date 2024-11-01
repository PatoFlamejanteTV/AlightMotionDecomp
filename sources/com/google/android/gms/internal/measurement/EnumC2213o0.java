package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2213o0 implements InterfaceC2280w4 {
    UNSPECIFIED_TYPE(0),
    RAW_FILE_IO_TYPE(1),
    MOBSTORE_TYPE(2),
    SQLITE_OPEN_HELPER_TYPE(3),
    LEVEL_DB_TYPE(5),
    ROOM_TYPE(6),
    SHARED_PREFS_TYPE(7),
    PROTO_DATA_STORE_TYPE(8),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    private final int f16914a;

    EnumC2213o0(int i8) {
        this.f16914a = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(EnumC2213o0.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(w());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
    public final int w() {
        if (this != UNRECOGNIZED) {
            return this.f16914a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
