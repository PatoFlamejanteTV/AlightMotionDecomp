package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class TypedBundle {
    private static final int INITIAL_BOOLEAN = 4;
    private static final int INITIAL_FLOAT = 10;
    private static final int INITIAL_INT = 10;
    private static final int INITIAL_STRING = 5;
    int[] mTypeInt = new int[10];
    int[] mValueInt = new int[10];
    int mCountInt = 0;
    int[] mTypeFloat = new int[10];
    float[] mValueFloat = new float[10];
    int mCountFloat = 0;
    int[] mTypeString = new int[5];
    String[] mValueString = new String[5];
    int mCountString = 0;
    int[] mTypeBoolean = new int[4];
    boolean[] mValueBoolean = new boolean[4];
    int mCountBoolean = 0;

    public void add(int i8, int i9) {
        int i10 = this.mCountInt;
        int[] iArr = this.mTypeInt;
        if (i10 >= iArr.length) {
            this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.mValueInt;
            this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.mTypeInt;
        int i11 = this.mCountInt;
        iArr3[i11] = i8;
        int[] iArr4 = this.mValueInt;
        this.mCountInt = i11 + 1;
        iArr4[i11] = i9;
    }

    public void addIfNotNull(int i8, String str) {
        if (str != null) {
            add(i8, str);
        }
    }

    public void applyDelta(TypedValues typedValues) {
        for (int i8 = 0; i8 < this.mCountInt; i8++) {
            typedValues.setValue(this.mTypeInt[i8], this.mValueInt[i8]);
        }
        for (int i9 = 0; i9 < this.mCountFloat; i9++) {
            typedValues.setValue(this.mTypeFloat[i9], this.mValueFloat[i9]);
        }
        for (int i10 = 0; i10 < this.mCountString; i10++) {
            typedValues.setValue(this.mTypeString[i10], this.mValueString[i10]);
        }
        for (int i11 = 0; i11 < this.mCountBoolean; i11++) {
            typedValues.setValue(this.mTypeBoolean[i11], this.mValueBoolean[i11]);
        }
    }

    public void clear() {
        this.mCountBoolean = 0;
        this.mCountString = 0;
        this.mCountFloat = 0;
        this.mCountInt = 0;
    }

    public int getInteger(int i8) {
        for (int i9 = 0; i9 < this.mCountInt; i9++) {
            if (this.mTypeInt[i9] == i8) {
                return this.mValueInt[i9];
            }
        }
        return -1;
    }

    public void add(int i8, float f8) {
        int i9 = this.mCountFloat;
        int[] iArr = this.mTypeFloat;
        if (i9 >= iArr.length) {
            this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValueFloat;
            this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTypeFloat;
        int i10 = this.mCountFloat;
        iArr2[i10] = i8;
        float[] fArr2 = this.mValueFloat;
        this.mCountFloat = i10 + 1;
        fArr2[i10] = f8;
    }

    public void applyDelta(TypedBundle typedBundle) {
        for (int i8 = 0; i8 < this.mCountInt; i8++) {
            typedBundle.add(this.mTypeInt[i8], this.mValueInt[i8]);
        }
        for (int i9 = 0; i9 < this.mCountFloat; i9++) {
            typedBundle.add(this.mTypeFloat[i9], this.mValueFloat[i9]);
        }
        for (int i10 = 0; i10 < this.mCountString; i10++) {
            typedBundle.add(this.mTypeString[i10], this.mValueString[i10]);
        }
        for (int i11 = 0; i11 < this.mCountBoolean; i11++) {
            typedBundle.add(this.mTypeBoolean[i11], this.mValueBoolean[i11]);
        }
    }

    public void add(int i8, String str) {
        int i9 = this.mCountString;
        int[] iArr = this.mTypeString;
        if (i9 >= iArr.length) {
            this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.mValueString;
            this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.mTypeString;
        int i10 = this.mCountString;
        iArr2[i10] = i8;
        String[] strArr2 = this.mValueString;
        this.mCountString = i10 + 1;
        strArr2[i10] = str;
    }

    public void add(int i8, boolean z8) {
        int i9 = this.mCountBoolean;
        int[] iArr = this.mTypeBoolean;
        if (i9 >= iArr.length) {
            this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.mValueBoolean;
            this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.mTypeBoolean;
        int i10 = this.mCountBoolean;
        iArr2[i10] = i8;
        boolean[] zArr2 = this.mValueBoolean;
        this.mCountBoolean = i10 + 1;
        zArr2[i10] = z8;
    }
}
