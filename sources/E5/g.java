package E5;

import D5.s;
import U7.w;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class g extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f1984a;

    /* renamed from: b, reason: collision with root package name */
    public final U7.g f1985b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1986c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1987d;

    public g(s tcModel, U7.g disclosureRepository, w translationsTextRepository) {
        AbstractC3292y.i(tcModel, "tcModel");
        AbstractC3292y.i(disclosureRepository, "disclosureRepository");
        AbstractC3292y.i(translationsTextRepository, "translationsTextRepository");
        this.f1984a = tcModel;
        this.f1985b = disclosureRepository;
        this.f1986c = translationsTextRepository;
        this.f1987d = new ArrayList();
    }

    public final int a(b8.e switchItemType) {
        AbstractC3292y.i(switchItemType, "switchItemType");
        int ordinal = switchItemType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 2;
            }
            if (ordinal == 2) {
                return 10;
            }
        }
        return 8;
    }
}
