package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE;
    GoalVariableAccessor accessor;
    private SolverVariable[] arrayGoals;
    Cache mCache;
    private int numGoals;
    private SolverVariable[] sortArray;

    /* loaded from: classes.dex */
    class GoalVariableAccessor {
        PriorityGoalRow row;
        SolverVariable variable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.row = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.variable.goalStrengthVector;
                float f8 = fArr[i8] + solverVariable.goalStrengthVector[i8];
                fArr[i8] = f8;
                if (Math.abs(f8) < 1.0E-4f) {
                    this.variable.goalStrengthVector[i8] = 0.0f;
                }
            }
        }

        public boolean addToGoal(SolverVariable solverVariable, float f8) {
            boolean z8 = true;
            if (this.variable.inGoal) {
                for (int i8 = 0; i8 < 9; i8++) {
                    float[] fArr = this.variable.goalStrengthVector;
                    float f9 = fArr[i8] + (solverVariable.goalStrengthVector[i8] * f8);
                    fArr[i8] = f9;
                    if (Math.abs(f9) < 1.0E-4f) {
                        this.variable.goalStrengthVector[i8] = 0.0f;
                    } else {
                        z8 = false;
                    }
                }
                if (z8) {
                    PriorityGoalRow.this.removeGoal(this.variable);
                }
                return false;
            }
            for (int i9 = 0; i9 < 9; i9++) {
                float f10 = solverVariable.goalStrengthVector[i9];
                if (f10 != 0.0f) {
                    float f11 = f10 * f8;
                    if (Math.abs(f11) < 1.0E-4f) {
                        f11 = 0.0f;
                    }
                    this.variable.goalStrengthVector[i9] = f11;
                } else {
                    this.variable.goalStrengthVector[i9] = 0.0f;
                }
            }
            return true;
        }

        public void init(SolverVariable solverVariable) {
            this.variable = solverVariable;
        }

        public final boolean isNegative() {
            for (int i8 = 8; i8 >= 0; i8--) {
                float f8 = this.variable.goalStrengthVector[i8];
                if (f8 > 0.0f) {
                    return false;
                }
                if (f8 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i8 = 0; i8 < 9; i8++) {
                if (this.variable.goalStrengthVector[i8] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            int i8 = 8;
            while (true) {
                if (i8 < 0) {
                    break;
                }
                float f8 = solverVariable.goalStrengthVector[i8];
                float f9 = this.variable.goalStrengthVector[i8];
                if (f9 == f8) {
                    i8--;
                } else if (f9 < f8) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.variable.goalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.variable != null) {
                for (int i8 = 0; i8 < 9; i8++) {
                    str = str + this.variable.goalStrengthVector[i8] + " ";
                }
            }
            return str + "] " + this.variable;
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.TABLE_SIZE = 128;
        this.arrayGoals = new SolverVariable[128];
        this.sortArray = new SolverVariable[128];
        this.numGoals = 0;
        this.accessor = new GoalVariableAccessor(this);
        this.mCache = cache;
    }

    private final void addToGoal(SolverVariable solverVariable) {
        int i8;
        int i9 = this.numGoals + 1;
        SolverVariable[] solverVariableArr = this.arrayGoals;
        if (i9 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.arrayGoals = solverVariableArr2;
            this.sortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.arrayGoals;
        int i10 = this.numGoals;
        solverVariableArr3[i10] = solverVariable;
        int i11 = i10 + 1;
        this.numGoals = i11;
        if (i11 > 1 && solverVariableArr3[i10].id > solverVariable.id) {
            int i12 = 0;
            while (true) {
                i8 = this.numGoals;
                if (i12 >= i8) {
                    break;
                }
                this.sortArray[i12] = this.arrayGoals[i12];
                i12++;
            }
            Arrays.sort(this.sortArray, 0, i8, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.id - solverVariable3.id;
                }
            });
            for (int i13 = 0; i13 < this.numGoals; i13++) {
                this.arrayGoals[i13] = this.sortArray[i13];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGoal(SolverVariable solverVariable) {
        int i8 = 0;
        while (i8 < this.numGoals) {
            if (this.arrayGoals[i8] == solverVariable) {
                while (true) {
                    int i9 = this.numGoals;
                    if (i8 < i9 - 1) {
                        SolverVariable[] solverVariableArr = this.arrayGoals;
                        int i10 = i8 + 1;
                        solverVariableArr[i8] = solverVariableArr[i10];
                        i8 = i10;
                    } else {
                        this.numGoals = i9 - 1;
                        solverVariable.inGoal = false;
                        return;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        this.accessor.init(solverVariable);
        this.accessor.reset();
        solverVariable.goalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.numGoals = 0;
        this.constantValue = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i8 = -1;
        for (int i9 = 0; i9 < this.numGoals; i9++) {
            SolverVariable solverVariable = this.arrayGoals[i9];
            if (!zArr[solverVariable.id]) {
                this.accessor.init(solverVariable);
                if (i8 == -1) {
                    if (!this.accessor.isNegative()) {
                    }
                    i8 = i9;
                } else {
                    if (!this.accessor.isSmallerThan(this.arrayGoals[i8])) {
                    }
                    i8 = i9;
                }
            }
        }
        if (i8 == -1) {
            return null;
        }
        return this.arrayGoals[i8];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        if (this.numGoals == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String str = " goal -> (" + this.constantValue + ") : ";
        for (int i8 = 0; i8 < this.numGoals; i8++) {
            this.accessor.init(this.arrayGoals[i8]);
            str = str + this.accessor + " ";
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z8) {
        SolverVariable solverVariable = arrayRow.variable;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i8 = 0; i8 < currentSize; i8++) {
            SolverVariable variable = arrayRowVariables.getVariable(i8);
            float variableValue = arrayRowVariables.getVariableValue(i8);
            this.accessor.init(variable);
            if (this.accessor.addToGoal(solverVariable, variableValue)) {
                addToGoal(variable);
            }
            this.constantValue += arrayRow.constantValue * variableValue;
        }
        removeGoal(solverVariable);
    }
}
