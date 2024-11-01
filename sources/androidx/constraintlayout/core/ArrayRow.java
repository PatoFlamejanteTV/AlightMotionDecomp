package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    SolverVariable variable = null;
    float constantValue = 0.0f;
    boolean used = false;
    ArrayList<SolverVariable> variablesToUpdate = new ArrayList<>();
    boolean isSimpleDefinition = false;

    /* loaded from: classes.dex */
    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f8, boolean z8);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f8);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i8);

        float getVariableValue(int i8);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f8);

        float remove(SolverVariable solverVariable, boolean z8);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z8);
    }

    public ArrayRow() {
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        if (solverVariable.usageInRowCount <= 1) {
            return true;
        }
        return false;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < currentSize; i8++) {
            float variableValue = this.variables.getVariableValue(i8);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i8);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && (((type = variable.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f8)) {
                    f8 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i8) {
        this.variables.put(linearSystem.createErrorVariable(i8, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i8, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow addSingleError(SolverVariable solverVariable, int i8) {
        this.variables.put(solverVariable, i8);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean chooseSubject(LinearSystem linearSystem) {
        boolean z8;
        SolverVariable chooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (chooseSubjectInVariables == null) {
            z8 = true;
        } else {
            pivot(chooseSubjectInVariables);
            z8 = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
        }
        return z8;
    }

    SolverVariable chooseSubjectInVariables(LinearSystem linearSystem) {
        boolean isNew;
        boolean isNew2;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable = null;
        SolverVariable solverVariable2 = null;
        boolean z8 = false;
        boolean z9 = false;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i8 = 0; i8 < currentSize; i8++) {
            float variableValue = this.variables.getVariableValue(i8);
            SolverVariable variable = this.variables.getVariable(i8);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (f8 > variableValue) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (!z8 && isNew(variable, linearSystem)) {
                    f8 = variableValue;
                    solverVariable = variable;
                    z8 = true;
                }
                z8 = isNew2;
                f8 = variableValue;
                solverVariable = variable;
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null) {
                    isNew = isNew(variable, linearSystem);
                } else if (f9 > variableValue) {
                    isNew = isNew(variable, linearSystem);
                } else if (!z9 && isNew(variable, linearSystem)) {
                    f9 = variableValue;
                    solverVariable2 = variable;
                    z9 = true;
                }
                z9 = isNew;
                f9 = variableValue;
                solverVariable2 = variable;
            }
        }
        if (solverVariable != null) {
            return solverVariable;
        }
        return solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.variable = null;
        this.constantValue = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, float f8, SolverVariable solverVariable3, SolverVariable solverVariable4, int i9) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f8 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i8 > 0 || i9 > 0) {
                this.constantValue = (-i8) + i9;
            }
        } else if (f8 <= 0.0f) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.constantValue = i8;
        } else if (f8 >= 1.0f) {
            this.variables.put(solverVariable4, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            this.constantValue = -i9;
        } else {
            float f9 = 1.0f - f8;
            this.variables.put(solverVariable, f9 * 1.0f);
            this.variables.put(solverVariable2, f9 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f8);
            this.variables.put(solverVariable4, 1.0f * f8);
            if (i8 > 0 || i9 > 0) {
                this.constantValue = ((-i8) * f9) + (i9 * f8);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow createRowDefinition(SolverVariable solverVariable, int i8) {
        this.variable = solverVariable;
        float f8 = i8;
        solverVariable.computedValue = f8;
        this.constantValue = f8;
        this.isSimpleDefinition = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f8) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f8);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f8) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f8);
        this.variables.put(solverVariable4, -f8);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f8, float f9, float f10, SolverVariable solverVariable, int i8, SolverVariable solverVariable2, int i9, SolverVariable solverVariable3, int i10, SolverVariable solverVariable4, int i11) {
        if (f9 != 0.0f && f8 != f10) {
            float f11 = (f8 / f9) / (f10 / f9);
            this.constantValue = ((-i8) - i9) + (i10 * f11) + (i11 * f11);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f11);
            this.variables.put(solverVariable3, -f11);
        } else {
            this.constantValue = ((-i8) - i9) + i10 + i11;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f8, float f9, float f10, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.constantValue = 0.0f;
        if (f9 != 0.0f && f8 != f10) {
            if (f8 == 0.0f) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
            } else if (f10 == 0.0f) {
                this.variables.put(solverVariable3, 1.0f);
                this.variables.put(solverVariable4, -1.0f);
            } else {
                float f11 = (f8 / f9) / (f10 / f9);
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable4, f11);
                this.variables.put(solverVariable3, -f11);
            }
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i8) {
        if (i8 < 0) {
            this.constantValue = i8 * (-1);
            this.variables.put(solverVariable, 1.0f);
        } else {
            this.constantValue = i8;
            this.variables.put(solverVariable, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.constantValue = i8;
        }
        if (!z8) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.constantValue = i8;
        }
        if (!z8) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
        }
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f8) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.constantValue = -f8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ensurePositiveConstant() {
        float f8 = this.constantValue;
        if (f8 < 0.0f) {
            this.constantValue = f8 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.variable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasKeyVariable() {
        SolverVariable solverVariable = this.variable;
        if (solverVariable != null && (solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.constantValue >= 0.0f)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.variable = null;
            this.variables.clear();
            for (int i8 = 0; i8 < arrayRow.variables.getCurrentSize(); i8++) {
                this.variables.add(arrayRow.variables.getVariable(i8), arrayRow.variables.getVariableValue(i8), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        if (this.variable == null && this.constantValue == 0.0f && this.variables.getCurrentSize() == 0) {
            return true;
        }
        return false;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.variable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.variable.definitionId = -1;
            this.variable = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.variable = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.constantValue /= remove;
        this.variables.divideByAmount(remove);
    }

    public void reset() {
        this.variable = null;
        this.variables.clear();
        this.constantValue = 0.0f;
        this.isSimpleDefinition = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int sizeInBytes() {
        int i8;
        if (this.variable != null) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        return i8 + 8 + this.variables.sizeInBytes();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toReadableString() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toReadableString():java.lang.String");
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z8) {
        if (solverVariable != null && solverVariable.isFinalValue) {
            this.constantValue += solverVariable.computedValue * this.variables.get(solverVariable);
            this.variables.remove(solverVariable, z8);
            if (z8) {
                solverVariable.removeFromRow(this);
            }
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.isSimpleDefinition = true;
                linearSystem.hasSimpleDefinition = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z8) {
        this.constantValue += arrayRow.constantValue * this.variables.use(arrayRow, z8);
        if (z8) {
            arrayRow.variable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z8) {
        if (solverVariable != null && solverVariable.isSynonym) {
            float f8 = this.variables.get(solverVariable);
            this.constantValue += solverVariable.synonymDelta * f8;
            this.variables.remove(solverVariable, z8);
            if (z8) {
                solverVariable.removeFromRow(this);
            }
            this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.synonym], f8, z8);
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.isSimpleDefinition = true;
                linearSystem.hasSimpleDefinition = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z8 = false;
        while (!z8) {
            int currentSize = this.variables.getCurrentSize();
            for (int i8 = 0; i8 < currentSize; i8++) {
                SolverVariable variable = this.variables.getVariable(i8);
                if (variable.definitionId != -1 || variable.isFinalValue || variable.isSynonym) {
                    this.variablesToUpdate.add(variable);
                }
            }
            int size = this.variablesToUpdate.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    SolverVariable solverVariable = this.variablesToUpdate.get(i9);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.isSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.definitionId], true);
                    }
                }
                this.variablesToUpdate.clear();
            } else {
                z8 = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i8 = solverVariable.strength;
        float f8 = 1.0f;
        if (i8 != 1) {
            if (i8 == 2) {
                f8 = 1000.0f;
            } else if (i8 == 3) {
                f8 = 1000000.0f;
            } else if (i8 == 4) {
                f8 = 1.0E9f;
            } else if (i8 == 5) {
                f8 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f8);
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.constantValue = i8;
        }
        if (!z8) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        }
        return this;
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i8, SolverVariable solverVariable2) {
        this.constantValue = i8;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
