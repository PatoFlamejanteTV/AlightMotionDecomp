package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    public ValidSpecification(T value, String tag, SpecificationComputer.VerificationMode verificationMode, Logger logger) {
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.i(verificationMode, "verificationMode");
        AbstractC3292y.i(logger, "logger");
        this.value = value;
        this.tag = tag;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        return this.value;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getTag() {
        return this.tag;
    }

    public final T getValue() {
        return this.value;
    }

    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String message, Function1 condition) {
        AbstractC3292y.i(message, "message");
        AbstractC3292y.i(condition, "condition");
        if (((Boolean) condition.invoke(this.value)).booleanValue()) {
            return this;
        }
        return new FailedSpecification(this.value, this.tag, message, this.logger, this.verificationMode);
    }
}
