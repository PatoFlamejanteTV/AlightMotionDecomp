package N3;

import D3.f;
import D3.i;
import R5.AbstractC1435t;
import com.stripe.android.model.o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final f.C0023f c(o oVar) {
        return new f.C0023f(oVar, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(List list, D3.i iVar) {
        i.d dVar;
        Integer num = null;
        if (iVar instanceof i.d) {
            dVar = (i.d) iVar;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Iterator it = list.iterator();
            int i8 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC3292y.d(((o) it.next()).f25631a, ((i.d) iVar).getId())) {
                        break;
                    }
                    i8++;
                } else {
                    i8 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i8);
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            o oVar = (o) list.get(num.intValue());
            return AbstractC1435t.G0(AbstractC1435t.e(oVar), AbstractC1435t.E0(list, oVar));
        }
        return list;
    }
}
