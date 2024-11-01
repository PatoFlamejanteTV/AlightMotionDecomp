package androidx.compose.ui.semantics;

import Q5.InterfaceC1412g;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import d6.InterfaceC2767a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, InterfaceC2767a {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    public final void collapsePeer$ui_release(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                InterfaceC1412g action = accessibilityAction.getAction();
                if (action == null) {
                    action = ((AccessibilityAction) value).getAction();
                }
                map.put(key, new AccessibilityAction(label, action));
            }
        }
    }

    public final <T> boolean contains(SemanticsPropertyKey<T> semanticsPropertyKey) {
        return this.props.containsKey(semanticsPropertyKey);
    }

    public final boolean containsImportantForAccessibility$ui_release() {
        Set<SemanticsPropertyKey<?>> keySet = this.props.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            if (((SemanticsPropertyKey) it.next()).isImportantForAccessibility$ui_release()) {
                return true;
            }
        }
        return false;
    }

    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.putAll(this.props);
        return semanticsConfiguration;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        if (AbstractC3292y.d(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics) {
            return true;
        }
        return false;
    }

    public final <T> T get(SemanticsPropertyKey<T> semanticsPropertyKey) {
        T t8 = (T) this.props.get(semanticsPropertyKey);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(SemanticsPropertyKey<T> semanticsPropertyKey, Function0 function0) {
        T t8 = (T) this.props.get(semanticsPropertyKey);
        if (t8 == null) {
            return (T) function0.invoke();
        }
        return t8;
    }

    public final <T> T getOrElseNullable(SemanticsPropertyKey<T> semanticsPropertyKey, Function0 function0) {
        T t8 = (T) this.props.get(semanticsPropertyKey);
        if (t8 == null) {
            return (T) function0.invoke();
        }
        return t8;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + androidx.compose.foundation.a.a(this.isMergingSemanticsOfDescendants)) * 31) + androidx.compose.foundation.a.a(this.isClearingSemantics);
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final void mergeChild$ui_release(SemanticsConfiguration semanticsConfiguration) {
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : semanticsConfiguration.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            AbstractC3292y.g(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object merge = key.merge(obj, value);
            if (merge != null) {
                this.props.put(key, merge);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(SemanticsPropertyKey<T> semanticsPropertyKey, T t8) {
        if ((t8 instanceof AccessibilityAction) && contains(semanticsPropertyKey)) {
            Object obj = this.props.get(semanticsPropertyKey);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
            Map<SemanticsPropertyKey<?>, Object> map = this.props;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) t8;
            String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            InterfaceC1412g action = accessibilityAction2.getAction();
            if (action == null) {
                action = accessibilityAction.getAction();
            }
            map.put(semanticsPropertyKey, new AccessibilityAction(label, action));
            return;
        }
        this.props.put(semanticsPropertyKey, t8);
    }

    public final void setClearingSemantics(boolean z8) {
        this.isClearingSemantics = z8;
    }

    public final void setMergingSemanticsOfDescendants(boolean z8) {
        this.isMergingSemanticsOfDescendants = z8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : this.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(key.getName());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb) + " }";
    }
}
