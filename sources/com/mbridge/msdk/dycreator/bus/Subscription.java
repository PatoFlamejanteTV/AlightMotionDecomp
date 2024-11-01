package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f19912a;

    /* renamed from: b, reason: collision with root package name */
    final SubscriberMethod f19913b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f19912a = obj;
        this.f19913b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.f19912a != subscription.f19912a || !this.f19913b.equals(subscription.f19913b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f19912a.hashCode() + this.f19913b.f19909d.hashCode();
    }
}
