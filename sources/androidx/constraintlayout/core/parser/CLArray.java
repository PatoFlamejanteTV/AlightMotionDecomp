package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i9 <= 0 && json.length() + i8 < CLElement.MAX_LINE) {
            sb.append(json);
        } else {
            sb.append("[\n");
            Iterator<CLElement> it = this.mElements.iterator();
            boolean z8 = true;
            while (it.hasNext()) {
                CLElement next = it.next();
                if (!z8) {
                    sb.append(",\n");
                } else {
                    z8 = false;
                }
                addIndent(sb, CLElement.BASE_INDENT + i8);
                sb.append(next.toFormattedJSON(CLElement.BASE_INDENT + i8, i9 - 1));
            }
            sb.append("\n");
            addIndent(sb, i8);
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z8 = true;
        for (int i8 = 0; i8 < this.mElements.size(); i8++) {
            if (!z8) {
                sb.append(", ");
            } else {
                z8 = false;
            }
            sb.append(this.mElements.get(i8).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
