package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    static final int NONE = -1;
    private static float epsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    int currentSize = 0;
    private int ROW_SIZE = 8;
    private SolverVariable candidate = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    private int mHead = -1;
    private int mLast = -1;
    private boolean mDidFillOnce = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f8, boolean z8) {
        float f9 = epsilon;
        if (f8 > (-f9) && f8 < f9) {
            return;
        }
        int i8 = this.mHead;
        if (i8 == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f8;
            this.mArrayIndices[0] = solverVariable.id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                int i9 = this.mLast + 1;
                this.mLast = i9;
                int[] iArr = this.mArrayIndices;
                if (i9 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i8 != -1 && i11 < this.currentSize; i11++) {
            int i12 = this.mArrayIndices[i8];
            int i13 = solverVariable.id;
            if (i12 == i13) {
                float[] fArr = this.mArrayValues;
                float f10 = fArr[i8] + f8;
                float f11 = epsilon;
                if (f10 > (-f11) && f10 < f11) {
                    f10 = 0.0f;
                }
                fArr[i8] = f10;
                if (f10 == 0.0f) {
                    if (i8 == this.mHead) {
                        this.mHead = this.mArrayNextIndices[i8];
                    } else {
                        int[] iArr2 = this.mArrayNextIndices;
                        iArr2[i10] = iArr2[i8];
                    }
                    if (z8) {
                        solverVariable.removeFromRow(this.mRow);
                    }
                    if (this.mDidFillOnce) {
                        this.mLast = i8;
                    }
                    solverVariable.usageInRowCount--;
                    this.currentSize--;
                    return;
                }
                return;
            }
            if (i12 < i13) {
                i10 = i8;
            }
            i8 = this.mArrayNextIndices[i8];
        }
        int i14 = this.mLast;
        int i15 = i14 + 1;
        if (this.mDidFillOnce) {
            int[] iArr3 = this.mArrayIndices;
            if (iArr3[i14] != -1) {
                i14 = iArr3.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr4 = this.mArrayIndices;
        if (i14 >= iArr4.length && this.currentSize < iArr4.length) {
            int i16 = 0;
            while (true) {
                int[] iArr5 = this.mArrayIndices;
                if (i16 >= iArr5.length) {
                    break;
                }
                if (iArr5[i16] == -1) {
                    i14 = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr6 = this.mArrayIndices;
        if (i14 >= iArr6.length) {
            i14 = iArr6.length;
            int i17 = this.ROW_SIZE * 2;
            this.ROW_SIZE = i17;
            this.mDidFillOnce = false;
            this.mLast = i14 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i17);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }
        this.mArrayIndices[i14] = solverVariable.id;
        this.mArrayValues[i14] = f8;
        if (i10 != -1) {
            int[] iArr7 = this.mArrayNextIndices;
            iArr7[i14] = iArr7[i10];
            iArr7[i10] = i14;
        } else {
            this.mArrayNextIndices[i14] = this.mHead;
            this.mHead = i14;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        this.currentSize++;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int i18 = this.mLast;
        int[] iArr8 = this.mArrayIndices;
        if (i18 >= iArr8.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i8 = this.mHead;
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i8]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i8 = this.mArrayNextIndices[i8];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i8 = this.mHead;
        if (i8 == -1) {
            return false;
        }
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            if (this.mArrayIndices[i8] == solverVariable.id) {
                return true;
            }
            i8 = this.mArrayNextIndices[i8];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i8 = this.currentSize;
        System.out.print("{ ");
        for (int i9 = 0; i9 < i8; i9++) {
            SolverVariable variable = getVariable(i9);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i9) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f8) {
        int i8 = this.mHead;
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            float[] fArr = this.mArrayValues;
            fArr[i8] = fArr[i8] / f8;
            i8 = this.mArrayNextIndices[i8];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i8 = this.mHead;
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            if (this.mArrayIndices[i8] == solverVariable.id) {
                return this.mArrayValues[i8];
            }
            i8 = this.mArrayNextIndices[i8];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.currentSize;
    }

    public int getHead() {
        return this.mHead;
    }

    public final int getId(int i8) {
        return this.mArrayIndices[i8];
    }

    public final int getNextIndice(int i8) {
        return this.mArrayNextIndices[i8];
    }

    SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.candidate;
        if (solverVariable == null) {
            int i8 = this.mHead;
            SolverVariable solverVariable2 = null;
            for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
                if (this.mArrayValues[i8] < 0.0f) {
                    SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i8]];
                    if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                        solverVariable2 = solverVariable3;
                    }
                }
                i8 = this.mArrayNextIndices[i8];
            }
            return solverVariable2;
        }
        return solverVariable;
    }

    public final float getValue(int i8) {
        return this.mArrayValues[i8];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i8) {
        int i9 = this.mHead;
        for (int i10 = 0; i9 != -1 && i10 < this.currentSize; i10++) {
            if (i10 == i8) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i9]];
            }
            i9 = this.mArrayNextIndices[i9];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i8) {
        int i9 = this.mHead;
        for (int i10 = 0; i9 != -1 && i10 < this.currentSize; i10++) {
            if (i10 == i8) {
                return this.mArrayValues[i9];
            }
            i9 = this.mArrayNextIndices[i9];
        }
        return 0.0f;
    }

    boolean hasAtLeastOnePositiveVariable() {
        int i8 = this.mHead;
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            if (this.mArrayValues[i8] > 0.0f) {
                return true;
            }
            i8 = this.mArrayNextIndices[i8];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i8 = this.mHead;
        if (i8 == -1) {
            return -1;
        }
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            if (this.mArrayIndices[i8] == solverVariable.id) {
                return i8;
            }
            i8 = this.mArrayNextIndices[i8];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i8 = this.mHead;
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            float[] fArr = this.mArrayValues;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.mArrayNextIndices[i8];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f8) {
        if (f8 == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i8 = this.mHead;
        if (i8 == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f8;
            this.mArrayIndices[0] = solverVariable.id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                int i9 = this.mLast + 1;
                this.mLast = i9;
                int[] iArr = this.mArrayIndices;
                if (i9 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i8 != -1 && i11 < this.currentSize; i11++) {
            int i12 = this.mArrayIndices[i8];
            int i13 = solverVariable.id;
            if (i12 == i13) {
                this.mArrayValues[i8] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i8;
            }
            i8 = this.mArrayNextIndices[i8];
        }
        int i14 = this.mLast;
        int i15 = i14 + 1;
        if (this.mDidFillOnce) {
            int[] iArr2 = this.mArrayIndices;
            if (iArr2[i14] != -1) {
                i14 = iArr2.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr3 = this.mArrayIndices;
        if (i14 >= iArr3.length && this.currentSize < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.mArrayIndices;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    i14 = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.mArrayIndices;
        if (i14 >= iArr5.length) {
            i14 = iArr5.length;
            int i17 = this.ROW_SIZE * 2;
            this.ROW_SIZE = i17;
            this.mDidFillOnce = false;
            this.mLast = i14 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i17);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }
        this.mArrayIndices[i14] = solverVariable.id;
        this.mArrayValues[i14] = f8;
        if (i10 != -1) {
            int[] iArr6 = this.mArrayNextIndices;
            iArr6[i14] = iArr6[i10];
            iArr6[i10] = i14;
        } else {
            this.mArrayNextIndices[i14] = this.mHead;
            this.mHead = i14;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        int i18 = this.currentSize + 1;
        this.currentSize = i18;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int[] iArr7 = this.mArrayIndices;
        if (i18 >= iArr7.length) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= iArr7.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z8) {
        if (this.candidate == solverVariable) {
            this.candidate = null;
        }
        int i8 = this.mHead;
        if (i8 == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i8 != -1 && i9 < this.currentSize) {
            if (this.mArrayIndices[i8] == solverVariable.id) {
                if (i8 == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i8];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i10] = iArr[i8];
                }
                if (z8) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.currentSize--;
                this.mArrayIndices[i8] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i8;
                }
                return this.mArrayValues[i8];
            }
            i9++;
            i10 = i8;
            i8 = this.mArrayNextIndices[i8];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.mArrayIndices.length * 12) + 36;
    }

    public String toString() {
        int i8 = this.mHead;
        String str = "";
        for (int i9 = 0; i8 != -1 && i9 < this.currentSize; i9++) {
            str = ((str + " -> ") + this.mArrayValues[i8] + " : ") + this.mCache.mIndexedVariables[this.mArrayIndices[i8]];
            i8 = this.mArrayNextIndices[i8];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z8) {
        float f8 = get(arrayRow.variable);
        remove(arrayRow.variable, z8);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i8 = 0; i8 < currentSize; i8++) {
            SolverVariable variable = arrayRowVariables.getVariable(i8);
            add(variable, arrayRowVariables.get(variable) * f8, z8);
        }
        return f8;
    }
}
