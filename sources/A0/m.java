package A0;

import Q.AbstractC1396p;

/* loaded from: classes.dex */
public abstract class m extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    public m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(str);
        AbstractC1396p.g(str, "Detail message must not be empty");
    }
}
