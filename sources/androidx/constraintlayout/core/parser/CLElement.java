package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;
    private int line;
    protected CLContainer mContainer;
    private final char[] mContent;
    protected long start = -1;
    protected long end = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addIndent(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append(' ');
        }
    }

    public String content() {
        String str = new String(this.mContent);
        long j8 = this.end;
        if (j8 != Long.MAX_VALUE) {
            long j9 = this.start;
            if (j8 >= j9) {
                return str.substring((int) j9, ((int) j8) + 1);
            }
        }
        long j10 = this.start;
        return str.substring((int) j10, ((int) j10) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getDebugName() {
        if (CLParser.DEBUG) {
            return getStrClass() + " -> ";
        }
        return "";
    }

    public long getEnd() {
        return this.end;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.line;
    }

    public long getStart() {
        return this.start;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean isDone() {
        if (this.end != Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        if (this.start > -1) {
            return true;
        }
        return false;
    }

    public boolean notStarted() {
        if (this.start == -1) {
            return true;
        }
        return false;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j8) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j8;
        if (CLParser.DEBUG) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i8) {
        this.line = i8;
    }

    public void setStart(long j8) {
        this.start = j8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toFormattedJSON(int i8, int i9) {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toJSON() {
        return "";
    }

    public String toString() {
        long j8 = this.start;
        long j9 = this.end;
        if (j8 <= j9 && j9 != Long.MAX_VALUE) {
            return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + new String(this.mContent).substring((int) this.start, ((int) this.end) + 1) + ">>";
        }
        return getClass() + " (INVALID, " + this.start + "-" + this.end + ")";
    }
}
