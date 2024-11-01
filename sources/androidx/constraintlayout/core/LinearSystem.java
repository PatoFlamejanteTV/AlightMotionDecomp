package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    private static int POOL_SIZE = 1000;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    final Cache mCache;
    private Row mGoal;
    ArrayRow[] mRows;
    private Row mTempGoal;
    public boolean hasSimpleDefinition = false;
    int mVariablesID = 0;
    private HashMap<String, SolverVariable> mVariables = null;
    private int TABLE_SIZE = 32;
    private int mMaxColumns = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];
    int mNumColumns = 1;
    int mNumRows = 0;
    private int mMaxRows = 32;
    private SolverVariable[] mPoolVariables = new SolverVariable[POOL_SIZE];
    private int mPoolVariablesCount = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z8);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z8);

        void updateFromSystem(LinearSystem linearSystem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        this.mRows = null;
        this.mRows = new ArrayRow[32];
        releaseRows();
        Cache cache = new Cache();
        this.mCache = cache;
        this.mGoal = new PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(cache);
        } else {
            this.mTempGoal = new ArrayRow(cache);
        }
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String str) {
        SolverVariable acquire = this.mCache.solverVariablePool.acquire();
        if (acquire == null) {
            acquire = new SolverVariable(type, str);
            acquire.setType(type, str);
        } else {
            acquire.reset();
            acquire.setType(type, str);
        }
        int i8 = this.mPoolVariablesCount;
        int i9 = POOL_SIZE;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            POOL_SIZE = i10;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, i10);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i11 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i11 + 1;
        solverVariableArr[i11] = acquire;
        return acquire;
    }

    private void addError(ArrayRow arrayRow) {
        arrayRow.addError(this, 0);
    }

    private final void addRow(ArrayRow arrayRow) {
        int i8;
        if (SIMPLIFY_SYNONYMS && arrayRow.isSimpleDefinition) {
            arrayRow.variable.setFinalValue(this, arrayRow.constantValue);
        } else {
            ArrayRow[] arrayRowArr = this.mRows;
            int i9 = this.mNumRows;
            arrayRowArr[i9] = arrayRow;
            SolverVariable solverVariable = arrayRow.variable;
            solverVariable.definitionId = i9;
            this.mNumRows = i9 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i10 = 0;
            while (i10 < this.mNumRows) {
                if (this.mRows[i10] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.mRows[i10];
                if (arrayRow2 != null && arrayRow2.isSimpleDefinition) {
                    arrayRow2.variable.setFinalValue(this, arrayRow2.constantValue);
                    if (OPTIMIZED_ENGINE) {
                        this.mCache.optimizedArrayRowPool.release(arrayRow2);
                    } else {
                        this.mCache.arrayRowPool.release(arrayRow2);
                    }
                    this.mRows[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i8 = this.mNumRows;
                        if (i11 >= i8) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.mRows;
                        int i13 = i11 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i11];
                        arrayRowArr2[i13] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.variable;
                        if (solverVariable2.definitionId == i11) {
                            solverVariable2.definitionId = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i8) {
                        this.mRows[i12] = null;
                    }
                    this.mNumRows = i8 - 1;
                    i10--;
                }
                i10++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    private void addSingleError(ArrayRow arrayRow, int i8) {
        addSingleError(arrayRow, i8, 0);
    }

    private void computeValues() {
        for (int i8 = 0; i8 < this.mNumRows; i8++) {
            ArrayRow arrayRow = this.mRows[i8];
            arrayRow.variable.computedValue = arrayRow.constantValue;
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f8) {
        return linearSystem.createRow().createRowDimensionPercent(solverVariable, solverVariable2, f8);
    }

    private SolverVariable createVariable(String str, SolverVariable.Type type) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(type, null);
        acquireSolverVariable.setName(str);
        int i8 = this.mVariablesID + 1;
        this.mVariablesID = i8;
        this.mNumColumns++;
        acquireSolverVariable.id = i8;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(str, acquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    private void displayRows() {
        displaySolverVariables();
        String str = "";
        for (int i8 = 0; i8 < this.mNumRows; i8++) {
            str = (str + this.mRows[i8]) + "\n";
        }
        System.out.println(str + this.mGoal + "\n");
    }

    private void displaySolverVariables() {
        System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    private int enforceBFS(Row row) throws Exception {
        for (int i8 = 0; i8 < this.mNumRows; i8++) {
            ArrayRow arrayRow = this.mRows[i8];
            if (arrayRow.variable.mType != SolverVariable.Type.UNRESTRICTED && arrayRow.constantValue < 0.0f) {
                boolean z8 = false;
                int i9 = 0;
                while (!z8) {
                    Metrics metrics = sMetrics;
                    if (metrics != null) {
                        metrics.bfs++;
                    }
                    i9++;
                    float f8 = Float.MAX_VALUE;
                    int i10 = 0;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = 0;
                    while (true) {
                        if (i10 >= this.mNumRows) {
                            break;
                        }
                        ArrayRow arrayRow2 = this.mRows[i10];
                        if (arrayRow2.variable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow2.isSimpleDefinition && arrayRow2.constantValue < 0.0f) {
                            int i14 = 9;
                            if (SKIP_COLUMNS) {
                                int currentSize = arrayRow2.variables.getCurrentSize();
                                int i15 = 0;
                                while (i15 < currentSize) {
                                    SolverVariable variable = arrayRow2.variables.getVariable(i15);
                                    float f9 = arrayRow2.variables.get(variable);
                                    if (f9 > 0.0f) {
                                        int i16 = 0;
                                        while (i16 < i14) {
                                            float f10 = variable.strengthVector[i16] / f9;
                                            if ((f10 < f8 && i16 == i13) || i16 > i13) {
                                                i13 = i16;
                                                i12 = variable.id;
                                                i11 = i10;
                                                f8 = f10;
                                            }
                                            i16++;
                                            i14 = 9;
                                        }
                                    }
                                    i15++;
                                    i14 = 9;
                                }
                            } else {
                                for (int i17 = 1; i17 < this.mNumColumns; i17++) {
                                    SolverVariable solverVariable = this.mCache.mIndexedVariables[i17];
                                    float f11 = arrayRow2.variables.get(solverVariable);
                                    if (f11 > 0.0f) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f12 = solverVariable.strengthVector[i18] / f11;
                                            if ((f12 < f8 && i18 == i13) || i18 > i13) {
                                                i13 = i18;
                                                i11 = i10;
                                                i12 = i17;
                                                f8 = f12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i10++;
                    }
                    if (i11 != -1) {
                        ArrayRow arrayRow3 = this.mRows[i11];
                        arrayRow3.variable.definitionId = -1;
                        Metrics metrics2 = sMetrics;
                        if (metrics2 != null) {
                            metrics2.pivots++;
                        }
                        arrayRow3.pivot(this.mCache.mIndexedVariables[i12]);
                        SolverVariable solverVariable2 = arrayRow3.variable;
                        solverVariable2.definitionId = i11;
                        solverVariable2.updateReferencesWithNewDefinition(this, arrayRow3);
                    } else {
                        z8 = true;
                    }
                    if (i9 > this.mNumColumns / 2) {
                        z8 = true;
                    }
                }
                return i9;
            }
        }
        return 0;
    }

    private String getDisplaySize(int i8) {
        int i9 = i8 * 4;
        int i10 = i9 / 1024;
        int i11 = i10 / 1024;
        if (i11 > 0) {
            return "" + i11 + " Mb";
        }
        if (i10 > 0) {
            return "" + i10 + " Kb";
        }
        return "" + i9 + " bytes";
    }

    private String getDisplayStrength(int i8) {
        if (i8 == 1) {
            return "LOW";
        }
        if (i8 == 2) {
            return "MEDIUM";
        }
        if (i8 == 3) {
            return "HIGH";
        }
        if (i8 == 4) {
            return "HIGHEST";
        }
        if (i8 == 5) {
            return "EQUALITY";
        }
        if (i8 == 8) {
            return "FIXED";
        }
        if (i8 == 6) {
            return "BARRIER";
        }
        return "NONE";
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        int i8 = this.TABLE_SIZE * 2;
        this.TABLE_SIZE = i8;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, i8);
        Cache cache = this.mCache;
        cache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(cache.mIndexedVariables, this.TABLE_SIZE);
        int i9 = this.TABLE_SIZE;
        this.mAlreadyTestedCandidates = new boolean[i9];
        this.mMaxColumns = i9;
        this.mMaxRows = i9;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, i9);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    private final int optimize(Row row, boolean z8) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i8 = 0; i8 < this.mNumColumns; i8++) {
            this.mAlreadyTestedCandidates[i8] = false;
        }
        boolean z9 = false;
        int i9 = 0;
        while (!z9) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i9++;
            if (i9 >= this.mNumColumns * 2) {
                return i9;
            }
            if (row.getKey() != null) {
                this.mAlreadyTestedCandidates[row.getKey().id] = true;
            }
            SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if (pivotCandidate != null) {
                boolean[] zArr = this.mAlreadyTestedCandidates;
                int i10 = pivotCandidate.id;
                if (zArr[i10]) {
                    return i9;
                }
                zArr[i10] = true;
            }
            if (pivotCandidate != null) {
                float f8 = Float.MAX_VALUE;
                int i11 = -1;
                for (int i12 = 0; i12 < this.mNumRows; i12++) {
                    ArrayRow arrayRow = this.mRows[i12];
                    if (arrayRow.variable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                        float f9 = arrayRow.variables.get(pivotCandidate);
                        if (f9 < 0.0f) {
                            float f10 = (-arrayRow.constantValue) / f9;
                            if (f10 < f8) {
                                i11 = i12;
                                f8 = f10;
                            }
                        }
                    }
                }
                if (i11 > -1) {
                    ArrayRow arrayRow2 = this.mRows[i11];
                    arrayRow2.variable.definitionId = -1;
                    Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.pivot(pivotCandidate);
                    SolverVariable solverVariable = arrayRow2.variable;
                    solverVariable.definitionId = i11;
                    solverVariable.updateReferencesWithNewDefinition(this, arrayRow2);
                }
            } else {
                z9 = true;
            }
        }
        return i9;
    }

    private void releaseRows() {
        int i8 = 0;
        if (OPTIMIZED_ENGINE) {
            while (i8 < this.mNumRows) {
                ArrayRow arrayRow = this.mRows[i8];
                if (arrayRow != null) {
                    this.mCache.optimizedArrayRowPool.release(arrayRow);
                }
                this.mRows[i8] = null;
                i8++;
            }
            return;
        }
        while (i8 < this.mNumRows) {
            ArrayRow arrayRow2 = this.mRows[i8];
            if (arrayRow2 != null) {
                this.mCache.arrayRowPool.release(arrayRow2);
            }
            this.mRows[i8] = null;
            i8++;
        }
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f8, int i8) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable createObjectVariable = createObjectVariable(constraintWidget.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable createObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable createObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable createObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(type4));
        SolverVariable createObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(type));
        SolverVariable createObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(type2));
        SolverVariable createObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(type3));
        SolverVariable createObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(type4));
        ArrayRow createRow = createRow();
        double d8 = f8;
        double d9 = i8;
        createRow.createRowWithAngle(createObjectVariable2, createObjectVariable4, createObjectVariable6, createObjectVariable8, (float) (Math.sin(d8) * d9));
        addConstraint(createRow);
        ArrayRow createRow2 = createRow();
        createRow2.createRowWithAngle(createObjectVariable, createObjectVariable3, createObjectVariable5, createObjectVariable7, (float) (Math.cos(d8) * d9));
        addConstraint(createRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, float f8, SolverVariable solverVariable3, SolverVariable solverVariable4, int i9, int i10) {
        ArrayRow createRow = createRow();
        createRow.createRowCentering(solverVariable, solverVariable2, i8, f8, solverVariable3, solverVariable4, i9);
        if (i10 != 8) {
            createRow.addError(this, i10);
        }
        addConstraint(createRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addConstraint(androidx.constraintlayout.core.ArrayRow r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r8.isSimpleDefinition
            if (r3 == 0) goto L17
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L17:
            int r0 = r7.mNumRows
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.mMaxRows
            if (r0 >= r4) goto L26
            int r0 = r7.mNumColumns
            int r0 = r0 + r3
            int r4 = r7.mMaxColumns
            if (r0 < r4) goto L29
        L26:
            r7.increaseTableSize()
        L29:
            boolean r0 = r8.isSimpleDefinition
            r4 = 0
            if (r0 != 0) goto La1
            r8.updateFromSystem(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            r8.ensurePositiveConstant()
            boolean r0 = r8.chooseSubject(r7)
            if (r0 == 0) goto L98
            androidx.constraintlayout.core.SolverVariable r0 = r7.createExtraVariable()
            r8.variable = r0
            int r5 = r7.mNumRows
            r7.addRow(r8)
            int r6 = r7.mNumRows
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            androidx.constraintlayout.core.LinearSystem$Row r4 = r7.mTempGoal
            r4.initFromRow(r8)
            androidx.constraintlayout.core.LinearSystem$Row r4 = r7.mTempGoal
            r7.optimize(r4, r3)
            int r4 = r0.definitionId
            r5 = -1
            if (r4 != r5) goto L99
            androidx.constraintlayout.core.SolverVariable r4 = r8.variable
            if (r4 != r0) goto L76
            androidx.constraintlayout.core.SolverVariable r0 = r8.pickPivot(r0)
            if (r0 == 0) goto L76
            androidx.constraintlayout.core.Metrics r4 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r4 == 0) goto L73
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L73:
            r8.pivot(r0)
        L76:
            boolean r0 = r8.isSimpleDefinition
            if (r0 != 0) goto L7f
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            r0.updateReferencesWithNewDefinition(r7, r8)
        L7f:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L8b
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            r0.release(r8)
            goto L92
        L8b:
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
            r0.release(r8)
        L92:
            int r0 = r7.mNumRows
            int r0 = r0 - r3
            r7.mNumRows = r0
            goto L99
        L98:
            r3 = 0
        L99:
            boolean r0 = r8.hasKeyVariable()
            if (r0 != 0) goto La0
            return
        La0:
            r4 = r3
        La1:
            if (r4 != 0) goto La6
            r7.addRow(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.LinearSystem.addConstraint(androidx.constraintlayout.core.ArrayRow):void");
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, int i9) {
        if (USE_BASIC_SYNONYMS && i9 == 8 && solverVariable2.isFinalValue && solverVariable.definitionId == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i8);
            return null;
        }
        ArrayRow createRow = createRow();
        createRow.createRowEquals(solverVariable, solverVariable2, i8);
        if (i9 != 8) {
            createRow.addError(this, i9);
        }
        addConstraint(createRow);
        return createRow;
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, boolean z8) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i8);
        addConstraint(createRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, int i9) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i8);
        if (i9 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i9);
        }
        addConstraint(createRow);
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, boolean z8) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i8);
        addConstraint(createRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i8, int i9) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i8);
        if (i9 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i9);
        }
        addConstraint(createRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f8, int i8) {
        ArrayRow createRow = createRow();
        createRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f8);
        if (i8 != 8) {
            createRow.addError(this, i8);
        }
        addConstraint(createRow);
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i8) {
        if (solverVariable.definitionId == -1 && i8 == 0) {
            if (solverVariable2.isSynonym) {
                solverVariable2 = this.mCache.mIndexedVariables[solverVariable2.synonym];
            }
            if (solverVariable.isSynonym) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[solverVariable.synonym];
                return;
            } else {
                solverVariable.setSynonym(this, solverVariable2, 0.0f);
                return;
            }
        }
        addEquality(solverVariable, solverVariable2, i8, 8);
    }

    final void cleanupRows() {
        int i8;
        int i9 = 0;
        while (i9 < this.mNumRows) {
            ArrayRow arrayRow = this.mRows[i9];
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.isSimpleDefinition = true;
            }
            if (arrayRow.isSimpleDefinition) {
                SolverVariable solverVariable = arrayRow.variable;
                solverVariable.computedValue = arrayRow.constantValue;
                solverVariable.removeFromRow(arrayRow);
                int i10 = i9;
                while (true) {
                    i8 = this.mNumRows;
                    if (i10 >= i8 - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i11 = i10 + 1;
                    arrayRowArr[i10] = arrayRowArr[i11];
                    i10 = i11;
                }
                this.mRows[i8 - 1] = null;
                this.mNumRows = i8 - 1;
                i9--;
                if (OPTIMIZED_ENGINE) {
                    this.mCache.optimizedArrayRowPool.release(arrayRow);
                } else {
                    this.mCache.arrayRowPool.release(arrayRow);
                }
            }
            i9++;
        }
    }

    public SolverVariable createErrorVariable(int i8, String str) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.ERROR, str);
        int i9 = this.mVariablesID + 1;
        this.mVariablesID = i9;
        this.mNumColumns++;
        acquireSolverVariable.id = i9;
        acquireSolverVariable.strength = i8;
        this.mCache.mIndexedVariables[i9] = acquireSolverVariable;
        this.mGoal.addError(acquireSolverVariable);
        return acquireSolverVariable;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i8 = this.mVariablesID + 1;
        this.mVariablesID = i8;
        this.mNumColumns++;
        acquireSolverVariable.id = i8;
        this.mCache.mIndexedVariables[i8] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i8 = solverVariable.id;
            if (i8 == -1 || i8 > this.mVariablesID || this.mCache.mIndexedVariables[i8] == null) {
                if (i8 != -1) {
                    solverVariable.reset();
                }
                int i9 = this.mVariablesID + 1;
                this.mVariablesID = i9;
                this.mNumColumns++;
                solverVariable.id = i9;
                solverVariable.mType = SolverVariable.Type.UNRESTRICTED;
                this.mCache.mIndexedVariables[i9] = solverVariable;
            }
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow acquire;
        if (OPTIMIZED_ENGINE) {
            acquire = this.mCache.optimizedArrayRowPool.acquire();
            if (acquire == null) {
                acquire = new ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                acquire.reset();
            }
        } else {
            acquire = this.mCache.arrayRowPool.acquire();
            if (acquire == null) {
                acquire = new ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
            } else {
                acquire.reset();
            }
        }
        SolverVariable.increaseErrorId();
        return acquire;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i8 = this.mVariablesID + 1;
        this.mVariablesID = i8;
        this.mNumColumns++;
        acquireSolverVariable.id = i8;
        this.mCache.mIndexedVariables[i8] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String str = " num vars " + this.mVariablesID + "\n";
        for (int i8 = 0; i8 < this.mVariablesID + 1; i8++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[i8];
            if (solverVariable != null && solverVariable.isFinalValue) {
                str = str + " $[" + i8 + "] => " + solverVariable + " = " + solverVariable.computedValue + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i9 = 0; i9 < this.mVariablesID + 1; i9++) {
            SolverVariable[] solverVariableArr = this.mCache.mIndexedVariables;
            SolverVariable solverVariable2 = solverVariableArr[i9];
            if (solverVariable2 != null && solverVariable2.isSynonym) {
                str2 = str2 + " ~[" + i9 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.synonym] + " + " + solverVariable2.synonymDelta + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i10 = 0; i10 < this.mNumRows; i10++) {
            str3 = (str3 + this.mRows[i10].toReadableString()) + "\n #  ";
        }
        if (this.mGoal != null) {
            str3 = str3 + "Goal: " + this.mGoal + "\n";
        }
        System.out.println(str3);
    }

    void displaySystemInformation() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.TABLE_SIZE; i9++) {
            ArrayRow arrayRow = this.mRows[i9];
            if (arrayRow != null) {
                i8 += arrayRow.sizeInBytes();
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            ArrayRow arrayRow2 = this.mRows[i11];
            if (arrayRow2 != null) {
                i10 += arrayRow2.sizeInBytes();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.TABLE_SIZE);
        sb.append(" (");
        int i12 = this.TABLE_SIZE;
        sb.append(getDisplaySize(i12 * i12));
        sb.append(") -- row sizes: ");
        sb.append(getDisplaySize(i8));
        sb.append(", actual size: ");
        sb.append(getDisplaySize(i10));
        sb.append(" rows: ");
        sb.append(this.mNumRows);
        sb.append("/");
        sb.append(this.mMaxRows);
        sb.append(" cols: ");
        sb.append(this.mNumColumns);
        sb.append("/");
        sb.append(this.mMaxColumns);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(getDisplaySize(0));
        printStream.println(sb.toString());
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i8 = 0; i8 < this.mNumRows; i8++) {
            if (this.mRows[i8].variable.mType == SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.mRows[i8].toReadableString()) + "\n";
            }
        }
        System.out.println(str + this.mGoal + "\n");
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    public Cache getCache() {
        return this.mCache;
    }

    Row getGoal() {
        return this.mGoal;
    }

    public int getMemoryUsed() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.mNumRows; i9++) {
            ArrayRow arrayRow = this.mRows[i9];
            if (arrayRow != null) {
                i8 += arrayRow.sizeInBytes();
            }
        }
        return i8;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    ArrayRow getRow(int i8) {
        return this.mRows[i8];
    }

    float getValueFor(String str) {
        SolverVariable variable = getVariable(str, SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    SolverVariable getVariable(String str, SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable solverVariable = this.mVariables.get(str);
        if (solverVariable == null) {
            return createVariable(str, type);
        }
        return solverVariable;
    }

    public void minimize() throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
            return;
        }
        if (!this.graphOptimizer && !this.newgraphOptimizer) {
            minimizeGoal(this.mGoal);
            return;
        }
        Metrics metrics2 = sMetrics;
        if (metrics2 != null) {
            metrics2.graphOptimizer++;
        }
        for (int i8 = 0; i8 < this.mNumRows; i8++) {
            if (!this.mRows[i8].isSimpleDefinition) {
                minimizeGoal(this.mGoal);
                return;
            }
        }
        Metrics metrics3 = sMetrics;
        if (metrics3 != null) {
            metrics3.fullySolved++;
        }
        computeValues();
    }

    void minimizeGoal(Row row) throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, this.mNumColumns);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, this.mNumRows);
        }
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i8;
        if (arrayRow.isSimpleDefinition && (solverVariable = arrayRow.variable) != null) {
            int i9 = solverVariable.definitionId;
            if (i9 != -1) {
                while (true) {
                    i8 = this.mNumRows;
                    if (i9 >= i8 - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i10 = i9 + 1;
                    ArrayRow arrayRow2 = arrayRowArr[i10];
                    SolverVariable solverVariable2 = arrayRow2.variable;
                    if (solverVariable2.definitionId == i10) {
                        solverVariable2.definitionId = i9;
                    }
                    arrayRowArr[i9] = arrayRow2;
                    i9 = i10;
                }
                this.mNumRows = i8 - 1;
            }
            SolverVariable solverVariable3 = arrayRow.variable;
            if (!solverVariable3.isFinalValue) {
                solverVariable3.setFinalValue(this, arrayRow.constantValue);
            }
            if (OPTIMIZED_ENGINE) {
                this.mCache.optimizedArrayRowPool.release(arrayRow);
            } else {
                this.mCache.arrayRowPool.release(arrayRow);
            }
        }
    }

    public void reset() {
        Cache cache;
        int i8 = 0;
        while (true) {
            cache = this.mCache;
            SolverVariable[] solverVariableArr = cache.mIndexedVariables;
            if (i8 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i8];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i8++;
        }
        cache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.mVariables;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i9 = 0; i9 < this.mNumRows; i9++) {
            ArrayRow arrayRow = this.mRows[i9];
            if (arrayRow != null) {
                arrayRow.used = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(this.mCache);
        } else {
            this.mTempGoal = new ArrayRow(this.mCache);
        }
    }

    void addSingleError(ArrayRow arrayRow, int i8, int i9) {
        arrayRow.addSingleError(createErrorVariable(i9, null), i8);
    }

    public void addEquality(SolverVariable solverVariable, int i8) {
        if (USE_BASIC_SYNONYMS && solverVariable.definitionId == -1) {
            float f8 = i8;
            solverVariable.setFinalValue(this, f8);
            for (int i9 = 0; i9 < this.mVariablesID + 1; i9++) {
                SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i9];
                if (solverVariable2 != null && solverVariable2.isSynonym && solverVariable2.synonym == solverVariable.id) {
                    solverVariable2.setFinalValue(this, solverVariable2.synonymDelta + f8);
                }
            }
            return;
        }
        int i10 = solverVariable.definitionId;
        if (i10 != -1) {
            ArrayRow arrayRow = this.mRows[i10];
            if (arrayRow.isSimpleDefinition) {
                arrayRow.constantValue = i8;
                return;
            }
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.isSimpleDefinition = true;
                arrayRow.constantValue = i8;
                return;
            } else {
                ArrayRow createRow = createRow();
                createRow.createRowEquals(solverVariable, i8);
                addConstraint(createRow);
                return;
            }
        }
        ArrayRow createRow2 = createRow();
        createRow2.createRowDefinition(solverVariable, i8);
        addConstraint(createRow2);
    }
}
