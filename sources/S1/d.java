package S1;

import java.security.AlgorithmParameters;
import java.security.Provider;

/* loaded from: classes4.dex */
public abstract class d {
    public static AlgorithmParameters a(String str, Provider provider) {
        if (provider == null) {
            return AlgorithmParameters.getInstance(str);
        }
        return AlgorithmParameters.getInstance(str, provider);
    }
}
