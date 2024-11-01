package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavArgument {
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isNullable;
    private final NavType<Object> type;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;
        private NavType<Object> type;

        public final NavArgument build() {
            NavType<Object> navType = this.type;
            if (navType == null) {
                navType = NavType.Companion.inferFromValueType(this.defaultValue);
                AbstractC3292y.g(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navType, this.isNullable, this.defaultValue, this.defaultValuePresent);
        }

        public final Builder setDefaultValue(Object obj) {
            this.defaultValue = obj;
            this.defaultValuePresent = true;
            return this;
        }

        public final Builder setIsNullable(boolean z8) {
            this.isNullable = z8;
            return this;
        }

        public final <T> Builder setType(NavType<T> type) {
            AbstractC3292y.i(type, "type");
            this.type = type;
            return this;
        }
    }

    public NavArgument(NavType<Object> type, boolean z8, Object obj, boolean z9) {
        AbstractC3292y.i(type, "type");
        if (!type.isNullableAllowed() && z8) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        }
        if (!z8 && z9 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.type = type;
        this.isNullable = z8;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC3292y.d(NavArgument.class, obj.getClass())) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !AbstractC3292y.d(this.type, navArgument.type)) {
            return false;
        }
        Object obj2 = this.defaultValue;
        if (obj2 != null) {
            return AbstractC3292y.d(obj2, navArgument.defaultValue);
        }
        if (navArgument.defaultValue == null) {
            return true;
        }
        return false;
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final NavType<Object> getType() {
        return this.type;
    }

    public int hashCode() {
        int i8;
        int hashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    public final boolean isDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void putDefaultValue(String name, Bundle bundle) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(bundle, "bundle");
        if (this.isDefaultValuePresent) {
            this.type.put(bundle, name, this.defaultValue);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavArgument.class.getSimpleName());
        sb.append(" Type: " + this.type);
        sb.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb.append(" DefaultValue: " + this.defaultValue);
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "sb.toString()");
        return sb2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(String name, Bundle bundle) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.get(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
