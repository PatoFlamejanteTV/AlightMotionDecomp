package androidx.profileinstaller;

/* loaded from: classes3.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j8) {
        this.mValue = j8;
    }

    static FileSectionType fromValue(long j8) {
        FileSectionType[] values = values();
        for (int i8 = 0; i8 < values.length; i8++) {
            if (values[i8].getValue() == j8) {
                return values[i8];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j8);
    }

    public long getValue() {
        return this.mValue;
    }
}
