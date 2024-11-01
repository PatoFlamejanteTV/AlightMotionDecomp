package c;

import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1997e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f15159a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f15160b;

    /* renamed from: c, reason: collision with root package name */
    public final L5.c f15161c;

    /* renamed from: d, reason: collision with root package name */
    public final J6.f f15162d;

    public C1997e(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback, L5.c response, J6.f portalConfig) {
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(response, "response");
        AbstractC3292y.i(portalConfig, "portalConfig");
        this.f15159a = sharedStorage;
        this.f15160b = choiceCmpCallback;
        this.f15161c = response;
        this.f15162d = portalConfig;
    }

    public final GBCConsentValue a(List list, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((b8.d) obj).f15122a.f3123a == C2001i.f15172a.e(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b8.d dVar = (b8.d) obj;
        if (dVar == null) {
            return GBCConsentValue.DENIED;
        }
        if (AbstractC3292y.d(dVar.f15123b, Boolean.TRUE)) {
            return GBCConsentValue.GRANTED;
        }
        return GBCConsentValue.DENIED;
    }
}
