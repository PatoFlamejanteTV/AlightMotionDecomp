package androidx.constraintlayout.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    int definitionId;
    float[] goalStrengthVector;
    public int id;
    public boolean inGoal;
    HashSet<ArrayRow> inRows;
    public boolean isFinalValue;
    boolean isSynonym;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    private String mName;
    Type mType;
    public int strength;
    float[] strengthVector;
    int synonym;
    float synonymDelta;
    public int usageInRowCount;

    /* renamed from: androidx.constraintlayout.core.SolverVariable$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type = iArr;
            try {
                iArr[Type.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.strengthVector = new float[9];
        this.goalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        this.inRows = null;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        if (str != null) {
            return str + uniqueErrorId;
        }
        int i8 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[type.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 == 5) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                            int i9 = uniqueId + 1;
                            uniqueId = i9;
                            sb.append(i9);
                            return sb.toString();
                        }
                        throw new AssertionError(type.name());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("e");
                    int i10 = uniqueErrorId + 1;
                    uniqueErrorId = i10;
                    sb2.append(i10);
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(ExifInterface.LATITUDE_SOUTH);
                int i11 = uniqueSlackId + 1;
                uniqueSlackId = i11;
                sb3.append(i11);
                return sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("C");
            int i12 = uniqueConstantId + 1;
            uniqueConstantId = i12;
            sb4.append(i12);
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("U");
        int i13 = uniqueUnrestrictedId + 1;
        uniqueUnrestrictedId = i13;
        sb5.append(i13);
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void increaseErrorId() {
        uniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i8 = 0;
        while (true) {
            int i9 = this.mClientEquationsCount;
            if (i8 < i9) {
                if (this.mClientEquations[i8] == arrayRow) {
                    return;
                } else {
                    i8++;
                }
            } else {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i9 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i10 = this.mClientEquationsCount;
                arrayRowArr2[i10] = arrayRow;
                this.mClientEquationsCount = i10 + 1;
                return;
            }
        }
    }

    void clearStrengths() {
        for (int i8 = 0; i8 < 9; i8++) {
            this.strengthVector[i8] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i8 = this.mClientEquationsCount;
        int i9 = 0;
        while (i9 < i8) {
            if (this.mClientEquations[i9] == arrayRow) {
                while (i9 < i8 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i10 = i9 + 1;
                    arrayRowArr[i9] = arrayRowArr[i10];
                    i9 = i10;
                }
                this.mClientEquationsCount--;
                return;
            }
            i9++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i8 = this.mClientEquationsCount;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.goalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f8) {
        this.computedValue = f8;
        this.isFinalValue = true;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i8 = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f8) {
        this.isSynonym = true;
        this.synonym = solverVariable.id;
        this.synonymDelta = f8;
        int i8 = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    String strengthsToString() {
        String str = this + "[";
        boolean z8 = false;
        boolean z9 = true;
        for (int i8 = 0; i8 < this.strengthVector.length; i8++) {
            String str2 = str + this.strengthVector[i8];
            float[] fArr = this.strengthVector;
            float f8 = fArr[i8];
            if (f8 > 0.0f) {
                z8 = false;
            } else if (f8 < 0.0f) {
                z8 = true;
            }
            if (f8 != 0.0f) {
                z9 = false;
            }
            if (i8 < fArr.length - 1) {
                str = str2 + ", ";
            } else {
                str = str2 + "] ";
            }
        }
        if (z8) {
            str = str + " (-)";
        }
        if (z9) {
            return str + " (*)";
        }
        return str;
    }

    public String toString() {
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i8 = this.mClientEquationsCount;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.id - solverVariable.id;
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.strengthVector = new float[9];
        this.goalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        this.inRows = null;
        this.mType = type;
    }
}
