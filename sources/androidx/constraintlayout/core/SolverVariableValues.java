package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float epsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int NONE = -1;
    private int SIZE = 16;
    private int HASH_SIZE = 16;
    int[] keys = new int[16];
    int[] nextKeys = new int[16];
    int[] variables = new int[16];
    float[] values = new float[16];
    int[] previous = new int[16];
    int[] next = new int[16];
    int mCount = 0;
    int head = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i8) {
        int[] iArr;
        int i9 = solverVariable.id % this.HASH_SIZE;
        int[] iArr2 = this.keys;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            iArr2[i9] = i8;
        } else {
            while (true) {
                iArr = this.nextKeys;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            iArr[i10] = i8;
        }
        this.nextKeys[i8] = -1;
    }

    private void addVariable(int i8, SolverVariable solverVariable, float f8) {
        this.variables[i8] = solverVariable.id;
        this.values[i8] = f8;
        this.previous[i8] = -1;
        this.next[i8] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i8 = 0; i8 < this.HASH_SIZE; i8++) {
            if (this.keys[i8] != -1) {
                String str = hashCode() + " hash [" + i8 + "] => ";
                int i9 = this.keys[i8];
                boolean z8 = false;
                while (!z8) {
                    str = str + " " + this.variables[i9];
                    int i10 = this.nextKeys[i9];
                    if (i10 != -1) {
                        i9 = i10;
                    } else {
                        z8 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i8 = 0; i8 < this.SIZE; i8++) {
            if (this.variables[i8] == -1) {
                return i8;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i8 = this.SIZE * 2;
        this.variables = Arrays.copyOf(this.variables, i8);
        this.values = Arrays.copyOf(this.values, i8);
        this.previous = Arrays.copyOf(this.previous, i8);
        this.next = Arrays.copyOf(this.next, i8);
        this.nextKeys = Arrays.copyOf(this.nextKeys, i8);
        for (int i9 = this.SIZE; i9 < i8; i9++) {
            this.variables[i9] = -1;
            this.nextKeys[i9] = -1;
        }
        this.SIZE = i8;
    }

    private void insertVariable(int i8, SolverVariable solverVariable, float f8) {
        int findEmptySlot = findEmptySlot();
        addVariable(findEmptySlot, solverVariable, f8);
        if (i8 != -1) {
            this.previous[findEmptySlot] = i8;
            int[] iArr = this.next;
            iArr[findEmptySlot] = iArr[i8];
            iArr[i8] = findEmptySlot;
        } else {
            this.previous[findEmptySlot] = -1;
            if (this.mCount > 0) {
                this.next[findEmptySlot] = this.head;
                this.head = findEmptySlot;
            } else {
                this.next[findEmptySlot] = -1;
            }
        }
        int i9 = this.next[findEmptySlot];
        if (i9 != -1) {
            this.previous[i9] = findEmptySlot;
        }
        addToHashMap(solverVariable, findEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i8;
        int i9 = solverVariable.id;
        int i10 = i9 % this.HASH_SIZE;
        int[] iArr2 = this.keys;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            return;
        }
        if (this.variables[i11] == i9) {
            int[] iArr3 = this.nextKeys;
            iArr2[i10] = iArr3[i11];
            iArr3[i11] = -1;
            return;
        }
        while (true) {
            iArr = this.nextKeys;
            i8 = iArr[i11];
            if (i8 == -1 || this.variables[i8] == i9) {
                break;
            } else {
                i11 = i8;
            }
        }
        if (i8 != -1 && this.variables[i8] == i9) {
            iArr[i11] = iArr[i8];
            iArr[i8] = -1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f8, boolean z8) {
        float f9 = epsilon;
        if (f8 > (-f9) && f8 < f9) {
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            put(solverVariable, f8);
            return;
        }
        float[] fArr = this.values;
        float f10 = fArr[indexOf] + f8;
        fArr[indexOf] = f10;
        float f11 = epsilon;
        if (f10 > (-f11) && f10 < f11) {
            fArr[indexOf] = 0.0f;
            remove(solverVariable, z8);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i8 = this.mCount;
        for (int i9 = 0; i9 < i8; i9++) {
            SolverVariable variable = getVariable(i9);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i10 = 0; i10 < this.SIZE; i10++) {
            this.variables[i10] = -1;
            this.nextKeys[i10] = -1;
        }
        for (int i11 = 0; i11 < this.HASH_SIZE; i11++) {
            this.keys[i11] = -1;
        }
        this.mCount = 0;
        this.head = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        if (indexOf(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i8 = this.mCount;
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
        int i8 = this.mCount;
        int i9 = this.head;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.values;
            fArr[i9] = fArr[i9] / f8;
            i9 = this.next[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            return this.values[indexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i8) {
        int i9 = this.mCount;
        if (i9 == 0) {
            return null;
        }
        int i10 = this.head;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8 && i10 != -1) {
                return this.mCache.mIndexedVariables[this.variables[i10]];
            }
            i10 = this.next[i10];
            if (i10 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i8) {
        int i9 = this.mCount;
        int i10 = this.head;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8) {
                return this.values[i10];
            }
            i10 = this.next[i10];
            if (i10 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i8 = solverVariable.id;
            int i9 = this.keys[i8 % this.HASH_SIZE];
            if (i9 == -1) {
                return -1;
            }
            if (this.variables[i9] == i8) {
                return i9;
            }
            do {
                i9 = this.nextKeys[i9];
                if (i9 == -1) {
                    break;
                }
            } while (this.variables[i9] != i8);
            if (i9 != -1 && this.variables[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i8 = this.mCount;
        int i9 = this.head;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.values;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.next[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f8) {
        float f9 = epsilon;
        if (f8 > (-f9) && f8 < f9) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f8);
            addToHashMap(solverVariable, 0);
            this.head = 0;
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            this.values[indexOf] = f8;
            return;
        }
        if (this.mCount + 1 >= this.SIZE) {
            increaseSize();
        }
        int i8 = this.mCount;
        int i9 = this.head;
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = this.variables[i9];
            int i13 = solverVariable.id;
            if (i12 == i13) {
                this.values[i9] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i9;
            }
            i9 = this.next[i9];
            if (i9 == -1) {
                break;
            }
        }
        insertVariable(i10, solverVariable, f8);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z8) {
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f8 = this.values[indexOf];
        if (this.head == indexOf) {
            this.head = this.next[indexOf];
        }
        this.variables[indexOf] = -1;
        int[] iArr = this.previous;
        int i8 = iArr[indexOf];
        if (i8 != -1) {
            int[] iArr2 = this.next;
            iArr2[i8] = iArr2[indexOf];
        }
        int i9 = this.next[indexOf];
        if (i9 != -1) {
            iArr[i9] = iArr[indexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z8) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f8;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i8 = this.mCount;
        for (int i9 = 0; i9 < i8; i9++) {
            SolverVariable variable = getVariable(i9);
            if (variable != null) {
                String str4 = str3 + variable + " = " + getVariableValue(i9) + " ";
                int indexOf = indexOf(variable);
                String str5 = str4 + "[p: ";
                if (this.previous[indexOf] != -1) {
                    str = str5 + this.mCache.mIndexedVariables[this.variables[this.previous[indexOf]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.next[indexOf] != -1) {
                    str2 = str6 + this.mCache.mIndexedVariables[this.variables[this.next[indexOf]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z8) {
        float f8 = get(arrayRow.variable);
        remove(arrayRow.variable, z8);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i8 = 0;
        int i9 = 0;
        while (i8 < currentSize) {
            int i10 = solverVariableValues.variables[i9];
            if (i10 != -1) {
                add(this.mCache.mIndexedVariables[i10], solverVariableValues.values[i9] * f8, z8);
                i8++;
            }
            i9++;
        }
        return f8;
    }
}
