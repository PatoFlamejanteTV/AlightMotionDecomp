package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLNumber extends CLElement {
    float value;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.value = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.value)) {
            this.value = Float.parseFloat(content());
        }
        return this.value;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.value)) {
            this.value = Integer.parseInt(content());
        }
        return (int) this.value;
    }

    public boolean isInt() {
        if (((int) r0) == getFloat()) {
            return true;
        }
        return false;
    }

    public void putValue(float f8) {
        this.value = f8;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i8);
        float f8 = getFloat();
        int i10 = (int) f8;
        if (i10 == f8) {
            sb.append(i10);
        } else {
            sb.append(f8);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        float f8 = getFloat();
        int i8 = (int) f8;
        if (i8 == f8) {
            return "" + i8;
        }
        return "" + f8;
    }

    public CLNumber(float f8) {
        super(null);
        this.value = f8;
    }
}
