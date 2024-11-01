package D0;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes3.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1177a = new j() { // from class: D0.i
        @Override // D0.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
